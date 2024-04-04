<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
	integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.js"
	integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h1>회원가입</h1>
		<form method="post" action="/lesson06/ex01/add-user">
			<div class="form-group">
				<label for="name">이름</label> <input type="text" id="name"
					name="name" class="form-control col-3">
			</div>
			<div class="form-group">
				<label for="yyyymmdd">생년월일</label> <input type="text" id="yyyymmdd"
					name="yyyymmdd" class="form-control col-3"
					placeholder="예) 19951108">
			</div>
			<div class="form-group">
				<label for="email">이메일</label> <input type="text" id="email"
					name="email" class="form-control col-3">
			</div>
			<div class="form-group">
				<label for="introduce">자기소개</label>
				<textarea id="introduce" name="introduce" class="form-control col-3"></textarea>
			</div>
			<input type="button" id="joinBtn" value="회원가입" class="btn btn-success">
		</form>
	</div>
	
	<script>
		$(document).ready(function() {
			// 1) jquery의 submit - form 태그
			
			/* $("form").on('submit', function(e) {
				// e.preventDefault();  // 서브밋 기능 중단 
				
				// validation
				let name = $("input[name=name]").val().trim();
				if (name.length < 1) {
					alert("이름을 입력허세요");
					return false;
				}
				
				let yyyymmdd = $("input[name=yyyymmdd]").val().trim();
				if (yyyymmdd == "") {
					alert("생년월일을 입력허세요");
					return false;
				}
				
				let email = $("input[name=email]").val().trim();
				if (!email) {
					alert("이메일을 입력허세요");
					return false;
				}
				
				alert("submit");
			}); */
			
			// 2) jquery의 AJAX 통신 이용
			
			$("#joinBtn").on('click', function() {
				// validation
				let name = $("input[name=name]").val().trim();
				if (name.length < 1) {
					alert("이름을 입력허세요");
					return;
				}
				
				let yyyymmdd = $("input[name=yyyymmdd]").val().trim();
				if (yyyymmdd == "") {
					alert("생년월일을 입력허세요");
					return;
				}
				
				let email = $("input[name=email]").val().trim();
				if (!email) {
					alert("이메일을 입력허세요");
					return;
				}
				
				let introduce = $("textarea[name=introduce]").val().trim();
				
				console.log(name);
				console.log(yyyymmdd);
				console.log(email);
				console.log(introduce);
				
				// alert("체크 완료");
				// AJAX 통신: 서버에 요청
				$.ajax({
					// request
					type: 'POST'
					, url: '/lesson06/ex01/add-user'
					, data: {"name":name, "yyyymmdd":yyyymmdd, "email":email, "introduce":introduce}
					// response
					// callback 함수
					, success:function(data) { // data 파라미타: 응답값(String)
						if (data == "성공") {
							// 회원가입 완료 화면으로 이동
							location.href="/lesson06/ex01/after-add-user-view";
						}
					}
					, error:function(xhr, status, error) {
						alert(xhr);
						alert(status);
						alert(error);
					}
				});
			});
		});
	</script>
</body>
</html>