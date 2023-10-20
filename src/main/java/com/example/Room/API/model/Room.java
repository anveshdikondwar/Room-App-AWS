package com.example.Room.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name  = "OYO")
public class Room {

    @Id
    private Integer roomId;


    private Integer roomNumber;

    private type roomType;

    @Column(name = "available")
    private boolean roomAvailable;


    private double roomPrice;
}
