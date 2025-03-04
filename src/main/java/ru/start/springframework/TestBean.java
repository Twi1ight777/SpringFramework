package ru.start.springframework;

public class TestBean {
    private String name;

    // Конструктор для тестирования
    public TestBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
