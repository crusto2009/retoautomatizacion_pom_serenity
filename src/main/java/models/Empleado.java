package models;

public class Empleado {

    private static  String nombreEmpleado;

    public static String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public static void setNombreEmpleado(String nombreEmpleado) {
        Empleado.nombreEmpleado = nombreEmpleado;
    }
}
