/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datademo.bean;

import java.io.Serializable;

public class Car implements Serializable {
 
    private String name;
    private String model;
 
    public Car() {
 
    }
 
    public Car(String name, String model) {
        this.name = name;
        this.model = model;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getModel() {
        return model;
    }
 
    public void setModel(String model) {
        this.model = model;
    }
 
}