package main.java.com.iquest.validate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        List<String> passwords = new ArrayList<>();
        List<String> phoneNumbers = new ArrayList<>();

        emails.add("uursu.adrian@gmail.com");
        emails.add("mircea.cel.batran@gmail.co.uk");
        emails.add("user23@domain.co");
        emails.add("adrian#gmail.com");
        emails.add("@gmail.com");
        emails.add("adrian1337@@gmail.com");

        passwords.add("adrianursu@");
        passwords.add("adrianursU@:+>");
        passwords.add("ADRIANURSU@");
        passwords.add("ADRIANURSu");

        phoneNumbers.add("+40 123 456 7890");
        phoneNumbers.add("123 456 7890");
        phoneNumbers.add("0040 123.456.7890");
        phoneNumbers.add("123-456-7890");
        phoneNumbers.add("+0040 123.456.7890");



        String emailRegex = "^([A-Za-z0-9.]+)@([\\w]+)((\\.(\\w){2,3})+)$";
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[: !#$%&'()*+,-./:;<=>?@\\^_`{|}~])[A-Za-z !\\#$%&'()*+,-./:;<=>?@\\]^_`{|}~]{10,}$";
        String phoneRegex = "^(\\+\\d{1,3}\\s)?(\\d{1,4}\\s)?\\(?\\d{3}\\)?([\\s.-]\\d{3}[\\s.-]\\d{4})$";


        Pattern patternEmail = Pattern.compile(emailRegex);
        Pattern patternPass = Pattern.compile(passRegex);
        Pattern patternPhone = Pattern.compile(phoneRegex);

        for (String email : emails) {
            Matcher matcher = patternEmail.matcher(email);
            if (matcher.matches()) {
                System.out.println("email " + email + " [VALID] ");
            } else {
                System.out.println("email " + email + " [IS NOT VALID]");
            }
        }

        System.out.println("_________________________________________________");
        for (String pass : passwords) {
            Matcher matcher = patternPass.matcher(pass);
            if (matcher.matches()) {
                System.out.println("password " + pass + " [VALID] ");
            } else {
                System.out.println("password " + pass + " [IS NOT VALID]");
            }
        }

        System.out.println("_________________________________________________");
        for (String phoneNrs : phoneNumbers) {
            Matcher matcher = patternPhone.matcher(phoneNrs);
            if (matcher.matches()) {
                System.out.println("Phone number " + phoneNrs + " [VALID] ");
            } else {
                System.out.println("Phone number " + phoneNrs + " [IS NOT VALID]");
            }
        }
    }
}
