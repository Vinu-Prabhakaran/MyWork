var backButton = document.getElementById("back-btn");
var ccButton = document.getElementById("cc-btn");
var page2Body = document.getElementById("p2body");

//change color of page2

function cChange() {
    console.log("CC Click Detected");
    page2Body.classList.add("p2color1");
}

ccButton.addEventListener("click",cChange);

function goBack() {
    location.assign("index.html");
}