package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle {
    /*
    makeModel : String
    year : int
    odometer : int
    Methods: constructor
    all getters / setters
    getValue() : BigDecimal (override)
    // A car's value is determined as
    // 0-3 years old - 3% reduced value of cost per year
    // 4-6 years old - 6% reduced value of cost per year
    // 7-10 years old - 8% reduced value of cost per year
    // over 10 years old - $1000.00
    // MINUS reduce final value by 25% if over 100,000 miles
    // unless makeModel contains word Honda or Toyota
     */
    String makeModel;
    int year;
    int odometer;

    public Vehicle(String makeModel, int year, int odometer) {
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    //@Override
    public BigDecimal getValue(BigDecimal value) {
        return value;
    }
}
