package com.geekbrains.backend.test;

public class Test {
    public static void main(String[] args) {
        // создаем экземпляр класса
        User user = User.builder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setEmail("wefw@sdf.ru")
                .setPhone("8934534564")
                .setAddress("Kaz")
                .build();
    }
}
