public class Directivo extends Persona{
    double sueldo;
    int antiguedad;

    public Directivo(){

    }
    public Directivo( double sueldo, int antiguedad,int id, String nom, String apellido){
        super(id,nom,apellido);
        this.sueldo=sueldo;
        this.antiguedad=antiguedad;

    }
    
}
