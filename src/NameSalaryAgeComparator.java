import java.util.Comparator;

public class NameSalaryAgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		int c=0;
		
		c = e1.name.compareToIgnoreCase(e2.name);
		
		if(c==0){
			c = e1.salary==e2.salary?0:(e1.salary > e2.salary?1:-1);
		}
		if(c==0){
			c = e1.age==e2.age?0:(e1.age > e2.age?1:-1);
		}
		return c;
	}
}