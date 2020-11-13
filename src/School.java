import java.util.ArrayList;

public class Hz {
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents(){
        return students;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Hz (String name){
        this.name = name;

        this.students = new ArrayList<>();
    }

    public void entrance(Student student) {
        this.students.add(student);


    }

    public String getStudentPass(){
        StringBuilder builder = new StringBuilder();

        for (Student student: this.students){
            HzPass pass = new HzPass(student);
            String str = pass.toString();
            builder.append(str);
        }

        return builder.toString();
    }
}
