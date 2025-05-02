package java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SpplierPro {
public static void main(String[] args) {
Consumer<Integer> s=(x)->System.out.println("Welome"+x);
s.accept(20);

}

}
