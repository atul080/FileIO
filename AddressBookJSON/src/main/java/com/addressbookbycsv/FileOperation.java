package com.addressbookbycsv;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import org.json.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class FileOperation {
    public static void writeFile() {
        try {
            Scanner sc = new Scanner(System.in);
            JSONObject js=new JSONObject();
            System.out.println("Enter First Name.");
            String firstName = sc.nextLine();
            System.out.println("Enter Last Name.");
            String lastName = sc.nextLine();
            System.out.println("Enter Address.");
            String address = sc.nextLine();
            System.out.println("Enter City.");
            String city = sc.nextLine();
            System.out.println("Enter State.");
            String state = sc.nextLine();
            System.out.println("Enter Phone.");
            String phn = sc.nextLine();
            System.out.println("Enter Email.");
            String email = sc.nextLine();
            js.put("First Name",firstName);
            js.put("Last Name",lastName);
            js.put("Address",address);
            js.put("City",city);
            js.put("State",state);
            js.put("Phone",phn);
            js.put("Email",email);
            FileWriter file=new FileWriter("Contacts.json");
            file.write(js.toString());
            System.out.println("Written Successfully.");
            file.close();
        }
        catch (Exception e){}
    }
    public static void readFile() {
        try {
            JSONParser p= new JSONParser();
            Object ob=p.parse(new FileReader("Contacts.json"));
            JSONObject obj=(JSONObject)ob;
            System.out.println("First Name: "+ (String) obj.get("First Name"));
            System.out.println("Last Name: "+(String) obj.get("Last Name"));
            System.out.println("Address: "+(String) obj.get("Address"));
            System.out.println("City: "+(String) obj.get("City"));
            System.out.println("State: "+(String) obj.get("State"));
            System.out.println("Phone: "+(String) obj.get("Phone"));
            System.out.println("Email: "+(String) obj.get("Email"));
            System.out.println("*************************");
        }
        catch (Exception e)
        {}
    }
}
