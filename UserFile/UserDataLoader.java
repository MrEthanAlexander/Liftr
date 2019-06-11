import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JsonParser;;

public class UserDataLoader
{
  private static final String fileName = "User_Data.json";

  public static ArrayList<User> loadUser()
  {
    ArrayList<User> users = new ArrayList<User>();
    try
    {
      FileReader reader = new FileReader(fileName);
      JSONParser parser = new JSONParser();
      JSONObject jsonData = (JSONObject) new JSONParser().parse(reader);
      JSONArray userJSON = (JSONArray)jsonData.get("user");

      for(int i = 0; i < userJSON.size(); i++)
      {
        JSONObject userFile = (JSONObject)userJSON.get(i);
        String name = (String)personJSON.get("Name");
        String userName = (String)personJSON.get("Username");
        String password = (String)personJSON.get("Password");
        boolean privacy = (boolean)personJSON.get("Privacy");
        String recovQuestion = (String)personJSON.get("Recovery_Question");
        String recovAnswer = (String)personJSON.get("Recovery_Answer");
        int age = (int)personJSON.get("Age");
        String gender = (String)personJSON.get("Gender");
        int weight = (int)personJSON.get("Weight");
        int height = (int)personJSON.get("Height");
        int BMI = (int)personJSON.get("BMI");
        String bodyType = (String)personJSON("Body_Type");
        String description = (String)personJSON.get("Description");

        people.add(new User(name, userName, password, privacy, recovQuestion, recovAnswer,
                            age, gender, weight,height,BMI, bodyType,description));
        /*JSONArray workoutJSON = (JSONArray)jsonData.get("Workout_Log");
        for(int j = 0; j < workoutJSON.size(); j++)
        {
          JSONObject workoutFile = (JSONObject)workoutJSON.get(j);
          String

        }*/
      }
      return people;
    }
    catch()
    {
      e.printStackTace();
    }
    return null;
  }
}
