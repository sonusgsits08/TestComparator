import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.name.compareToIgnoreCase(e2.name);
	}
}
