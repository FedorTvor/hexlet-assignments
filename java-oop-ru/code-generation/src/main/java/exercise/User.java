package exercise;

import lombok.Value;

@Value
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
}
