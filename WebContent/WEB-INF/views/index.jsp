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
	#form_site {
		width: 100%;
	    display: inherit;
	}
</style>
</head>
<body>
	<div>
		<div class="mdl-grid">
			<div class="mdl-cell mdl-cell--3-col"></div>
			<div class="mdl-cell mdl-cell--6-col" id="div_pageIntroduce">환영합니다!<br>음악 재생 사이트에 구애받지 않고 플레이리스트를 자유롭게 플레이리스트를 옮기세요.</div>
			<div class="mdl-cell mdl-cell--3-col"></div>
		</div>
		<div class="mdl-grid">
			<form id="form_site" method="post" action="">
				<div class="mdl-cell mdl-cell--2-col"></div>
				<div class="mdl-cell mdl-cell--3-col">
					<div class="mdl-grid">
						플레이리스트가 저장되어 있는 사이트를 선택하세요. 
					</div>
					<div class="mdl-grid">
						<label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="site1-option1">
							<input type="radio" id="site1-option1" class="mdl-radio__button" name="site1" value="melon">
							<span class="mdl-radio__label">멜론(MELON)</span>
						</label>
					</div>
					<div class="mdl-grid">
						<label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="site1-option2">
							<input type="radio" id="site1-option2" class="mdl-radio__button" name="site1" value="genie">
							<span class="mdl-radio__label">지니(Genie)</span>
						</label>
					</div>
				</div>
				<div class="mdl-cell mdl-cell--1-col">화살표</div>
				<div class="mdl-cell mdl-cell--3-col">
					<div class="mdl-grid">
						플레이리스트를 옮길 사이트를 선택하세요. 
					</div>
					<div class="mdl-grid">
						<label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="site2-option1">
							<input type="radio" id="site2-option1" class="mdl-radio__button" name="site2" value="melon">
							<span class="mdl-radio__label">멜론(MELON)</span>
						</label>
					</div>
					<div class="mdl-grid">
						<label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="site2-option2">
							<input type="radio" id="site2-option2" class="mdl-radio__button" name="site2" value="genie">
							<span class="mdl-radio__label">지니(Genie)</span>
						</label>
					</div>
				</div>
				<div class="mdl-cell mdl-cell--1-col">
					<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" id="btn_submit">선택 완료</button>
				</div>
				<div class="mdl-cell mdl-cell--2-col"></div>
			</form>
		</div>
	</div>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.amber-red.min.css" />
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</body>
</html>