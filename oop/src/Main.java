import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Student kunal = new Student();
        Student rahul = new Student();

        kunal.greeting();

     //   kunal.rno = 13;
      //  kunal.name = "Kunal Kushwaha";
       // kunal.marks = 99.5f;

      //  System.out.println(kunal.rno);
      //  System.out.println(kunal.name);
       // System.out.println(kunal.marks);



    }
}


class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello, my name is " + this.name);
    }

    Student() {
        this.rno = 13;
        this.name = "Kunal";
        this.marks = 88.5f;


    }
}


