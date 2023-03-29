package teachers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TeacherFactory teacherFactory = new TeacherFactory();

        // create the object
        ITeacher javaTeacher = teacherFactory.getTeacher("Java");

        // use the object
        System.out.println("Created Java teacher via Factory pattern: \n" + javaTeacher.getHomework() + "\n");

        //use beans
        ITeacher theTeacher = context.getBean("javaTeacher", ITeacher.class);
        ITeacher historyTeacher = context.getBean("historyTeacher", ITeacher.class);
        WebDevTeacher webDevTeacher = context.getBean("webDevTeacher", WebDevTeacher.class);

        System.out.println("Java teacher as Spring bean:");
        System.out.println(theTeacher.getHomework());
        System.out.println(theTeacher.getWisdom());

        System.out.println("\nHistory teacher as Spring bean:");
        System.out.println(historyTeacher.getHomework());

        System.out.println("\nWebDevTeacher teacher as Spring bean:");
        webDevTeacher.printKnowledge();

        context.close();
    }
}