public class Association {
 
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Bhavadharani");
        Teacher teacher2 = new Teacher("LuciferV5FridayStar");
        
        Student student1 = new Student("Nomura");
        Student student2 = new Student("Aizawa");
        Student student3 = new Student("Yoshikawa");
        Student student4 = new Student("Uehara");
        
        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher1.addStudent(student3);
        
        teacher2.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        
        teacher1.print();
        teacher2.print();
        student1.print();
        student2.print();
        student3.print();
        student4.print();
    }
}
 
/*
Output:
------ 
Teacher Bhavadharani ma'am students are:
- GowthamRam
- Anirudh SAS
- Kumar
Teacher LuciferV5FridayStar students are:
-Ajay_bj
-MukeshKarthikeyan 
- KishoreSingle
Student GowthamRam's teachers are:
- Bhavadharani
Student AnirudhSAS's teachers are:
- Bhavadharani
- Lucifer
Student Kumar's teachers are:
- Bhavadharani
- LuciferV5FridayStar
Student KishoreSingle's teachers are:
- LuciferV5FridayStar
*/
