
package com.example.demo.service;

public interface IUsuarioService {
    
    public void crearUsuario(String nombreUsuario, String contraseniaUsuario);
    
    public void encontrarUsuario(Long idUsuario);
    
    public void traerUsuarios();
    
    public void editarUsuario(Long idUsuario, String nuevoNombre, String nuevaContrasenia);
    
    public void eliminarUsuario(Long idUsuario);
}
