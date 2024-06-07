package com.project.webCrude.infra;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice// indico para o Spring todas as vezes que existir exceções
public class RequestsExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity threat404(){

        var response = new ExceptionDTO("Not found item");
        return ResponseEntity.badRequest().body(response);

    }
}
