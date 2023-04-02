package teachers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan

public class WisdomWordsServiceConfiguration {
    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }
}
