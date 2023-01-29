package ru.stolyarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        //читаем спринг-конфиг файл
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //получаем бин из контейнера
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach swimmingCoach = context.getBean("swimmingCoach", Coach.class);

        //вызываем метод на бине
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(swimmingCoach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyFortune());

        //закрываем контекст
        context.close();
    }
}
