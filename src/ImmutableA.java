public final class ImmutableA {
	private final String empName;
	public  String getEmpname() {
		return empName;
	}
	public Integer getEmpsalary() {
		return empSalary;
	}
	private final Integer empSalary;
	ImmutableA(String name,Integer salary){
		this.empName=name;
		this.empSalary=salary;
	}
}