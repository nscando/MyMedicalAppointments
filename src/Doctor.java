import javax.print.Doc;

public class Doctor {
    //Atributos
    static int id = 0;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo Objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del Dr. es: "+ name);
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);

    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
