package teachers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TeacherFactory teacherFactory = new TeacherFactory();

        // create the object
        ITeacher javaTeacher = teacherFactory.getTeacher("Java");

        // use the object
        System.out.println(javaTeacher.getHomework());

        //use beans
        ITeacher theTeacher = context.getBean("myTeacher", ITeacher.class);
        ITeacher historyTeacher = context.getBean("historyTeacher", ITeacher.class);

        System.out.println(theTeacher.getHomework());
        System.out.println(historyTeacher.getHomework());

        context.close();
    }
}