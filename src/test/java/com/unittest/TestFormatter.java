package com.unittest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;

import com.main.StringFormatter;

public class TestFormatter {
	@Test
	public void testRemoveDigits() {
		try {
			Method m = StringFormatter.class.getDeclaredMethod("removeDigits",
					String.class);
			Assert.assertNotNull(m);
			m.setAccessible(true);
			String output = (String) m.invoke(new StringFormatter(), "str123");
			Assert.assertEquals("str", output);
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
