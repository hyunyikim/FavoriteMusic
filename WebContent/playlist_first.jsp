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
	#form_site2 {
		width: 100%;
	    display: inherit;
	}
	#div_playlist, #div_songs {
		background-color: #efefef;
	}
	
	
	.demo-list-control {
	  width: 300px;
	}
	
	.demo-list-radio {
	  display: inline;
	}
</style>
</head>
<body>
	<div>
		<div class="mdl-grid">
			<div class="mdl-cell mdl-cell--3-col"></div>
			<div class="mdl-cell mdl-cell--6-col" id="div_pageIntroduce">어느 플레이리스트를 옮기실건가요?</div>
			<div class="mdl-cell mdl-cell--3-col"></div>
		</div>
		<div class="mdl-grid">
			<div class="mdl-cell mdl-cell--2-col"></div>
			<div class="mdl-cell mdl-cell--3-col" id="div_playlist">
				<ul class="demo-list-control mdl-list">
				  <li class="mdl-list__item">
				    <span class="mdl-list__item-primary-content">
				      <i class="material-icons  mdl-list__item-avatar">person</i>
				      	현이 페이보릿
				    </span>
				    <span class="mdl-list__item-secondary-action">
				      <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" for="playlist_1">
				        <input type="radio" id="playlist_1" class="mdl-radio__button" name="playlist" value="1" />
				      </label>
				    </span>
				  </li>
				  <li class="mdl-list__item">
				    <span class="mdl-list__item-primary-content">
				      <i class="material-icons  mdl-list__item-avatar">person</i>
				      	현이 페이보릿2
				    </span>
				    <span class="mdl-list__item-secondary-action">
				      <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" for="playlist_2">
				        <input type="radio" id="playlist_2" class="mdl-radio__button" name="playlist" value="2" />
				      </label>
				    </span>
				  </li>
				</ul>
			</div> 
			<div class="mdl-cell mdl-cell--4-col" id="div_songs">
				<ul class="">
				  <li class="">노래1</li>
				  <li class="">노래1</li>
				  <li class="">노래1</li>
				  <li class="">노래1</li>
				 </ul>
			</div>
			<div class="mdl-cell mdl-cell--1-col">
				<button class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored" id="btn_submit">선택 완료</button>
			</div>
			<div class="mdl-cell mdl-cell--2-col"></div>
			
		</div>
	</div>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.amber-red.min.css" />
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</body>
</html>