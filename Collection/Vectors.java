package Collection;

public class Vectors {
	String[] names = new String[3];
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		
		numbers[0] = 231;
		numbers[1] = 232;
		numbers[2] = 233;
		numbers[3] = 234; 
		numbers[4] = 235; // last position in vector is size - 1
		
		System.out.println(" ------ Using Loop Control 'for' --------");
		
		for(int i=0; i<5; i++){
			System.out.println("Vector value in position "+i+" is "+numbers[i]);
		}
		
		System.out.println(" ------ Using Loop Control 'While' -------");

		int cont = 0;
		while(cont<5){
			System.out.println("Vector value in position "+cont+" is "+numbers[cont]);
			cont++;
		}
		
		Vectors vec = new Vectors();
		
		vec.names[0] = "July";
		vec.names[1] = "Mackenzie";
		vec.names[2] = "Robert";
		
		System.out.println(" The vector size is "+vec.names.length);
		
		for(int i=0; i<3; i++){
			System.out.println("Vector names in position "+i+" is "+vec.names[i]);
		}
				
	}
}
