import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    ArrayList<Patient> patients;
    public  List<Patient> run ()throws ParserConfigurationException, IOException, SAXException {
        List<Patient> patients = new ArrayList<>();

        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

        File file = new File("fallakten.xml");
        Document document = documentBuilder.parse(file);


        document.getDocumentElement().normalize();


        NodeList nodeList = document.getElementsByTagName("student");


        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                String date =getTagValue("Datum",element);
                String diagnosis =getTagValue("Diagnose",element);
                int id = Integer.parseInt(getTagValue("Id", element));
                String hospital = getTagValue("Krankenhaus", element);
                String name = getTagValue("Patient", element);
                String symptom = getTagValue("Symptom", element);

                LocalDate date1 = LocalDate.parse(date);


                patients.add(new Patient(id, name, symptom,diagnosis, date1 ,hospital));
            }
        }

       return patients;
    }



    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag);
        if (nodeList.getLength() == 0) return "";
        return nodeList.item(0).getTextContent();
    }

    public void sort(){

    }
    public void filter(){

    }
    public void writeToFile() {

    }
}
