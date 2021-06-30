/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eps;

/**
 *
 * @author Estudiante
 */
public class Paciente {
    
    String NombrePaciente;
    int documentoIdentidad;
    String Apellidos;
    String Genero;
    int edad;
    boolean discapacidad;

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public Paciente(){
        
    }
    
    public Paciente(String NombrePaciente, int documentoIdentidad, String Apellidos, String Genero, int edad) {
        this.NombrePaciente = NombrePaciente;
        this.documentoIdentidad = documentoIdentidad;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.edad = edad;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
