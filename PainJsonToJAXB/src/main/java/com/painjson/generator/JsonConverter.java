package com.painjson.generator;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class JsonConverter {

	URL source = getClass().getClassLoader().getResource("testPain.json");//new URL("classpath:testPain.json");
	
	public void initConvertJsonToPOJO() {
		try {
			JCodeModel model = new JCodeModel();
			JsonConverter j = new JsonConverter();
			GenerationConfig config = new DefaultGenerationConfig() {
				@Override
				public boolean isGenerateBuilders() {
					return true;
				}

				public SourceType getSourceType() {
					return SourceType.JSON;
				}
			};

			SchemaMapper mapper = new SchemaMapper(
					new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
			mapper.generate(model, "Document", "com.json.genrated", j.source);
			String path = JsonConverter.class.getProtectionDomain().getCodeSource().getLocation().getPath()+"../../build/generated/main/java/";
			File dir = new File(path);
			if (!dir.exists()){
		        dir.mkdirs();
		    }
			model.build(dir);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
