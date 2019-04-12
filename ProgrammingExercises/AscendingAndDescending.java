import java.util.Scanner;

public class AscendingAndDescending
{
    public static void main(String[] args)
    {
        int num;
        int num2;
        int num3;
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        System.out.print("Enter a number ");
        num2 = input.nextInt();
        System.out.print("Enter a number ");
        num3 = input.nextInt();

        if(num > num2)
        {
            temp = num;
            num = num2;
            num2 = temp;
        }
        if(num > num3)
        {
            temp = num;
            num = num3;
            num3 = temp;
        }
        if(num2 > num3)
        {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println("In ascending order: " + num + " " + num2 + " " + num3);

        /*
        As the 3 numbers are already sorted in ascending order,
        swapping the first and last number will make the numbers sorted in descending order.
        */
        temp = num;
        num = num3;
        num3 = temp;
        System.out.println("In descending order: " + num + " " + num2 + " " + num3);
    }
}
