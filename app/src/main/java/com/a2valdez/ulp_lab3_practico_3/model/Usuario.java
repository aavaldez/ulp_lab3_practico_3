package com.a2valdez.ulp_lab3_practico_3.model;

import androidx.annotation.NonNull;

public class Usuario {
    private long dni;
    private String apellido;
    private String nombre;
    private String mail;
    private String password;
    private String foto;

    public Usuario(long dni, String apellido, String nombre, String mail, String password) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.mail = mail;
        this.password = password;
        this.foto = dni+".png";
    }

    public Usuario(){}

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @NonNull
    @Override
    public String toString() {
        return "Usuario{"+
                "dni="+dni+
                ", apellido='"+apellido+'\''+
                ", nombre="+nombre+'\''+
                ", mail="+mail+'\''+
                ", password="+password+'\''+
                '}';
    }
}
