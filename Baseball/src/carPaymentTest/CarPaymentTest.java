package carPaymentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import carPayment.Car;

import java.lang.Math;

public class CarPaymentTest {
	
	@Test
	public void monthlyPayment_Test1() {
		
		Car aCar = new Car(35000, 0, 60, 0.10);
		
		assertTrue(Math.round(aCar.monthlyPayment()) == Math.round(743.65));
		
	}
	
	@Test
	public void totalInterest_Test1() {
		
		Car aCar = new Car(35000, 0, 60, 0.10);
		
		System.out.print(aCar.totalInterest());
		
		assertTrue(Math.round(aCar.totalInterest()) == Math.round(9618.79));
		
	}
	

}
