public class UAGStudent{
  
  //class variables
  String name;
  int grade;
  static String principalName = "Ms. McKoy";
  String studentID;
  static int nextID = 100;
  
  //constructor
  public UAGStudent (String name, int grade){
    this.name = name;
    this.grade = grade;
    this.studentID = String.format("%s%d", name.substring(0, 1).toUpperCase(), nextID);
    this.nextID += 1;
  }
  
  //methods
  public static void newPrincipal(String newName){
    principalName = newName;
  }
  
  public static void resetID(){
    nextID = 100;
  }
  
  public String toString(){
    return String.format("%s %s", name, studentID);
  }
  
}