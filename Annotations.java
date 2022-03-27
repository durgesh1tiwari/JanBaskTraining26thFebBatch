package testNgTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am into Beofre Suite method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am into Beofre class method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am into Beofre Test method");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am into Beofre method method");
	}

	@Test
	public void testCase1() {
		System.out.println("I am into Test Case1");
	}

	@Test
	public void testCase2() {
		System.out.println("I am into Test case2");
	}

	@AfterMethod
	public void afterMethods() {
		System.out.println("I am into after methd ");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am into AFter test method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am into after class method");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("I am into After Suite method");
	}

}
