package teachmeskills.lesson11.service;

import teachmeskills.lesson11.exception.WrongLoginException;
import teachmeskills.lesson11.exception.WrongPasswordException;

public class DataService {
    public static boolean checkAccountData(final String login, final String password, final String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        String symbolSpace = " ";
        int loginLength = login.length();

        if (loginLength > 19 | login.contains(symbolSpace)) {
            throw new WrongLoginException("Incorrect login data");
        }

        int passwordLength = password.length();

        if (passwordLength > 19 | password.contains(symbolSpace)) {
            throw new WrongLoginException("Incorrect password data");
        }

        char[] arrayChar = password.toCharArray();
        boolean flag = false;

        for (int i = 0; i < passwordLength; i++) {
            if (((int)password.charAt(i) > 47) & ((int)password.charAt(i) < 59)) {
                flag = true;
            }
        }

        if (!flag) {
            throw new WrongPasswordException("Incorrect password data");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password data");
        }

        return true;
    }
}
