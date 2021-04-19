package EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ParentEmployee {
	private  long id;   
    private  String name;   
    private  Date dateOfBirth;    
    private  BigDecimal salary;
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, dateOfBirth, salary);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		if (id != employee.getId())
			return false;
		if (name != null ? !name.equals(employee.getName()) : employee.getName() != null)
			return false;
		if (dateOfBirth != null ? !dateOfBirth.equals(employee.getDateOfBirth()) : employee.getDateOfBirth() != null)
			return false;
		return salary != null ? salary.equals(employee.getSalary()) : employee.getSalary() == null;
	}
	 
}
