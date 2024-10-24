public class Profesor extends Persona {
    int curso;
    String materia;

    public Profesor(){

    }

    public Profesor(int curso, String materia, int id, String nom, String apellido){
        super(id,nom,apellido);
        this.curso=curso;
        this.materia=materia;
    }

    public int getCurso(){
        return curso;
    }
    public String getMateria(){
        return materia;
    }

    public void setCurso(int curso){
        this.curso=curso;
    }

    public void setMateria(String materia){
        this.materia=materia;
    }

    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("curso: "+curso);
        System.out.println("Materia: "+materia);
    }
}
