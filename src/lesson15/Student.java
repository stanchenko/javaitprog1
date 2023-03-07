package lesson15;

import java.util.logging.SocketHandler;

public class Student extends Person {
       public int course = 1;

       public Student (int height, String name, int course) {
           super(height, name);
           this.course = course;
       }

    public void tell () {
        System.out.println(super.height+" "+super.name+" "+course);

    }

}
