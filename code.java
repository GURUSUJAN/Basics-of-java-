import java.util.*;
public class man
{
    public static void loop(int num3)
    {
        int element=0;
        for(element=0;element<num3;element++)
        {
            System.out.print(element);
            System.out.print(" ");
        }
    }
    public static void main(String [] args)
    {
        //While loop, If-else if-else, Normal commands, arrays!
        Scanner scan=new Scanner(System.in);
        System.out.println("Hola! Soy Sujan");
        System.out.print("Name: ");
        String str1=scan.nextLine();
        System.out.println("Hello "+str1);
        System.out.print("Married (Y/N): ");
        String str2=scan.nextLine();
        int number=583;
        int count=0;
        System.out.println("Guess");
        System.out.print("> ");
        int num1= scan.nextInt();
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        while(num1!=number)
        {
            System.out.print("> ");
            num1 = scan.nextInt();
            count++;
        }
        if((str1.charAt(str1.length()-1)=='I')||str1.charAt(str1.length()-1)=='A')
        {
            if(str2.charAt(str2.length()-1)=='Y')
                System.out.println("You have taken " + count + " tries for the answer MRS. " + str1);
            else
                System.out.println("You have taken " + count + " tries for the answer MISS. " + str1);
        }
        else
        {
            if(str2.charAt(str2.length()-1)=='Y')
                System.out.println("You have taken " + count + " tries for the answer MR. " + str1);
            else
                System.out.println("You have taken " + count + " tries for the answer MASTER " + str1);
        }
        loop(count);
    }
}
