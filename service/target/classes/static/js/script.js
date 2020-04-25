// Authorization
var modal = document.getElementById("myModal");

var signBtn = document.getElementsByClassName("signBtn");

var span = document.getElementsByClassName("closeRegisterWindow")[0];

for (var i = 0; i < signBtn.length; i++) {
  signBtn[i].onclick = function() {
    modal.style.display = "block";
  }
}

span.onclick = function() {
  modal.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

// Burger menu
function onCount(t){
	if (!t.i) {
		t.i=1; 
		openNav();
	} else { 
		t.i=0;
		closeNav();
	}
}

function openNav(){
	document.getElementById("mySidenav").style.width="448px";
}

function closeNav(){
	document.getElementById("mySidenav").style.width="0";
}

// Job description
var unitDescription = document.getElementsByClassName('unit-description')[0];

var unitBtn = document.getElementsByClassName('hover-image');

var closeBtn = document.getElementsByClassName("close-description")[0];

for (var i = 0; i <unitBtn.length; i++) {
        unitBtn[i].onclick = function(){
        unitDescription.style.display = "block";
  }
}

closeBtn.onclick = function() {
  unitDescription.style.display = "none";
}

window.onclick = function(event) {
  if (event.target == unitDescription) {
    unitDescription.style.display = "none";
  }
}





