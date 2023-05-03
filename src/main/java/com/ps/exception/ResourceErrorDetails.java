package com.ps.exception;

public class ResourceErrorDetails {

	private int Status;

	private String Message;

	private long TimeStamp;

	public int getStatus() {
		return Status;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public long getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		TimeStamp = timeStamp;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public ResourceErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceErrorDetails(int status, String message, long timeStamp) {
		super();
		Status = status;
		Message = message;
		TimeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ResourceErrorDetails [Status=" + Status + ", Message=" + Message + ", TimeStamp=" + TimeStamp + "]";
	}
	
	
	
}
