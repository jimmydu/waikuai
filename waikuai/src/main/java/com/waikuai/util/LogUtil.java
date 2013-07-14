package com.waikuai.util;

import org.apache.log4j.Logger;

public class LogUtil {
	private Logger logger = Logger.getLogger("");

	public Logger getLogger() {
		if (logger == null) {
			return Logger.getLogger("");
		}
		return logger;
	}
}
