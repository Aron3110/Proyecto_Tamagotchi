/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author patvi
 */
public class Entretenimiento {
    private String Entretenimiento;
    private int aburrimiento;
    private int tiempoEntretenimiento;

    public String getEntretenimiento() {
        return Entretenimiento;
    }

    public void setEntretenimiento(String Entretenimiento) {
        this.Entretenimiento = Entretenimiento;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public int getTiempoEntretenimiento() {
        return tiempoEntretenimiento;
    }

    public void setTiempoEntretenimiento(int tiempoEntretenimiento) {
        this.tiempoEntretenimiento = tiempoEntretenimiento;
    }

    public Entretenimiento(String Entretenimiento, int aburrimiento, int tiempoEntretenimiento) {
        this.Entretenimiento = Entretenimiento;
        this.aburrimiento = aburrimiento;
        this.tiempoEntretenimiento = tiempoEntretenimiento;
    }
    
}
