import java.util.*;
public class TwoD_Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the number of columns");
        int column=sc.nextInt();
        int number[][]=new int[row][column];
        System.out.println("Enter the numbers");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                number[i] [j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number to be checked");
        int x=sc.nextInt();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(number[i][j]==x)
                {
                    System.out.println("Index is:("+i+","+j+")");
                }
            }
        }
        sc.close();
    }
}