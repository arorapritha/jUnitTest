package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCaseAddstrings {

	@Test
	void test() {
		jUnitFunctions jUnitstring = new jUnitFunctions();
		String result = jUnitstring.AddStrings ("Pritha", "Arora");
		assertEquals ("PrithaArora", result);
		
		
		
		
		
	}

}
