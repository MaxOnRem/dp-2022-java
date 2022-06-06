package table;

import java.io.Serializable;

public class Table implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private float width;
	private float height;
	public Table(String title, float width, float height) {
		super();
		this.title = title;
		this.width = width;
		this.height = height;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "{\"title\": \""+title+"\", \"width\": \""+width+"\", \"height\": \""+height+"\"}";
	}
	
}
