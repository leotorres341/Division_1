package com.example.division.division;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/division")
public class division {

    @GetMapping("/{a}/{b}")
    public ResponseEntity<?> resta(@PathVariable int a, @PathVariable int b) {
        if(a < b) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error 400: 'a' no puede ser menor que 'b'");
        } else if (a == b) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error 400: 'a' no puede ser igual a 'b'");
        } else {
            int resultado = a / b;
            return ResponseEntity.ok(resultado);
        }
    }

}