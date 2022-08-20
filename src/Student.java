import java.util.ArrayList;

class Student <T> {
T thingToPrint;


public Student(T thingToPrint){
    this.thingToPrint = thingToPrint;
}

public void print(){
    System.out.println(thingToPrint);

}

    public static void main(String[] args) {
        Student<String> letsPrint = new Student<>("hello");
        letsPrint.print();
    }
}