package utn.tienda_libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

  import java.awt.EvenQueue;

@SpringBootApplication
public class TiendaLibrosApplication {

	public static void main(String[] args) {
	
	ConfigurableApplicationContext contextSpring =
                            new SpringApplicationBuilder(TiendaLibrosApplication.class)
                    .headless(false)
                    .web(WebApplicationType.NONE)
                    .run(args);
    //Ejecutamos el codigo para cargar el formulario
    EventQueue.invokeLater(() -> { //Método Lamba
        //Obtener el objeto from a traves del spring
        LibroFrom LibroFrom = contextoSpring.getBean(LibroFrom.class);
	libroFrom.setVisible(true);
    });
 }
		
}
