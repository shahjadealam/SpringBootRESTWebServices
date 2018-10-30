package spring.boot.base.crud.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@Autowired
	ResponseData responseData;

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<ResponseData> invalid(Exception e) {

		responseData.setError(e.getMessage());
		responseData.getDescription();
		responseData.setStatus("FAILED");
		return ResponseEntity.ok(responseData);
	}
}
