public class Student extends Person {
    public String[] courses;

    public Employee(String firstName, String lastName, String[] courses) {
        super(firstName, lastName);
        this.courses = courses;
    }


    public String toString() {
       String res = super.toString() + "\ncourses:";
       for(int i = 0; i < courses.length; i++){
          res += "\n" + courses[i];
       }
       return res;
    }
}
