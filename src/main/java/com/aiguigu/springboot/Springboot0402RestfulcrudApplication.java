package com.aiguigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;

import javax.swing.text.View;
import java.util.Locale;

@SpringBootApplication
public class Springboot0402RestfulcrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot0402RestfulcrudApplication.class, args);
	}

	@Bean
	public ViewResolver myViewReolver(){
	    return new MyViewResolver();
    }

	private static class MyViewResolver implements ViewResolver{
        @Override
        public org.springframework.web.servlet.View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }


}
