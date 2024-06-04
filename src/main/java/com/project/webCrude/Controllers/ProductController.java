package com.project.webCrude.Controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// aqui avisamos para o spring que aqui ficará o rest controller
@RequestMapping("/product")
//esse controller ouvirá esse endpoint

public class ProductController {

    @GetMapping
    public ResponseEntity getAllProducts(){
    return ResponseEntity.ok("deu ok");
    }

}
