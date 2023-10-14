package model;

public class Cliente {
    private String name;
    private String lastName;
    private String adreess;

    public Cliente(String name, String lastName, String adreess) {
        this.name = name;
        this.lastName = lastName;
        this.adreess = adreess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdreess() {
        return adreess;
    }

    public void setAdreess(String adreess) {
        this.adreess = adreess;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adreess='" + adreess + '\'' +
                '}';
    }
}
