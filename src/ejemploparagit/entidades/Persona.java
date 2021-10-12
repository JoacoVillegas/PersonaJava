/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploparagit.entidades;

/**
 *
 * @author Gustavo
 */
public class Persona {
    public String nacionalidad;
    public int edad;
    public String sexo;

    public Persona() {
    }

    public Persona(String nacionalidad, int edad, String sexo) {
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nacionalidad=" + nacionalidad + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}
