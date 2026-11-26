/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author m2003375
 */
public class InitialiseData {

    public static BufferedReader bReader;
    public static final File FILE = new File("src/archive.txt");
    public static SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

    private static Date parseDate(String dateString) {
        try {
            return formatter.parse(dateString);
        } catch (ParseException ex) {
            ex.getMessage();
        }
        return null;
    }

    public static void loadFileToList() throws IOException {
        String currentLine;

        try {
            bReader = new BufferedReader(new FileReader(FILE));

            while ((currentLine = bReader.readLine()) != null) {
                String[] contractParts = currentLine.split("\\t");

                Contract contract = new Contract();

                contract.setContractDate(parseDate(contractParts[0]));
                contract.setPackageSize(Integer.valueOf(contractParts[1]));
                contract.setDataBundle(Integer.valueOf(contractParts[2]));
                contract.setContractLength(Integer.valueOf(contractParts[3]));
                contract.setAllowInternatinalCalls(contractParts[4]);
                contract.setReferenceNumber(contractParts[5]);
                contract.setMonthlyCharge(Double.valueOf(contractParts[6]));
                contract.setClientName(contractParts[7]);
                System.out.println(contract);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }

    }
    

}
