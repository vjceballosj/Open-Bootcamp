public class Empleado {

    //atributos
    String name;
    int age;
    double salary;
    boolean active;

    //contructor

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", active=" + active +
                '}';
    }

    public Empleado(String name, int age, double salary, boolean active){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.active = active;

        //métodos


    }
}
