public class Persona {
    int id;
    String nombre;
    String apellido;
    
    public Persona(int id, String nom, String apellido){
        this.id=id;
        this.nombre= nom;
        this.apellido = apellido;
    }
    public Persona (){

    }
    public int getId(){
        return id;
    }

    public String getNombre (){
        return nombre;
    }


    public String getApellido (){
        return apellido;
    }    

    public void setId(int id){
        this.id= id;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public void mostrarDatos(){
        System.out.println("Id: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
  }


