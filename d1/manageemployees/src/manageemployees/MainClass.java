package manageemployees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void  main(String args[]) {
		try {
			//Supporting Logic
			EmployeeOperations operations;
			ApplicationContext springContainer = new AnnotationConfigApplicationContext("manageemployees"); // Creating the Spring Container instance
			operations = springContainer.getBean(EmployeeOperations.class); //Find for EmployeeOperations instance
			OperationsConfiguration config = springContainer.getBean(OperationsConfiguration.class); //Find for OperationsConfiguration bean instance
			config.setFileName("C:/TEMP/james.dat"); //Set the configuration data
			
			//Business Logic
			Employee james = new Employee(100, "James Cooper");
			operations.writeObject(james);
			System.out.println("Object written to file...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
