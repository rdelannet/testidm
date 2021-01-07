package exception;

public class BadBadValueException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BadBadValueException (String s) {
	       super(s) ;
	   }
}
