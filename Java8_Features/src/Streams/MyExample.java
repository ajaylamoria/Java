package Streams;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyExample {
	static int element =10;
	public static void main(String[] args) {
		
		
/*	----------------------------------------------------------------------------------------------	*/
    /*Java Stream Supports Parallel and Sequential Processing	*/	
		
	/*
	 *When to Use Java Streams
	 *
      Java streams represent a pipeline through which the data will flow and the functions to operate on the data.
      As such, they can be used in any number of applications that involve data-driven functions. 
      In the example below, the Java stream is used as a fancy iterator:
     */ 


    




		
/**1.Start:Creation of Streams*/	

/*1.1 Creation Of Streams Without Collections
		 * Stream.of(Array)
		 * Stream.generate(Lambda Expression)
		 * Stream.iterate(Lambda Expression)
		 * Arrays.stream(Array)
		 * String.chars()*/
	

/* Stream.of(Array)	*/	
		
		Integer [] arr ={1,2,3};

			Stream<Integer> stream =Stream.of(arr);        // Stream Created by Stream.of()
			stream.forEach(str ->{System.out.println(str);}); 
			
/*Stream.generate(Lambda Expression)*/	
			
			//Stream Created by generate method and it uses Supplier Interface to return Stream Object.
			Stream<String> stream1 = Stream.generate(()->{return "abc";});  

/*Stream.iterate(Lambda Expression)	*/	
			
			Stream<String> stream2 = Stream.iterate("abc", (x)->x);
			Stream.iterate(0, (x)->x+1).limit(5).forEach(val->System.out.println("Iterate Stream "+val));;
/* Arrays.stream(Array)	*/	
			int [] arr1 ={1,2,3};
			IntStream stream3 = Arrays.stream(arr1);
			stream3.forEach(x ->System.out.println(x));
			
		/* NOTE:: 1. Stream.of(arr[int or Integer]) returns Stream<Primitive or non Primitive>
	                * but Arrays.stream(arr[int]) return intStream if we use primitives */	
			
/*Create Streams from List */			
   List<Integer>  listA = new ArrayList<>();
        listA.stream().forEach(val -> {System.out.println(val);});

/*1.2 Creation Of Streams  Collections.*/
			
		Employee arrayOfEmps[] = {
					new Employee(1, "AJay", 100),
					new Employee(2, "Vineet", 200),
					new Employee(3, "Abhishek", 300)
			};
			
			
			List<Employee> list = Arrays.asList(arrayOfEmps);
			Stream<Employee> stream4 = list.stream();
			stream4.forEach(emp -> System.out.println("From List:- " +emp.getName()));
	
/**1.End:Creation of Streams*/
			
/**2.Get List or Array from Stream */	
			
			//Get a List from Stream
			List<Employee> myList = Arrays.asList(arrayOfEmps);
			Stream<Employee> stream5 = myList.stream();		
			
			List<Employee> myListBack = stream5.collect(Collectors.toList());
			myListBack.forEach(emp->System.out.println(emp.getName()));
			
			String arrNew[] ={"Ajay","rajiv","DJ"};
			Stream<String> streamNew = Stream.of(arrNew);
			Object arrNewBack[] = streamNew.toArray();
			
			
			
/*---------------------------------------------------------------------------------------------------------
*/
			

/** 3.Java Stream Intermediate Operations
 *    .3.1 Slicing Operation
 *           1.filter(Lambda Expression)
 *           2.distinct()
 *           3.Limit(n)
 *           3.skip(n)
 * Stream map(Function mapper) */
			
/*1.Boolean filter(Lambda Expression):--
 * Filter method: The filter method filters out elements from a given stream. It uses a Predicate function
   instance which it applies to the whole stream and returns a filtered stream containing those elements which match the Predicate.
   It is an intermediateClick to Read Tutorial explaining intermediate & terminal Stream operations stream operation.
   
   Syntax of filter method: <stream-instance>.filter()
 * 
 * We can use filter() method to test stream elements for a condition and generate filtered list.*/	
			
 List<Integer> myList1 = new ArrayList<Integer>();
 for(int i = 0;i<40;i++){
	 myList1.add(i);
 }
 
 Stream<Integer> seqStream = myList1.stream();
 Stream<Integer> filteredStream= seqStream.filter(x->x>30);
 filteredStream.forEach(x->System.out.println("Filtered Stream :-"+x));

 /*
  * Distinct Method: The distinct method when applied to a stream, returns a stream instance which has all elements unique/distinct. 
  * I.e. every unique element is present only once in the resultant stream. The uniqueness of elements in the resultant stream is 
  * determined by the equals & hashcode implementation in these elements. It is an intermediate stream operation.
    Syntax of distinct method: <stream-instance>.distinct()
    Returns: java.util.Stream */
 
    List<Integer> li = new ArrayList<>();
    li.add(2);
    li.add(2);
    li.add(3);
    li.add(4);
    
    li.stream().distinct().forEach(val ->System.out.println("Distinct Val:-"+val));
    
    /*limit and skip Method
     * Syntax of limit method: <stream-instance>.limit(n)
       Returns: java.util.Stream of n elements
        Limit(n) method: The limit method puts an upper-limit cap purely based on the number of elements in the stream.
        A limit of n applied to a stream returns a stream which contains exactly n elements if the original stream had more than or equal
        to n elements. In case the original stream had less than n elements, and limit of n has been applied on the stream, 
        then there is no affect on the stream elements, i.e. the returned stream is same as the original stream. 
        This method is a short-circuiting intermediate stream operation.
        
        
    *Syntax of skip method: <stream-instance>.skip(n)
     Returns: java.util.Stream of elements post first n elements
     Skip(n) method: The skip method is complimentary to the limit method. I.e. the skip method returns a truncated version of the original stream 
     such that the first n elements in the list are skipped and the remaining elements are returned in the resulting stream. 
     This method is an intermediate stream operation.
      */
    
    Stream.iterate(0, n->n+1).limit(10).forEach(val->System.out.println("Limit Fun:-"+val));
    Stream.iterate(0, n->n+1).skip(10).forEach(val->System.out.println("Skip Fun:-"+val));
    
    
    
/* Stream map(Function mapper) */
 
/* The Stream.map() function performs map functional operation i.e.
 *  it take a Stream and transform it to another Stream. 
 *  It applies a function on each element of Stream and store return value into new Stream
 *  
 *  refer this link :-https://www.javabrahman.com/java-8/java-8-mapping-with-streams-map-flatmap-methods-tutorial-with-examples/
 */

 
 List<Integer> mapList = new ArrayList<Integer>();
 mapList.add(10);
 mapList.add(20);
 mapList.add(30);
 mapList.add(40);
 
 mapList.forEach(val->System.out.println("Before Map :"+val));
 List<Integer> mapList2 =mapList.stream().map(x->x*3).collect(Collectors.toList());
 mapList2.forEach(val->System.out.println("After Map :"+val));
 
 // Transform String to Integer
 List<Integer> listOfIntegers = Stream.of("1","2","3").map(Integer::valueOf).collect(Collectors.toList());
 listOfIntegers.forEach(x->System.out.println(x));
 
 
 /*The Stream.flatMap() function
  * as name suggests, is the combination of a map and a flat operation.
  *  This means you first apply map function and than flattens the result.
  *   Key difference is the function used by map operation returns a Stream of values 
  *   or list of values rather than single value, that's why we need flattening.
  *    When you flat a Stream of Stream, it gets converted into Stream of values.
  */
 
 List<String> Lists = Stream.of(Arrays.asList("1","2","4"),Arrays.asList("7","5","4"),Arrays.asList("11","24","44")).
		 flatMap(list1->list1.stream()).collect(Collectors.toList());
 
 Lists.forEach(x->System.out.print(" "+x));
 System.out.println();
 
 /*sorted(Comparator)*/
 
 List<Integer> sortedList = Stream.of(3,5,6,8,2).sorted().collect(Collectors.toList());
 sortedList.forEach(x->System.out.print(x));
 System.out.println();
/* ---------------------------------------------------------------------------------------------------------*/
 
 /**Java Stream Terminal Operations*/
 
/* reduce()
 * https://www.javabrahman.com/java-8/java-8-reducing-with-streams-reduce-method-tutorial-with-examples/*/
 
 
 List<String> words = Arrays.asList("GFG", "Geeks", "for", 
         "GeeksQuiz", "GeeksforGeeks"); 

// The lambda expression passed to 
// reduce() method takes two Strings 
// and returns the longer String. 
// The result of the reduce() method is 
// an Optional because the list on which 
// reduce() is called may be empty. 
Optional<String> longestString = words.stream() .reduce((word1, word2)-> word1.length() > word2.length() 
         ? word1 : word2); 

// Displaying the longest String 
longestString.ifPresent(System.out::println); 

//1. Sum of elements
 List<Integer> lists = Arrays.asList(1,2,3,4,5);
 int sum=lists.stream().reduce(0,(x,y)->x+y);
 System.out.println("Sum of Reduce :-"+sum);
 
 int MaxElement=lists.stream().reduce(0,(x,y)->x >y?x:y);
 System.out.println("Maximum of Reduce :-"+MaxElement);
 
 
/**2.Start:-Functional Interfaces in Java 8 Stream	*/	
		
/*2.1 :Start:- Function Interface : It is a Functional Interface which takes one argument as Input and 
 *             other Argument is Output*/	
		
			
	// (3).Function which takes in a number and returns half of it 		
	  Function<Integer,Double> func = x->x/2.5;	
	  
	// (2).It Executes After Func
	  func = func.andThen(x->x*4);
	
	// (1).It Executes Before Func
	  func = func.compose(x->x*x);
	  
	// 3.apply the function to get the result 
	System.out.println(func.apply(10));
	
	// It returns the Identity of Function
	Function iden = Function.identity();
	System.out.println(iden);

/*2.1 : End : Function Interface */
	

/*2.2 :Start:- BiFunction Interface : It is a Interface which takes 2 Argument as an input and 3rd argument 
 *             result. */
			
   	
/*2.3 : Predicate Interface*/
	/*Belongs to java.util.function Package
	This Interface improves manageability of code,
	helps in unit-testing them separately, and contain some methods like:
	isEqual() ,and(),or(),negate(),test() etc. */
		
	// Creating predicate
	Predicate<Integer> pred = x->(x<10);   
	
	// Calling Predicate method 
	System.out.println(pred.test(5));
	
	/*Predicate Chaining*/
	Predicate<Integer> grtThanTen = x->(x>10);
	Predicate<Integer> lessThanTwnty = x->(x<20);
	
	System.out.println(grtThanTen.and(lessThanTwnty).test(15));
	
/*2.4 : Consumer Interface*/	
	
	/*It is an Interface which takes one Argument and produces result
	Consumer Interface is useful when it is not needed to return any value*/
	
	Consumer<Integer> cons = current-> System.out.println(current);
	cons.accept(10);
	
	Consumer<Integer> cons1 = modify->{
		element= element+10;
	};
	
	cons1.andThen(cons).accept(20);
	
/*3. Types Of Streams:- 1.Sequential Stream and 2. Parallel Stream 	*/
	
	List<Integer> list1 = new ArrayList<Integer>();
	for(int i=0;i<20;i++){
		list1.add(i);
	}
	
	Stream<Integer> seqStream1 = list1.stream();
	Stream<Integer> parallelStream = list1.parallelStream();
	seqStream1.forEach(x ->System.out.print(","+x));
	System.out.println();
	parallelStream.forEach(x ->System.out.print(","+x));
	}

}
