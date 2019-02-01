package fr.akwanet.springboot.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig {
	Logger logger = LoggerFactory.getLogger(SpringMongoConfig.class);

	@Value("${spring.data.mongodb.host}")
	private String mongoHost;

	@Value("${spring.data.mongodb.port}")
	private String mongoPort;

	@Value("${spring.data.mongodb.database}")
	private String mongoDBName;

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		logger.info("@@ Mongo Host="+mongoHost+", Port="+mongoPort+", Mondo DBName="+mongoDBName);
		
		MongoTemplate mongoTemplate = 
		    new MongoTemplate(new MongoClient(mongoHost, Integer.parseInt(mongoPort)),mongoDBName);
		return mongoTemplate;
		
	}
}
