package com.exampleModel.demoModel.controller;

import com.exampleModel.demoModel.model.Vehicle;
import com.exampleModel.demoModel.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle addVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.addVehicle(vehicle);
    }
    @GetMapping()
    public List<Vehicle> getVehicles(){
        return vehicleService.getVehicles();
    }
    @GetMapping(value = "/{id}")
    public Vehicle getVehicle(@PathVariable("id") int id){

        return vehicleService.getVehicle(id);
    }
    @PutMapping(value = "/{id}")
    public Vehicle updateVehicle(@PathVariable("id") int id, @RequestBody Vehicle vehicle){
        return vehicleService.updateVehicle(id, vehicle);
    }
    @DeleteMapping(value = "/{id}")
    public void deleteVehicle(@PathVariable("id") int id){
        vehicleService.deleteVehicle(id);
    }
}
