package com.cs4800.assignment4;

import java.util.List;
import com.google.common.collect.ImmutableList;

public class GoogleGuavaTest {

	private final List<String> list = ImmutableList.of("This, is, a, test");
	
	public List<String> getList() {
		return list;
	}
}
