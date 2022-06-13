package laptops;

public class Laptops {
	
	int id;
	String title;
	String img;
	String description;
	
	public Laptops() {
		
	}
	
	public Laptops(int id, String title, String img, String description) {
		this.id = id;
		this.title = title;
		this.img = img;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "{\"id\": \""+id+"\", \"title\": \""+title+"\", \"img\": \""+img+"\", \"description\": \""+description+"\"}";
	}
	
	
}