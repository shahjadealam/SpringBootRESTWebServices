package spring.boot.base.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "No such file")
public class CustomException extends Exception {

	String message;

	public CustomException(String message) {
		super(message);

	}
}
