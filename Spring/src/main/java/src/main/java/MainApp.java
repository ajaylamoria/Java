package src.main.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Collections.CollectionsFile;
import beanLifecycle.BeanLifeCycle;
import depandencyInjection.TextEditor;
import inheritance.HelloIndia;
import inheritance.HelloWorld;;

public class MainApp {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
/*Bean Scopes  :Start*/
		
	/*    
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.setMessage("One Object");
	      System.out.println(obj.getMessage());
	      HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
	      System.out.println(obj2.getMessage());
	*/
	      
/*Bean Scopes  :End*/ 
	      
/*Bean Life Cycle :Start*/ 
		
		
    /*    
	      BeanLifeCycle bean = (BeanLifeCycle) context1.getBean("beanLifeCycle");
	      bean.setMessage("Hello Bean ");
	      bean.getMessage();
	     // context1.registerShutdownHook()
	      bean.destroy();
    */
		
/*Bean Life Cycle :End*/ 
	
		
/*Inheritance :Start	*/	
		
   /*     HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
	      objA.getMessage1();
	      objA.getMessage2();

	      HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();
   */

/*Inheritance :End	*/	
		
/*Constructor Based Injection :Start	*/	
		
  /*      TextEditor obj = (TextEditor) context.getBean("textEditor");
		  obj.spellCheck();
		  obj.langCheck();
	      */
/*Constructor Based Injection :End*/	
		
		
		
/*Setter Based Injection :Start	*/	
		
		TextEditor objsetter = (TextEditor) context.getBean("textEditor");
		objsetter.spellCheck();
		
	      
/*Setter Based Injection :End*/		
		
		CollectionsFile obj=(CollectionsFile) context.getBean("collections");
		System.out.println("List: "+obj.getNumberList());
		System.out.println("Set: "+obj.getMobileSet());
		System.out.println("Map: "+obj.getAddressMap());
		System.out.println("Property: "+obj.getProp());
		
	}

}
