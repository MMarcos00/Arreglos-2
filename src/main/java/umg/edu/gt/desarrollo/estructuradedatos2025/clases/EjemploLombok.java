package umg.edu.gt.desarrollo.estructuradedatos2025.clases;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
* La anotación @Data genera automáticamente los métodos getter, setter, toString, equals y hashCode.
* La anotación @NoArgsConstructor crea un constructor sin argumentos.
* De esta manera, reduces la cantidad de código repetitivo y haces tu clase más limpia y mantenible.
*/
@Data
@NoArgsConstructor
public class EjemploLombok {
    private String nombre;
    private int edad;

    public static void main(String[] args) {
        EjemploLombok persona = new EjemploLombok();
        persona.setNombre("Marcos");
        persona.setEdad(19);

        System.out.println(persona);  // Automáticamente llama a toString()
    }
}
