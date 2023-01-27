package net.guides.springboot2.springboot2jpacrudexample.exception;

public class ResourceNotFoundException extends Throwable{
	public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
