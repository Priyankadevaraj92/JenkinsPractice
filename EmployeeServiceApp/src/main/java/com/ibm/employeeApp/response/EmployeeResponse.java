package com.ibm.employeeApp.response;

public class EmployeeResponse {

	private int status;
	private String message;
	private Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public EmployeeResponse(final int status, final String message, final Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

}
