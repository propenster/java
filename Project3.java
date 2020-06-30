
import java.util.HashMap;
import java.util.Map;
import java.io. BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Project3{
	
	/*
		This Method takes a csv file path...as parameter

		Then it parses it and converts it to an Array - type HashMap...
		To hold Country : Capital pairs..

	*/
	public Map<String, String> csvToArray(String fileName){

		String line = "";
		String delimiter = ", ";
		Map<String, String> CountryMap = new HashMap<String, String>();

		//Open and 
		try

			(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			while((line = br.readLine()) != null){
				//Split the values using comma as separator
				//And store in a string regular Array...
				String[] country = line.split(delimiter);
				//Add the array values in an hashMap...
				for(int i=0; i<country.length; i++){
					CountryMap.put(country[0], country[1]);
				} 
				// System.out.println("Country: " + country[0] + " Capital: " + country[1]);
			}
			}catch(FileNotFoundException e){
			e.printStackTrace();

			}catch(IOException e){
					e.printStackTrace();
		}
		return CountryMap;
	} 


	public static void main(String[] args)
	{
		//Initialize necessary Global variables...
		//And Objects...
		Scanner input = new Scanner(System.in);
		String userAnswer = "";
		int totalScore = 0;
		int rightAnswers = 0;
		int wrongAnswers = 0;

		System.out.println(
			"\nWelcome To the African Countries Trivia v1.0.0"+
			"\nInstructions:"+
			"\n\tYou have 10 questions to answer "+
			"\n\tAll questions carry equal marks of 5 points each. "+
			"\n\tEnter the answer in the prompt -_ _ _ "+
			"\n\tYou are expected to answer in Title Case e.g. 'Washington' but don't worry, any case is accepted"+
			"\n\tOnce you are done, you will get a manifest (breakdown) of your result... "+
			"\n\n\tGood luck!"+
			"\n\n Created by Faith Olusegun (a.k.a propenster)"+
			"\n Release Date: June 29th 2020. "
			);
		System.out.println();
		//Create an instance of the Project3 Class 
		//To expose the convertToCsV method....
		Project3 testCSV = new Project3();
		// String csvFile = "C:\\Users\\Win8\\Desktop\\propenster\\java\\dev\\countries.csv";
		//Input .CSV File of African Countries...
		String csvFile = "C:\\Users\\Win8\\Desktop\\propenster\\java\\dev\\african_countries.csv";

		Map<String, String> outFile = new HashMap<String, String>();
		//outFile holds the HashMap obtained from coverting african_countries.csv
		//to an Array of type HashMap...
		outFile = testCSV.csvToArray(csvFile);

		// System.out.println(outFile);

		//Now, Implement the Random Game Engine here....
		//First Turn the Map into a List of Questions....
		List<String> countryQuestionList = new ArrayList<String>(outFile.keySet());
		/*
			List<String> alreadyTaken = new ArrayList<String>();

			if(!(AlreadyTaken.containsKey(question)){
				Do some stuff..Here...	

			}
		*/
		for(int i=0; i<10; i++){
			Random rand = new Random();
			int index = rand.nextInt(countryQuestionList.size());
			String question = countryQuestionList.get(index);
			System.out.print("What is the Capital of " + question + " ? _ _ _ ");
			
			//Get user Input... and store it in userAnswer Type: String..
			userAnswer = input.nextLine();
			//Is the user-entered Answer Correct?
			if(userAnswer.equalsIgnoreCase(outFile.get(question))){
				System.out.println("Correct");
				totalScore += 5;
				rightAnswers++;

			}else{
				System.out.println("Incorrect");
				totalScore = totalScore;
				wrongAnswers++;
			}
			//Shuffle the QuestionList again with a new Randomizer now
			//To make sure a question is not repeated..
			Collections.shuffle(countryQuestionList, new Random());

		}
		System.out.println();
		System.out.println();
		System.out.println("Right Answers : "+ rightAnswers);
		System.out.println("Wrong Answers : "+ wrongAnswers);
		System.out.println("Your Total Score is "+ totalScore + "\n\n");
		System.out.println("Thank you for playing the African Countries Trivia...");
	}
}