package accolite.assignment.advjava;

import java.util.*;

public class Company {
	private int id;
	private String name,city;
	 
	List<Employe> employeeList = new LinkedList<>();
	Company(int id,String name,String city){
		 this.setId(id);
		 this.setName(name);
	  	 this.setCity(city);
	  	 if(id==1) {
	  	employeeList.add(new Employe(1,"Kumar",21));
	  	employeeList.add(new Employe(2,"Shantanu",23));
	  	employeeList.add(new Employe(5,"Naman",31));
	  	employeeList.add(new Employe(4,"Deepak",27));
	  	System.out.println("Company "+name+" age below 30");
	  	for(Employe emp: employeeList) {
			if(emp.getAge()<30) 
				System.out.println("Name "+emp.getName());
		}
	  	System.out.println("Company "+name+" sort by id");
	  	TreeSet<Employe> temp = new TreeSet<Employe>((p1,p2) -> p1.getId() - p2.getId());
	  	for(Employe emp: employeeList)
			temp.add(emp);
	  	for(Employe emp: temp) {
			
				System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
		}
	  	System.out.println("Company "+name+" sort by name");
	  	TreeSet<Employe> tem = new TreeSet<Employe>((p3,p4) -> p3.getName().compareTo(p4.getName()));
	  	for(Employe emp: employeeList)
			tem.add(emp);
	  	for(Employe emp: tem) {
			
				System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
		}
	  	System.out.println("Company "+name+" sort by Age");
	  	TreeSet<Employe> te = new TreeSet<Employe>((p1,p2) -> p1.getAge() - p2.getAge());
	  	for(Employe emp: employeeList)
			te.add(emp);
	  	for(Employe emp: te) {
			
				System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
		}
		
	}
	  	if(id==2) {
		  	employeeList.add(new Employe(1,"Manish",21));
		  	employeeList.add(new Employe(2,"Shreya",23));
		  	employeeList.add(new Employe(3,"Labdhi",31));
		  	employeeList.add(new Employe(4,"Jain",37));
		  	System.out.println("Company "+name+" age below 30");
		  	for(Employe emp: employeeList) {
				if(emp.getAge()<30) 
					System.out.println("Name "+emp.getName());
			}
		  	System.out.println("Company "+name+" sort by id");
		  	TreeSet<Employe> temp = new TreeSet<Employe>((p1,p2) -> p1.getId() - p2.getId());
		  	for(Employe emp: employeeList)
				temp.add(emp);
		  	for(Employe emp: temp) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by name");
		  	TreeSet<Employe> tem = new TreeSet<Employe>((p3,p4) -> p3.getName().compareTo(p4.getName()));
		  	for(Employe emp: employeeList)
				tem.add(emp);
		  	for(Employe emp: tem) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by Age");
		  	TreeSet<Employe> te = new TreeSet<Employe>((p1,p2) -> p1.getAge() - p2.getAge());
		  	for(Employe emp: employeeList)
				te.add(emp);
		  	for(Employe emp: te) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		}
	  	if(id==3) {
		  	employeeList.add(new Employe(1,"Mridul",31));
		  	employeeList.add(new Employe(2,"Rishi",33));
		  	employeeList.add(new Employe(3,"Kapil",31));
		  	employeeList.add(new Employe(4,"Urmi",37));
		  	System.out.println("Company "+name+" age below 30");
		  	for(Employe emp: employeeList) {
				if(emp.getAge()<30) 
					System.out.println("Name "+emp.getName());
			}
		  	System.out.println("Company "+name+" sort by id");
		  	TreeSet<Employe> temp = new TreeSet<Employe>((p1,p2) -> p1.getId() - p2.getId());
		  	for(Employe emp: employeeList)
				temp.add(emp);
		  	for(Employe emp: temp) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by name");
		  	TreeSet<Employe> tem = new TreeSet<Employe>((p3,p4) -> p3.getName().compareTo(p4.getName()));
		  	for(Employe emp: employeeList)
				tem.add(emp);
		  	for(Employe emp: tem) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by Age");
		  	TreeSet<Employe> te = new TreeSet<Employe>((p1,p2) -> p1.getAge() - p2.getAge());
		  	for(Employe emp: employeeList)
				te.add(emp);
		  	for(Employe emp: te) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		}
	  	if(id==4) {
		  	employeeList.add(new Employe(1,"Agarwal",22));
		  	employeeList.add(new Employe(2,"Dutta",23));
		  	employeeList.add(new Employe(3,"Shruti",23));
		  	employeeList.add(new Employe(4,"Kirti",27));
		  	System.out.println("Company "+name+" age below 30");
		  	for(Employe emp: employeeList) {
				if(emp.getAge()<30) 
					System.out.println("Name "+emp.getName());
			}
		  	System.out.println("Company "+name+" sort by id");
		  	TreeSet<Employe> temp = new TreeSet<Employe>((p1,p2) -> p1.getId() - p2.getId());
		  	for(Employe emp: employeeList)
				temp.add(emp);
		  	for(Employe emp: temp) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by name");
		  	TreeSet<Employe> tem = new TreeSet<Employe>((p3,p4) -> p3.getName().compareTo(p4.getName()));
		  	for(Employe emp: employeeList)
				tem.add(emp);
		  	for(Employe emp: tem) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by Age");
		  	TreeSet<Employe> te = new TreeSet<Employe>((p1,p2) -> p1.getAge() - p2.getAge());
		  	for(Employe emp: employeeList)
				te.add(emp);
		  	for(Employe emp: te) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		}
	  	if(id==5) {
		  	employeeList.add(new Employe(1,"Layeeq",21));
		  	employeeList.add(new Employe(2,"Krutika",23));
		  	employeeList.add(new Employe(3,"Ahmeed",31));
		  	employeeList.add(new Employe(4,"Shah",37));
		  	System.out.println("Company "+name+" age below 30");
		  	for(Employe emp: employeeList) {
				if(emp.getAge()<30) 
					System.out.println("Name "+emp.getName());
			}
		  	System.out.println("Company "+name+" sort by id");
		  	TreeSet<Employe> temp = new TreeSet<Employe>((p1,p2) -> p1.getId() - p2.getId());
		  	for(Employe emp: employeeList)
				temp.add(emp);
		  	for(Employe emp: temp) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by name");
		  	TreeSet<Employe> tem = new TreeSet<Employe>((p3,p4) -> p3.getName().compareTo(p4.getName()));
		  	for(Employe emp: employeeList)
				tem.add(emp);
		  	for(Employe emp: tem) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		  	System.out.println("Company "+name+" sort by Age");
		  	TreeSet<Employe> te = new TreeSet<Employe>((p1,p2) -> p1.getAge() - p2.getAge());
		  	for(Employe emp: employeeList)
				te.add(emp);
		  	for(Employe emp: te) {
				
					System.out.println("ID "+ emp.getId()+" Name "+emp.getName()+" Age "+emp.getAge());
			}
		}
	}
	 public int getId() {
		   return id;
	   }
	 public void setId(int id) {
		   this.id=id;
	   }
	 public String getName() {
	  	 return name;
	   }
	 public void setName(String name) {
	  	 this.name=name;
	   }
	 public String getCity() {
	  	 return city;
	   }
	 public void setCity(String city) {
	  	 this.city=city;
	   }

}
