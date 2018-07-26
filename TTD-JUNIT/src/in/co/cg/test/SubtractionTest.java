package in.co.cg.test;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import in.co.cg.calc.Maths;

class SubtractionTest {

	@Test
	void testSubtractTwoPositive() {
		
		Maths math=new Maths();
       
		int ans=math.subtract(2,2);
	    Assert.assertEquals(0, ans);
	}
	@Test
	void testSubtractTwoNegative() {
		
		Maths math=new Maths();
       
		int ans=math.subtract(-2,-2);
	    Assert.assertEquals(0, ans);
	}
	@Test
	void testSubtractFirstPositiveSecondNegative() {
		
		Maths math=new Maths();
       
		int ans=math.subtract(10,-2);
	    Assert.assertEquals(12, ans);
	}
	@Test
	void testSubtractFirstNegativeSecondPositive() {
		
		Maths math=new Maths();
       
		int ans=math.subtract(-10,2);
	    Assert.assertEquals(-12, ans);

		
	}

}
