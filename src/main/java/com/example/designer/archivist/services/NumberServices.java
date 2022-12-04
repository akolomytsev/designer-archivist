package com.example.designer.archivist.services;

import com.example.designer.archivist.model.NumbersDecimal;
import com.example.designer.archivist.repositories.NumberRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class NumberServices {

    private NumberRepository numberRepository;

    public NumberServices(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
    }

    public List<NumbersDecimal> getAllNumbers() {
        return numberRepository.getAllNumbers();
    }

    public void deleteById(Long id) {
        numberRepository.deleteById(id);
    }

    public void numberDetails(Long numberId, Integer delta) {
        NumbersDecimal numbersDecimal = numberRepository.findById(numberId);
        numbersDecimal.setNumberDetails(numbersDecimal.getNumberDetails() + delta);
    }
}
