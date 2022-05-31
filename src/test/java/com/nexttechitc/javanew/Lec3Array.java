package com.nexttechitc.javanew;

public class Lec3Array {

	public static void main(String[] args) {
		/* 
		//Array syntax
		// in Array we store values in index. Index starts with 0
		//Datatype variable={data1,data2,datan};
		//String [] Fruits = {"Mango", “Watermelon", "Orange", "Apple"}
		 
		 */
        String[] Fruits= {"Mango","Watermelon","Orange","Apple"};		
        
           int[] numbers = {5,10,15,20,25};
	 
           //assignment store 4 cars name in Array
          String[] Cars={"Audi","Toyota","BMW","Honda"};	
          //change the value in Array
         
          Fruits[0]="Pear";
          System.out.println(Fruits[0]);
          //see one index
          System.out.println(Fruits[2]);
          
          //System.out.println(Fruits[4]);
          /* in Array and Array list Array values are stored in index, What ever index we have, 
          if we want to call any value out of the index then we will get "Index Out Bound Exception" error in console
          */
          
          // How we get the length? By (variable name. length)
          System.out.println(Fruits.length);
          
          //We change value in index wise
          Fruits[2]="Lemon";
          
          System.out.println(Fruits[2]);
          
}
	

}