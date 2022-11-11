package com.api.parkingcontrolapi.repositories;

import com.api.parkingcontrolapi.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
