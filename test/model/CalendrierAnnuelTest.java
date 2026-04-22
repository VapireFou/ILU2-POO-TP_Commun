package model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalendrierAnnuelTest {
	private CalandrierAnnuel calendrier;

	@BeforeEach
	void setUp() throws Exception {
		calendrier = new CalandrierAnnuel();
	}

	@Test
	void testCalendrierAnnuel() {
		assertNotNull(calendrier, "calendrier null");
	}

	@Test
	void testEstLibre() {
		assertTrue(calendrier.estLibre(31, 12), "31/12 devrait �tre libre");
	}

	@Test
	void testReserver() {
		assertTrue(calendrier.reserver(20, 10), "reservation du 20/10 devrait �tre possible");
		assertFalse(calendrier.estLibre(20, 10), "20/10 devrait �tre occuper");
		assertFalse(calendrier.reserver(20, 10), "reservation du 20/10 ne devrait pas �tre possible");
	}

}
