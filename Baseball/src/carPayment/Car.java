
package carPayment;

import java.lang.Math;

public class Car {
	
	private int carCost;
	private int downPayment;
	private int loanLengthMonths;
	private double interestRate;
	
	public Car(int cc, int dp, int ll, double ir) {
		this.carCost = cc;
		this.downPayment = cc;
		this.loanLengthMonths = ll;
		this.interestRate = ir;
	}
	
	public double monthlyPayment() {
		double P = ((double)this.carCost - (double)this.downPayment);
		double monthRate = this.interestRate / 12;
		double n = (double)this.loanLengthMonths;
		double num = (monthRate * (Math.pow(1+monthRate, n)));
		double denom = (Math.pow(1+monthRate, n) - 1);
		
		return P * (num/denom);
	}
	
	public double totalInterest() {
		double nm = (double)this.loanLengthMonths * this.monthlyPayment();
		return nm - (double)this.carCost - (double)this.downPayment;
	}
	
	

}
