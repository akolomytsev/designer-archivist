package com.example.designer.archivist.controllers;

import com.example.designer.archivist.model.NumbersDecimal;
import com.example.designer.archivist.services.NumberServices;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class NumberController {

    private NumberServices numberServices;

    public NumberController(NumberServices numberServices) {
        this.numberServices = numberServices;
    }

    @GetMapping("/numbers")
    public List<NumbersDecimal> getAllNumbers() {
        return numberServices.getAllNumbers();
    }

    @GetMapping("/numbers/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        numberServices.deleteById(id);
    }

    @GetMapping("/numbers/change_number")
    public void changeNumber (@RequestParam Long numberId, @RequestParam Integer delta){
        numberServices.numberDetails(numberId, delta);
    }
}
