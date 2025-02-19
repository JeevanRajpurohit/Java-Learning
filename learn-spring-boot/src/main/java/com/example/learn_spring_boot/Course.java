package com.example.learn_spring_boot;

public class Course {
    public long id;
    public String name;
    public String mentor;

    public Course(String name, long id, String mentor) {
        this.name = name;
        this.id = id;
        this.mentor = mentor;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMentor() {
        return mentor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mentor='" + mentor + '\'' +
                '}';
    }
}
