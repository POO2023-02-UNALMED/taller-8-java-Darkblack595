
package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero( String nombre, int edad, String posicion, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    
    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    public int compareTo(Portero otroPortero){
         return Math.abs(this.getEdad()-otroPortero.getEdad());
    }
    
    public String elJugador(){
        return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+ ", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+ ". Le han marcado "+this.golesRecibidos;
    }
    
    
    
}