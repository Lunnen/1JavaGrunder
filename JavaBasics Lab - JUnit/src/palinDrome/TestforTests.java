package palinDrome;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestforTests {

		// assertEquals
	
	@Test
	public void addition() {
		System.out.println(" adding test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1));
	}
	@Test
	public void additionButFails() {
		System.out.println(" adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}
	
	// New Tests:
	
	@Test
	public void assertArrayEqualsTestThatsNotRight() {

		System.out.println(" assertArrayEqualsTest That's NOT OK!"); 
		
		int[] expected = {1, 2, 3};
		int[] actually = {1, 3, 2};
		
		assertArrayEquals(expected, actually);
		
	}
	@Test
	public void assertArrayEqualsTestThatsIsRight() {

		System.out.println(" assertArrayEqualsTest that's OK "); 
		
		int[] expected = {1, 2, 3};
		int[] actually = {1,2,3};
		
		assertArrayEquals(expected, actually);
		
	}
	
	
}

/* Labb steg 3:
Annotation �r en anteckning g�llande koden.
L�ggs till f�r att underl�tta l�sbarhet av koden.

@Test inneb�r att funktionen ska testas enligt JUnit 
medans @Ignore inneb�r att den ska hoppa �ver denna del.

Assertion �r en samling verktyg som testar att funktioner vi gjort
beter sig p� r�tt s�tt och inte skriver ut fel eller 
agerar p� ett s�tt funktionen inte �r gjord f�r.

assertEquals �r en funktion som f�rv�ntar sig att
det f�rsta v�rdet som kommer in �r sant och j�mf�r det med n�stkommande
v�rde som kommer, och ger ett sant/falskt v�rde beroende
p� om det �r samma. Den f�rv�ntar sig att de ska vara lika.

*/