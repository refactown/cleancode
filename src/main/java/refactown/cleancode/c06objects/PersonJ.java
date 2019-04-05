package refactown.cleancode.c06objects;

import java.util.Objects;

public class PersonJ {

    /** name */
    private String name;
    /** age */
    private int age;
    /** city */
    private String city;

    /** Default Constructor */
    public PersonJ(){

    }

    /**
     * Retorna o nome.
     * @return  O nome.
     * */
    public String getName() {
        return name;
    }

    /**
     * Determina o nome.
     * @param name O nome determinado.
     * */
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public PersonJ(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonJ personJ = (PersonJ) o;
        return age == personJ.age &&
                Objects.equals(name, personJ.name) &&
                Objects.equals(city, personJ.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city);
    }

    @Override
    public String toString() {
        return "PersonJ{" + "name='" + name + '\'' + ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
