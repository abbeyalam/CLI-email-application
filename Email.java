package com.techelevator;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Email {

    //Class Variables (Encapsulation by making variables private)
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String password;
    private int defaultPasswordLength =10;
    private int mailboxCapacity =500;
    private String alternateEmail;
    private String email;

    //Class constructor: Recieves first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
      //  System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // Call a method asking for department and return that department
        this.department = setDepartment();
       // System.out.println("Department is " + this.department);

        //Set random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is " + this.password);

        //Combine elements to generate email
        this.email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" + department +"." + "company.com";
      //  System.out.println("Your email is " + this.email);
    }
    //Method for creating email account
    public void createEmail(int amount) {
        System.out.println(firstName+"."+lastName+"@"+department+"."+company+".com");
        }

    //Ask for department
    private String setDepartment() {
        System.out.print(
                "Enter the department: \n1: Sales \n2: Accounting \n3: Development \n4: Engineering \n5: none "
        );
        Scanner sc = new Scanner(System.in);
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Accounting";
        } else if (depChoice == 3) {
            return "Development";
        } else if (depChoice == 4) {
            return "Engineering";
        } else if (depChoice == 5) {
            return "0";
        } else {
            return "Please enter a valid option";
        }
    }

    //Generate a random password
    private String randomPassword (int length) {
        //Define the possibility of choices for random password
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        //User defined length
        //Look at passwordSet as Array, find value at any given
        char[] password = new char[length];
        for (int i =0; i<length; i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set mailbox capacity: Encapsulation --> hiding properties
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternative email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePass (String password){
        this.password =password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                " \nCOMPANY EMAIL: " + email + " \nMAILBOX CAP: " + mailboxCapacity + "mb";
    }
}

