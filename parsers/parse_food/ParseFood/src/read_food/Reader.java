package read_food;


import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import food_obj.*;


public class Reader {
	private static final String FILENAME = "food_data.json";
	public static ArrayList<Food> loadFoods() {
		ArrayList<Food> food_list = new ArrayList<Food>();
		try {
			FileReader reader = new FileReader(FILENAME);
			JSONParser parser = new JSONParser();
			JSONObject jsonData = (JSONObject)new JSONParser().parse(reader);
			JSONArray foodListJSON = (JSONArray)jsonData.get("foods");
			for(int i=0; i < foodListJSON.size(); i++) {
				JSONObject foodJSON = (JSONObject)foodListJSON.get(i);
				String name = (String)foodJSON.get("name");
				String calories = (String)foodJSON.get("calories");
				String serving_size = (String)foodJSON.get("serving_size");

				food_list.add(new Food(name, calories, serving_size));
			}

			return food_list;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
