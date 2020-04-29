/*// Authorization
var modal = document.getElementById("myModal");

var btn = document.getElementById("myBtn");

var span = document.getElementsByClassName("close")[0];

btn.onclick = function() {
  modal.style.display = "block";
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
}*/

// Messages
function connect() {
	var socket = new SockJS('/chat-messaging');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		console.log("connected: " + frame);
		stompClient.subscribe('/chat/messages', function(response) {
			var data = JSON.parse(response.body);
			draw("left", data.message);
		});
	});
}

function draw(side, text) {
	console.log("drawing...");
	var $message;
	$message = $($('.message_template').clone().html());
	$message.addClass(side).find('.text').html(text);
	$('.messages').append($message);
	return setTimeout(function () {
		return $message.addClass('appeared');
	}, 0);

}
function disconnect(){
	stompClient.disconnect();
}
function sendMessage(){
	stompClient.send("/app/message", {}, JSON.stringify({'message': $("#message_input_value").val()}));
}




