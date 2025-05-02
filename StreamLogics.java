package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamLogics {

	public static void main(String[] args) {
		List<Double> salaries=List.of(55345.56, 45656.75,34567.78,34678.67,25465.90,17650.22,18456.50,19875.90, 19000.25,25000.56);
		Optional<Double> d=salaries.stream().reduce((a,b)->a+b);
		System.out.println(d);
         
	}
	

}
