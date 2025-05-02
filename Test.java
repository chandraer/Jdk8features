package java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
	Myinterface inter=()->System.out.println("hello learning java8");
	inter.print();
	Function<Integer,Integer> square=x->x*x;
	System.out.println(square.apply(10));
	BiFunction<Integer, Integer,Integer> function=(a,b)-> a+b;
	System.out.println(function.apply(10,10));
	
	}

}
