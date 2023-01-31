package com.bridzelabz.maximumNumbers;

public class PrintArrayUsingGenerics<T> {
	    public static void toPrintArray(Integer[] inputArray){
	        for (int element:inputArray) {
	            System.out.print(element+",");
	        }
	        System.out.println();
	    }
	    public static void toPrintArray(Double[] inputArray){
	        for (double element:inputArray) {
	            System.out.print(element+",");
	        }
	        System.out.println();
	    }
	    public static void toPrintArray(Character[] inputArray) {
	        for (char element : inputArray) {
	            System.out.print(element + ",");
	        }
	        System.out.println();
	    }
	    public static void main(String[] args) {
	        Integer[] intArray ={1,2,3,4,5,7,8,9};
	        Double[] doubleArray ={1.2,3.2,3.4,4.5,5.2,7.8};
	        Character[] charArray ={'A','C','D','W','Q'};
	        toPrintArray(intArray);
	        toPrintArray(doubleArray);
	        toPrintArray(charArray);
	    }
	}


