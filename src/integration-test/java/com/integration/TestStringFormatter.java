package com.integration;

import org.junit.Assert;
import org.junit.Test;

import com.main.StringFormatter;

public class TestStringFormatter {
	@Test
	public void testStringFormatter() {
		try {
			String output = new StringFormatter().format("str123");
			Assert.assertEquals("STR", output);
		} catch (SecurityException | IllegalArgumentException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
