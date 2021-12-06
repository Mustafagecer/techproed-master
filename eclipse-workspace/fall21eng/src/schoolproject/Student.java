package schoolproject;

public class Student implements ITDepartment,LanguageDepertmant {

	private String name;
	private String lastname;
	private int id;
	private String departmentName;
	private Instructor instructor;
	private String labName;
	@Override
	public String departmentName() {
	
		return this.departmentName;
	}
	public void setDepertmantName() {
		this.departmentName=departmentName;
		
	}
	@Override
	public Instructor instructor() {
		
		return this.instructor;
	}
	@Override
	public Student student() {
	
		return this;
	}
	@Override
	public String labName() {

		return labName;
	}
	public void setLabName(String labName) {
		this.labName=labName;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", lastname=" + lastname + ", id=" + id + ", departmentName=" + departmentName
				+ ", instructor=" + instructor + ", labName=" + labName + "]";
	}
	
	
}
