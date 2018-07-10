package test;

import java.util.TreeMap;

public class TestMap {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(3, "a");
		treeMap.put(3, "a");
		treeMap.put(2, "b");
		treeMap.put(5, "c");
		
		for (Number number : treeMap.keySet()) {
			System.out.print(treeMap.get(number));
		}
	}

}
