package service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import dataStr.ComplexNum;
import dataStr.MyStack;

public class MainService {

	public static void main(String[] args) {
		try {
			MyStack complexStack = new MyStack();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("----COMPLEX NUMBER----");
			
			complexStack.push("(2+7i)/(3.4-4.1i)-(-2+9i)\n");
			complexStack.print();
			
			System.out.println("Enter the real part of first complex number : ");
	        int real1 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of first complex number : ");
	        int img11 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of second complex number : ");
	        int real2 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of second complex number : ");
	        int img12 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of third complex number : ");
	        int real3 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of third complex number : ");
	        int img13 = scanner.nextInt();
	        
	        ComplexNum firstNum = new ComplexNum(real1, img11); 
	        ComplexNum secondNum = new ComplexNum(real2, img12); 
	        ComplexNum thirdNum = new ComplexNum(real3, img13); 
	        
	        ComplexNum divide = new ComplexNum(); 
	        divide = divide.divideComplex(firstNum, secondNum, thirdNum); 
	        
	        ComplexNum substract = new ComplexNum(); 
	        substract = substract.subtractComplex(firstNum, secondNum, thirdNum); 
	        
	        ComplexNum sum = new ComplexNum(); 
	        sum = sum.addComplex(firstNum, secondNum, thirdNum); 
	        
	        if(divide.getImag() >= 0 || divide.getImag() <= 0) {
	            System.out.println("The complex number after divide : " + "(" + divide.getReal()+ " + " + divide.getImag() 
	            + "i" + ")" + "/" + "(" + divide.getReal() + " - " + divide.getImag() 
	            + "i" + ")" + " - " + "(" + divide.getReal() + " + " + divide.getImag() + "i" + ")"); 
	            
	        } 
	        else {
	        	System.out.println("Wrong parameters");
	        }
	        
	        
	        System.out.println("Enter the real part of first complex number : ");
	        int real5 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of first complex number : ");
	        int img15 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of second complex number : ");
	        int real6 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of second complex number : ");
	        int img16 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of third complex number : ");
	        int real7 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of third complex number : ");
	        int img17 = scanner.nextInt();
	        
	        if(substract.getImag() <= 0 || substract.getImag() >= 0) {
	        	System.out.println("The complex number after substraction : " + "(" + substract.getReal()+ " + " + substract.getImag() 
	            + "i" + ")" + "/" + "(" + substract.getReal() + " - " + substract.getImag() 
	            + "i" + ")" + " - " + "(" + substract.getReal() + " + " + substract.getImag() + "i" + ")");
	        }
	        else {
	        	System.out.println("Wrong parameters");
	        }
	        
	        System.out.println("Enter the real part of first complex number : ");
	        int real8 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of first complex number : ");
	        int img18 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of second complex number : ");
	        int real9 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of second complex number : ");
	        int img19 = scanner.nextInt();
	        
	        System.out.println("Enter the real part of third complex number : ");
	        int real10 = scanner.nextInt();
	        
	        System.out.println("Enter the imaginary part of third complex number : ");
	        int img110 = scanner.nextInt();
	        
	        
	        if(sum.getImag() >= 0 || sum.getImag() <= 0) {
	        	System.out.println("The complex number after addition : " + "(" + sum.getReal()+ " + " + sum.getImag() 
	            + "i" + ")" + "/" + "(" + sum.getReal() + " - " + sum.getImag() 
	            + "i" + ")" + " - " + "(" + sum.getReal() + " + " + sum.getImag() + "i" + ")");
	        }
	        else {
	        	System.out.println("Wrong parameters");
	        }
	        
	        System.out.println("----------------");
	        
	        //read from file
	        MyStack fileList = getArrayElementsFromFile("resources/skaitli.txt");
	        MyStack fileList2 = getArrayElementsFromFile("resources/darbibas.txt");
	        
	        fileList.print();
	        fileList2.print();
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static MyStack getArrayElementsFromFile(String path) throws Exception{
		File myFile = new File(path); 
		FileInputStream myInputStream = new FileInputStream(myFile);
		
		Scanner myScanner = new Scanner(myInputStream);
		MyStack listFromFile = new MyStack();
		
		while(myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			char element = line.charAt(0);
			listFromFile.push(element);
		}
		myScanner.close();
		return listFromFile;
	}

}
