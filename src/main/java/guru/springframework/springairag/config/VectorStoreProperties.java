package guru.springframework.springairag.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "paha.aiapp")
@Getter
@Setter
public class VectorStoreProperties {

    private String vectorStorePath;
}
