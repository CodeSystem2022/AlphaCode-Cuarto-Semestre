package utn.tienda_libros;

import utn.tienda_libros.modelo.libro

import java.util.List;

public interface ILibroServicio {
    public List<Libro> listarLibros();


    public Libro buscarLibroPorId(Interger idLibro);

    public void guardarLibro(Libro libro);

    public void eliminarLibro(Libro libro);
}

