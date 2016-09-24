/**
 * Created by drkomp on 24.09.2016.
 */
public class TestingClass {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0]= new Person("Coach Bob", 27, "M");
        persons[1]=new Student("Lynne Brooke", 16, "F","HS95129",3.5);
        persons[2]=new Teacher("Duke Java",34,"M",50000.0,"Computer Science");
        persons[3]=new CollegeStudent("Imma Frosh",18,"F","UCB123",4.0,1,"English");
        for (Person person:persons
             ) {
            System.out.println( person.toString());

        }
    }
}
