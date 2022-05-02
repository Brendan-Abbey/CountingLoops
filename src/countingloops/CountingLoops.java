/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingloops;
import java.util.Scanner;
/**
 *
 * @author brabb5577
 */
public class CountingLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int x=2;
        while (x != 5)
        {
            System.out.println("What would you like to do?");
            System.out.println("1... Count from 0 to 10 by 1");
            System.out.println("2... Count from 100 to 0 by 10");
            System.out.println("3... Count from 50 to 500 by 50");
            System.out.println("4... Count from 6000 to 1000 by 1000");
            System.out.println("5... Quit ");
            x = scan.nextInt();
            if (x==1)
            {
                for (int i = 0;i<=10;i++)
                {
                    System.out.println(i);
                }
            }
            else if (x==2)
            {
                for (int i = 100;i>=0;i-=10)
                {
                    System.out.println(i);
                }
            }
            else if (x == 3)
            {
                for (int i = 50;i<=500;i+=50)
                {
                    System.out.println(i);
                }
            }
            else if (x==4)
            {
                for (int i = 6000;i>=1000; i+=1000)
                {
                    System.out.println(i);
                }
            }
            else{
                System.out.println("Goodbye!");
            }
        }
    }
    
}
