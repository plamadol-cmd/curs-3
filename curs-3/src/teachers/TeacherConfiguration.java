package teachers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import(WisdomWordsServiceConfiguration.class)
public class TeacherConfiguration {

    @Bean
    public teachers.JavaTeacher javaTeacher() {
        return new JavaTeacher(wisdomWordsService(), homeworkService());
    }

    @Bean
    public WisdomWordsService wisdomWordsService() {
        return new WisdomWordsService();
    }

    @Bean
    public HomeworkService homeworkService() {
        return new teachers.HomeworkService();
    }
}
