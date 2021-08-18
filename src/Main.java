public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Matias Scandizzo";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctorNico = new Doctor();
        myDoctor.showId();
        System.out.println(Doctor.id);
    }
}
