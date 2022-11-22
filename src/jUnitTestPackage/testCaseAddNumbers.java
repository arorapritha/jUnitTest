package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCaseAddNumbers {

	@Test
	void test() {
		jUnitFunctions jUnit = new jUnitFunctions();
		int result = jUnit.AddNumbers(30, 40);
		assertEquals (70,result);
		
		
	}

}
