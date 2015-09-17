package edu.pwr.mlitka.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class AppConfig {

	@Bean
	public ViewResolver resolver() {
		final InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("WEB-INF/jsp/");
		vr.setSuffix(".jsp");
		return vr;
	}

}
