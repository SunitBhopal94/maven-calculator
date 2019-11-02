package org.calculate.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest
{
@Test
 
public void whentddcalculatorInitializedThenReturnTrue()
{
	App cal= new App();
	assertTrue(cal.getStatus());
}

@Test
 
public void whenAddTwoNumberThenReturnCorrectAnswer()
{
	App cal= new App();
	assertEquals( 3, cal.addition(1, 2));
	assertEquals( 6, cal.addition(4, 2));
	assertEquals(-4, cal.addition(-2, -2));
}

@Test
public void testFailAdd() 
{

	  App cal= new App();
      assertNotEquals("addition error()", 0, cal.addition(1, 2));
} 

@Test
 public void whenSubtractTwoNumberThenReturnCorrectAnswer()
{

	App cal = new App();
	assertEquals(5, cal.subtraction(10,5));
	assertEquals(-1, cal.subtraction(-5,-4));
	assertEquals(0, cal.subtraction(3,3));
}

@Test
public void FailtestSubtract() 
{
	App cal= new App();
    assertNotEquals("subtraction error()", 0, cal.subtraction(4, 2));
} 



@Test
 public void whenMultiplyTwoNumberThenReturnCorrectAnswer()
{

	App cal= new App();
	assertEquals(45,cal.multiplication(9,5));
	assertEquals(-30,cal.multiplication(-6,5));
	assertEquals(0,cal.multiplication(9,0));
	
}


@Test
public void Failtestmultiply() 
{

	App cal= new App();
    assertNotEquals("multiply error()", 0, cal.multiplication(4, 2));
} 


  @Test
    public void whenDivideThenReturnCorrectAnswer()
  {
      App cal = new App();
	  assertEquals(2,cal.division(10,5));
	  assertEquals(-4,cal.division(-12,3));
	  assertEquals(0,cal.division(0,2));
    }
  
  @Test
  public void testdivisionFail()
  {
  App cal= new App();
  assertNotEquals(" divide error()", 1,cal.division(9, 3));
  }
  																				
  @Test
    public void whenModulusThenReturnRemainder()
  {
	  
	  App cal= new App();
	 assertEquals(1,cal.mod(10,3));
  }
}
