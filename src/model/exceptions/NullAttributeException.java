package model.exceptions;

public class NullAttributeException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public NullAttributeException() {
		super("Atributo sem valor");
	}

}
