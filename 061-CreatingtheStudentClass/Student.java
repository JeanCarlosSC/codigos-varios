public class Student{
  
	//class variables/states
	public String name;
	public int grade;
	public double gpa;
	public int daysWithoutUniform;
	public float promedio;
	public String carrera;
	public String facultad;
	
	//constructor
	public Student(String aname, int agrade, double agpa, float apromedio, String acarrera, String afacultad){
		this.name = aname;
		this.grade = agrade;
		this.gpa = agpa;
		this.daysWithoutUniform = 0;
		this.promedio = apromedio;
		this.carrera = acarrera;
		this.facultad = afacultad;
	}
	
	public Student(String aname, int agrade, double agpa){
		this.name = aname;
		this.grade = agrade;
		this.gpa = agpa;
		this.daysWithoutUniform = 0;
	}
	
	//methods/behaviors
	public void changeGPA(double new_gpa){
		this.gpa = new_gpa;
	}
	
	public void changeName(String new_name){
	  this.name = new_name;
	}
	
	public void graduate(){
	  this.grade ++;
	}
	
	public void checkUniform(boolean isWearingUniform){
	  if(isWearingUniform){
	    this.daysWithoutUniform = 0;
	  }else{
	    this.daysWithoutUniform += 1;
	  }
	}
	
	public void cambiarFacultad(String afacultad){
	  this.facultad = afacultad;
	}
	
	public void subirPromedio(){
	  this.promedio += 0.1;
	}
	
	public void cambiarCarrera(String acarrera){
	  this.carrera = acarrera;
	}
	
	public String toString(){
	  String x = String.format("%s &d %f %d %.1f %s %s", name, grade, gpa, daysWithoutUniform, promedio, carrera, facultad);
	  return x;
	}
}