package laptops;

import java.util.ArrayList;
import java.util.List;

public class Mock {
	
	private List<Laptops> laptopList = new ArrayList<>();
	
	
	public Mock () {		
		this.laptopList.add(new Laptops(0,"Mac","assets/mac.jpg","The MacBook Pro is the most powerful laptop"));
		this.laptopList.add(new Laptops(1,"HP","assets/spectre.jpg","Spectre x360 14"));
		this.laptopList.add(new Laptops(2,"Dell","assets/xps.jpg","Dell’s latest XPS 13 2-in-1"));
	}

	public List<Laptops> getLaptopList() {
		return laptopList;
	}

	public void setLaptopList(List<Laptops> laptopList) {
		this.laptopList = laptopList;
	}

}
