package Hypernet.Process;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
       
        List<Employee>employeeList= new ArrayList<Employee>();
        List<Project>projectList= new ArrayList<Project>();
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session =factory.openSession();
        session.beginTransaction();
       Employee e=new Employee();
        e.setEmployeeName("Kumar");
        e.setEmployeeAge(21);
        e.setEmployeeName("Kumar");
        e.setEmployeeAge(21);
        e.setEmployeeName("Shan");
        e.setEmployeeAge(22);
        e.setEmployeeName("Layeeq");
        e.setEmployeeAge(24);
        e.setEmployeeName("Aman");
        e.setEmployeeAge(27);
         e.setEmployeeName("Shan");
        e.setEmployeeAge(22);

        Integer id=(Integer)session.save(e);
        
        session.getTransaction().commit();
        
        Criteria cr = session.createCriteria(Employee.class); 
		 
		
       cr.add(Restrictions.eq("employeeId", 2));
		  employeeList= cr.list();
		  System.out.println("Tell us the employee count with id 2");
		  System.out.println(employeeList.size());
		  System.out.println("Tell us the employee Id and Name with id 2 ");
		  for(Employee st:employeeList)
		  {
			  System.out.println(st);
			  System.out.println(st.getEmployeeId()+" "+st.getEmployeeName()+" "+st.getEmployeeAge());
		  }
		  @SuppressWarnings("deprecation")
		Criteria cd = session.createCriteria(Employee.class); 
		  cd.add(Restrictions.gt("employeeAge", 22));
		  employeeList= cd.list();
		  System.out.println("Tell us the employee count above age 22");
		  System.out.println(employeeList.size());
		  System.out.println("Tell us the employee Id and Name with age above 22 ");
		  for(Employee st:employeeList)
		  {
			  
			  System.out.println(st.getEmployeeId()+" "+st.getEmployeeName()+" "+st.getEmployeeAge());
		  }
		
		  Project p=new Project();
	     p.setEmployeeId(4);
	       p.setProjectName("Paytm Project");
	        session.save(p);
		  p.setEmployeeId(3);
	       p.setProjectName("WallMart Project");
	        session.save(p);
		  p.setEmployeeId(7);
	       p.setProjectName("SAP Project");
	        session.save(p);
		  p.setEmployeeId(6);
	       p.setProjectName("Accolite Project");
	        session.save(p);
		  p.setEmployeeId(4);
	       p.setProjectName("WallMart Project");
	        session.save(p);     
	     
	       Criteria co = session.createCriteria(Project.class); 
	       co.add(Restrictions.eq("employeeId", 4));
			  projectList= co.list();
			 System.out.println("Project ID & Name with employeeId 4 ");
			  for(Project ct:projectList)
			  {
				  System.out.println("Project id: "+ct.getProjectId()+"||"+" Project name: "+ct.getProjectName());
				 
			  }
		  
			  Criteria ci = session.createCriteria(Employee.class); 	  
			  employeeList= ci.list();     
			  System.out.println("Employee ID,Name &age along with Project Name ");
			  for(Employee employee: employeeList) {
				  System.out.println("Employee Name:" +employee.getEmployeeName()+"|"+"Employee Age:"+ 
				  +employee.getEmployeeAge()+"|"+"Employee Id:" +
				  +employee.getEmployeeId()+"|"+"Employee Project Name:"
				  +(!employee.getProjects().isEmpty()?employee.getProjects().get(0).getProjectName()
				  :"No Project Assigned") );
				  } 
    }
}
