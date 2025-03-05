package com.xiaowen.personinfo.exception;


import com.xiaowen.personinfo.controller.ExceptionController;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "com.xiaowen.personinfo.controller", assignableTypes = ExceptionController.class)
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<?> handleAppExecption(BaseException ex, HttpServletRequest request){
        ErrorResponse response = new ErrorResponse(ex, request.getRequestURI());
        return new ResponseEntity<>(response, new HttpHeaders(), ex.getError().getStatus());
    }


    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleResourceNotFoundException(ResourceNotFoundException ex, HttpServletRequest request) {
        ErrorResponse errorReponse = new ErrorResponse(ex, request.getRequestURI());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorReponse);
    }



}
