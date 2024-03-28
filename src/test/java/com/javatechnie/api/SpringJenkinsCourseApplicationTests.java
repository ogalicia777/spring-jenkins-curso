package com.javatechnie.api;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsCourseApplicationTests {
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsCourseApplicationTests.class);
	
	@Test
	public contextLoads() {
		logger.info("Test case executing...");
		
		assertEquals(true, true);
		
	}

}
