package com.jcg.jaxb.json;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;

public class MoxyTest {
	public static void main(String[] args) throws JAXBException {
		// Creating a new employee pojo object with data
        Document doc = new Document();
        AccountIdentification4Choice choice = new AccountIdentification4Choice();
        choice.setIBAN("akiban");
        AccountCurrency cur = new AccountCurrency();
        List<String> currOrAmnt = new ArrayList<>();
        currOrAmnt.add("USD");
        cur.currOrAmnt = currOrAmnt;
        choice.setCur(cur);
        doc.setAccId(choice);
        
 
        // Create a JaxBContext
        JAXBContext jc = JAXBContext.newInstance(Document.class);
 
        // Create the Marshaller Object using the JaxB Context
        Marshaller marshaller = jc.createMarshaller();
         
        // Set the Marshaller media type to JSON or XML
        marshaller.setProperty(MarshallerProperties.MEDIA_TYPE,
                "application/json");
         
        // Set it to true if you need to include the JSON root element in the JSON output
        marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
         
        // Set it to true if you need the JSON output to formatted
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
         
        // Marshal the employee object to JSON and print the output to console
        marshaller.marshal(doc, System.out);
	}
}
