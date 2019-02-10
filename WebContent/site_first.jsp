<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#div_pageIntroduce {
		text-align: center;
	}
	#form_site1 {
		width: 100%;
	    display: inherit;
	}
</style>
</head>
<body>
	<div>
		<div class="mdl-grid">
			<div class="mdl-cell mdl-cell--3-col"></div>
			<div class="mdl-cell mdl-cell--6-col" id="div_pageIntroduce">플레이리스트를 옮길 사이트의 아이디, 비밀번호를 입력하세요.</div>
			<div class="mdl-cell mdl-cell--3-col"></div>
		</div>
		<div class="mdl-grid">
			<form id="form_site1" method="post" action="">
				<div class="mdl-cell mdl-cell--3-col"></div>	 
				<div class="mdl-cell mdl-cell--3-col">
					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
					    <input class="mdl-textfield__input" type="text" id="site1_id">
					    <label class="mdl-textfield__label" for="sample3">MELON ID</label>
					</div>
				</div>
				<div class="mdl-cell mdl-cell--3-col">
					<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
					    <input class="mdl-textfield__input" type="text" id="site1_pwd">
					    <label class="mdl-textfield__label" for="sample3">MELON PASSWARD</label>
					</div>
				</div>
				<div class="mdl-cell mdl-cell--3-col">
					<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" id="btn_submit">입력 완료</button>
				</div>
			</form>
		</div>
	</div>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.amber-red.min.css" />
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</body>
</html>