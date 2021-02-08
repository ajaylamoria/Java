package singleton_pattern;


 
 
/**
 *  Copyright (c), AnkitMittal JavaMadeSoEasy.com
 *  Main class
 */
public class SingletonClassTest {
    public static void main(String... a) throws NoSuchFieldException, SecurityException {
           
    	/*Eager Initialization Object Creation
    	Singleton eagerInstance = Singleton.getEagerInstance();
    	eagerInstance.show();
    	System.out.println("-----------------------------");*/
    	
    	/*Static Initialization Object Creation*/
    	/*Singleton staticInstance = Singleton.getStaticInstance();
    	staticInstance.show();
    	System.out.println("-----------------------------");*/
    	
    	/*Static Initialization Object Creation*/
    	/*How to check a class is singleton*/
    	Singleton  lazyInstance = Singleton.getLazyInstance();
    	lazyInstance.show();
    	System.out.println("-----------------------------");
    	Singleton  lazyInstance2 = Singleton.getLazyInstance();
    	lazyInstance2.show();
    	
    	
    	System.out.println(lazyInstance.equals(lazyInstance2));
    	
    	
          
           
    }
}
 
/*OUTPUT
 
m()
m()
true
 
*/