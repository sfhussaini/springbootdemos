package manageemployees;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperationsImpl implements EmployeeOperations {
	@Autowired
	private OperationsConfiguration config;
	
	public void setConfig(OperationsConfiguration config) {
		this.config = config;
	}
	
	@Override
	public void writeObject(Employee obj) {
		try {
			FileOutputStream fos = new FileOutputStream(config.getFileName());
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}