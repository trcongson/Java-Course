public class TestCourse {
    public static void displayCourse(Course course){
        System.out.println("Course \"" + course.getName() + "\"has" + course.getCount() + "student(s): {" );
        String[] students = course.getStudents();
        for (int i = 0; i < course.getCount(); i ++){
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        Course course = new Course("CodeGym");
        displayCourse(course);

        String son = "Sơn";
        course.addStudent(son);
        displayCourse(course);

        String thang = "Thắng";
        course.addStudent(thang);
        displayCourse(course);

        course.removeStudent(son);
        displayCourse(course);

        String tung = "Tùng";
        course.addStudent(tung);
        displayCourse(course);
    }
}
