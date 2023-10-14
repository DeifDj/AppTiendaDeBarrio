package model;

public class Usuario {
    private int User;
    private int password;


    public Usuario(int user, int password) {
        User = user;
        this.password = password;
    }

    public int getUser() {
        return User;
    }

    public void setUser(int user) {
        User = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "User=" + User +
                ", password=" + password +
                '}';
    }
}
