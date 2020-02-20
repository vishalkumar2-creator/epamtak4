package com.epam.Interest;

public class EstimationOfHomeConstruction {
	private int typeOfMaterial;
    private double areaOfHouse;
    private boolean isHouseAutomated;
    private double estimationOfCost;
   public EstimationOfHomeConstruction(int typeOfMaterial,double areaOfHouse,boolean isHouseAutomated){
        this.typeOfMaterial =typeOfMaterial;
        this.areaOfHouse = areaOfHouse;
        this.isHouseAutomated = isHouseAutomated;
        switch(this.typeOfMaterial){
            case 0: this.estimationOfCost = 1200;
                    break;
            case 1: this.estimationOfCost = 1500;
                    break;
            case 2: this.estimationOfCost = 1800;
                    break;
        }
        if(this.isHouseAutomated){
            this.estimationOfCost += 700;
        }
    }
    public double Estimation(){
        return this.estimationOfCost * this.areaOfHouse;
    }
}
