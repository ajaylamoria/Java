package MVC.controller.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.Student;
import jdbc.StudentDAO;
import jdbc.StudentMapper;

public class StudentDAOImpl implements StudentDAO{

	JdbcTemplate template;
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		
	}

	public void create(Student std) {
		  String SQL = "insert into Student (id,name, age) values (?, ?,?)";
		  template.update(SQL,std.getId(),std.getName(),std.getAge());
		
	}

	public Student getStudent(Integer id) {
		 String SQL = "select * from Student where id = ?";
	      Student student = template.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return student;
	}
	
	

	public List<Student> listStudents() {
		 String SQL = "select * from Student";
	      List <Student> students = template.query(SQL, new StudentMapper());
	      return students;
	}

	public void delete(Integer id) {
		 String SQL = "delete from Student where id = ?";
		 template.update(SQL,id);
		
	}

	public void update(Student std) {
		String sql="update Student set name='"+std.getName()+"', age='"+std.getAge()+"' where id="+std.getId()+"";  
	     template.update(sql);
		
	}
	

}
