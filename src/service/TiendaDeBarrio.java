package service;

import model.Cliente;
import model.Producto;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TiendaDeBarrio {


    final List<Usuario> usuarioList = new ArrayList<>();
    final List<Producto> productoList = new ArrayList<>();
    final List<model.Cliente> clienteList = new ArrayList<>();
    public  void addUsuario(Usuario usuario) {
        if (usuarioList.contains(usuario)) {
            usuarioList.add(usuario);
        }
    }

    public Optional<Usuario> findUsuarioByUser(String user) {
        return usuarioList.stream()
                .filter(usuario -> usuario.getUser().equals(user))
                .findAny();
        }
    public  void addProducto(Producto producto) {
        if (productoList.contains(producto)) {
            productoList.add(producto);
        }
    }

    public Optional<Producto> productoOptional(String name) {
        return productoList.stream()
                .filter(producto -> producto.getName().equals(name))
                .findAny();

    }
    public  void addCliente(Cliente cliente) {
        if (clienteList.contains(cliente)) {
            clienteList.add(cliente);
        }
    }

    public Optional<Cliente> clienteOptional(String name) {
        return clienteList.stream()
                .filter(cliente -> cliente.getName().equals(name))
                .findAny();

    }
}
