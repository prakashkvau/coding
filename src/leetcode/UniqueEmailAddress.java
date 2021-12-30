package leetcode;

import java.util.Arrays;
import java.util.Objects;

public class UniqueEmailAddress {

    public static int numUniqueEmails(String[] emails) {
        return (int) Arrays.stream(emails).map((String email) -> {
           String[] parts = email.split("@");
            System.out.println(Arrays.toString(parts));
           if (parts.length !=2) {
               return null;
           }
            return parts[0].replace(".", "").split("\\+")[0]  + "@"+ parts[1];
        }).filter(Objects::nonNull).distinct().count();

    }

    public static void main(String[] args) {
        String[] emails = new String[]{"a@leetcode.@com","a.+hello@leetcode.com","c@leetcode.com"};
        System.out.println(UniqueEmailAddress.numUniqueEmails(emails));

    }
}
