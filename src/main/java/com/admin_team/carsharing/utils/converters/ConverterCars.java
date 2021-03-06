package com.admin_team.carsharing.utils.converters;

import com.admin_team.carsharing.entity.CarEntity;
import com.admin_team.carsharing.service.CarService;
import com.admin_team.carsharing.dto.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class ConverterCars {

    @Autowired
    private static CarService carService;

    public static CarDTO mapCar(CarEntity carEntity) {
        CarDTO carDto = new CarDTO();

        carDto.setId(carEntity.getId());
        carDto.setBrand(carEntity.getBrand());
        carDto.setModel(carEntity.getModel());
        carDto.setYear(carEntity.getYear());
        carDto.setStateNum(carEntity.getStateNum());
        carDto.setMileage(carEntity.getMileage());
        carDto.setSeats(carEntity.getSeats());
        carDto.setLocation(carEntity.getLocation());
        carDto.setPhoto(carEntity.getPhoto());
        carDto.setTransmissionType(carEntity.getTransmissionType());
        carDto.setCarBody(carEntity.getCarBody());
        carDto.setDriveGear(carEntity.getDriveGear());
        carDto.setEngineType(carEntity.getEngineType());
        carDto.setFuelType(carEntity.getFuelType());
        carDto.setFuelConsumption(carEntity.getFuelConsumption());
        carDto.setConditionInformation(carEntity.getConditionInformation());
        carDto.setInsurance(carEntity.getInsurance());
        carDto.setPriceLease(carEntity.getPriceLease());
        carDto.setAdText(carEntity.getAdText());
        carDto.setIsActivated(carEntity.getIsActivated());
        carDto.setPrice(carEntity.getPrice());
        carDto.setId_owner(carEntity.getId_owner());
        carDto.setOptionalAccessories(carEntity.getOptionalAccessories());
        carDto.setCalendarOfFree(carEntity.getCalendarOfFree());
        carDto.setIsFree(carEntity.getIsFree());
        return carDto;
    }

    public static CarEntity mapCar(CarDTO carDto) {
        CarEntity carEntity;
        Optional<CarEntity> carEntityOptional = carService.findById(carDto.getId());

        if (carEntityOptional.isPresent()) carEntity = carEntityOptional.get();
        else throw new RuntimeException("Incorrect ID of car");

        carEntity.setId(carDto.getId());
        carEntity.setBrand(carDto.getBrand());
        carEntity.setModel(carDto.getModel());
        carEntity.setYear(carDto.getYear());
        carEntity.setStateNum(carDto.getStateNum());
        carEntity.setMileage(carDto.getMileage());
        carEntity.setSeats(carDto.getSeats());
        carEntity.setLocation(carDto.getLocation());
        carEntity.setPhoto(carDto.getPhoto());
        carEntity.setTransmissionType(carDto.getTransmissionType());
        carEntity.setCarBody(carDto.getCarBody());
        carEntity.setDriveGear(carDto.getDriveGear());
        carEntity.setEngineType(carDto.getEngineType());
        carEntity.setFuelType(carDto.getFuelType());
        carEntity.setFuelConsumption(carDto.getFuelConsumption());
        carEntity.setConditionInformation(carDto.getConditionInformation());
        carEntity.setInsurance(carDto.getInsurance());
        carEntity.setPriceLease(carDto.getPriceLease());
        carEntity.setAdText(carDto.getAdText());
        carEntity.setIsActivated(carDto.getIsActivated());
        carEntity.setPrice(carDto.getPrice());
        carEntity.setId_owner(carDto.getId_owner());
        carEntity.setOptionalAccessories(carDto.getOptionalAccessories());
        carEntity.setCalendarOfFree(carDto.getCalendarOfFree());
        carEntity.setIsFree(carDto.getIsFree());
        return carEntity;
    }
}
