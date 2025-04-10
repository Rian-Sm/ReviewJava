package com.rns.demo;

import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name;
    private String address;
    private String phone;

    public Customer() {
        this.name = "Default NAME";
        this.address = "DEFAULT ADDRESS";
        this.phone = "1111-1111";
    }

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
