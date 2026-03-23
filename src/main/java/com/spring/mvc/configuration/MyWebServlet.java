
package com.spring.mvc.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebServlet implements WebApplicationInitializer {
	@Override
	public void onStartup(ServletContext ctx) throws ServletException {
		AnnotationConfigWebApplicationContext annWebConfig = new AnnotationConfigWebApplicationContext();
		annWebConfig.register(SpringConfig.class);
		annWebConfig.setServletContext(ctx);
		ServletRegistration.Dynamic servlet = ctx.addServlet("dispatcher", new DispatcherServlet(annWebConfig));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}
}
