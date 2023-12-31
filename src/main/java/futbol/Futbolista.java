
package futbol;

abstract public class Futbolista implements Comparable<Object>{
    private String nombre;
    private int edad;
    private final String posicion ;
    
    public Futbolista(){
    this("Maradona",30,"delantero");
    }
    
    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }
    
    @Override
    public String toString(){
        return "El futbolista " +this.getNombre()+ " tiene " + this.getEdad() + ", y juega de " + this.getPosicion();
    } 
    
    public boolean equals(Futbolista f){
        if (this == f) {
            return true;
        }
        if (f == null || getClass() != f.getClass()) {
            return false;
      }else{return false;}
    }
   
    
    abstract public boolean jugarConLasManos();
   
    @Override
    public int compareTo(Object otroFutbolista){
         return 0;
    }
        
}
