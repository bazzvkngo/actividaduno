package com.actividaduno;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        Empleado e1 = new Empleado("Juan", 25, "Calle 1", 1, 1000);
        Empleado e2 = new Empleado("Maria", 30, "Calle 2", 2, 2000);
        Empleado e3 = new Empleado("Pedro", 35, "Calle 3", 3, 3000);

        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);

        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Direccion: " + empleado.getDireccion());
            System.out.println("Id Empleado: " + empleado.getIdEmpleado());
            System.out.println("Salario:" + empleado.getSalario());
            System.out.println("-----------------");
        }
    }
}