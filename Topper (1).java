class Student
{
     String name;
     int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    static void topper(Student[] arr)
    {
        int max = arr[0].marks,k=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].marks>max) {
                max = arr[i].marks;
                k=i;
            }
        }
        System.out.println("Name: "+ arr[k].name);
        System.out.println("Marks: "+ arr[k].marks);
    }
}

public class Topper
{
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0] = new Student("Rajat Rajput",99);
        arr[1] = new Student("Sarthak Prajapati", 98);
        arr[2] = new Student("Kishna Tishna",95);

        Student.topper(arr);
    }
}
