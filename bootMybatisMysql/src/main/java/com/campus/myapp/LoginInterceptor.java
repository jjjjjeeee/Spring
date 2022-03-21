package com.campus.myapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor implements HandlerInterceptor{
	// ��Ʈ�ѷ��� ȣ��Ǳ� ���� ����� �޼ҵ�
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
		// false: �α������� ������
		// true: �ش� ��Ʈ�ѷ��� �̵��Ѵ�.
		
		// request��ü���� session��ü�� ������
		HttpSession session = request.getSession();
		
		// �α��� ���¸� ���ϱ�
		String logStatus = (String)session.getAttribute("logStatus");
		
		if(logStatus != null && logStatus.equals("Y")) { // �α��� �Ǿ�����
			return true; // ������ ����
		}else { // �α��� �ȵȰ�� 
			// �α��� Ȩ�������� �̵�
			response.sendRedirect("/member/loginForm");
			return false;
		}
	}
}
