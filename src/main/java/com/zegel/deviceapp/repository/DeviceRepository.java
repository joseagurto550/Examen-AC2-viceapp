package com.zegel.deviceapp.repository;

import com.zegel.deviceapp.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DeviceRepository extends JpaRepository<Device, Long> {
}
