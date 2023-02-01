package corejava.map;

import java.util.Objects;

public class SiriDetails {
	//attributes 
	private String Name ;
	private String Address;
	private String DOB ;
	private String Specialization;
	private double SSC;
	private int Intermediate;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public double getSSC() {
		return SSC;
	}
	public void setSSC(double sSC) {
		SSC = sSC;
	}
	public int getIntermediate() {
		return Intermediate;
	}
	public void setIntermediate(int intermediate) {
		Intermediate = intermediate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Address, DOB, Intermediate, Name, SSC, Specialization);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SiriDetails other = (SiriDetails) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(DOB, other.DOB)
				&& Intermediate == other.Intermediate && Objects.equals(Name, other.Name)
				&& Double.doubleToLongBits(SSC) == Double.doubleToLongBits(other.SSC)
				&& Objects.equals(Specialization, other.Specialization);
	}
	
	

}
