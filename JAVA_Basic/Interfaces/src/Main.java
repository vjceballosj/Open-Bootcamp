import java.util.List;

public class Main {
public static void main(String[] args) {

    EmpleadosCRUD empleadosCRUD = new EmpleadosCRUD();


Empleado valentin = new Empleado("Valentín", 
        40,36000,true);
Empleado javier = new Empleado("Javier",
        40,37000,true);
Empleado ceballos = new Empleado("Ceballos",
        40,38000,true);

    System.out.println(valentin);

//Save empleados
EmpleadosCRUD.save(valentin);
EmpleadosCRUD.save(javier);
EmpleadosCRUD.save(ceballos);

//Consultar empleados
List<Empleado> empleados = EmpleadosCRUD.findAll();
    System.out.println(empleados);
}
}