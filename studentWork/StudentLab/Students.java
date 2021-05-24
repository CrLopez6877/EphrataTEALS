package studentWork;

public class student {
    private String name; 
    private int studentNumber;
    private String[] classSchedule;
    
    public Student(String studentName, int studentID) {
        name = studentName;
        studentNumber = studentID;
        classSchedule = new String[7];
        Arrays.fill(classSchedule, "Free");
    }
    public void updateSchedule(int period, String className) {
        classSchedule[(period - 1)] = className;


    }
    public void studentReport() {
        System.out.println(name + "-" + studentNumber);
        for (int i = 0; i < 7; i++) {
            System.out.println("Period" + i + ": " + classSchedule[i]); 

            }
    }
    public static void main(String []args) {

        Student James = new Student("James", 90210);
        Student Marzia = new Student("Crystal, 47302");
        James.updateSchedule(1, "Gym");
        James.updateSchedule(2, "Shop");
        James.updateSchedule(3, "Math");
        James.updateSchedule(4, "Civics");
        James.updateSchedule(5, "English");
        James.updateSchedule(6, "Band");
        James.updateSchedule(7, "History");
        Marzia.updateSchedule(1, "Robotics");
        Marzia.updateSchedule(2, "Math");
        Marzia.updateSchedule(3, "English");
        Marzia.updateSchedule(4, "History");
        Marzia.updateSchedule(5, "Welding");
        Marzia.updateSchedule(6, "Science");
        Marzia.updateSchedule(7, "Physics");
        James.studentReport();
        Marzia.studentReport();
    }
}
