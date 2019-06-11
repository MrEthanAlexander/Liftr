import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class UserWriter()
{
  public static userDetail(String name, String userName, String password,
                            boolean Privacy, String recovQuestion,
                            String recovAnswer, int age, String gender,
                            int weight, int height, int BMI, String bodyType, String description)
  {
    JSONObject userDetails = new JSONObject();
    userDetails.put("Name", name);
    userDetail.put("Username", userName);
    userDetail.put("Password", password);
    userDetail.put("Privacy", privacy);
    userDetail.put("Recovery_Question", recovQuestion);
    userDetail.put("Recovery_Answer", recovAnswer);
    userDetail.put("Age", age);
    userDetail.put("Gender", gender);
    userDetail.put("Weight", weight);
    userDetail.put("Height",height);
    userDetail.put("BMI", BMI);
    userDetail.put("Body_Type", bodyType);
    userDetail.put("Description", description);

    JSONObject userList = new JSONArray();
    userList.add(userDetails);
    try(FileWriter file = new FileWriter("User_Data.json"))
    {
      file.write(userList.toJSONString());
      file.flush();
    }
    catch(Exception e)
    {
      e.printStackTace();
    }
  }
}
