package com.itheima.sh.b_json_02;

public class Friend {
    private String id;
    private String name;
    private Integer age;

    public Friend() {
    }

    public Friend(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setAge(Integer age) {
        this.age = age;
    }
}
