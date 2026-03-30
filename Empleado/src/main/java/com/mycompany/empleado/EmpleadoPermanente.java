/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

import java.util.Date;

/**
 *
 * @author Angely Nikol
 */
public class EmpleadoPermanente extends Empleado {

    private String beneficio;

    // Constructor con todos los parámetros
    public EmpleadoPermanente(int idEmpleado, String nombre, String apellido,
                              Date fechaInicioContrato, double salario,
                              String beneficio) {
        super(idEmpleado, nombre, apellido, fechaInicioContrato, salario);
        this.beneficio = beneficio;
    }

    // Getters y Setters
    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    // Métodos heredados de Empleado
    @Override
    public double calcularSalario() {
        // Ejemplo: salario base + un bono fijo
        return getSalario() + 500;
    }

    // Si quieres acceder a la fecha de inicio contrato desde la clase padre
    public Date getFechaInicioContrato() {
        return super.getFechaContrato();
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        super.setFechaContrato(fechaInicioContrato);
    }
}
