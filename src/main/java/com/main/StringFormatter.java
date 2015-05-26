package com.main;

public class StringFormatter {
	public String format(String str) {
		if (str == null || "".equals(str))
			return "";
		str = str.toUpperCase();
		return removeDigits(str);
	}

	private String removeDigits(String str) {
		StringBuffer sb = new StringBuffer();
		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch))
				sb.append(ch);
		}
		return sb.toString();
	}
}
