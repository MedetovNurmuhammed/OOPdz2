import java.util.Arrays;
public class Main {
    public static void main(String[] args) {


        String[] ss = {"Java", "event"};
        MyClass m = new MyClass("Нурмухаммед", "Медетов", 20, new String[]{"Java", "event"}, "Манты");
        System.out.println(m.name + " " + m.surname  + " " + m.age + " Жашта  Peaksoftто откон сабактары: " + Arrays.toString(ss) + " Жакшы коргон тамагы :  " + m.food);
        MyClass myClass1 = new MyClass();
        myClass1.name = "Адилет";
        myClass1.surname = "Толомушев";
        myClass1.age = 21;
        String[] sab = new String[]{"Java", "Английский"};
        myClass1.sabak = sab;
        myClass1.food = "Шорпо";
        System.out.println(myClass1.name+" "+myClass1.surname+" "+myClass1.age+" "+Arrays.toString(sab)+" "+myClass1.food) ;
    }
}