package com.rk.beans;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.rk")
public class Organization {
    private String organizationName;
    private Pic picOrg;

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public void setPicOrg(Pic picOrg) {
        this.picOrg = picOrg;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "organizationName='" + organizationName + '\'' +
                ", picOrg=" + picOrg +
                '}';
    }
}
