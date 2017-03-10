package br.com.tt.exception;

public class ClienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ClienteException() {
		super();
	}

	public ClienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ClienteException(String message, Throwable cause) {
		super(message, cause);
	}

	public ClienteException(String message) {
		super(message);
	}

	public ClienteException(Throwable cause) {
		super(cause);
	}

}
