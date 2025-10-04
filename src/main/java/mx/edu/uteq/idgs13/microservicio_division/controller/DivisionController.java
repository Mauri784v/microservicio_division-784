package mx.edu.uteq.idgs13.microservicio_division.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mx.edu.uteq.idgs13.microservicio_division.entity.Division;
import mx.edu.uteq.idgs13.microservicio_division.service.DivisionService;

@RestController
@RequestMapping("/divisiones")
@CrossOrigin(origins = "*")
public class DivisionController {

    @Autowired
    private DivisionService divisionService;

    @PostMapping
    public Division crearDivision(@RequestBody Division division) {
        return divisionService.crearDivision(division);
    }
}
