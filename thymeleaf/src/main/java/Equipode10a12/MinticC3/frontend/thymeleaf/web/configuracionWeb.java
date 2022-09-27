package Equipode10a12.MinticC3.frontend.thymeleaf.web;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;
@Configuration
public class configuracionWeb implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registro){

        registro.addViewController("/").setViewName("index");
        registro.addViewController("/login");
        registro.addViewController("/error/403").setViewName("/error/403");
    }
        @Bean
        public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver, SpringSecurityDialect sec) {
            final SpringTemplateEngine templateEngine = new SpringTemplateEngine();
            templateEngine.setTemplateResolver(templateResolver);
            templateEngine.addDialect(sec); // Enable use of "sec"
            return templateEngine;
        }
    }

