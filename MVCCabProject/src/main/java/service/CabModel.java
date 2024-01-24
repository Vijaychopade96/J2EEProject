package service;

public class CabModel {
	public double calculateBill(double dis, String type) {
		double miniPrice=10;
		double microPrice=15;
		double primePrice=20;
		double billAmt=0;
		
		switch(type){
		
		case "MINI":
			billAmt=dis*miniPrice;
			System.out.println("Total Bill Amount is:"+billAmt);
			return billAmt;
			
		case "MICRO":
			billAmt=dis*microPrice;
			System.out.println("Total Bill Amount is:"+billAmt);
			return billAmt;
			
		case "PRIME":
			billAmt=dis*primePrice;
			System.out.println("Total Bill Amount is:"+billAmt);
			return billAmt;
		}
		return billAmt;
	}

}
