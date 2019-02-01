/**
 * 
 */
package com.jcg.jaxb.json;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.persistence.jaxb.UnmarshallerProperties;

/**
 * @author ashraf_sarhan
 * 
 */
public class UnmarshallerDemo {

	/**
	 * @param args
	 * @throws JAXBException
	 *             Unmarshaller JSON to POJO using EclipseLink MOXy
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {

		// Create a JaxBContext
		JAXBContext jc = JAXBContext.newInstance(Employee.class);

		// Create the Unmarshaller Object using the JaxB Context
		Unmarshaller unmarshaller = jc.createUnmarshaller();

		// Set the Unmarshaller media type to JSON or XML
		unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE,
				"application/json");

		// Set it to true if you need to include the JSON root element in the
		// JSON input
		unmarshaller
				.setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);

		// Create the StreamSource by creating StringReader using the JSON input
		StreamSource json = new StreamSource(
				new StringReader(
						"{\r\n" + 
						"   \"accId\" : {\r\n" + 
						"      \"IBAN\" : \"akiban\",\r\n" + 
						"      \"cur\" : {\r\n" + 
						"         \"currOrAmnt\" : [ \"USD\" ]\r\n" + 
						"      }\r\n" + 
						"   }\r\n" + 
						"}"));

		// Getting the employee pojo again from the json
		Document employee = unmarshaller.unmarshal(new StreamSource(getJsonURL().getFile()), Document.class)
				.getValue();

		// Print the employee data to console
//		System.out.println("Employee Id: " + employee.getId());
//		System.out.println("\nEmployee Name: " + employee.getName());
//		System.out.println("\nEmployee Skills: "
//				+ StringUtils.join(employee.getSkills(), ','));
		System.out.println(employee);
	}
	
	private static URL getJsonURL() throws IOException {
		return UnmarshallerDemo.class.getClassLoader().getResource("myjson.json"); 
	}

}
