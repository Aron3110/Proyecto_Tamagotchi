/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Aaron Mena Bogarin
 */
public class Mascota {
    
    private int salud;
    private int hambre;
    private int sueno;//sueño
    /**
     * Representa el nivel de aburrimiento 
     * de la mascota.
     * Si sube a 90 o más esta caera
     * enferma
     */
    private int aburrimiento;
    /**
     * Son la cantidad de estadisticas
     * que estan por debajo del margen del
     * 10% o por encima del 90% en caso del
     * aburrimiento
     */
    private boolean enferma;

    public int getSalud() {
        return salud;
    }
    public int getHambre() {
        return hambre;
    }
    public int getSueno() {
        return sueno;
    }
    public int getAburrimiento() {
        return aburrimiento;
    }
    public boolean isEnferma(){
        return enferma;
    }
    /**
     * Suma el valor dado por parametro 
     * a el atributo de salud.
     * En caso de parametro negativos 
     * los resta.
     * 
     * [Valor Actual] += [Parametro]
     * 
     * El valor del atributo no pasara
     * de 100 ni bajara de cero.
     * @param salud Valor a sumar.
     */
    public void setSalud(int salud) {
        if ((this.salud += salud) < 0){
            this.salud = 0;
        }else if((this.salud += salud) > 100){
            this.salud = 100;
        }else{
            this.salud += salud;
        }
    }
    /**
     * Suma el valor dado por parametro 
     * a el atributo de hambre.
     * En caso de parametro negativos 
     * los resta.
     * 
     * [Valor Actual] += [Parametro]
     * 
     * El valor del atributo no pasara
     * de 100 ni bajara de cero.
     * @param hambre Valor a sumar.
     */
    public void setHambre(int hambre) {
        if ((this.hambre += hambre) < 0){
            this.hambre = 0;
        }else if((this.hambre += hambre) > 100){
            this.hambre = 100;
        }else{
            this.hambre += hambre;
        }
    }
    /**
     * Suma el valor dado por parametro 
     * a el atributo de sueno.
     * En caso de parametro negativos 
     * los resta.
     * 
     * [Valor Actual] += [Parametro]
     * 
     * El valor del atributo no pasara
     * de 100 ni bajara de cero.
     * @param sueno Valor a sumar.
     */
    public void setSueno(int sueno) {
        if ((this.sueno += sueno) < 0){
            this.sueno = 0;
        }else if((this.sueno += sueno) > 100){
            this.sueno = 100;
        }else{
            this.sueno += sueno;
        }
    }
    /**
     * Suma el valor dado por parametro 
     * a el atributo de aburrimiento.
     * En caso de parametro negativos 
     * los resta.
     * 
     * [Valor Actual] += [Parametro]
     * 
     * El valor del atributo no pasara
     * de 100 ni bajara de cero.
     * @param aburrimiento Valor a sumar.
     */
    public void setAburrimiento(int aburrimiento) {
        if ((this.aburrimiento += aburrimiento) < 0){
            this.aburrimiento = 0;
        }else if((this.aburrimiento += aburrimiento) > 100){
            this.aburrimiento = 100;
        }else{
            this.aburrimiento += aburrimiento;
        }
    }
    /**
     * Cambia el atributo booleano 
     * enferma al opuesto del acutal
     */
    public void cambiarEstado(){
        enferma = !enferma;
    }
    /**
     * Metodo constructor
     */
    public Mascota() {
        this.salud = 100;
        this.hambre = 100;
        this.sueno = 100;
        this.aburrimiento = 0;
        this.enferma = false;   
    }

    @Override
    public String toString() {
        return "Mascota\n"
                + "Salud:" + salud + "\n"
                + "Hambre:" + hambre + "\n"
                + "Sueño: " + sueno + "\n"
                + "Aburrimiento:" + aburrimiento + "\n"
                + "Enferma:" + enferma;
    }
    
}
