package nicramus.java8kata.lambda.pojos;

import javax.lang.model.element.Name;

/**
 * Created by m on 2016-11-22.
 */
public class NameSurname {
    public String name;
    public String surname;

    public NameSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
