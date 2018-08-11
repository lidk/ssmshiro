package com.sunway.webcore.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunway.webcore.common.model.ParamError;
import com.sunway.webcore.utils.LogFactory;

public class BaseExceptionHandleAction {
	/** 基于@ExceptionHandler异常处理 */
	/*
	 * @ExceptionHandler public ModelAndView
	 * handleAndReturnPage(HttpServletRequest request, HttpServletResponse
	 * response, Exception ex) {
	 * 
	 * ModelAndView mv = new ModelAndView("Exception") ; mv.addObject("ex", ex);
	 * 
	 * // 根据不同错误转向不同页面 if (ex instanceof BusinessException) { return mv; } else
	 * { return mv; //返回Exception.jsp页面 } }
	 */

	/** 基于@ExceptionHandler异常处理 */
	@ExceptionHandler
	@ResponseBody
	public BasePostException handleAndReturnData(HttpServletRequest request, HttpServletResponse response,
			Exception ex) {

		BasePostException res = new BasePostException();
		if (ex instanceof BaseException) {
			BaseException e = (BaseException) ex;
			res.setCode(e.getCode());
			res.setLogMes(e.getLogMes());
		} else if (ex instanceof BindException) {
			BindException e = (BindException) ex;
			BaseBindException dataEx = new BaseBindException();
			dataEx.setCount(e.getErrorCount());
			List<ParamError> params = new ArrayList<ParamError>();
			List<FieldError> errors = e.getFieldErrors();
			for (FieldError error : errors) {
				ParamError param = new ParamError();
				param.setCode(error.getCode());
				param.setDefaultMessage(error.getDefaultMessage());
				param.setDtoName(error.getObjectName());
				param.setField(error.getField());
				params.add(param);
			}
			dataEx.setParams(params);
			res.setData(dataEx);
			res.setCode(100);
			res.setLogMes(e.getMessage());
		} else {
			res.setCode(500);
			res.setLogMes("Uncustomized error");
		}
		res.setMsg(ex.getMessage());
		res.setExcetion(ex.getClass().getSimpleName());
		String loguuid = UUID.randomUUID().toString();
		Logger logger = LogFactory.createLogger(loguuid);
		logger.error(res.errorLog());
		LogFactory.stop(loguuid);
		return res;
	}

}
