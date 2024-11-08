package gestionpersonas;

// Herencia: La clase Doctor hereda de la clase abstracta Persona
public class Doctor extends Persona 
{
    private String especialidad; // Encapsulamiento

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad); // Llamada al constructor de la superclase
        this.especialidad = especialidad;
    }

    public String getEspecialidad() 
    {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) 
    {
        this.especialidad = especialidad;
    }

    // Polimorfismo: Implementación del método abstracto de la superclase
    @Override
    public void mostrarInfo() 
    {
        System.out.println("Doctor: " + getNombre() + ", Edad: " + getEdad() + ", Especialidad: " + especialidad);
    }
}

