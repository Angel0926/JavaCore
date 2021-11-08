package ClassWork.Lesson12;

public class StudentTest {
    public static void main(String[] args) {
        Student poxos=new Student("poxos","poxosyan",
                "094555555", 23, "java");
        System.out.println(poxos.getName());
        poxos.setName("poxosik");
        System.out.println(poxos.getName());

    }
}
