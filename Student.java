public class Student {
    private String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Student student = new Student("Sowmya Reddy");

        //getName method to retrieve the name
        String studentName = student.getName();
        System.out.println(studentName);
    }
}
