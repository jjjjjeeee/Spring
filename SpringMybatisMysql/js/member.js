function memberCheck(){
	let userid = document.getElementById("userid");
	if(userid.value==''){
		alert("아이디를 입력하거라");
		userid.focus();
		return false;
	}
	/////////////////////////////////////
	if(document.getElementById("idchk").value=='N'){
		alert("아이디 중복검사 하세요");
		return false;
	}
	/////////////////////////////////////
	let userpwd = document.getElementById("userpwd");
	let userpwd2 = document.getElementById("userpwd2");
	if(userpwd.value=='' || userpwd2.value==''){
		alert("비밀번호 입력 필쑤");
		userpwd.focus();
		return false;
	}
	if(userpwd.value!=userpwd2.value){
		alert("비밀번호가 일치하지 않.");
		userpwd.focus();
		return false;
	}
	
	let username = document.querySelector("#username");
	if(username.value==""){
		alert("이름을 입력해라!!");
		username.focus();
		return false;
	}
	
	let tel2 = document.querySelector("#tel2");
	let tel3 = document.getElementById("tel3");
	
	let regExp1 = /^[0-9]{3,4}$/; //tel2
	let regExp2 = /^[0-9]{4}$/; //tel3
	if(!regExp1.test(tel2.value) || !regExp2.test(tel3.value)){
		alert("전화번호를 잘못 입력하였습니다!!!!!");
		tel2.focus();
		return false;
	}
	return true;
}