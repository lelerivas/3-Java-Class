package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {

	private Integer cod;
	private String name;
	private String maker;
	private Double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer cod, String name, String maker, Double price) {
		super();
		this.cod = cod;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [cod=" + cod + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod == null) ? 0 : cod.hashCode());
		result = prime * result + ((maker == null) ? 0 : maker.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (cod == null) {
			if (other.cod != null)
				return false;
		} else if (!cod.equals(other.cod))
			return false;
		if (maker == null) {
			if (other.maker != null)
				return false;
		} else if (!maker.equals(other.maker))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	@Override
	public int compareTo(Product p) {
		return price.compareTo(p.price);
	}
	
	public static void main(String[] args) {
	
		Product p1 = new Product(101,"Laptop","hp",2430.);
		Product p2 = new Product(56,"Desktop","dell",1900.);
		Product p3 = new Product(79,"Camera","Sony",1200.);
		Product p4 = new Product(108,"Ipad","Apple",2150.);
		
		System.out.println(p1.hashCode());
		System.out.println(p1.toString());
		
		if(p1.equals(p2)){
			System.out.println("Equals Object");
		}else{
			System.out.println("Different Object");
		}
		
		List<Product> list1 = Arrays.asList(p1,p2,p3,p4);
		
		Collections.sort(list1);
		
		for(Product p :list1){
			System.out.println(p);	
		}
		
		Collections.sort(list1, new ProductComparison());
		
		System.out.println();
		for(Product p: list1){
			System.out.println(p);
		}
			
	}
	
}
