package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class NombreController {
    @GetMapping("/mi-nombre")
    public String obtenerNombre() {
        return "Ricardo Andrés Villamizar Méndez";
    }
}
