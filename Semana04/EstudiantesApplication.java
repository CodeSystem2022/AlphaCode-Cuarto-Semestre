package utn.estudiantes;
 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {
    @Autowired
    private EstudianteServicio estudianteServicio;
    private static final Logger logger = LoggerFactory.getLogger(EstudiantesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EstudiantesApplication.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        logger.info(nl+"Ejecutando el método run de Spring..."+nl);
    }
}

 
 
 
 





 


   
