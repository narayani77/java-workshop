import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currenTime = LocalTime.now();
        LocalTime RegistrationTimeLeft = LocalTime.of(18, 15, 59);
        int hoursleft = RegistrationTimeLeft.getHour()-currenTime.getHour();
        int minleft = RegistrationTimeLeft.getMinute()-currenTime.getHour();
        int secleft = RegistrationTimeLeft.getSecond()-currenTime.getSecond();
        System.out.println("you have"+hoursleft+"hours"+minleft+"min"+secleft+"Secondleft");


    }

}
