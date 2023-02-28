import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       List<User>users=new LinkedList<>();
       users.add(new User("Aibek",2005));
       users.add(new User("Asan",1999));
       users.add(new User("Uson",1998));
       users.add(new User("Malika",2006));
        System.out.println(users.stream().map(x -> 2023 - x.getYearOfBirth()).collect(Collectors.toList()));
        System.out.println(users.stream().map(
                x -> 2023 - x.getYearOfBirth() < 18 ? "меньше 18 лет" : "Больше 18 лет").collect(Collectors.toList()));
        System.out.println("Стольким людям есть 18 :"+users.stream().filter(x -> 2023 - x.getYearOfBirth() >= 18).count());
    }
}