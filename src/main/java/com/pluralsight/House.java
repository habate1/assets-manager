package com.pluralsight;

import java.math.BigDecimal;

public class House {
    /*
    Properties: address : String
    condition : int (1 -excellent, 2 -good, 3 -fair, 4 -poor)
    squareFoot : int
    lotSize : int
    Methods: constructor
    all getters / setters
    getValue() : BigDecimal (override)
    // A house's value is determined as
    // $180.00 per square foot (excellent)
    // $130.00 per square foot (good)
    // $90.00 per square foot (fair)
    // $80.00 per square foot (poor)
    // PLUS 25 cents per square foot of lot size
     */
    String address;
    int condition;
    int squareFoot;
    int lotSize;

    public House(String address, int condition, int squareFoot, int lotSize) {
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    //@Override
    public BigDecimal getValue(BigDecimal value) {
        return value;
    }
}
