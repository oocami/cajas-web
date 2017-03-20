package cajas.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class LoginException extends BusinessException {

	private static final long serialVersionUID = 1L;

	public LoginException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}