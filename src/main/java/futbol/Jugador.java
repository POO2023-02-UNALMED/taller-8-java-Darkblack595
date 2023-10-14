
package futbol;

import java.lang.Math;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;
    
    public Jugador(){
        this("Maradona",30,"delantero",(short)289,(byte)7);
    }
    
    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal){
        super(nombre,  edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    
    @Override
    public int compareTo(Object o){
         if(o instanceof Jugador otroJugador){
             return Math.abs(this.getEdad()- otroJugador.getEdad());
          }else{return 0;}
        }

    @Override
    public boolean jugarConLasManos() {
           return false;
        }
    
    @Override
    public String toString(){
        return "El futbolista "+this.getNombre() + " tiene " +this.getEdad()+ ", y juega de " + this.getPosicion() + " con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;
    }
}
