package entities;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String featureA;
//<<<<<<< HEAD
//	private String workingInMaster;
//=======
	private String workingInA;
	private int weight;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFeatureA() {
		return featureA;
	}
	public void setFeatureA(String featureA) {
		this.featureA = featureA;
	}
	
	public String getWorkingInA() {
		return workingInA;
	}
	public void setWorkingInA(String workingInA) {
		this.workingInA = workingInA;
	}
	//toString
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [id=");
		builder.append(id);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
