package ru.start.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingSpringFramework {
    public static void main(String[] args) {
        // Запуск контекста приложения с помощью XML-файла конфигурации.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //"testBean" - id бина. TestBean имя класса. testBean - объект, созданный Spring Framework.
        // ClassicalMusic или RockMusic - наследники Music. В конфигурации можно переключаться между Music и RockMusic.
        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();
    }
}
