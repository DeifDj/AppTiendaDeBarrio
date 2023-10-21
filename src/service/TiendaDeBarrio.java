package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TiendaDeBarrio {


    final List<Usuario> usuarioList = new ArrayList<>();
    final List<Producto> productoList = new ArrayList<>();
    final List<Cliente> Cliente = new ArrayList<>();
    public  void enterUser(Usuario usuario) {
        if (usuarioList.contains(usuario)) {
            usuarioList.add(usuario);
        }
    }

    public Optional<Usuario> usuarioOptional(String User) {
        return usuarioList.stream()
                .filter(usuario -> usuario.getUser().equals(User))
                .findAny();
        }
    public  void addProduct(Producto producto) {
        if (productoList.contains(producto)) {
            productoList.add(producto);
        }
    }

    public Optional<Producto> productoOptional(String Name) {
        return productoList.stream()
                .filter(producto -> producto.getName().equals(Name))
                .findAny();

    }
}
