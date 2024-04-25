package br.com.xt.dio.springboot.scopes.app;

public class Answer {

    private String email;
    private String name;

    public Answer(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
