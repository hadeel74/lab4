/**
 * Created by USER on 24/02/2021.
 */
public class OldPair {
    Object first;
    Object second;

    public OldPair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public void setFirst(Object first) {
        this.first = first;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "OldPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        OldPair  bookPair=new OldPair("book1",123);
        String x=(String)bookPair.getFirst();
        int y=(int) bookPair.getSecond();
        System.out.println(bookPair);
        OldPair prod=new OldPair("pen",30.50);
        System.out.println(prod);
        Student s1=new Student("Hadeel",21,666);
        Student s2=new Student("Eman",20,543);
        OldPair comp=new OldPair(s1,s2);
        System.out.println(comp);

    }
}
