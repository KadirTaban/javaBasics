package homeWork01;

public class Main {
    public static void main(String[] args) {
        Instructor ınstructor = new Instructor();
        ınstructor.setId(1);
        ınstructor.setFirstName("Kadir");
        ınstructor.setEmail("kadirtaban@mountainlabs");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(ınstructor);
    }
}