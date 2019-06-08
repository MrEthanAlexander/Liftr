public class User
{
  private String name;
  private String username;
  private String password;
  private String securityQuestion;
  private String securityAnswer;
  private boolean privacy;
  private int age;
  private String gender;
  private int weight;
  private int height;
  private String bodyType;
  private String description;
  public User()
  {
    this.name = "no name";
    this.username = "no username";
    this.password = "no password";
    this.securityQuestion = "no question";
    this.securityAnswer = "no answer";
    this.privacy = true;
    this.age = 14;
    this.gender = "no gender";
    this.weight = 85.0;
    this.height = 100.0;
    this.bodyType = "no body type";
    this.description = "empty description";
  }
  public User(String xName, String xUser, String xPass, String xQuestion, String xAnswer,
  boolean xPrivacy, int xAge, String xGender, double xWeight, double xHeight, String xBody, String Description)
  {
    //TODO
  }
  public String getName()
  {
    return this.name;
  }
  public void setName(String name)
  {
    this.name = name;
  }
  public String getUser()
  {
    return this.username;
  }
  public void setUser(String user)
  {
    this.username = user;
  }
  public String getPassword()
  {
    return this.getPassword;
  }
  public void setPass(String pass)
  {
    this.password = pass;
  }
  public String getQuestion()
  {
    return this.securityQuestion;
  }
  public void setQuestion(String question)
  {
    this.securityQuestion = question;
  }
  public String getAnswer()
  {
    return this.securityAnswer;
  }
  public void setAnswer(String answer)
  {
    this.securityAnswer = answer;
  }
  public boolean getPrivacy()
  {
    return this.privacy;
  }
  public void setPrivacy(boolean privacy)
  {
    this.privacy = ;
  }
  public int getAge()
  {
    return this.age;
  }
  public int getWeight()
  {
    return this.weight;
  }
  public int getHeight()
  {
    return this.username;
  }
  public String getBody()
  {
    return this.bodyType;
  }
  public String getDescription()
  {
    return this.description;
  }
}
