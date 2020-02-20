package com.epam.Interest;

public class Interest {
	private double principalAmount,timePeriod,rateOfInterest,amount;
	public Interest(double principalAmount,double timePeriod,double rateOfInterest)
	{
		this.principalAmount=principalAmount;
		this.timePeriod=timePeriod;
		this.rateOfInterest=rateOfInterest;
	}
	double SimpleInterest()
	{
		return (principalAmount*timePeriod*rateOfInterest)/100;
	}
	double CompundInterest()
	{
		this.amount=principalAmount*(Math.pow(1+(rateOfInterest/100),timePeriod));
		return this.amount-principalAmount;
	}
}
