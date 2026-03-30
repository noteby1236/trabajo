package com.mycompany.empleado;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Departamento {

    private int idDepartamento;
    private String nombre;
    private double salarioBase;
    private List<Empleado> empleados;

    // Constructor
    public Departamento(int idDepartamento, String nombre, double salarioBase) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.empleados = new ArrayList<>();
    }

    // Getter y Setter ID
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    // Getter y Setter Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter SalarioBase
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Agregar empleado al departamento
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    // Eliminar empleado del departamento
    public void eliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    // Listar empleados
    public List<Empleado> listarEmpleados() {
        return empleados;
    }

    // Calcular nómina total del departamento
    public double calcularNominaDepartamento() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

    // Generar reporte del departamento como String (para reutilizar)
    public String generarReporteDepartamento() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte del Departamento: ").append(nombre).append("\n");
        reporte.append("ID Departamento: ").append(idDepartamento).append("\n");
        reporte.append("Salario Base: ").append(salarioBase).append("\n");
        reporte.append("Empleados:\n");

        for (Empleado e : empleados) {
            reporte.append(" - ID: ").append(e.getIdEmpleado())
                   .append(" | Nombre: ").append(e.getNombre())
                   .append(" ").append(e.getApellido())
                   .append(" | Salario: ").append(e.calcularSalario())
                   .append("\n");
        }

        reporte.append("Nómina total: ").append(calcularNominaDepartamento()).append("\n");
        return reporte.toString();
    }

    // Mostrar reporte directamente en JOptionPane
    public void mostrarReporteDepartamento() {
        JOptionPane.showMessageDialog(null, generarReporteDepartamento(),
                                      "Reporte Departamento", JOptionPane.INFORMATION_MESSAGE);
    }
}