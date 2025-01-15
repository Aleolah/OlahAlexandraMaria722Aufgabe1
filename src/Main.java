import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        App app = new App();
        List<Patient> patients= new ArrayList<>();
        patients = app.run();
        for ( Patient p : patients ) {
            System.out.println(p);
        }






    }
}