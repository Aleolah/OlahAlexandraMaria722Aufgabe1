import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients;

        patients = app.run();
//        for ( Patient p : patients ) {
//            System.out.println(p);
//        }
        System.out.println("Enter a letter: ");
        String input = sc.nextLine();
        char letter = input.charAt(0);
        app.filterPatientsByName(patients,letter);








    }
}