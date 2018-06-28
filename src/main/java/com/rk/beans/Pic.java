package com.rk.beans;


import org.springframework.stereotype.Component;

@Component
public class Pic {
    private String picName;

    public void setPicName(String picName) {
        this.picName = picName;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "picName='" + picName + '\'' +
                '}';
    }
}
