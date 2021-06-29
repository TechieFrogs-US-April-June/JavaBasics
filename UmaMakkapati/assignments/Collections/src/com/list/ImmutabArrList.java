package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//How to make ArrayList as immutable?

public class ImmutabArrList {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Uma");
		l.add("Anitha");
		l.add("Suri");
		List<String> unmodifiableList = Collections.unmodifiableList(l);
	}

}
