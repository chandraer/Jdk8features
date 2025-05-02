package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MobileSearchOptional {
public static void main(String[] args) {
	List<String> mobiles=Arrays.asList("iphone14","samsung Galaxy s23","onePlus 11","Google Pixel 11","Micromax 11");
	String searchMobile="iphone11";
	Optional<String> mobileOptional=mobiles.stream().filter(mobile-> mobile.equalsIgnoreCase(searchMobile)).findFirst();
	String msg=mobileOptional.isPresent()? "Mobile found:"+ mobileOptional.get():"mSearched mobile not found";
	// ispresent() method used like an if(), else, statements for optional.If the data is found print the data or else print an alternate message.
	//which directly stores in the container variable of mentioned type.
	System.out.println(msg);
	mobileOptional.ifPresent(mobile-> System.out.println("Mobile found:"+mobile));
	//ifpresent() method is used to print if the data contains only in the optional container otherwise it will print nothing
	//ifpresent() justs works like if() statement without any alternate message
//orelseGet()
	String s=mobileOptional.orElse("Your searched mobile data not found!!!");
	// Using orElse() method if value is present returns value otherwise it will return other 
	System.out.println(s);
	String m=mobileOptional.orElseThrow(()->new  MobileNotFoundException("Your searched mobile not found:"+searchMobile ));
	System.out.println(m);
	//If a value is present, returns the value, otherwise throws an exceptionproduced by the exception supplying function.
	
}
}