package food_obj;

public class Food {
	private String name;
	private String calories;
	private String serving_size;

	public Food(String name, String calories, String serving_size) {
		this.name = name;
		this.calories = calories;
		this.serving_size = serving_size;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcalories() {
		return calories;
	}

	public void setcalories(String calories) {
		this.calories = calories;
	}

	public String getserving_size() {
		return serving_size;
	}

	public void setserving_size(String serving_size) {
		this.serving_size = serving_size;
	}
}
