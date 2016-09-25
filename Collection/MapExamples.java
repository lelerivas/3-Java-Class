package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {

	Map<String, Double> mapHash = new HashMap<String, Double>();
	Map<String, Double> mapTree = new TreeMap<String, Double>();
	Map<String, Double> mapLinked = new LinkedHashMap<String, Double>();
	
	public static void main(String[] args) {
		
		MapExamples me = new MapExamples();
		
		me.mapHash.put("Junior", 3200.);
		me.mapHash.put("Pleno", 11000.);
		me.mapHash.put("Senior", 7600.);
		me.mapHash.put("Trainee", 2000.);
		System.out.println("HashMap: "+me.mapHash);
		
		me.mapTree.put("Junior", 3200.);
		me.mapTree.put("Pleno", 11000.);
		me.mapTree.put("Senior", 7600.);
		me.mapTree.put("Trainee", 2000.);		
		System.out.println("MapTree: "+me.mapTree);
		
		me.mapLinked.put("Junior", 3200.);
		me.mapLinked.put("Pleno", 11000.);
		me.mapLinked.put("Senior", 7600.);
		me.mapLinked.put("Trainee", 2000.);		
		System.out.println("mapLinked: "+me.mapLinked);

	}	
}
