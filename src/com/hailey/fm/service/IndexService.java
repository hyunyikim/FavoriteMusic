package com.hailey.fm.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hailey.fm.action.Action;
import com.hailey.fm.action.ActionForward;

public class IndexService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = new ActionForward();
		try {
			// 한글 인코딩 설정
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");

			String site1 = (String)request.getParameter("site1");
			String site2 = (String)request.getParameter("site2");

			// 세션에 선택한 두개 사이트 저장	
			HttpSession session = request.getSession();
			session.setAttribute("site1", site1);
			session.setAttribute("site2", site2);	

			forward.setRedirect(false);		//	 얘를 true로 하면 redirect로 간다
			forward.setPath("/WEB-INF/views/site_first.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return forward;
	}

}
