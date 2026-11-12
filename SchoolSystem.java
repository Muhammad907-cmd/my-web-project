class Student {
    String name;
    int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public void displayInfo() {
        System.out.println("اسم الطالب: " + name + " | الصف الدراسي: " + gradeLevel);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        System.out.println("--- أهلاً بك في نظام إدارة المدرسة ---");
        
        // إنشاء بيانات طلاب كمثال
        Student student1 = new Student("أحمد محمد", 2);
        Student student2 = new Student("سارة خالد", 3);

        // عرض معلومات الطلاب
        student1.displayInfo();
        student2.displayInfo();
    }
}
