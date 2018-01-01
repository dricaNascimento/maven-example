package com.imp.components;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyComponentTest {

	@Test
	public void test() {
		
		MyComponent myComponent = new MyComponent();
		
		int result = myComponent.doCalculate();
		
		assertEquals(4, result); 
		
	}

}
