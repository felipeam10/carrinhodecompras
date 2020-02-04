package br.com.carrinhodecompras.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.carrinhodecompras.loja.controllers.HomeController;

@EnableWebMvc 
@ComponentScan(basePackageClasses = {HomeController.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/wiews/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
}
