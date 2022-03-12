package com.techelevator;

public class Application {

    /**
     * The main entry point in the application
     * Scenario: You are an IT SUPPORT ADMINISTRATOR SPECIALIST and are
     * charged with the task of creating email accounts for new hires.
     *
     * Your application should do the following:
     * Generate an email with the following syntax: firstname.lastname@department.company.com
     * Determine the department (sales, development, accounting, engineering) if none leave blank
     * Generate a random String for a password
     * Have set methods to change the passowrd,set the mailbox capacity and define
     * an alternate email address
     * Have get methods to display the name, email, and mailbox capacity
     */
    public static void main(String[] args) {
       Email abi = new Email("Abi", "Alam");
        System.out.println(abi.showInfo());

       //set alt email
        //abi.setAlternateEmail("abi@google.com");
        //get alt email
        //System.out.println(abi.getAlternateEmail());

       //set mailbox capacity
      // abi.setMailboxCapacity(1000);

       //change password
       //abi.changePass("hellomoto");

    }
}

