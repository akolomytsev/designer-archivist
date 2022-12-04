package com.example.designer.archivist.repositories;

import com.example.designer.archivist.model.NumbersDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class NumberRepository {

    private List<NumbersDecimal> numbersDecimals;

    @PostConstruct
    public void init() {
        numbersDecimals = new ArrayList<>(List.of(
                new NumbersDecimal(1L, 3, "ПБ", 543, 378, "Швах"),
                new NumbersDecimal(2L, 3, "ПБ", 543, 379, "Плюх"),
                new NumbersDecimal(3L, 3, "ПБ", 543, 380, "Мух")
        ));
    }

    public List<NumbersDecimal> getAllNumbers() {
        return Collections.unmodifiableList(numbersDecimals);
    }

    public NumbersDecimal findById(Long id) {
        return numbersDecimals.stream().filter(s -> s.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException("Number not found"));
    }
//
//    public void add(NumbersDecimal numbersDecimal) {
//        numbersDecimals.add(numbersDecimal);
//    }

    public void deleteById(Long id) {
        numbersDecimals.removeIf(s-> s.getId().equals(id));
    }
}
