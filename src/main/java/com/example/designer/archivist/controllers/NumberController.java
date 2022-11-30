package com.example.designer.archivist.controllers;

import com.example.designer.archivist.controllers.model.NumbersDecimal;
import com.example.designer.archivist.controllers.repositories.NumberRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumberController {

    private NumberRepository numbersRepository;

    public NumberController(NumberRepository numbersRepository) {
        this.numbersRepository = numbersRepository;
    }

    @GetMapping("/numbers")
    @ResponseBody
    public List<NumbersDecimal> getAllNumber(Model model) {
        return numbersRepository.getAllNumbers();
    }

//    @GetMapping("/detail") //конечный адрес
//    @ResponseBody // то что должно улететь клиенту (тело ответа)
//    public String detail(){
//        return "8ПБ.";
//    }
//
//    @GetMapping("/assemble")
//    @ResponseBody
//    public String assemble(@RequestParam String a,@RequestParam String b, @RequestParam(required = false) String c){
//        return "5ПБ."+ a + "." + b + c;
//    }
//
//    @GetMapping("/product")
//    @ResponseBody
//    public String product(){
//        return "3ПБ.";
//    }
//
//    @GetMapping("/id/{name}/info")
//    @ResponseBody
//    public String name(@PathVariable String name){
//        return "3ПБ.005.369 " + name;
//    }
//
//    @GetMapping("/numbers")
//    public String allDecimalDrawingNumber(Model model) {
//        model.addAttribute("numbers", numbersRepository.getAllNumbers());
//        return "number_page";
//    }
//
//    @GetMapping("/numbers/{id}")
//    public String getDecimalDrawingNumber(Model model, @PathVariable Long id) {
//        NumbersDecimal numbersDecimal = numbersRepository.findById(id);
//        model.addAttribute("number", numbersDecimal);
//        return "number_info_page";
//    }
//
//    @GetMapping("/show_form")
//    public String showFormPage(){
//        return "simple_format";
//    }
//
//    @GetMapping("/number_add")
//    public String addNumber(@RequestParam Long id, @RequestParam String titleFactory, @RequestParam Integer nameDetails, @RequestParam Integer numberDetails){
//        NumbersDecimal numbersDecimal = new NumbersDecimal(id, titleFactory, nameDetails, numberDetails);
//        numbersRepository.add(numbersDecimal);
//        return "redirect:/numbers";
//    }
}
