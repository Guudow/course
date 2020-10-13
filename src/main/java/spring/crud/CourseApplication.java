package spring.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spring.crud.dao.DAO;
import spring.crud.model.Course;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class CourseApplication {

    private static DAO<Course> dao;

    public CourseApplication(DAO<Course> dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {

        SpringApplication.run(CourseApplication.class, args);

        System.out.println("\nCreate Course -------------------------------------\n");
        Course springVue = new Course("Spring Boot + Vue","New Course","http://www.danvega.dev/courses");
        dao.create(springVue);

        System.out.println("\n One Course ------------ \n");
        Optional<Course> firstOne = dao.get(1);
        System.out.println(firstOne.get());

        springVue.setDescription("Learn to build Vue apps that talk to Spring");
        dao.update(springVue,6);

        dao.delete(4);


        System.out.println("\n All Courses-----------------------\n");
        List<Course> courses = dao.list();
        courses.forEach(System.out::println);

    }


}
