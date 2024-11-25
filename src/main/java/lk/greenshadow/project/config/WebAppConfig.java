package lk.greenshadow.project.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("lk.greenshadow.project")
@EnableWebMvc
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("Web App Config");
    }
}
