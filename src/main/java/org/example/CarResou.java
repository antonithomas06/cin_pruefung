package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/resources/carlist")
public class CarResou {

    private final CarRepo carRepo;

    public CarResou(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @GetMapping
    public List<Car> retrieveAll() {
        return carRepo.findAll();
    }

}
