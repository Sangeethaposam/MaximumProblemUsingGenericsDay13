package com.bridzelabz.maximumNumbers;

public class RefactorCode2 <T extends Comparable>{
	    T var1;
	    T var2;
	    T vare3;

	    RefactorCode2(T var1, T var2, T var3){   // parameterized constructor is used to initialize instance variable of objects
	        this.var1 = var1;
	        this.var2 = var2;
	        this.vare3 = var3;
	    }

	    void max_variables(){
	        if(this.var1.compareTo(this.var2) > 0){
	            if(this.var1.compareTo(this.vare3) > 0){
	                System.out.println( this.var1 + " is Maximum of three variables");
	            }else {
	                System.out.println( this.vare3 + " is Maximum of three variables ");
	            }
	        }else{
	            if(this.var2.compareTo(this.vare3) > 0){
	                System.out.println( this.var2 + " is Maximum of three variables ");
	            }else{
	                System.out.println( this.vare3 + " is Maximum of three variables ");
	            }
	        }
	    }
	    public static void main(String[] args) {
	    	RefactorCode2<Integer> obj1 = new RefactorCode2(60, 1, 45);
	        obj1.max_variables();

	        RefactorCode2 <String> obj2 = new RefactorCode2("Apple", "Banana","Peach");
	        obj2.max_variables();

	        RefactorCode2 <Float> obj3 = new RefactorCode2(5.3f, 7.1f, 10.7f);
	        obj3.max_variables();
	    }
	}
	
