package dataStr;

public class ComplexNum {

	private double real;	//real number
	private double imag;	//imaginary number
	
	
	public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public ComplexNum() {}
	
	public ComplexNum(double realr, double imagr) {
		super();
		this.real = realr;
		this.imag = imagr;
	}
	
	public ComplexNum addComplex(ComplexNum firstNum, ComplexNum secondNum, ComplexNum thirdNum) {
		ComplexNum temp = new ComplexNum();
		temp.real = firstNum.real + secondNum.real + thirdNum.real;
		temp.imag = firstNum.imag + secondNum.imag + thirdNum.imag;
		return temp;
	}
	
	public ComplexNum divideComplex(ComplexNum firstNum, ComplexNum secondNum, ComplexNum thirdNum) {
		ComplexNum temp = new ComplexNum();
		temp.real = firstNum.real / secondNum.real / thirdNum.real;
		temp.imag = firstNum.imag / secondNum.imag / thirdNum.imag;
		return temp;
	}
	
	public ComplexNum subtractComplex(ComplexNum firstNum, ComplexNum secondNum, ComplexNum thirdNum) {
		ComplexNum temp = new ComplexNum();
		temp.real = firstNum.real - secondNum.real - thirdNum.real;
		temp.imag = firstNum.imag - secondNum.imag - thirdNum.imag;
		return temp;
	}
}
