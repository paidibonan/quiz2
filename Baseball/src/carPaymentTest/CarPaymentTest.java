package carPaymentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import carPayment.Car;

public class CarPaymentTest {
	
	@Test
	public void monthlyPayment_Test() {
		
		Car aCar = new Car(35000, 0, 60, 0.10);
		
		assertTrue(aCar.monthlyPayment() == 743.65);
		
	}
	
	@Test
	public void totalInterest() {
		
		Car aCar = new Car(35000, 0, 60, 0.10);
		
		assertTrue(aCar.totalInterest() == 9618.79);
	}

}
