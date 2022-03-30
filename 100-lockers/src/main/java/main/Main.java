package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		int count = 1;
		int answer = 0;
		myList = makeList(myList);
		for(int i = 0; i < 100; i++) {
			count++;
			myList = change(count, myList);
		}
		for (int i = 0; i < 101; i++) {
			System.out.println(myList.get(i));
			if (myList.get(i) == "1") {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	public static List<String> makeList(List<String> myList) {
		for(int i = 0; i < 101; i++) {
			myList.add("1");
		}
		return myList;
	}
	
	public static List<String> change(int count, List<String> myList){
		int test = 0;
		for(int i = 0; i < myList.size(); i++) {
			if(i % count == 0 && i != 0) {
				if(myList.get(i) == "1") {
					myList.set(i, "0");
				}else {
					myList.set(i, "1");
				}
			} else if (i == 0){ // the first index "index 0" will not be counted. 
				myList.set(i, "0");
			}
//			System.out.println(test);
//			test++;
		}
//		System.out.println(count + "---------------------");
		return myList;
	}

}
