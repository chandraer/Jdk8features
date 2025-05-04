package java8;

public class MobilesList {
private String mobName;
private String colour;
private double price;

public String getMobName() {
	return mobName;
}
public void setMobName(String mobName) {
	this.mobName = mobName;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "MobilesList [mobName=" + mobName + ", colour=" + colour + ", price=" + price + "]";
}
public MobilesList(String mobName, String colour, double price) {
	super();
	this.mobName = mobName;
	this.colour = colour;
	this.price = price;
}


}
