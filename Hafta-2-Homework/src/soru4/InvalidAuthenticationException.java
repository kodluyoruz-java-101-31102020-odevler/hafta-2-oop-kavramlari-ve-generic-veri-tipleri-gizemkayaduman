package soru4;

public class InvalidAuthenticationException extends Exception{
	
private static final long serialVersionUID = -1512968406062966965L;
	
	private int code;
	private String message;
	
	public InvalidAuthenticationException(int code, String message) {
		this.setMessage(message);
		this.setCode(code);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
