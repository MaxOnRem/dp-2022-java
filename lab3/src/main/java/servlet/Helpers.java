package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import jakarta.servlet.http.HttpServletRequest;
import laptops.Laptops;

public class Helpers {
	
	public static JsonElement bodyParse(HttpServletRequest request) {
		JsonElement jsonElement=null;	
		
		try {
			jsonElement = JsonParser.parseReader(request.getReader());
		} catch (JsonIOException | JsonSyntaxException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonElement;
	}
	
	public static Laptops laptopParse(HttpServletRequest request) {
		Laptops laptops = new Laptops();
		JsonElement jsonElement = bodyParse(request);
		//laptops.setId(jsonElement.getAsJsonObject().get("id").getAsInt());
		laptops.setTitle(jsonElement.getAsJsonObject().get("title").getAsString());
		laptops.setImg(jsonElement.getAsJsonObject().get("img").getAsString());
		laptops.setDescription(jsonElement.getAsJsonObject().get("description").getAsString());
		return laptops;
	}
	
	public static int getNextId(List<Laptops> list) {
		int maxId = 0;
		
		Iterator<Laptops> iterator = list.iterator();
		while(iterator.hasNext()) {
			int currentId = iterator.next().getId();
			if(currentId>maxId) maxId=currentId;
		}
		return maxId+1;
	}
	
	public static int getIndexByUserId(int id,List<Laptops> list) {
		int listId = id;
		
		Iterator<Laptops> iterator = list.iterator();
		while(iterator.hasNext()) {
			Laptops temp =iterator.next();
			if(temp.getId()==listId) { 
				listId=list.indexOf(temp);
				break;
			}
		}
		return listId;
	}
	
	

}