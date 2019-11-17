package com.exampleModel.demoModel.service;

import com.exampleModel.demoModel.model.Vehicle;
import com.exampleModel.demoModel.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;


    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return (List<Vehicle>) vehicleRepository.findAll();
    }

    public Vehicle getVehicle(int id) {
        return vehicleRepository.findById(id).get();
    }

    public Vehicle updateVehicle(int id, Vehicle vehicle) {
        vehicle.setId(id);
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(int id) {
        vehicleRepository.deleteById(id);
    }


}
