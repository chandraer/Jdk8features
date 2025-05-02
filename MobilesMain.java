package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MobilesMain {

	public static void main(String[] args) {
		
List<MobilesList> ref=new ArrayList<MobilesList>();
ref.add(new MobilesList("Apple13", "pink", 78000.00));
ref.add(new MobilesList("Oneplus9", "AuroraGreen", 75000.00));
ref.add(new MobilesList("Apple10", "Silver", 90000.00));
ref.add(new MobilesList("OppoF19", "cosmicBlack", 85000.00));
ref.add(new MobilesList("OppoFl9", "green", 67500.00));
ref.stream().filter((x)->x.getMobName().equals("Apple1")).findFirst().get();
//
	}
}
