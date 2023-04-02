package teachers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TeacherConfiguration.class);

        //use beans
        ITeacher javaTeacher = context.getBean("javaTeacher", JavaTeacher.class);
        ITeacher historyTeacher = context.getBean("historyTeacher", HistoryTeacher.class);
        WebDevTeacher webDevTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        System.out.println("Java teacher as Spring bean:");
        System.out.println(javaTeacher.getHomework());
        System.out.println(javaTeacher.getWisdom());

        System.out.println("\nHistory teacher as Spring bean:");
        System.out.println(historyTeacher.getHomework());

        System.out.println("\nWebDevTeacher teacher as Spring bean:");
        webDevTeacher.printKnowledge();

        context.close();
    }
}