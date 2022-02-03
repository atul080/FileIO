package com.addressbookbycsv;

import java.util.Scanner;

public class AddressBookCSV {

    public static void main(String[] ar) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select option from below :");
        System.out.println("1. Add New Contact."+"\n"+"2. Read All Contacts.");
        int option=sc.nextInt();
        switch (option)
        {
            case 1: FileOperation.writeFile();
                break;
            case 2: FileOperation.readFile();
                break;
            default: System.out.println("Invalid option.");
        }
    }
}
