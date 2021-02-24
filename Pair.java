/**
 * Created by USER on 24/02/2021.
 */
public class Pair<A,B> {
    A first;
    B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {
        Pair<String,Integer> BookPair=new Pair<>("book1",123);
        String x=(String)BookPair.getFirst();
        int y=(int) BookPair.getSecond();
        System.out.println(BookPair);
        Student s1=new Student("Hadeel",21,666);
        Student s2=new Student("Eman",20,543);
        Pair<Student,Student> s=new Pair<>(s1,s2);
        System.out.println(s);
    }
}

