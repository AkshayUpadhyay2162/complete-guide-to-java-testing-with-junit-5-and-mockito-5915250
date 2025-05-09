package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator underTest = new Calculator();
  
  // Test Add
  @Test
  public void addition() {
    int result = underTest.add(10, 3);
    assertEquals(13, result);
  }

  @Test
  public void multiplication(){
    int res = underTest.multiply(3, 6);
    assertEquals(18, res);
  }
}
