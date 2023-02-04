package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;


import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cars")
public class CarController {
    @GetMapping("/")
    public CarDTO getCar(@RequestParam String id, @RequestParam String modelName, double price){

        return new CarDTO(id, modelName, price);
    }
    @PostMapping("/")
    @ResponseBody
    public String printCar(@Validated @RequestBody CarDTO car){
        System.out.println(car);
        return HttpStatus.CREATED.toString();
    }
}

