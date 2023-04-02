package animals;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalApplicationMain {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfiguration.class);

        IAnimal theDog = context.getBean("myDog", IAnimal.class);
        IAnimal theCat = context.getBean("cat", IAnimal.class);

        theDog.setAnimalName("Archie");
        theCat.setAnimalName("Mimi");

        System.out.println(theDog);
        System.out.println(theDog.makeSound());
        System.out.println(theDog.getAnimalName());

        System.out.println(theCat);
        System.out.println(theCat.makeSound());
        System.out.println(theCat.getAnimalName());
    }
}