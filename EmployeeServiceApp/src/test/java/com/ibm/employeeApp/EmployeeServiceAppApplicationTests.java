package com.ibm.employeeApp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeServiceAppApplicationTests {
public static Logger logger=LoggerFactory.getLogger(EmployeeServiceAppApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case Executing...");
		assertEquals(true, true);
	}

}
