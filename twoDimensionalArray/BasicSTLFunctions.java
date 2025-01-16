package twoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class BasicSTLFunctions {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(10); a.add(20); a.add(30);
		List<Integer> b = new ArrayList<>();
		b.add(40); b.add(50);
		List<Integer> c = new ArrayList<>();
		List<Integer> d = new ArrayList<>();
		d.add(60);
		
		List<List<Integer>> l = new ArrayList<>();
		l.add(a); l.add(b); l.add(c); l.add(d);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
//		System.out.println(l);
//		
//		System.out.println(l.get(1).get(0));
		
//		l.remove(1);
//		System.out.println(l.size());
//		System.out.println(l.get(1).size());
//		System.out.println(l.get(1).get(0));
//		l.clear();
//		System.out.println(l.isEmpty());
		
//		int elementToCheck = 50;
//		boolean flag = false;
//		for(int i=0; i<l.size(); i++) {
//			for(int j=0; j<l.get(i).size(); j++) {
//				if(l.get(i).get(j) == elementToCheck) {
//					flag = true;
//					break;
//				}
//			}
//		}
//		if(flag) {
//			System.out.println(elementToCheck + " is present");
//		}else {
//			System.out.println(elementToCheck + " is not present");
//		}
		
//		System.out.println(l.indexOf(b));
//		System.out.println(a.indexOf(30));
				
		for(int i=0; i<l.size(); i++) {
			for(int j=0; j<l.get(i).size(); j++) {
				System.out.print(l.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}

}
