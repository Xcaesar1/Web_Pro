package main.com;

public class entity {
    private String url;
    private String name;
    private Integer age;
    private String gender;

    public entity() {
    }

    public entity(String url, String name, Integer age, String gender) {
        this.url = url;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
