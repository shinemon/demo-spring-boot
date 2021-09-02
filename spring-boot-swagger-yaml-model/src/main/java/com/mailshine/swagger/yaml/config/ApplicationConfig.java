package com.mailshine.swagger.yaml.config;

import com.mailshine.swagger.yaml.model.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The type Application config.
 */
@Configuration
public class ApplicationConfig {

    /**
     * The type Browser history config.
     */
    @Configuration
    public static class BrowserHistoryConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");

            registry.addResourceHandler("/webjars/**")
                    .addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
    }

    @Bean
    public Course demoCourse() {
        Course course = new Course();
        course.setCourseName("CSDemo550");
        course.setCourseId("10");
        return course;
    }

}
