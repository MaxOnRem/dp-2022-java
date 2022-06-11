package mock;

import java.util.ArrayList;
import java.util.List;

import laptops.Laptops;

public class CrudMock {


	private List<Laptops> LaptopsList = new ArrayList<>();
	
	public CrudMock() {	
		this.LaptopsList.add(new Laptops(0,"Promo Q3","assets/promo.jpg", "Coffee Tables: Central to most living rooms, coffee tables provide a place to set drinks, a place to put your feet up, and provide additional storage. Wayfair has thousands of coffee tables in a myriad of shapes, materials and styles."));
		this.LaptopsList.add(new Laptops(1,"Strong Grafit","assets/grafit.jpg", "End Tables: Typically placed at the end of sofas or between recliners, end tables provide another surface to hold drinks or decor, and are commonly used to hold living room lamps. Among Wayfair's thousands of end tables are end tables made of metal, wood, glass and stone."));
		this.LaptopsList.add(new Laptops(2,"Lunch Table","assets/fixmebli.jpg", "Console Tables: Sometimes called sofa tables, console tables are narrow tables that are usually right around the height of the back of a sofa. When a living room sofa is placed in the room so that the back of the sofa is not against a wall, it's common to place a console table behind the sofa."));
	}
	
	public List<Laptops> getLaptopsList() {
		return LaptopsList;
	}

	public void setLaptopsList(List<Laptops> laptopsList) {
		LaptopsList = laptopsList;
	}
	
}
