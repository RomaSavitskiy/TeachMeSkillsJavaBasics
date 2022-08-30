package teachmeskills.lesson11;

import teachmeskills.lesson11.exception.WrongLoginException;
import teachmeskills.lesson11.exception.WrongPasswordException;
import teachmeskills.lesson11.service.DataService;

public class Main {
    public static void main(String[] args) {
        DataService dataService = new DataService();

        try {
            DataService.checkAccountData("123e123e123e", "dsa9sa", "dsa9s a");
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
}
