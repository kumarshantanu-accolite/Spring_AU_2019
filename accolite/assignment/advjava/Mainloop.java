package accolite.assignment.advjava;

import java.util.*;

public class Mainloop {
	 public static void main(String args[]) {
			
		 List<Company> companyList = new LinkedList<>();
		 companyList.add(new Company(1,"Accolite","Bangalore"));
		 companyList.add(new Company(2,"VISA","Bangalore"));
		 companyList.add(new Company(3,"CISCO","Bangalore"));
		 companyList.add(new Company(4,"Paytm","Mumbai"));
		 companyList.add(new Company(5,"Google","Mumbai"));
		 System.out.println("\nCITYWISE COMPANY PRINT");
			ArrayList<Company> temp = new ArrayList<Company>();
			for(Company c1 : companyList) {
				if(!temp.contains(c1)) {
					temp.add(c1);
					System.out.println("\nCITY: " + c1.getCity());
					System.out.println(c1.getName());
					for(Company c2: companyList) {
						if(c1!=c2 && c1.getCity().equalsIgnoreCase(c2.getCity())){
							System.out.println(c2.getName());
							temp.add(c2);
						}
					}
				}
}

	 }}



















