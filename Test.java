/**
 * Created by USER on 24/02/2021.
 */
public class Test {
    public static void main(String[] args) {
        Person p1;
        Student s1=new Student("Hadeel",21,666)  ;
        p1=s1;//widening cast
        System.out.println(p1);
        Person p2=new Student("Eman",20,543);
        if(p2 instanceof Student)//handling cast exception
        {
            Student s2=(Student)p2;//narrowing cast
            System.out.println(s2);
        }

    }
}
