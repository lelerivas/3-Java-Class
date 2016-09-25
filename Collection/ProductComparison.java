package Collection;

import java.util.Comparator;

public class ProductComparison implements Comparator<Product>  {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getCod().compareTo(p2.getCod());
	}
}
