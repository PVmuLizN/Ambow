let imgAd;
let timeOut1;
let timeOut2;

const showAd = () => {
    imgAd = document.createElement("img");
    imgAd.setAttribute("position", "absolute");
    imgAd.setAttribute("top", "0");
    imgAd.setAttribute("src", "Picture1.png");

    document.body.appendChild(imgAd);
};

const popAd = () => {
    timeOut1 = setTimeout(showAd, 2000);
    timeOut2 = setTimeout(() => {
        imgAd.remove();
    }, 4000);
};

// Create a div to hold the images.
// document.body.appendChild(div);

// Add the images to the div.
var index = 0;
var images = ["q.jpg", "q1.jpg", "q2.jpg"];

function changeImage() {
    var img = document.getElementById("loopAd");
    index = (index + 1) % images.length;
    img.src = images[index];
}
var t = 5;
function timerShow() {
    var timer1 = document.getElementById("timer");

    t -= 1;
    timer1.innerHTML = "";
    timer1.innerHTML = "还有" + t + "秒跳转";
}
function jump() {
    window.location.href = "https://www.baidu.com"
}
// Use a setInterval() function to call the JavaScript function repeatedly.
window.onload = function () {
    popAd();
    setInterval(changeImage, 1000);
    setInterval(timerShow, 1000);
    setTimeout(jump, 5000);
};
