package chapter5;

public class PersonTest {
    public static void main(String []args)
    {
        Person[] people=new Person[2];
        people[0]=new Employee("Jack",40000,1997,3,1);
        people[1]=new Student("Bob","math");
        for(Person p:people)
            System.out.println(p.getName()+","+p.getDescription()+","+p.toString());
    }
}
