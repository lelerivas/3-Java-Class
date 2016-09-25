package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
	List<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>(); // list doesn't have a definite size
		
		numbers.add(424); // use add to save information in the list
		numbers.add(654);
		numbers.add(896);
		numbers.add(123);
		numbers.add(998);
		numbers.add(875);
		
		for(int i=0; i< numbers.size();i++){
			System.out.println("Value in the position "+i+" is "+numbers.get(i));
		}
		
		System.out.println("------ Change a value in the position 0 --------");
		numbers.set(0, 111); 
		
		for(int i=0; i< numbers.size();i++){
			System.out.println("Value in the position "+i+" is "+numbers.get(i));
		}
		
		System.out.println("------ Sorting the list --------");
		Collections.sort(numbers);
		
		for(int i=0; i< numbers.size();i++){
			System.out.println("Value in the position "+i+" after the sort is "+numbers.get(i));
		}
		
		System.out.println("------ Removing a position in the list --------");
		numbers.remove(3);
		
		for(int i=0; i< numbers.size();i++){
			System.out.println("Value in the position "+i+" after the remove is "+numbers.get(i));
		}
		
		System.out.println("------ List with String --------");
		Lists lista = new Lists();
		lista.names.add("Bob");
		lista.names.add("Louise");
		lista.names.add("Marck");
		
		for(int i=0; i< lista.names.size();i++){
			System.out.println("Name in the position "+i+" is "+lista.names.get(i)); // faster access. 
		}
		
	}
}
