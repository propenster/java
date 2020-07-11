package dev.java.propenster;

import java.util.ArrayList;
import java.util.HashMap;
import java.Collections;

public class DataStructures{
	

	public static void main(String[] args){

	//Create an ArrayList Object of Type String....	
	ArrayList <String> newList = new ArrayList<String>();
	newList.add("David");
	newList.add("Blessing");
	newList.add("Josh");
	//Print the Elements of the NewList ArrayList using foreach loop
	for(String list : newList){
		System.out.println(list);

	}
	//We can insert element into a particular position...
	newList.put(1, "Mubarak");
	System.out.println(newList);
	//Remove the fourth (3) item/element in the ArrayList....
	newList.remove(3);

	//Can we use the COllections Library to sort and ArrayList
	Collections.sort(newList);

	//HashMap
	HashMap <String, String> countryList = new HashMap<String, String>();
	countryList.add("USA", "Washington D.C");
	countryList.add("U.A.E", "Dubai");
	countryList.add("Nigeria", "Abuja");
	countryList.add("Ghana", "Accra");

	//Use the COllections Library to sort the HashMap...
	Collections.sort(countryList);

	//Foreach loop to print the Keys in the HashMap
	for(String country : countryList.keySet()){
		System.out.println(country);
	}
	countryList.length();
	//Foreach loop to print the Value in the HashMap
	for(String capitals : countryList.values()){
		System.out.println(capitals);
	}

	Enum Level = {ONE, TWO, THREE, FOUR};

	Switch(Level){
			case Level.ONE:
				System.out.println("This is Level One");

				break;
			case Level.TWO:
				System.out.println("This is Level Two...Getting Tougher");
				break;
			case Level.THREE:
				System.out.println("Getting very difficult to go through... Level Three is challenging");
				break;
			case Level.FOUR:
				System.out.println("This Level Four is impossible");
				break;
			default:
				System.out.println("Invalid Level...Selected");
		}

	int [] newIntArray = new int[];
	newIntArray[0] = 20;
	newIntArray[1] = 40;
	newIntArray[2] = 60;
	newIntArray[3] = 80;
	newIntArray[4] = 100;

	//Loop thorugh to print using a Try-catch block actually...
	try{
			for(int i=0; i<newIntArray.length; i++){
				System.out.println(newIntArray+" ");
			}
	}
	catch(Exception e){
		System.out.println("Errors: _"+e);
	}

	//Can we use a foreach loop to print elements of an array instead?
	//Let's try using the newIntArray array above...
	for(int num : newIntArray){
		System.out.println(num+" ");
	}

	

	/*
		Now Lets' do a Multidimenstional Array..........
		You use a Multidimensional Array when you have to represent
		an array that has rows and columns..,
		kind of like a matrix...
	*/
		int[][] numbersArray = new int[][]{{1,2,3,4}, {5,6,7,8,9}};

		//And now iterate through to pring element
		for(int i = 0; i<numbersArray.length; i++){
			for(int j= 0; j<i; ++j){
				System.out.println(numbersArray[i][j]);
			}
		}//For loop ends here.......


	}//End Main Method...
}//End Class welcome....