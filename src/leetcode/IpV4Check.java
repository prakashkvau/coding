package leetcode;

public class IpV4Check {
    boolean isIPv4Address(String inputString) {
        String[] splits = inputString.split("\\.");
        for (String s: splits) {
            if (Integer.valueOf(s) < 0 || Integer.valueOf(s) > 255) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        IpV4Check ipV4Check = new IpV4Check();
        System.out.println(ipV4Check.isIPv4Address("172.365.245.1"));
    }
}
