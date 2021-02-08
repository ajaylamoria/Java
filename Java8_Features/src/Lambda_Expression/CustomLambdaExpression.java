package Lambda_Expression;

public class CustomLambdaExpression {

	public static void main(String[] args) {
		
		   // lambda expression to implement above 
        // CustomFunctionalInterface interface. This interface 
        // by default implements show(int number) 
		CustomFunctionalInterface cusObj = (x,y) ->{
			System.out.println(x+" "+y);
		};
      
		cusObj.show(10,30);
	}

	/*Note that lambda expressions can only be used to implement functional interfaces*/
}
