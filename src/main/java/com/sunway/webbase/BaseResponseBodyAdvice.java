package com.sunway.webbase;

import java.io.File;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.sunway.webcore.exception.BasePostException;

import org.springframework.http.HttpMethod;

import springfox.documentation.swagger.web.UiConfiguration;

@ControllerAdvice
public class BaseResponseBodyAdvice implements ResponseBodyAdvice<Object> {

	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		// TODO Auto-generated method stub
		return MappingJackson2HttpMessageConverter.class.isAssignableFrom(converterType);
	}

	@Override
	public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
			Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request,
			ServerHttpResponse response) {
		// TODO Auto-generated method stub
		System.out.println("统一返回");
		if (body == null) {
			return body;
		}

		if (request.getMethod().equals(HttpMethod.POST)) {
			if (body instanceof BasePostResult) {
				return body;
			} else if (body instanceof File) {
				return body;
			} else if (body instanceof UiConfiguration) {
				return body;
			} else if (body instanceof BasePostException) {
				BasePostException ex = (BasePostException) body;
				BasePostResult result = new BasePostResult(false, ex.getMsg(), body, ex.getCode());
				return result;
			} else {
				BasePostResult result = new BasePostResult(true, "", body, 0);
				// body.setB("我是后面设置的");
				return result;
			}
		} else {
			return body;
		}
	}

}
