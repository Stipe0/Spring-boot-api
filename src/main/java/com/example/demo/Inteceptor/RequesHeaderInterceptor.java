package com.example.demo.Inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.example.demo.Exceptions.IllegalIputException;

@Component
public class RequesHeaderInterceptor extends HandlerInterceptorAdapter {

	//@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		if(StringUtils.isEmpty(request.getPathInfo()))
//			throw new IllegalIputException("exception from interceptor");
//		return super.preHandle(request, response, handler);
//	}
	

}
