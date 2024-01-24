package model;

public class Simple {
	public double billCalculate(double kmeter,String type) {
		double miniprice=10;
		double microprice=15;
		double primeprice=20;
		double billAmt = 0;
		double total=0;
		switch(type) {
		case "MINI":
			total=kmeter*miniprice;
			billAmt=total+total*0.05;
			return billAmt;
		case "MICRO":
			total=kmeter*microprice;
			billAmt=total+total*0.08;
			return billAmt;
		case "PRIME":
			total=kmeter*primeprice;
			billAmt=total+total*0.10;
			return billAmt;
	}
		return billAmt;
	}
}

