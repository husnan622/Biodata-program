/**
 * 
 * @author Husnan
 * @version 11 Oktober 2020
 */

public class MemberAccessTest {
    public static void main(String[] args) {
        Time1 time = new Time1();

        time.hour = 7; // Error: hour has private access in Time1
        time.minute = 15; // Error: minute has private access in Time1
        time.second = 30; // Error: second has private access in Time1
    }
}