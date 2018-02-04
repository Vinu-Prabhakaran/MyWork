/**
 * 
 */
var newItemCount=1;
var i=0;
var myList = document.getElementById("my-list");
var myButton = document.getElementById("my-btn");
var listItems = document.getElementById("my-list").getElementsByTagName("li");
var myHead = document.getElementById("my-header");


function removeBg(){
    for (i = 0; i < listItems.length; i++){
        listItems[i].classList.remove("listbg");
    }
}
function listClick()
{
    myHead.innerHTML=(this.innerHTML+" selected ");
    removeBg();
    this.classList.add("listbg");
}

for (i = 0; i < listItems.length; i++){
    listItems[i].addEventListener("click",listClick);
}


function buttonClick() {
    myList.innerHTML+=("<li>New List Item "+newItemCount+".</li>");
    newItemCount++;
    //alert("Clicked!");
}
myButton.addEventListener("click", buttonClick);

