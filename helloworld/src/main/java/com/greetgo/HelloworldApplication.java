package com.greetgo;

import com.greetgo.entities.Word;
import com.greetgo.mappers.DataMapper;
import com.greetgo.mappers.DataMapperInit;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HelloworldApplication.class, args);
		DataMapperInit d = new DataMapperInit();
		int a = d.getData(1);
		System.out.println("It woooooooooooooorks: "+a);

	}


//	public void setFtlTemplate(DataMapper mapper) throws IOException, TemplateException {
//		Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
//		Template tmp = cfg.getTemplate("src/main/resources/index.ftl");
//		Map<String, Object> root = new HashMap<>();
//		Writer out = new OutputStreamWriter(System.out);
//
//		Word entity = new Word();
//		entity.setId(mapper.getIdFromDB(mapper.numberOfRowsInTable()));
//		entity.setText(mapper.getTextFromDB(mapper.numberOfRowsInTable()));
//		root.put("text", entity);
//		tmp.process(root, out);
//	}

}
