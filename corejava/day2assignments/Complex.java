/**
 * 
 */
package corejava.day2assignments;

/**
 * @author mrnimmal
 *Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. 
 *	The class has the following behaviours/services/methods:
	void set(float, float) to set the specified value in object
	void disp() to display complex number object
	complex sum() to sum two complex numbers & return complex number
	1. Write the definitions for each of the above member functions.
	2. Write a ComplexTest class with main function to create three complex number objects.
	Set the value in two objects and call sum() to calculate sum and assign it in third object. 
	Display all complex numbers.
 */
public class Complex {
	private float real;
	private float imaginary;
	//set() method for intitialising the real and imaginary float values. 
	public void set(float real, float imaginary)
	{
		if(real>0 || imaginary>0){
		this.real = real;
		this.imaginary = imaginary;
		}else
			System.out.println("Invalid details");
	}
	//disp() for displaying the method.
	public void disp()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
	//sum() method for adding the two numbers.
	public static Complex sum(Complex complexNumber1, Complex complexNumber2) {
		Complex complexSum = new Complex();
		System.out.println("Adding the two complex numbers: ");
		complexSum.real = complexNumber1.real+complexNumber2.real;
		complexSum.imaginary = complexNumber1.imaginary+complexNumber2.imaginary; 
		return complexSum ;//returning the sum of the complex numbers.
	}
	

}
