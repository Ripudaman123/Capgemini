package in.co.cg.test;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

import in.co.cg.calc.Maths;

class AdditionTest {

	@Test
	void testAddTwoPositive() {
		
		Maths math=new Maths();
       
		int ans=math.add(2,2);
	    Assert.assertEquals(4, ans);
	}
	@Test
	void testAddTwoNegative() {
		
		Maths math=new Maths();
       
		int ans=math.add(-2,-2);
	    Assert.assertEquals(-4, ans);
	}
	@Test
	void testAddGreaterPositiveSmallerNegative() {
		
		Maths math=new Maths();
       
		int ans=math.add(10,-2);
	    Assert.assertEquals(8, ans);
	}
	@Test
	void testAddGreaterNegativeSmallerPositive() {
		
		Maths math=new Maths();
       
		int ans=math.add(-10,2);
	    Assert.assertEquals(-8, ans);
	}
}
