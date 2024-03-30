package org.example.streams;

import java.util.List;

class User {

    String name;
    int age;
    List<String> favouriteFoods;
    Gender gender;
    boolean isMarried;

    public User(String name, int age, List<String> favouriteFoods, Gender gender, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.favouriteFoods = favouriteFoods;
        this.gender = gender;
        this.isMarried = isMarried;
    }

    String getName() {
        return name;
    }

     void setName(String name) {
        this.name = name;
    }

     int getAge() {
        return age;
    }

     void setAge(int age) {
        this.age = age;
    }

     List<String> getFavouriteFoods() {
        return favouriteFoods;
    }

     void setFavouriteFoods(List<String> favouriteFoods) {
        this.favouriteFoods = favouriteFoods;
    }

     boolean isMarried() {
        return isMarried;
    }

     void setMarried(boolean married) {
        isMarried = married;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() { return name + " " + age;
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", favouriteFoods=" + favouriteFoods +
//                ", gender=" + gender +
//                ", isMarried=" + isMarried +
//                '}';
    }

    enum Gender {M,F}
}
