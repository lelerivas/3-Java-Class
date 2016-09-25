package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
	Set<Integer> setHash   = new HashSet<Integer>();
	Set<Integer> setTree   = new TreeSet<Integer>();
	Set<Integer> setLinked = new LinkedHashSet<Integer>();
	
	public static void main(String[] args) {
		
		SetExamples se = new SetExamples();
		
		System.out.println(" -------------- Hash Examples -------------- ");
		
		System.out.println(se.setHash.add(32));
		System.out.println(se.setHash.add(67));
		System.out.println(se.setHash.add(13));
		System.out.println(se.setHash.add(67)); // It is not possible save duplicate 
		System.out.println(se.setHash); // get data through the hashcode
		
		System.out.println(" -------------- Tree Examples -------------- ");
		
		System.out.println(se.setTree.add(32));
		System.out.println(se.setTree.add(67));
		System.out.println(se.setTree.add(13));
		System.out.println(se.setTree.add(67)); // It is not possible save duplicate
		System.out.println(se.setTree); // get sorted data
		
		System.out.println(" -------------- Linked Examples -------------- ");
		
		System.out.println(se.setLinked.add(32));
		System.out.println(se.setLinked.add(67));
		System.out.println(se.setLinked.add(13));
		System.out.println(se.setLinked.add(67)); // It is not possible save duplicate
		System.out.println(se.setLinked); // obtain data in the same order entry	
	
	}
}
