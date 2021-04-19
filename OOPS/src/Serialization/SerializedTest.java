package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedTest {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee(10,"Ajay");
		String filename = "file.java"; 
		 FileOutputStream file;
		 ObjectOutputStream out;
		try {
			file = new FileOutputStream(filename);
			 out = new ObjectOutputStream(file);
			 // Method for serialization of object 
	            out.writeObject(emp); 
	              
	            out.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been serialized"); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
		 // Deserialization 
		
		Employee obj2 = null;
		
		// Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream fileIn = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(fileIn); 
              
            // Method for deserialization of object 
            obj2 = (Employee)in.readObject(); 
              
            in.close(); 
            fileIn.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("ID = " + obj2.getId()); 
            System.out.println("Name = " + obj2.getName()); 
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 

	}

}
