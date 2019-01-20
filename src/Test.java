import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test{
	public static void main(String[] args) {
	
		Employee e1 = new Employee("Ram", 30, 1000);
		Employee e2 = new Employee("Ram", 45, 1000);
		Employee e3 = new Employee("Ram", 10, 2000);
		List<Employee> elist = new ArrayList<Employee>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		System.out.println("before sort"+elist);
		//Collections.sort(elist,new NameComparator());
		//this is b2 line 17
		Collections.sort(elist,new NameSalaryAgeComparator());
		//this is b2 line 19
		System.out.println("after sort"+elist);
	}
}