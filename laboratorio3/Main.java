public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Vendedor("1001", "Carlos", 300000),
            new Administrativo("1002", "Maria")
        };

        for (Empleado e : empleados) {
            System.out.println(e.nombre);
            e.mostrarCedula();
            System.out.println("Salario: " + e.calcularSalario());
            System.out.println("Salario con 5 horas extra: " + e.calcularSalario(5));
            System.out.println();
        }
    }
}
