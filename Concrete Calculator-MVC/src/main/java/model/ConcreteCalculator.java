/**
 * 
 */
package model;

import java.text.NumberFormat;

/**
 * @author zachgroome
 *
 */
public class ConcreteCalculator {
	double length= 0; //stored in feet
	double width= 0;  //stored in feet
	double depth= 0;  //stored in inches
	double volume= 0; //cubic yards
	String unit= "";
	/**
	 * 
	 */
	public ConcreteCalculator() {
	}
	/**
	 * @param length
	 * @param width
	 * @param depth
	 * @param volume
	 * @param unit
	 */
	public ConcreteCalculator(double length, double width, double depth, String unit) {
		this.length = length;
		this.width = width;
		this.depth = depth;
		this.unit = unit;
	}
	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * @return the depth
	 */
	public double getDepth() {
		return depth;
	}
	/**
	 * @param depth 
	 */
	public void setDepth(double depth) {
		this.depth = depth/12;
	}
	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}
	//
	/**
	 * @param Set size for concrete bag A,B,orC
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	/**
	 * @return the volume in cubic yards
	 */
	public double getVolume() {
		volume= length*width*(depth/12)/27;
		return volume;
	}
	/**
	 * @return the bagCount
	 */
	public int getBagCount(){
		int bagCount=0;
		
		if(this.unit.equals("A")) {
			bagCount=(int) Math.ceil(this.volume/ .0138);
		} else if (this.unit.equals("B")) {
			bagCount=(int) Math.ceil(this.volume/ .0167);
		} else if (this.unit.equals("C")) {
			bagCount=(int) Math.ceil(this.volume/ .022);
		}
		
		return bagCount;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		double cost=0;
		
		if(this.unit.equals("A")) {
			cost= (this.getBagCount() * 2.45);
		} else if (this.unit.equals("B")) {
			cost= (this.getBagCount() * 2.83);
		} else if (this.unit.equals("C")) {
			cost= (this.getBagCount() * 3.75);
		}
		return cost;
	}
	/**
	 * @return HTML friendly output for convert.jsp
	 */
	public String getCalculationHTML() {
		String calculationHTML="";
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		NumberFormat pf = NumberFormat.getInstance();
	
		pf.setMaximumFractionDigits(2);
		
		calculationHTML += "<h2>Results</h2>";
		calculationHTML += "<p>" +pf.format(this.volume) +" Cubic Yards of Concrete" + "</p>";
		calculationHTML += "<p>" +getBagCount() + " Bags" + "</p>";
		calculationHTML += "<p>Cost:" +cf.format(this.getCost()) + "</p>";
		calculationHTML += "<p></p>";
		
		return calculationHTML;
	}
	

	
}
