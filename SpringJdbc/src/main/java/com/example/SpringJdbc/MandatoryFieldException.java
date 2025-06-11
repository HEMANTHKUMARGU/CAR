package com.example.SpringJdbc;

public class MandatoryFieldException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	String msg;
	public MandatoryFieldException(String msg)
	{
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
