package jdbc;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplate {

	   private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject;
	   private SimpleJdbcCall jdbcCall;
	   
	   
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	      this.jdbcCall =  new SimpleJdbcCall(dataSource).withFunctionName("GETRECORDFUNC");
	   }
	   public void create(Integer id,String name, Integer age) {
	      String SQL = "insert into Student (id,name, age) values (?, ?,?)";
	      if(getStudent(id).getId()==id){
	    	 System.out.println("Record Already exsist in DB for :"+id+"Name :"+name+"Age :"+age);
	      }
	      else{
	    	  jdbcTemplateObject.update( SQL, id,name, age);
		      System.out.println("Created Record ID = "+id+"Name " + name + " Age = " + age);  
	      }
	     
	      return;
	   }
	   public Student getStudent(Integer id) {
	      String SQL = "select * from Student where id = ?";
	      Student student = jdbcTemplateObject.queryForObject(SQL, 
	         new Object[]{id}, new StudentMapper());
	      
	      return student;
	   }
	   
	   public Student getStudentByProc(Integer id) {
		      SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		      Map<String, Object> out = jdbcCall.execute(in);
              
		      Student student = new Student();
		      student.setId(id);
		      student.setName((String) out.get("OUT_NAME"));
		     // student.setAge((Integer) out.get("OUT_AGE"));
		      BigDecimal age =(BigDecimal) out.get("OUT_AGE"); 
		      student.setAge(age.intValue());
		      return student;
		   }
	   
	   public String getStudentByFunc(Integer id){
		   
		   SqlParameterSource in = new MapSqlParameterSource().addValue("IN_ID", id);
		      String name = jdbcCall.executeFunction(String.class, in);
		      return name;
	   }
	   public List<Student> listStudents() {
	      String SQL = "select * from Student";
	      List <Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
	      return students;
	   }
	   public void delete(Integer id) {
	      String SQL = "delete from Student where id = ?";
	      jdbcTemplateObject.update(SQL, id);
	      System.out.println("Deleted Record with ID = " + id );
	      return;
	   }
	   public void update(Integer id, Integer age){
	      String SQL = "update Student set age = ? where id = ?";
	      jdbcTemplateObject.update(SQL, age, id);
	      System.out.println("Updated Record with ID = " + id );
	      return;
	   }
	   
}
