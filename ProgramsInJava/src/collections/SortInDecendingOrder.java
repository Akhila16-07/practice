package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortInDecendingOrder {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(13);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(72);
		list.add(32);
		list.add(1);
		
		Collections.sort(list);
		System.out.println(list);
		
	}
}
