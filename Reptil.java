import java.time.LocalDate;

enum EspecieReptil {
    TORTUGA, IGUANA, DRAGON_DE_KOMODO;
}

public class Reptil extends Animal {
    


    private final EspecieReptil especie;
    private boolean venenoso;
    
    // Constructor
    public Reptil(String pNombre, LocalDate pFechNac, double pPeso, EspecieReptil pEspecie, boolean pVeneno) {
        super(pNombre, pFechNac, pPeso);
        this.especie = pEspecie;
        this.venenoso = pVeneno;
    }
    

    public EspecieReptil getEspecie() {
        return especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }
    
    public void setVenenoso(boolean v) {
        this.venenoso = v;
    }
    
    // Métodos de instancia
    @Override
    public String toString() {
        String salida;
        salida = "Ficha del pajaro:\n";
        salida += "\tNombre: " + this.getNombre() + "\n";
        salida += "\tEspecie: " + this.especie + "\n";
        salida += "\tFecha nacimiento: " + this.getFechNac().toString() + "\n";
        salida += "\tPeso: " + this.getPeso() + " kg\n";
        salida += "\tCanta: " + (this.venenoso?"Si":"No") + "\n";
        salida += "\tComentarios: " + this.getComentarios() + "\n";
        
        return salida;
    }
    
}
