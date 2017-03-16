//=====================================
//
//Title: Homework 2
//
//Description:
//	Prompt the user for a conversion code
//	then convert their input and format
//	the output using printf.
//	
//	Parse an input showing what each
//	character is and also tokenize the
//	input. Format using printf 
//=====================================


package homework_2;


import java.util.Scanner;
import java.util.StringTokenizer;


public class Homework2
{
    

    public static void main (String[] args){
    	
    	//Declare variables
    	Scanner keyboard=new Scanner(System.in);
    	String inputLine;
    	String temp;
    	int sentinel=0;

    	/*System.out.println("Start of Homework 2");    	
    	
    	System.out.println("Question 2");
    	System.out.println();
    	//Format the table to show conversion codes
    	System.out.printf("%-10s %s %20s","Code","Conversion","Last Run Input\n");
    	System.out.printf("%-10s %s %10s","A","Celsius->Kelvin","32\n");
    	System.out.printf("%-10s %s %10s","B","Celcius->Newton","64\n");
    	System.out.printf("%-10s %s %10s","C","Kelvin->Celsius","200\n");
    	System.out.printf("%-10s %s %11s","D","Kelvin->Newton","300\n");
    	System.out.printf("%-10s %s %10s","E","Newton->Celsius","24\n");
    	System.out.printf("%-10s %s %11s","F","Newton->Kelvin","28\n");
    	
    	System.out.println("Enter A Conversion Code: ");
    	inputLine=keyboard.nextLine();
    	
    	//while loop used to validate the user input. controlled
    	//by a sentinel value.
    	while(sentinel==0){
    		
    		//if the input is incorrect
    	if(!(inputLine.equals("A")||inputLine.equals("a")||
    			inputLine.equals("B")||inputLine.equals("b")||
    			inputLine.equals("C")||inputLine.equals("c")||
    			inputLine.equals("D")||inputLine.equals("d")||
    			inputLine.equals("E")||inputLine.equals("e")||
    			inputLine.equals("F")||inputLine.equals("f")))
    	{ //end of if
    		
    		System.out.println("Your input is incorrect. "
    				+ "Please enter one of the"
    				+ "Converstion Codes");
    		System.out.println("Enter A Conversion Code: ");
        	inputLine=keyboard.nextLine();
        	
        	//if the input is correct
        	if((inputLine.equals("A")||inputLine.equals("a")||
        			inputLine.equals("B")||inputLine.equals("b")||
        			inputLine.equals("C")||inputLine.equals("c")||
        			inputLine.equals("D")||inputLine.equals("d")||
        			inputLine.equals("E")||inputLine.equals("e")||
        			inputLine.equals("F")||inputLine.equals("f")))
        	{
        		sentinel=1; /*Change to break out of the
        		 			 validation while loop
        	}

    	}
    	
    	//if the user enters the correct input on the first time
    	if((inputLine.equals("A")||inputLine.equals("a")||
    			inputLine.equals("B")||inputLine.equals("b")||
    			inputLine.equals("C")||inputLine.equals("c")||
    			inputLine.equals("D")||inputLine.equals("d")||
    			inputLine.equals("E")||inputLine.equals("e")||
    			inputLine.equals("F")||inputLine.equals("f")))
    	{
    		sentinel=1;/*Change to break out of the
			 			validation while loop
    	}
    	}//end of while
    	
    	
    	System.out.println("Enter a Temperature: ");
    	temp=keyboard.nextLine();
    	
    	/*Series of If statements to check the conversion code
    	  then convert the temp and print using printf
    	if(inputLine.equals("A")||inputLine.equals("a"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=convertedTemp+273.15;
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	if(inputLine.equals("B")||inputLine.equals("b"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=(convertedTemp*33)/100;
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	if(inputLine.equals("C")||inputLine.equals("c"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=convertedTemp-273.15;
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	if(inputLine.equals("D")||inputLine.equals("d"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=convertedTemp*(100/33);
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	if(inputLine.equals("E")||inputLine.equals("e"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=convertedTemp*(100/33);
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	if(inputLine.equals("F")||inputLine.equals("f"))
    	{
    		double convertedTemp=Integer.parseInt(temp);
    		convertedTemp=(convertedTemp*33)/100;
    		System.out.printf("%-10s %20s","Original Temp","Converted Temp\n");
        	System.out.printf("%-10s %14s",temp,convertedTemp,"\n");
        	
    	}
    	System.out.println();
    	System.out.println("End of Question2 ");
    	keyboard.close();  	
   */
   //End of Question 2 	
    	
    	
   	
   //Question 3 	
    	
   //Referenced Sample Code from Blackboard 	
   final String delimiters = ", \t\n\r\f"; 	
   StringTokenizer tokens;
   int tokenCount;
   System.out.println("Question 3");
   System.out.println();
   
   System.out.println("Enter A Sentence: ");
   inputLine=keyboard.nextLine();
   
   System.out.printf("%-10s %-12s %-13s %-6s %14s %12s %16s %n", "Character","At","Letter", "Lower Case", "Upper Case", "Number", "White Space");
  
   /*loop for however big the input is and at every character
    * (tempchar=inputLine.charAt(i)) print true or fales if the
    * character is upper,lower, ect*/
  for(int i=0;i<inputLine.length();i++)
  {
	  char tempChar=inputLine.charAt(i);
	  System.out.printf("%-10s %-12s %-13s %-6s %14s %15s %16s %n",tempChar,i,Character.isLetter(tempChar),Character.isLowerCase(tempChar),
			  Character.isUpperCase(tempChar),Character.isDigit(tempChar),Character.isWhitespace(tempChar));
  }
 
   
   
   
   tokens= new StringTokenizer(inputLine,delimiters);
   tokenCount=tokens.countTokens();
   System.out.printf("%-10s %4s \n", "Sentence:",inputLine,"\n");
   System.out.printf("%-10s %2s \n", "Number of Tokens:",tokenCount,"\n");
   
   //loop for however number of tokens there are
   //and print each token
   for (int i=1;i<=tokenCount;i++){
	   System.out.printf("%-10s %d %s %s \n","Token #",i,": ",tokens.nextToken(),"\n");
   }
   
    System.out.println("End of Question 3");
    keyboard.close(); 
    
    //End of Question 3
    
    }

}
 