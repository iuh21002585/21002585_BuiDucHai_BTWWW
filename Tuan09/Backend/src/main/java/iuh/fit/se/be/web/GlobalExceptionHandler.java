package iuh.fit.se.be.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    Map<String, String> handleValidation(MethodArgumentNotValidException ex){
        Map<String,String> errors = new LinkedHashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(err -> errors.put(err.getField(), err.getDefaultMessage()));
        return errors;
    }

    @ExceptionHandler({NoSuchElementException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    Map<String,String> notFound(RuntimeException ex){ return Map.of("error", ex.getMessage()); }

    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.CONFLICT)
    Map<String,String> conflict(RuntimeException ex){ return Map.of("error", ex.getMessage()); }
}
