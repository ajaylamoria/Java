package Lambda_Expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyClass {

	static final int INF = 100000;
	  static int[] r = new int[5+1];

	  public static int max(int x,int y) {
	    if(x > y)
	      return x;
	    return y;
	  }

	  public static void initR(){
	    r[0] = 0;
	    for(int i=1; i<=5; i++) {
	      r[i] = -1*INF;
	    }
	  }

	  public static int topDownRodCutting(int c[], int n) {
	    if (r[n] >= 0) {
	      return r[n];
	    }

	    int maximumRevenue = -1*INF;
	    int i;

	    for(i=1; i<=n; i++) {
	      maximumRevenue = max(maximumRevenue, c[i] + topDownRodCutting(c, n-i));
	    }

	    r[n] = maximumRevenue;
	    return r[n];
	  }
	  
	  public static void main(String[] args) {
		    initR();
		    // array starting from 1, element at index 0 is fake
		    int c[] = {4,3,2};
		    System.out.println(topDownRodCutting(c, 7));
		  }
}
