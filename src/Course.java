public class Course {
    private String name;
    private String[] students = new String[20];
    private int count = 0;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getCount() {
        return count;
    }

    public void addStudent(String name) {
        students[count] = name;
        count++;
    }

    public void removeStudent(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i] == name) {
                found = true;
                for (int j = i + 1; j < count; j++) {
                    students[j - 1] = students[j];
                }
                count--;
                System.out.println("Student \"" + name + "\" removed!");
            }
        }
        if (!found) {
            System.out.println("Student \"" + name + "\" not existed in list, nothing removed!");
        }
    }
}
