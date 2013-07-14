package com.waikuai.util;

import org.apache.log4j.Logger;

public class LogUtil {
	private static Logger logger = Logger.getLogger("");

	public static Logger getLogger() {
		if (logger == null) {
			return Logger.getLogger("");
		}
		return logger;
	}
}
