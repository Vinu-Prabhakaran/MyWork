/**
 * 
 */
var newItemCount=1;
var i=0;
var myList = document.getElementById("my-list");
var myButton = document.getElementById("my-btn");
var nxtButton = document.getElementById("nxt-btn");
var hideButton = document.getElementById("hide-btn");
var listItems = document.getElementById("my-list").getElementsByTagName("li");
var myHead = document.getElementById("my-header");
var link = document.getElementById('link');


myList.addEventListener("click",listClick);

function listClick(e)
{
    if(e.target.nodeName == "LI"){
        myHead.innerHTML=(e.target.innerHTML+" selected ");
        //removeBg();
        console.log("list clicked");
        console.log(e.target.parentNode.children.length)
        for (i = 0; i < e.target.parentNode.children.length; i++){
            e.target.parentNode.children[i].classList.remove("listbg");
        }
        e.target.classList.add("listbg");   
        
    }
   
}

// Function to identify the button click & add new item
function buttonClick() {
    myButton.classList.add("clicked");
    console.log("button class changed");
    myList.innerHTML+=("<li>New List Item "+newItemCount+".</li>");
    newItemCount++;
    //alert("Clicked!");
}
myButton.addEventListener("click", buttonClick);


function goPage2() {
    location.assign("page2.html");
}

//Test code to hide an object.
hideButton.addEventListener("click",hide);

function hide() {
    if (hideButton.innerHTML=='Hide'){
        console.log("Hide Click Detected");
        console.log("Hiding link");
        link.classList.add('hidden');
        hideButton.innerHTML='Show';
    }
    else{
        console.log("Show Click Detected");
        console.log("Showing link");
        link.classList.remove('hidden');
        hideButton.innerHTML='Hide';
    }
    
    
   // nxtButton.classList.add("hidden");
}



