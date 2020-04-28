// Navbar scrolling
var prevScrollpos = window.pageYOffset;
window.onscroll = function() {
  var currentScrollPos = window.pageYOffset;
  if (prevScrollpos > currentScrollPos) {
    document.getElementById("navbar").style.top = "0";
  } else {
    document.getElementById("navbar").style.top = "-74px";
  }
  prevScrollpos = currentScrollPos;
}

// Authorization
var modal = document.getElementsByClassName("myModal");

var signBtn = document.getElementsByClassName("signBtn");

var span = document.getElementsByClassName("closeRegisterWindow")[0];

for (var i = 0; i < signBtn.length; i++) {
  signBtn[i].onclick = function() {
    for (var n = 0; n < modal.length; n++) {
      modal[n].style.display = "block";
    }
  }
}

span.onclick = function() {
  for (var n = 0; n < modal.length; n++) {
      modal[n].style.display = "none";
    }
}

window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

/* Burger menu */
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

/* Search */
function searchFunction() {
    var input, filter, div, li, a, i;
    input = document.getElementById("searchInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("unitList");
    li = div.getElementsByClassName("unit");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("h1")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";

        }
    }
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





