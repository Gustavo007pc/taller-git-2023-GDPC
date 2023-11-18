package com.gp.demo.exceptions;

public class ErrorException extends Exception {

	private static final long serialVersionUID = 1L;
	private String contacto;

	public ErrorException() {
		// TODO Auto-generated constructor stub
	}

	public ErrorException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ErrorException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public ErrorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public ErrorException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}


	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	

}
