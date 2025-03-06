/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */
public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Carlos", 45, "Cardiología");
        Deportista deportista = new Deportista("Ana", 22, "Natación");
        
        doctor.mostrarInfo();
        deportista.mostrarInfo();
    }
}