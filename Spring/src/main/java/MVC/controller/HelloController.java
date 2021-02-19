package MVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import MVC.controller.dao.StudentDAOImpl;
import jdbc.Student;
@Controller

public class HelloController {
    
	@Autowired
	StudentDAOImpl studentDao;
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring MVC Framework!");
	      return "hello";
	   
 }
	
	
	@RequestMapping("/studentForm")  
    public String showform(Model m){  
    	m.addAttribute("command", new Student());
    	return "studentForm"; 
    } 
	
	/*It saves object into database. The @ModelAttribute puts request data 
     *  into model object. You need to mention RequestMethod.POST method  
     *  because default request is GET*/  
    @RequestMapping(value="/save",method = RequestMethod.POST)  
    public String save(@ModelAttribute("student") Student student){  
        studentDao.create(student);  
        return "redirect:/viewStudent";//will redirect to viewemp request mapping  
    }
    
    /* It provides list of Students in model object */  
    @RequestMapping("/viewStudent")  
    public String viewStudent(Model m){  
        List<Student> list=studentDao.listStudents();  
        m.addAttribute("list",list);
        return "viewStudent";  
    } 
    
    /* It deletes record for the given id in URL and redirects to /viewemp */  
    @RequestMapping(value="/deleteStd/{id}",method = RequestMethod.GET)  
    public String delete(@PathVariable int id){  
        studentDao.delete(id);  
        return "redirect:/viewStudent";  
    }
    
    /* It displays object data into form for the given id.  
     * The @PathVariable puts URL data into variable.*/  
    @RequestMapping(value="/editStd/{id}")  
    public String edit(@PathVariable int id, Model m){  
        Student std=studentDao.getStudent(id);  
        m.addAttribute("command",std);
        return "studenteditform";  
    }
    
    /* It updates model object. */  
    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
    public String editsave(@ModelAttribute("emp") Student std){  
        studentDao.update(std);  
        return "redirect:/viewStudent";  
    }
}
