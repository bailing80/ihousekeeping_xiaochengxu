package com.ccunix.ihousekeeping.base.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class DataSourceInterceptor {

	public void dataSourceActivity() {
	};

	public void before(JoinPoint jp) {
		System.out.println("activity dao #############################");
		// DataSourceTypeManager.set(DataSources.Activity);
	}

}