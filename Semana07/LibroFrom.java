package utn.tienda_libros.vista;

import org.springframework.beans.factory.annotation.Autowired;
import utn.tienda_libros.servicio.LibroServicio;

import javax.swing.*;

public class LibroFrom extends JFrame {
    LibroServicio libroServicio;
    private JPanel panel;

    @Autowired
    public LibroFrom(LibroServicio libroServicio){
        this.libroServicio = libroServicio;
        iniciarForma();
        agregarButton.addActionListener(e -> agregarLibro());
        
    }

    private void iniciarForma(){
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(900, 700);
}













    private void createUIComponents() {
    this.tablaModeloLibros = new DefaultTableModel(0,5);
    String[] cabecera = {"Id", "Libro", "Autor", "Precio", "Existencias"};
    this.tablaModeloLibros.setColumnIdentifiers(cabecera);
    // Instanciar el objeto de Jtable
    this.tablaLibros =new JTable(tablaModeloLibros);
    }
    
    private void agregarLibro() {
        //Leer los valores del Formulario
        if(libroTextoTextField.getText().equals("")) {
            mostrarMensaje("Ingrese el nombre del libro");
        }        
}
