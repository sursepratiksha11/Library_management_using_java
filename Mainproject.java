package ref;
import ref1.Module1;
import ref2.Module2;

import java.lang.*;
import java.util.Scanner;

public class Mainproject {

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 3) {
            System.out.println("------------------------------------------------------------------");
            System.out.println(" ENTER 1 FOR DETAILS \n ENTER 2 FOR BOOKS \n ENTER 3 FOR EXIT \n\n ------ ENTER THE CHOICE ------");
            choice = sc.nextInt();
            System.out.println("------------------------------------------------------------------");

            Module1 sc1 = new Module1();
            if (choice == 1) {

                System.out.println(" ");
                System.out.println("ENTER THE STUDENT'S NAME");
                sc1.name = sc.nextLine();
                sc1.name = sc.nextLine();
                System.out.println("ENTER THE STUDENT'S FATHER NAME");
                sc1.fname = sc.nextLine();
                System.out.println("ENTER THE STUDENT'S SURNAME NAME");
                sc1.surname = sc.nextLine();
                System.out.println("ENTER UNIVERSITY ID");
                sc1.uni_id = sc.nextLine();
                System.out.println("ENTER THE USER ID");
                sc1.uid = sc.nextLine();
                System.out.println("IN WHICH SEMESTER DO YOU STUDY:");
                sc1.sem = sc.nextInt();
                System.out.println(" ");
                sc1.setdata();
                System.out.println(" ");
            }
            else if (choice == 2)
            {

                Scanner input = new Scanner(System.in);
                String in1;
                String in2;
                String in3;
                int choice1;
                String ans;
                Module2 obj =new Module2();

                do {
                    obj.showAvail();
                    System.out.print("Press 1. TO ADD BOOK.\nPress 2. TO ISSUE BOOK.\nPress 3. RETURN BOOK \n");
                    choice1 = input.nextInt();
                    in1 = input.nextLine();

                    switch (choice1) {
                        case 1:
                            System.out.println("Enter Book Name to add : ");
                            in1 = input.nextLine();
                            obj.addBooks(in1);
                            obj.showAvail();
                            break;
                        case 2:
                            System.out.println("Enter Book Name : ");
                            in2 = input.nextLine();
                            obj.issueBook(in2);
                            break;
                        case 3:
                            System.out.println("Enter the name of the book to return : ");
                            in3 = input.nextLine();
                            obj.returnBooks(in3);
                            break;

                    }

                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Do you want to Continue.");
                    System.out.println("(Y/N)");
                    ans = input.nextLine();
                } while (!(ans.equalsIgnoreCase("N")));
            }

        }
    }
}