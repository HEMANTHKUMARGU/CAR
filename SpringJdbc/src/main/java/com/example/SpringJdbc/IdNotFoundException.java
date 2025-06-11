package com.example.SpringJdbc;

public class IdNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	
	String errMsg;
	public IdNotFoundException(String errmsg)
	{
		this.errMsg=errmsg;
	}
	
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	

}
