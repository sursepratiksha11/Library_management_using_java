package ref2;

import java.util.Scanner;

     class library{
    String name = new String();
    public String[] avail_books = new String[50];
    public String[] issued_books = new String[50];
   public  int chkbooks = 0;
    //public int act;
   public void initial() {

        avail_books[0] = "Java";
        avail_books[1] = "Software Engineering";
        avail_books[2] = "Computer Networks";
        avail_books[3] = "Operating System";
        avail_books[4] = "Data Structure";
        avail_books[5] = "Data Analysis";
        avail_books[6] = "Artificial Intelligence";
        avail_books[7] = "Machine learning";

    }

    private int tracking() {
        initial();
        int local = 0;
        while (avail_books[local] != null) {

            local++;
        }
        return local;
    }

    public void addBooks(String a) {
        avail_books[tracking()] = a;

    }

    public void showAvail() {
        System.out.print("---------------THE BOOKS IN INFORMATION TECHNOLOGY-----------------\n\n");
        System.out.print("---------------AVAILABLE BOOKS-----------------\n\n");
        for (int i = 0; i < tracking(); i++) {
            System.out.println(avail_books[i]);
        }
        System.out.println();
        System.out.print("-----------------------------------------------\n\n");


    }

    public void issueBook(String bkname) {
        int count = 0;
        if (chkbooks > 0) {
            for (int i = 0; i < chkbooks; i++) {
                for (int j = 0; j < chkbooks; j++) {
                    if (issued_books[i].equalsIgnoreCase(issued_books[j])) {
                        System.out.println(" THIS BOOK IS ALREADY ISSUED!!!");
                        System.out.println();
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < tracking(); i++) {
            if (bkname.equalsIgnoreCase(avail_books[i])) {
                issued_books[chkbooks] = avail_books[i];
                chkbooks++;
            }

        }
        if (chkbooks >= 1) {
            if (count == 0) {

                System.out.println("THE ISSUED BOOKS IS:");
                for (int j = 0; j < chkbooks; j++) {
                    System.out.println(issued_books[j]);
                }
            }
        } else {
            System.out.println(" THERE IS NO BOOK WITH THIS NAME ");
            System.out.println("NO BOOK IS ISSUED");
        }

    }

    public void returnBooks(String name) {
        int fix_no = chkbooks;
        if (chkbooks == 0) {
            System.out.println(" THERE IS NO BOOK WHICH YOU WANT TO RETURN");
        }
        for (int i = 0; i < chkbooks; i++) {
            if (name.equalsIgnoreCase(issued_books[i])) {
                System.out.println(issued_books[i] + " BOOK HAS BEEN RETUENED.");
                for (int j = i + 1; j < chkbooks; j++) {
                    issued_books[i] = issued_books[j];
                }
                chkbooks--;
            }
        }
        if (fix_no == chkbooks) {
            System.out.println("YOU HAVE NOT RETURNED THE BOOK ");
        }
    }

}

public class Module2 extends library {
    public static void main(String[] args) {
        library obj = new library();


    }
}

