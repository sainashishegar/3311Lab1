package lab02;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import edu.toronto.cs.jam.annotations.Description;

public class PersonTest {
	static Person kyrel, ilir;
	static SodaCan s,s2;
	
	void createPeople() {
		kyrel = new Person("Kyrel");
		ilir = new Person("Ilir");
		s = new SodaCan("Roots");
		s2 = new SodaCan("Roots");
	}
	
	@Test(timeout=100)
	//@Description(description="Person Test person name set correctly")
	public void testName() {
		createPeople();
		Person kyrel = new Person("Kyrel");
		String kyString = kyrel.toString();
		assertTrue("I am Kyrel, and I am very thirsty".equals(kyString));
	}

	@Test(timeout=100)
	//@Description(description="Person Test 5 gulps from unopened can. Very thirsty")
	public void testUnOpened() {
		createPeople();
		SodaCan s = new SodaCan("Roots");
		Person ilir = new Person("Ilir");

		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);

		String ilirString = ilir.toString();
		assertTrue("I am Ilir, and I am very thirsty".equals(ilirString));
	}
	@Test(timeout=100)
	//@Description(description="Person Test thirsty with open can")
	public void testOpenedThirsty() {
		createPeople();
		SodaCan s = new SodaCan("Roots");
		s.open();
		Person ilir = new Person("Ilir");

		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);

		String ilirString = ilir.toString();
		assertTrue("I am Ilir, and I am thirsty".equals(ilirString));
	}

	@Test(timeout=100)
	//@Description(description="Person Test very thirsty via gulp")
	public void testOpenedVeryThirsty() {
		createPeople();
		s.open();
		s2.open();
		
		
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s);
		ilir.gulpFrom(s2);
		ilir.gulpFrom(s2);
		ilir.gulpFrom(s2);
		ilir.gulpFrom(s2);
		ilir.gulpFrom(s2);

		String ilirString = ilir.toString();
		assertTrue("I am Ilir, and I am satisfied".equals(ilirString));
	}
	
	@Test(timeout=100)
	//@Description(description="Person Test very thirsty via sip")
	public void testOpenedVeryThirstySip() {
		createPeople();
		s.open();
		s2.open();
		
		for(int i = 0; i < 25; i ++) {
			ilir.sipFrom(s);
			ilir.sipFrom(s2);
		}
		String ilirString = ilir.toString();
		assertTrue("I am Ilir, and I am satisfied".equals(ilirString));
	}
}