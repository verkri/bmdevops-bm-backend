package hu.bankmonitor.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

public class WebConfiguration {

	@Bean
	public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter() {
		return new MappingJackson2XmlHttpMessageConverter(
				new Jackson2ObjectMapperBuilder()
						.defaultUseWrapper(false)
						.createXmlMapper(true)
						.build()
		);
	}

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2JsonHttpMessageConverter() {
		return new MappingJackson2HttpMessageConverter(
				new Jackson2ObjectMapperBuilder()
						.defaultUseWrapper(false)
						.createXmlMapper(true)
						.build()
		);
	}

}