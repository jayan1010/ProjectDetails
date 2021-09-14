package org.frame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Class {
	
@BeforeClass
private  void beforeClass() {
	System.out.println("Before class");
	

}
@AfterClass
private  void afterClass() {
	System.out.println("After class");

}
@AfterMethod




private void after() {
	System.out.println("After method");
	

}
@BeforeMethod
private  void before() {
	System.out.println("Before method");

}
@Test
private  void tc0() {
	System.out.println("method 0");

}

@Test
private  void tc1() {
	System.out.println("method 1");


}
@Test
private  void tc2() {
	System.out.println("method 2");
}
}

