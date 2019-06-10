import java.util.ArrayList;

public class People
{
  private static People people = null;
  private static ArrayList<User> userList = new ArrayList<User>();

  private People()
  {
    userList = UserDataLoader.loadUser();
  }
  oublic static People getInstance()
  {
    if(people == null)
    {
      people = new People();
    }
    return people;
  }
  public ArrayList<User> getUser()
  {
    return userList;
  }
}
