package ru.stolyarov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        //читаем спринг-конфиг файл
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //получаем бин из контейнера
        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);

        //вызываем метод на бине
        System.out.println(theCoach.getDailyWorkout());

        //закрываем контекст
        context.close();
    }
}
