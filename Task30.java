class Course{
    String courseName;
    int duration;
    double fee;
    Course(String courseName,int duration,double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourse(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration = "+duration);
        System.out.println("Fee = "+fee);
    }
}

public class Task30 {
    public static void main(String[] args) {
        Course c1 = new Course("Hari", 10, 10000);
        Course c2 = new Course("Kavya", 12, 100000);
        
        c1.displayCourse();
        c2.displayCourse();

    }
}
