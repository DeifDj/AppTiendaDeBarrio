package model;

public class Usuario {
    private final String User;
    private final int password;

    public Usuario(String user, int password) {
        this.User = user;
        this.password = password;
    }

    public String getUser() { return User; }

    public int getPassword() { return password; }

    @Override
    public String toString() {
        return "Usuario{" +
                "User='" + User + '\'' +
                ", password=" + password +
                '}';
    }
}

