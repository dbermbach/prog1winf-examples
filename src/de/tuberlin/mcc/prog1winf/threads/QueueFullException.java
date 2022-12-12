/**
 * 
 */
package de.tuberlin.mcc.prog1winf.threads;

/**
 * @author Dave
 *
 */
public class QueueFullException extends Exception {

	/**
	 * 
	 */
	public QueueFullException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public QueueFullException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public QueueFullException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public QueueFullException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public QueueFullException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
