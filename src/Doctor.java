import javax.print.Doc;

public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo Objeto Doctor");
    }

    Doctor(String name){
        System.out.println("El nombre del Dr. es: "+ name);
    }

    //Comportamientos
    public void showName() {
        System.out.println(name);

    }

}
