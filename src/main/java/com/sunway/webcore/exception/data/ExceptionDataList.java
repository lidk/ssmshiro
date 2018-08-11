package com.sunway.webcore.exception.data;

public class ExceptionDataList {

	public static ExceptionData PASSWORD_ERROR = new ExceptionData(4011, "passwordError");//密码错误

	public static ExceptionData PASSWORD_UNMATCH = new ExceptionData(4012, "passwordUnmatched");//密码不匹配

	public static ExceptionData SERVER_ERROR = new ExceptionData(500, "serverError");//服务器错误

	public static ExceptionData UPDATE_ERROR = new ExceptionData(1001, "updateError");

	public static ExceptionData DELETE_ERROR = new ExceptionData(1002, "deleteError");

	public static ExceptionData INSERT_ERROR = new ExceptionData(1003, "insertError");

	public static ExceptionData SELECT_ERROR = new ExceptionData(1004, "selectError");//查询出错
	
	public static ExceptionData PARAMETER_ERROR = new ExceptionData(100, "parameterError");//参数错误
	
	public static ExceptionData DBSERVER_ERROR = new ExceptionData(805, "数据库操作出错，请重试");//仅做说明 不调用
}
