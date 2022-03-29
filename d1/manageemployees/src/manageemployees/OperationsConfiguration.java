package manageemployees;

import org.springframework.stereotype.Component;

@Component
public class OperationsConfiguration {
	private String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
