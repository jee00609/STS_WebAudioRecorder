package com.STS_WebAudioRecorder.Config;

import javax.sql.DataSource;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.*;

@Configuration
@ComponentScan("com.LearningEnglishWordsWithImages")
public class JavaConfig {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl(
				"jdbc:mysql://localhost:3306/spring5fs?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8");
		dataSource.setUsername("root");
		
		//민지는 1234s
		dataSource.setPassword("1234");
		return dataSource;
	}
}
