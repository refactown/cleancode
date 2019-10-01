package refactown.cleancode.c06objects.envy;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FeatureEnvyTest {

	@Test
	void test() {
		// Feature Envy
		AnemicOrder anemicOrder = new AnemicOrder(LocalDate.now(), false);
		FeatureEnvy featureEnvy = new FeatureEnvy();
		assertTrue(featureEnvy.isValidOrder(anemicOrder)); // is Valid?
		
		// Order Feature 
		Order order = new Order(LocalDate.now(), false);
		assertTrue(order.isValid()); // is Valid?
	}

}
