/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

/**
 *
 * @author Angely Nikol
 */
import java.util.Date;
import java.util.Date;

public class ReporteDesempeño {

    private int idReporte;
    private String tipoReporte;
    private Date fecha;

    public ReporteDesempeño(int idReporte, String tipoReporte, Date fecha){
        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.fecha = fecha;
    }

    public String calcularMetricasEmpleado(Empleado e){

        double salario = e.calcularSalario();

        String metricas =
                "Empleado: " + e.getNombre() + " " + e.getApellido() + "\n" +
                "Salario: " + salario + "\n" +
                "Fecha contrato: " + e.getFechaContrato();

        return metricas;
    }

    public String calcularMetricasDepartamento(Departamento d){

        double totalNomina = d.calcularNominaDepartamento();

        String datos = "Departamento: " + d.getNombre() + "\n";
        datos += "Salario Base: " + d.getSalarioBase() + "\n";
        datos += "Nomina total: " + totalNomina + "\n\n";

        for(Empleado e : d.listarEmpleados()){
            datos += e.getNombre() + " " + e.getApellido() +
                    " | Salario: " + e.calcularSalario() + "\n";
        }

        return datos;
    }

    public String generarReporte(){
        return "Reporte generado en fecha: ";
    }

    public int getIdReporte() {
        return idReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public Date getFecha() {
        return fecha;
    }

}