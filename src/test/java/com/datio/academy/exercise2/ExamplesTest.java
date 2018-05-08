package com.datio.academy.exercise2;

import org.junit.Assert;
import org.junit.Test;

public class ExamplesTest {

	@Test
	public void testMethod_1() {
		Examples e = new Examples();
		Assert.assertEquals(42, e.methodToTest_1(40, 2));
	}

	@Test
	public void testMethod_2() {
		Examples e = new Examples();
		Assert.assertEquals(42, e.methodToTest_2(44, 2));
	}
}
