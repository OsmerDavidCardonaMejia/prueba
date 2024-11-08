package gestionpersonas;

// Abstracción: Clase abstracta que define los atributos básicos de una persona
public abstract class Persona 
{
    // Encapsulamiento: Atributos privados
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos públicos (Getters y Setters) para acceder a los atributos
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getEdad() 
    {
        return edad;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    // Abstracción y Polimorfismo: Método abstracto que será implementado por las subclases
    public abstract void mostrarInfo();
}
