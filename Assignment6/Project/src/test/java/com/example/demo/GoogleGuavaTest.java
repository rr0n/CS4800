package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.google.common.collect.Lists;

import java.util.List;

class GoogleGuavaTest {

	@Test
	public void testSplit() {
		String str = "a,b,c";
		List<String> expected = Lists.newArrayList("a", "b", "c");
		List<String> actual = new GoogleGuavaSample().getSplit(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSplit1() {
		String str = "HEl,l0 how are you doing?,  This is an e,xample";
		List<String> expected = Lists.newArrayList("HEl", "l0 how are you doing?", 
				"  This is an e", "xample");
		List<String> actual = new GoogleGuavaSample().getSplit(str);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSplit2() {
		String str = "";
		List<String> expected = Lists.newArrayList("");
		List<String> actual = new GoogleGuavaSample().getSplit(str);
		assertEquals(expected, actual);
	}
	
	public void testSplit3() {
		String str = "This is the last test";
		List<String> expected = Lists.newArrayList("This is the last test");
		List<String> actual = new GoogleGuavaSample().getSplit(str);
		assertEquals(expected, actual);
	}

}
