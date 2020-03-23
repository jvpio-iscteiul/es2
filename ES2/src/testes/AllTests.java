package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;

/**
 * The Class AllTests.
 */


@RunWith(JUnitPlatform.class)
@SuiteClasses({TestCar.class, TestStand.class, TestMain.class })
public class AllTests {

	
	
} 
