public class TestStaticmethod {
    public static void main(String[] args) {
        Student.change();

    Student s1 = new Student(123,"Hiep");
    Student s2 = new Student(143,"Hoang");
    Student s3 = new Student(164,"Hieu");
     s1.display();
     s2.display();
     s3.display();
}
}