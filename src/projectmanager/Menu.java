/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author m2003375
 */
public class Menu {

    private static Scanner SC = new Scanner(System.in);
    private static Scanner SCL = new Scanner(System.in);
    //this scanner is a seperate scanner to pick up the string for Internatinal calls.

    public static void loadMenu() {
        try {
            InitialiseData.loadFileToList();
        } catch (IOException ex) {
            System.getLogger(Menu.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        while (true) {
            System.out.println("""
                       1.Enter New Contract
                       2.Display Summary of Contracts
                       3.Display Summary of Contracts for Selected Month
                       4.Find and Display Contract
                       0.Exit
                       """);

            int choice = SC.nextInt();

            if (choice == 0) {
                System.exit(0);
            } else if (choice == 1) {
                newContract();
            } else if (choice == 2) {
                summaryOfContracts();
            } else if (choice == 3) {
                summaryOfContractsMonth();
            } else if (choice == 4) {
                searchForContracts();
            } else {
                System.out.println("Choice unkown enter a number between 0 - 4");
            }
        }

    }

    public static void newContract() {
        Contract newClient = new Contract();

        System.out.println("What is your full name?");
        String clientName = SC.nextLine();
        newClient.setClientName(clientName);
        System.out.println("Your name is: " + clientName + " is this correct. 1 for Yes 2 for No");
        int clientNameCorrect = SC.nextInt();
        if (clientNameCorrect == 1) {
            System.out.println("""
                           What is your prefered contract length?
                           1. 12 months
                           2. 24 months
                           3. 36 months
                           """);
        }
        int contractLength = SC.nextInt();
        newClient.setContractLength(contractLength);

        if (contractLength == 1 || contractLength == 2 || contractLength == 3) {
            System.out.println("""
                               What is your prefered data bundle?
                               1. Low
                               2. Medium
                               3. High
                               4. Unlimited
                               """);
        }
        int dataBundle = SC.nextInt();
        newClient.setDataBundle(dataBundle);

        if (dataBundle == 1 || dataBundle == 2 || dataBundle == 3 || dataBundle == 4) {
            System.out.println("""
                               Would you like to inculde internatinal calls?
                               Y/N
                               """);
        }
        
        SC.nextLine();
        
        String internatinalCalls = SCL.nextLine();
        newClient.setAllowInternatinalCalls(internatinalCalls);
         
        if (internatinalCalls == "Y" || internatinalCalls == "N") {
            System.out.println("""
                               What package size would you require?
                               1. Low
                               2. Medium
                               3. High
                               """);
        }
        int packageSize = SC.nextInt();
        newClient.setPackageSize(packageSize);

        /*if (clientNameCorrect != 1 || clientNameCorrect != 2) {
            System.out.println("Please enter either 1 or 2");
        } else if (clientNameCorrect == 1){
            System.out.println("""
                           What is your prefered contract length
                           1. 12 months
                           2. 24 months
                           3. 36 months
                           """);
        int contractLength = SC.nextInt();
        newClient.setContractLength(contractLength);
        } else if (clientNameCorrect == 2){
        }*/
    }

    private static void summaryOfContracts() {
        System.out.println("Summary Of");
    }

    private static void summaryOfContractsMonth() {
        System.out.println("Contract Months");
    }

    private static void searchForContracts() {
        System.out.println("Search For");
    }
}
