package Springcore_qn7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
   
	@Value("#{22+11}")//These are the expressions inside the bracket of the value annotation
	private int x;
	@Value("#{2+5+36}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}") // here we have called the static method but the process of calling will be as shown
	private double z;
	
	@Value("#{T(java.lang.Math).E}")// we have used the variable E of the java.lang.Math class 
	private double e ;
	
	@Value("#{ new java.lang.String('Rahul')}") // Here we have created the object of the String class
	private String name;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	

	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + "]";
	}
	
	
	
}