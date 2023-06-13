import java.util.ArrayList;
import java.util.List;

public class  EmpleadosCRUD {

    //Estructura de datos
    static List<Empleado> empleados = new ArrayList<>();

    //Operaciones CRUD => CREATE - guardar empleados
    public static void save(Empleado empleado) {
    empleados.add(empleado);
    }

    //Operaciones CRUD => Read/Retriver -buscar empleados
    public static List<Empleado> findAll() {
        return empleados;
    }


}
