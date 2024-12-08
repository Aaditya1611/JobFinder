package com.job.finder.logs;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.job.finder.controller.PostController.getAllPosts())")
	public void LogBefore() {
		LOGGER.info("getAllPosts method called");
	}
	
	@AfterReturning("execution(public * com.job.finder.controller.PostController.getAllPosts())")
	public void LogAfter() {
		LOGGER.info("getAllPosts method executed");
	}
	
	@AfterThrowing("execution(public * com.job.finder.controller.PostController.getAllPosts())")
	public void LogException() {
		LOGGER.info("Issues encountered");
	}
	
//	@Before("execution(public * com.job.finder.controller.PostController.search())")
//	public void Logs2() {
//		LOGGER.info("search by text method called");
//	}
//	
//	@Before("execution(public * com.job.finder.controller.PostController.addPosts())")
//	public void Logs3() {
//		LOGGER.info("addPosts method called");
//	}
}
