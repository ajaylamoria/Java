package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyTest {
static int element =10;
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,24,-1,8,-3,0)); 
		for (Integer i: numbers) {
			if(i<0){
				numbers.remove(i);
				}
			} 
		
		numbers.forEach(x->System.out.println(x));
	}

}
