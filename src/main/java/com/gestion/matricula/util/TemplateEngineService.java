package com.gestion.matricula.util;

import java.util.Map;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class TemplateEngineService {
	
	private TemplateEngine templateEngine;
	
	public TemplateEngineService() {
	    ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
	    templateResolver.setPrefix("templates/");
	    templateResolver.setSuffix(".html");
	    templateResolver.setTemplateMode(TemplateMode.HTML);
	    templateEngine = new TemplateEngine();
	    templateEngine.setTemplateResolver(templateResolver);
	}

	public String processTemplate(String template, Map<String, Object> mapContext) {
	    Context context = new Context();
	    context.setVariables(mapContext);
	    return templateEngine.process(template, context);
	}
	public String processTemplate(String template, Context context) {
	    return templateEngine.process(template, context);
	}

}
