/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL
 */
public class Horario {
    private int idcatedratico;
    private int idcurso;
    private int idgrado;
    private String nombre;
    private int idhorario;

    public Horario() {
    }

    public Horario(int idcatedratico, int idcurso, int idgrado, String nombre, int idhorario) {
        this.idcatedratico = idcatedratico;
        this.idcurso = idcurso;
        this.idgrado = idgrado;
        this.nombre = nombre;
        this.idhorario = idhorario;
    }

    public int getIdcatedratico() {
        return idcatedratico;
    }

    public void setIdcatedratico(int idcatedratico) {
        this.idcatedratico = idcatedratico;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getIdgrado() {
        return idgrado;
    }

    public void setIdgrado(int idgrado) {
        this.idgrado = idgrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdhorario() {
        return idhorario;
    }

    public void setIdhorario(int idhorario) {
        this.idhorario = idhorario;
    }

    public void getIdmateria(String text) {
        getIdmateria(text);
    }    

    public void setIdCate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdCatedratico(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
