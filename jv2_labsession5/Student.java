package jv2_labsession5;

public class Student {
    public Integer id;
    public String name;
    public Integer age;
    public Integer mark;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, Integer mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}