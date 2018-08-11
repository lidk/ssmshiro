package com.sunway.webcore.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConvert {

	public static <T> List<T> ArraytoList(T[] array) {
		List<T> list = null;
		if (array != null && array.length > 0) {
			list = new ArrayList<T>();
			for (T item : array) {
				list.add(item);
			}
		}
		return list;
	}

	@SuppressWarnings("unchecked")
	public static <T> T[] ListtoArray(List<T> list) {
		T[] array = null;
		if (list != null && !list.isEmpty()) {
			array = (T[]) new Object[list.size()];
			array = list.toArray(array);
		}
		return array;
	}
}
