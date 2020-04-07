import java.util.HashMap;

public class DataBaseCitizens {


    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        Passport passport = new Passport();

        HashMap <String, String> Citizens = new HashMap<>();

        for (int i = 0; i < citizen.name.length ; i++) {
            Citizens.put(passport.passportCode[i], citizen.name[i]);
        }

        System.out.println(Citizens.get("TT 23121"));
    }
}
