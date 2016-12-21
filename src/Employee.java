public class Employee 
{
	//this is Employee.java class
 String name;
 int age;
 float salary;
 
 Employee(String ename,int age,float salary){
	 
	this.name=ename;
	 this.age=age;
	 this.salary=salary;
 }
 @Override
	public String toString() {
	
		return "[name: "+name+" age: "+age+" salary: "+salary+" ]";
	}
}