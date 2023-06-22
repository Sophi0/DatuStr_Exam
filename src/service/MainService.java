package service;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import dataStr.ComplexNum;
import dataStr.MyStack;

public class MainService {

	public static void main(String[] args) {
		try {
			
			MyStack<ComplexNum> complexStack = new MyStack();
			
			complexStack.push(new ComplexNum(2, 2.4));	
			complexStack.push(new ComplexNum(5, 5.5));
			complexStack.push(new ComplexNum(6.2, 1));
			complexStack.push(new ComplexNum(3, 2.8));
			complexStack.print();
			
			MyStack charStack = new MyStack();
			
			charStack.push("-");
			charStack.push("/");
			charStack.print();
			
			
			/*
			
			Scanner scanner = new Scanner(System.in);
			
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
	        
	        complexStack.push(firstNum);
	        complexStack.push(secondNum);
	        complexStack.push(thirdNum);
	        complexStack.print();
	        */
	        
	        ComplexNum divide = new ComplexNum(); 
	        
	        complexStack.push(new ComplexNum(2.5, 2.2));	
			complexStack.push(new ComplexNum(5.1, 9));
	        complexStack.push(new ComplexNum(5, 7.1));
	        complexStack.top();
	        complexStack.pop();
	        complexStack.top();
	        complexStack.pop();
	        
	        divide = divide.divideComplex(complexStack.top(), complexStack.top()); 
	        
	        ComplexNum substract = new ComplexNum(); 
	        
	        complexStack.push(new ComplexNum(2.1, 3.2));	
			complexStack.push(new ComplexNum(6, 9.2));
	        complexStack.push(new ComplexNum(5.7, 7.1));
	        complexStack.top();
	        complexStack.pop();
	        complexStack.top();
	        complexStack.pop();
	        
	        substract = substract.subtractComplex(complexStack.top(), complexStack.top()); 
	        
	        ComplexNum sum = new ComplexNum(); 
	        sum = sum.addComplex(complexStack.top(), complexStack.top()); 
	        
	        /*
	        if(divide.getImag() >= 0 || divide.getImag() <= 0) {
	            System.out.println("The complex number after divide : " + "(" + divide.getReal()+ " + " + divide.getImag() 
	            + "i" + ")" + "/" + "(" + divide.getReal() + " - " + divide.getImag() 
	            + "i" + ")" + " - " + "(" + divide.getReal() + " + " + divide.getImag() + "i" + ")"); 
	            
	        } 
	        else {
	        	System.out.println("Wrong parameters");
	        }
	        
	        /*
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
	        */
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
