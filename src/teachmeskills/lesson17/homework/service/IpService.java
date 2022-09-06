package teachmeskills.lesson17.homework.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpService {
    public boolean checkValidIp(String ip) {
        Pattern pattern = Pattern.compile("(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?" +
                "[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.");

        Matcher matcher = pattern.matcher(ip);

        return matcher.matches();
    }

    public String inputIp() {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }
}
