package com.control;

import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XMLParser {

    private static List<Student> orders;

    public void WriteXMLFile(String filePath) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;

        try{
            builder = factory.newDocumentBuilder();
            Document document = builder.newDocument();

            Element element = document.createElementNS(null,"Students");

            document.appendChild(element);
            
            try {

                for(Student id : orders) {
                    element.appendChild(getStudent(document, id.getFirstName(),
                                                             id.getSecondName(),
                                                             id.getLastName(),
                                                             id.getSrAmount().toString(),
                                                             id.getID())
                    );
                                 
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transform = transformerFactory.newTransformer(); 
            
            transform.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(document);

            StreamResult result = new StreamResult(new File(filePath));

            transform.transform(source, result);


        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static Node getStudent(Document doc, String FirstName, String SecondName, String LastName, String srAmount, String ID) {
        Element student = doc.createElement("Student");
 
        student.setAttribute("FirstName", FirstName);
 
        student.appendChild(getStudentElements(doc, student, "SecondName", SecondName));
        student.appendChild(getStudentElements(doc, student, "LastName", LastName)); 
        student.appendChild(getStudentElements(doc, student, "srAmount", srAmount));
        student.appendChild(getStudentElements(doc, student, "ID", ID));
        
        return student;
    }
 
    private static Node getStudentElements(Document doc, Element element, String timePass, String value) {
        Element node = doc.createElement(timePass);
        node.appendChild(doc.createTextNode(value));
        return node;
    }

    public static List<Student> getOrders() {
        return orders;
    }

    public static void setOrders(List<Student> orders) {
        XMLParser.orders = orders;
    }
    
}