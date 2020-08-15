public class Person{
  
  private String firstname;
  private String lastname;
  private int birthmonth;
  private int birthday;
  private int birthyear;
  private String ssn;
  
  public Person(String fn, String ln, int bm, int bd, int by, String sn){
    firstname = fn;
    lastname = ln;
    birthmonth = bm;
    birthday = bd;
    birthyear = by;
    ssn = sn;
  }
  
  public String getFirstname(){
    return firstname;
  }
  
  public String getLastname(){
    return lastname;
  }
  
  public void setFirstname(String fn){
    firstname = fn;
  }
  
  public void setLastname(String ln){
    lastname = ln;
  }
  
  public String getBirthday(){
    return String.format("%d/%d/%d", birthmonth, birthday, birthyear);
  }
  
  public boolean verifySSN(String str){
    if(ssn.equals(str)) return true;
    return false;
  }
  
}