package com.datademo.bean;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CarBean implements Serializable {
 
    private List<Car> list;
 
    @PostConstruct
    public void init() {
        list = new ArrayList<>();
        list.add(new Car("kia", "2023"));
        list.add(new Car("swift", "2021"));
        list.add(new Car("suzuki", "2024"));
        list.add(new Car("ford", "2020"));
        list.add(new Car("honda", "2022"));
        list.add(new Car("tata", "2019"));
        list.add(new Car("mahindra", "2018"));
    }
 
    public List<Car> getList() {
        return list;
    }
}
