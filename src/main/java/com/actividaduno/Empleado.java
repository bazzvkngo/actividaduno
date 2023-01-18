package com.actividaduno;

public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;

    public Empleado(String nombre, int edad, String direccion, int idEmpleado, double salario) {
        super(nombre, edad, direccion);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}