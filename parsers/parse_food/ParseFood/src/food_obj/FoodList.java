package food_obj;

import java.util.ArrayList;
import read_food.Reader;

public class FoodList {
	private static FoodList fl = null;
	private static ArrayList<Food> alf = new ArrayList<Food>();

	private FoodList() {
		alf = Reader.loadFoods();
	}

	public static FoodList getInstance() {
		if(fl == null) {
			fl = new FoodList();
		}

		return fl;
	}

	public ArrayList<Food> getFoodList() {
		return alf;
	}
}