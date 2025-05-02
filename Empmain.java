package java8;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class Empmain {
public static void main(String[] args) {
	List<Employee> emps=List.of(new Employee(101,"bose",35450.00),new Employee(102,"chandrabose",45450.00));
	Optional<Employee> emp =emps.stream().filter(x->x.getId()==108)
				  .findFirst();
		emps.stream()
			.sorted((e1,e2)->Double.compare(e1.getSal(), e2.getSal()));
//	if(emp.isPresent())
//	{
//		System.out.println("Employee is:"+emp.get());
//		}
//		else {
//		System.out.println("data not found");
//	}
//	emp.ifPresent((x)->System.out.println(x));
//	emp.orElseThrow(()->new NoSuchElementException("Data not found"));
//	emp.ifPresentOrElse(x->System.out.println(x), ()->System.out.println("data not found"));
Employee e=(emp.orElse(new Employee(104,"sss",35450.00)));
System.out.println(e);
	
}
}
