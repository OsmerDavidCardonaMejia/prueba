package gestionpersonas;

// Herencia: La clase Deportista hereda de la clase abstracta Persona
public class Deportista extends Persona 
{
    private String deporte; // Encapsulamiento

    public Deportista(String nombre, int edad, String deporte)
    {
        super(nombre, edad); // Llamada al constructor de la superclase
        this.deporte = deporte;
    }

    public String getDeporte() 
    {
        return deporte;
    }

    public void setDeporte(String deporte)
    {
        this.deporte = deporte;
    }

    // Polimorfismo: Implementación del método abstracto de la superclase
    @Override
    public void mostrarInfo() 
    {
        System.out.println("Deportista: " + getNombre() + ", Edad: " + getEdad() + ", Deporte: " + deporte);
    }
}
