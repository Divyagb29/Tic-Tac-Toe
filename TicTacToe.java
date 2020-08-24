import java.util.*;
public class TicTacToe
{
	Scanner scanner=new Scanner(System.in);
	static Random random=new Random();
	public static void resettingBoard()
	{
		int arr[][]=new int[3][3];
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]);
				if(j == 0 || j == 1)
				{
					System.out.print(" | ");
				}
			}	
			System.out.println();
			if(i == 0 || i == 1)
			{
				System.out.println("---------");
			}
		}
	}
    public static void chooseLetter_X_or_O()
	{
		int turn = random.nextInt(2);
		if(turn == 0)
		{
			System.out.println("Player won the toss");
			System.out.println("choose what you want to take O or X");
			String option=scanner.next();
			if(option.equalsIgnoreCase("x"))
			    System.out.println("you have choose X");
            else
                System.out.println("you have choose O");
        }           
		else
		{
			System.out.println("Computer won the toss");
            System.out.println("Computer choose O");
		}
	}
    public static void main(String[] args)
	{   
	    System.out.println("****************************");
		System.out.println("WELCOME TO TIC-TAC-TOE GAME");
		System.out.println("****************************");
		resettingBoard();
		System.out.println("your board is ready now where you want to place mark");
		//tossTOCheckWhoPlaysFirst();
		//chooseLetter_X_or_O();
	}
}