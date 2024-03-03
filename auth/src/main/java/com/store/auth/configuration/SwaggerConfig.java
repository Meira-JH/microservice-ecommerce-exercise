package com.store.auth.configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info=@Info(
                title="Documentation for Authentication Microservice",
                description="Documentation for Authentication Microservicee",
                version = "v1",
                license = @License(name="Apache 2.0", url="http://www.apache.org/licenses/")
        )
)
public class SwaggerConfig {
}
