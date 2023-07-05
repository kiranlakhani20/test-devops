package com.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class JunitTestRunner {

	//test
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(firstTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
		//xyz		
	      System.out.println(result.wasSuccessful());
	   }
}



