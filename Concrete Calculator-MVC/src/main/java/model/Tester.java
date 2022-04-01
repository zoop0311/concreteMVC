package model;



public class Tester {

	public static void main(String[] args) {
		
		
		
		ConcreteCalculator C= new ConcreteCalculator(1,2,3,"A");
		System.out.println(C.getBagCount()+"bags");			//how many bags
		System.out.println(C.getVolume()+"cubicYards");		//volume in cubic yards
		System.out.println(C.getCost()+"USD");				//cost
		System.out.println(C.getCalculationHTML());			//HTML friendly results 

	}

}
