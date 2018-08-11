package com.sunway.webbase;

import java.io.Serializable;

public class BaseInfo implements Serializable {

	@Override
	public String toString() {
		return "BaseInfo []";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7432489853028651267L;

	public static BaseResult successUpdateResult = new BaseResult(true, "Update success");

	public static BaseResult errorUpdateResult = new BaseResult(false, "Update failed");

	public static BaseResult succesDeleteResult = new BaseResult(true, "Delete success");

	public static BaseResult errorDeleteResult = new BaseResult(false, "Delete failed");

	public static BaseResult successInsertResult = new BaseResult(true, "Insert success");

	public static BaseResult successSelectResult = new BaseResult(true, "Select success");

	public static BaseResult errorSelectResult = new BaseResult(true, "Select success");

	public static BaseResult errorInsertResult = new BaseResult(false, "Insert failed");

	public static String errorParameter = "Error parameter";

	public static String errorDataBase = "Error dataBase";

	public String getErrorDataBase() {
		return errorDataBase;
	}

	public String getErrorParameter() {
		return errorParameter;
	}

	public BaseResult getSuccessUpdateResult() {
		return successUpdateResult;
	}

	public BaseResult getErrorUpdateResult() {
		return errorUpdateResult;
	}

	public BaseResult getSuccesDeleteResult() {
		return succesDeleteResult;
	}

	public BaseResult getErrorDeleteResult() {
		return errorDeleteResult;
	}

	public BaseResult getSuccessInsertResult() {
		return successInsertResult;
	}

	public BaseResult getErrorInsertResult() {
		return errorInsertResult;
	}

	public BaseResult getSuccessSelectResult() {
		return successSelectResult;
	}

	public BaseResult getErrorSelectResult() {
		return errorSelectResult;
	}
}
