package com.painjson.beanconverter;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;
import org.dozer.DozerBeanMapper;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;


public class PainConverter {

	public URL getJsonURL() throws IOException {
		return getClass().getClassLoader().getResource("painConvert.json"); 
	}
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		PainConverter pc =  new PainConverter();
		try {
			
			com.json.generated.Document document =  objectMapper.readValue(pc.getJsonURL(), com.json.generated.Document.class);
			 DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
			 dozerBeanMapper.setMappingFiles(Arrays.asList("fieldMapping.xml"));
			sample._20022.tech._01.Document converted = dozerBeanMapper.map(document, sample._20022.tech._01.Document.class);
			
			System.out.println(converted.getAccId().getCur().getCurrOrAmnt().get(0));
			 
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
