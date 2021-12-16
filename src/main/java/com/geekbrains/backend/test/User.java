package com.geekbrains.backend.test;
//обычный data класс (в нем только инфа без логики)
public class User {
    private final String name, surname, address, phone, email;

    // все свойства заполняются из Builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    // создаем экземпляр Builder
    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder{
        private String name, surname, address, phone, email;

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }
        public UserBuilder setSurname(String surname){
            this.surname = surname;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }
        public UserBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        // функция
        public User build(){
            // передаем ссылку на Builder
            return new User(this);
        }
    }
}
