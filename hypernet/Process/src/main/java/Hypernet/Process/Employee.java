package Hypernet.Process;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employeeId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer employeeId;

	@Column(name="employeetName")
	public String employeeName;

	@Column(name="employeeAge")
	public Integer employeeAge;

	
	@OneToMany(mappedBy="employeeId", fetch=FetchType.EAGER) public List<Project>
	  projects;
	 
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Integer getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(Integer employeeAge) {
		this.employeeAge = employeeAge;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}