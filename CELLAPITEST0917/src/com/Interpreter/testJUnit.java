package com.Interpreter;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class testJUnit {
    @BeforeClass 
    public static void onlyOnce() {
    }
	@Test
	public void test() throws Exception{
		System.out.println("JUni되나?");
		assertEquals(false,false);
	}
}
