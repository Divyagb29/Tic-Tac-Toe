import java.util.*;

public class TicTacToe
{
	static Scanner scanner=new Scanner(System.in);
	static Random random=new Random();
	static String arr[][]=new String[3][3];
	
	public static int tossTOCheckWhoPlaysFirst()
	{
		int result=random.nextInt(2);
		if(result == 0)
		{
			System.out.println("Player won the toss ");
			return 0;
		}
		else
			System.out.println("computer won the toss");
		return 1;
	}
    public static int chooseLetter_X_or_O()
	{
		int choose = tossTOCheckWhoPlaysFirst();
               
		if (choose == 0)
		{   
			System.out.println("press 1 for choosing X  or  press 2 for choosing  O");
			int mark=scanner.nextInt();
			if(mark == 1)
			{
				System.out.println("you have choose X");
				return 1;
			}
			else
			{
				System.out.println("you have choose O");
				return 2;
			}
		}
		else
			System.out.println("computer has won the toss and choose O");
		return 0;
	}
	public static String[][] resetBoard()
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				arr[i][j]=" ";
			}	
		}
		System.out.println("BOARD IS REFRESHED");
		return arr;
	}
	public static void displayRefreshedBoard()
	{
		String arr[][]=resetBoard();

		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]+" | ");	
			}	System.out.println();
			System.out.println();
		}

	}
	public static void playerPlayGame()
	{
		int mark1=chooseLetter_X_or_O();
		System.out.println("enter no where  you want to place mark");
		int mark=scanner.nextInt();
		if(mark == 1 )
		{
			if(arr[0][0].equals(" ") && mark1 == 2)
				arr[0][0]= "O";

			else if(arr[0][0].equals(" ") )
				arr[0][0]= "X";

			else
				System.out.println("enter valid position");
		}

		else if(mark == 2 )
		{
			if(arr[0][1].equals(" ") && mark1 == 2)
				arr[0][1]="O";
			else if(arr[0][1].equals(" "))
				arr[0][1]="X";
			else
				System.out.println("enter valid position");
		}

		else if(mark == 3 )
		{
			if(arr[0][2].equals(" ") && mark1 == 2)
				arr[0][2]="O";

			else if(arr[0][2].equals(" "))
				arr[0][2]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 4 )
		{
			if(arr[1][0].equals(" ") && mark1 == 2)
				arr[1][0]="O";

			else if(arr[1][0].equals(" "))
				arr[1][0]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 5 )
		{
			if(arr[1][1].equals(" ") && mark1 == 2)
				arr[1][1]="O";
			else if(arr[1][1].equals(" "))
				arr[1][1]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 6 )
		{
			if(arr[1][2].equals(" ") && mark1 == 2)
				arr[1][2]="O";
			else if(arr[1][2].equals(" "))
				arr[1][2]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 7 )
		{  
			if(arr[2][0].equals(" ") && mark1 == 2)
				arr[2][0]="O";
			else if(arr[2][0].equals(" "))
				arr[2][0]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 8 )
		{
			if(arr[2][1].equals(" ") && mark1 == 2)
				arr[2][1]="O";
			else if(arr[2][1].equals(" "))
				arr[2][1]="X";
			else
				System.out.println("enter valid position");
		}
		else if(mark == 9 )
		{
			if(arr[2][2].equals(" ") && mark1 == 2)
				arr[2][2]="O";
			else if(arr[2][2].equals(" "))
				arr[2][2]="X";
			else
				System.out.println("enter valid position");
		}
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]+" | ");	
			}	System.out.println();
			System.out.println();
		}
	}
    public static void main(String[] args)
	{   
	        System.out.println("****************************");
		System.out.println("WELCOME TO TIC-TAC-TOE GAME");
		System.out.println("****************************");
		//resettingBoard();
		//System.out.println("your board is ready now where you want to place mark");
		//tossTOCheckWhoPlaysFirst();
		//chooseLetter_X_or_O();
		displayRefreshedBoard();
		playerPlayGame();
	}
}