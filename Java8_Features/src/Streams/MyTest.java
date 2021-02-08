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
