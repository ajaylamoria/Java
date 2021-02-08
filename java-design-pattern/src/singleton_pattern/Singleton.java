package singleton_pattern;

/**
* Singleton class - with Double checked Locking
* 
* To implement a Singleton pattern, we have different approaches but all of them have the following common concepts.

   Private constructor to restrict instantiation of the class from other classes.
   Private static variable of the same class that is the only instance of the class.
   Public static method that returns the instance of the class, this is the global access point for outer world to get
   the instance of the singleton class.
*/
class Singleton {
 
	/*1.Eager Initialization 
	 * 
	 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
	 * this is the easiest method to create a singleton class but it has a drawback
	 * that instance is created even though client application might not be using it.
	 * */
    private static final Singleton eagerInstance = new Singleton();
    
    /*Private Constructor to restrict the instantiation of Singleton Object*/
    private Singleton(){}
    
    /*Provide Global Access point to return Instance of SINGLETON object*/
    public static Singleton getEagerInstance(){
    	return eagerInstance;
    	
    }
    
    /*If your singleton class is not using a lot of resources, this is the approach to use. 
     * But in most of the scenarios, Singleton classes are created for resources such as File System, Database connections, etc. 
     * We should avoid the instantiation until unless client calls the getInstance method. Also, this method doesn’t provide any options
     * for exception handling.*/
    
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /*2. Static block initialization
     * 
     * Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block
     * that provides option for exception handling.*/
    
    private static final Singleton staticInstance;
    
    static{
    	try{
    		System.out.println("Static block initialization");
    		staticInstance = new Singleton();
    	}catch(Exception e){
    		throw new RuntimeException("Exception occured in creating singleton instance");
    	}
    }
    
    /*Provide Global Access point to return Instance of SINGLETON object*/
    public static Singleton getStaticInstance(){
    	if(staticInstance!=null){
    		System.out.println("Singleton Object Alreeady Created(By STATIC)");
    		return staticInstance;
    	}
    	else{
    		System.out.println("New Singleton Object Created"); // Code will never come to else condition becz instance is already created
    		return staticInstance;
    	}
    }
    
    /*
     * Both eager initialization and static block initialization creates the instance even before it’s being used and
     *that is not the best practice to use. So in further sections, we will learn how to create a Singleton class
     *that supports lazy initialization.
     **/
    
    /*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    /*3.Lazy Initialization
     * Lazy initialization method to implement Singleton pattern creates the instance in the global access method.*/
    
    private static Singleton lazyInstance;
    
    public static  Singleton getLazyInstance(){
    	if(lazyInstance==null){
    		lazyInstance = new Singleton();
    		System.out.println("Singleton New Object created (by LAZY)");
    		return lazyInstance;
    		
    	}
    	else{
    		System.out.println("Singleton Object Already created (by LAZY)");
    		return lazyInstance;
    		
    	}
    	
    	
    }
    
    /*
     * The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems,
     * it can cause issues if multiple threads are inside the if condition at the same time. It will destroy the singleton pattern
     * and both threads will get the different instances of the singleton class. In next section, we will see different ways to
     * create a thread-safe singleton class
     * */
    
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
  /*4. Thread Safe*/
    
private static Singleton lazyInstanceThreadSafe;
    
    public static  synchronized Singleton getThreadSafeLazyInstance(){
    	if(lazyInstanceThreadSafe==null){
    		lazyInstanceThreadSafe = new Singleton();
    		System.out.println("Singleton New Object created (by LAZY THREAD SAFE)");
    		
    	}
    	else{
    		System.out.println("Singleton Object Already created (by LAZY THREAD SAFE)");
    		
    	}
    	return lazyInstanceThreadSafe;
    	
    }
    
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /*4. Thread Safe with Double Lock Checking Principle*/
    
private static Singleton lazyInstanceDoubleLockChecking;
    
    public static  Singleton getDoubleLockCheckingInstance(){
    	
    	if(lazyInstanceDoubleLockChecking==null){
    		synchronized (Singleton.class) {
				if(lazyInstanceDoubleLockChecking==null){
					lazyInstanceDoubleLockChecking = new Singleton();
		    		System.out.println("Singleton New Object created (by DOUBLE CHECKED LOCK)");
				}
			}
    	}
    	else{
    		System.out.println("Singleton Object Already created (by DOUBLE CHECKED LOCK)");
    		
    	}
    	return lazyInstanceDoubleLockChecking;
    	
    }
/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    
   /*5. Bill Pugh Singleton Implementation
    * Prior to Java 5, java memory model had a lot of issues and the above approaches used to fail in certain scenarios 
    * where too many threads try to get the instance of the Singleton class simultaneously. 
    * So Bill Pugh came up with a different approach to create the Singleton class using an inner static helper class.
    * */
    
    private static class SingletonHelper{
    	private static final Singleton finalInstance = new Singleton();
    }
    
    public static Singleton getFinalInstance(){
    	
    	return SingletonHelper.finalInstance;
    }
    
    /*
     * Notice the private inner static class that contains the instance of the singleton class. When the singleton class is loaded, 
     * SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, 
     * this class gets loaded and creates the Singleton class instance.

     This is the most widely used approach for Singleton class as it doesn’t require synchronization.
     * */
    public void show(){
    	System.out.println("You are in Singleton");
    }

/*--------------------------------------------------------------------------------------------------------------------------------------------------------------*/
       
    
    
  
 
}
