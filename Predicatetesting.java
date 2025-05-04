package java8;

import java.util.List;
import java.util.function.Predicate;

public class Predicatetesting {

	public static void main(String[] args) {
	List<String> names=List.of("Raghu", "vishnu","Valli","Hindavi","Raju","Rani","Gopi","mani","Mahesh","vasu");
Predicate<String> p=(name)->name.startsWith("R");
Boolean b=p.test("Ramu");
if(b) {
	System.out.println("he is present");
}
else {
	System.out.println("Not present");
}
	}

}
