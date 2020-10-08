package com.example.demo;

import java.util.List;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class GoogleGuavaSample {

	private final List<String> list = ImmutableList.of("This, is, a, test");
	
	public List<String> getList() {
		return list;
	}
	
	public List<String> getSplit(String str) {
		List<String> list2 = Lists.newArrayList();
		list2 = Splitter.on(",").splitToList(str);
		return list2;
	}
}
