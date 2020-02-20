package task3;

import java.util.Scanner;

public class NewYearGiftImpl
{
    private static Scanner ob;

	public static void main(String[] args) {
        NewYearGift[] gifts = new NewYearGift[5];
        gifts[0] = new Choclate("Dairy Milk",30);
        gifts[1] = new Sweet("Barfi",10); 
        gifts[2] = new Choclate("Barbone",20);
        gifts[3] = new Sweet("RasMalai",5);
        gifts[4] = new Choclate("5Star",15);

        System.out.println("new year gifts are:");
        for (int i = 0; i < 5; i++)           
                System.out.println(gifts[i].getName());



        ob = new Scanner(System.in);
        int a = 1;
        System.out.println("Enter your choice");
        System.out.println("Enter 1 to View chocolates and sweets under quantity range");
        System.out.println("Enter 0 to exit");
        while(a!=0)
        {
            System.out.println("Please Choose your option");
            a = ob.nextInt();
            switch(a){
                case 1:
                    System.out.println("Enter quantity range"); 
                    int l = ob.nextInt();
                    int r = ob.nextInt();
                    int c = 0;
                    System.out.println("Gifts available in the given quantities are: ");
                    for (int i = 0; i < 5; i++)
                    {
                        if(gifts[i].getQuantity()>=l && gifts[i].getQuantity()<=r ) {
                            System.out.println(gifts[i].getName());
                            c++;
                        }
                    }
                    if(c==0)
                    {
                        System.out.println("No Gifts Found Sorry");
                    }
                    break;


                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }

    }
}