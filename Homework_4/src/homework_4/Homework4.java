package homework_4;
import java.util.Scanner;
public class Homework4 {
	static Scanner keyboard=new Scanner(System.in);
	public static int printMenu()	//function for printing menu and returning chioce
	{
		String choice;				
		int _choice;
		System.out.println("City Skies Menu");
		System.out.println("1 - Add City");
		System.out.println("2 - Change City Name");
		System.out.println("3 - Delete City");
		System.out.println("4 - List Cities");
		System.out.println("9 - Exit");
		System.out.println("Enter An Option: ");
		choice=keyboard.nextLine();
		_choice=Integer.parseInt(choice);
		return _choice;
	}
	
	
	public static void main(String[] args){
		
		/*String[] cities=new String[30];		//Declare Variables
		for(int i=0;i<cities.length;i++)	//Populate the array with empty values
		{
			cities[i]="";
		}
		cities[0]="Detroit";
		cities[1]="Dearborn";
		cities[2]="Windsor";
		int choice=0;
		String tempCity;
		String _tempIndex;
		int tempIndex;
		int cityCount=3;
		System.out.println("Question 1");
		System.out.println();
		
		
		while(choice!=9)		//Keeps the program Running until user enters 9
		{
			choice=printMenu(); //see printMenu function above
			
			if(choice==1)
			{
					//Add City
				
					System.out.println("Enter the city you'd like to add: ");
					tempCity=keyboard.nextLine();
					for(int i=0;i<cities.length;i++)	//loop until empty index is found. add city
					{
						if(cities[i].isEmpty())
						{
							cities[i]=tempCity;
							i=cities.length;
						}
					}
					cityCount++;
			}
				
			else if(choice==2)
			{
					//Change City Name
				
					Boolean cityExist=false;	//if the city exists flag
					System.out.println("Which city index would you like to change: ");
					_tempIndex=keyboard.nextLine();
					tempIndex=Integer.parseInt(_tempIndex);
					while(tempIndex>30 || tempIndex<0)		//validation loop
					{
						System.out.println("The value you entered was out of range. Try again");
						_tempIndex=keyboard.nextLine();
						tempIndex=Integer.parseInt(_tempIndex);
					}
					if(cities[tempIndex].isEmpty())
					{
						System.out.println("Index you are trying to edit is invalid/empty");
						cityExist=true; //cities doesnt exisit but set this to true to control the output
						continue;
					}
					System.out.println("What would you like to change the name to: ");
					tempCity=keyboard.nextLine();
					for(int i=0;i<cities.length;i++)	//loop through and see if the city exists. If so tell user and change flag
					{	
						if(cities[i].equals(tempCity))
						{
							System.out.println("That city is already accounted for");
							cityExist=true;
						}			
					}
					if(cityExist==false)	//if city doesnt exist. edit the index to what the user entered
					{
						cities[tempIndex]=tempCity;
						cityExist=false;
					}
			}
				
			else if(choice==3)
			{
					//Delete City
					boolean emptyIndex=false;
					System.out.println("Which city index would you like to delete: ");
					_tempIndex=keyboard.nextLine();
					tempIndex=Integer.parseInt(_tempIndex);
					while(tempIndex>30 || tempIndex<0)		//validation loop
					{
						System.out.println("The value you entered was out of range. Try again");
						_tempIndex=keyboard.nextLine();
						tempIndex=Integer.parseInt(_tempIndex);
					}
					if(cities[tempIndex].isEmpty())
					{
						System.out.println("There is no city to delete. Index is empty");
						emptyIndex=true;
					}
					
					if(emptyIndex==false)
					{
						cities[tempIndex]="";	//delete value of tempIndex
						for(int i=tempIndex;i<cities.length;i++)
						{
							if(i==cities.length-1)	//If the for loop is at the last value of the array
							{						//do the swap like this to avoid out of range errors
								cities[i-1]=cities[i];
								cities[i]="";
							}
							else
							{
								cities[i]=cities[i+1];
							}
						
						}
						cityCount--;
					}
			}
				
			else if(choice==4)
			{
					//List Cities
					System.out.printf("%-10s %-13s %n","Index","City Name");
					for(int i=0;i<cities.length;i++)
					{
						System.out.printf("%-10d %-13s %n",i,cities[i]);
						
					}
					System.out.printf("City Count: %d",cityCount);
					System.out.println();
					System.out.println();
			}
				
			else if(choice==9)
			{
					System.out.println("Exiting Program. Thank you");
			}
			else
			{
				System.out.println("Invalid Option. Please Try Again");
			}
			
				
			
			}
		System.out.println("End of Question 1");*/
		System.out.println();
		System.out.println();
		System.out.println("Start of Question 2");
		
		int temp;
		int[] sortArray=new int[20];
		for(int i=0;i<sortArray.length;i++)
		{
			sortArray[i]=100+(int)(Math.random()*((200-100)+1));
		}
		System.out.println("Unsorted Array");
		System.out.println();
		for(int i=0;i<sortArray.length;i++)
		{
			System.out.println(sortArray[i]);
		}
		System.out.println("Sorted Array. Decending Order");
		System.out.println();
		for(int i=0;i<sortArray.length;i++)
		{
			for(int j=0;j<sortArray.length;j++)
			{
				if(sortArray[j]<sortArray[i])
				{
					temp=sortArray[i];
					sortArray[i]=sortArray[j];
					sortArray[j]=temp;
				}
			}
		}
		for(int i=0;i<sortArray.length;i++)
		{
			System.out.println(sortArray[i]);
		}
		keyboard.close();
		}
	

		
	}




