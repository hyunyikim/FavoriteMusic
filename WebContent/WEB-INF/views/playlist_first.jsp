<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My PlayList</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
				  <c:forEach var="album" items="${albumList }">
					  <li class="mdl-list__item">
					    <span class="mdl-list__item-primary-content">
					      	${album }
					    </span>
					    <span class="mdl-list__item-secondary-action">
					      <label class="demo-list-radio mdl-radio mdl-js-radio mdl-js-ripple-effect" for="${album }">
					        <input type="radio" id="${album }" class="mdl-radio__button" name="playlist" value="${album }" />
					      </label>
					    </span>
					  </li>
				  </c:forEach>
				  
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
	<script type="text/javascript">
		$('.mdl-radio__button').click(function(){
			var selectedAlbum = $(this).val();
		});
		
		
		function musicList(album){
			$.ajax({
				url: "<%=request.getContextPath()%>/musicList.ajax"
				,data: {
					"album":album
				},success:function(data){
					
				},error:function(error){
					console.log("getMusicList error");
				}
				
			});
		}
	
	</script>
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.amber-red.min.css" />
<script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
</body>
</html>