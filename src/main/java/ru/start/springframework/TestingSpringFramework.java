package ru.start.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingSpringFramework {
    public static void main(String[] args) {
        // Запуск контекста приложения с помощью XML-файла конфигурации.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //"testBean" - id бина. TestBean имя класса. testBean - объект, созданный Spring Framework.
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        context.close();
    }
}
