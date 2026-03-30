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

public class EmpleadoTemporal extends Empleado {

    private Date fechaFinContrato;
    private int horasTrabajadas;
    private double valorHora;

    public EmpleadoTemporal(int idEmpleado, String nombre, String apellido,
                            Date fechaInicioContrato, double salario,
                            Date fechaFinContrato, int horasTrabajadas, double valorHora) {
        super(idEmpleado, nombre, apellido, fechaInicioContrato, salario);
        this.fechaFinContrato = fechaFinContrato;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public Date getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(Date fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }

    public Date getFechaInicioContrato() {
        return super.getFechaContrato();
    }

    public void setFechaInicioContrato(Date fechaInicioContrato) {
        super.setFechaContrato(fechaInicioContrato);
    }
}




