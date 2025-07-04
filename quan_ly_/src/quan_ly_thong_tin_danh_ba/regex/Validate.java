package quan_ly_thong_tin_danh_ba.regex;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String EMPTY_REGEX = "^\\s*$";
    private static final String DEVICE_REGEX = "^MD-\\d{4}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9.%+-]+@[A-Za-z0-9.-]+(\\.[A-Za-z]{2,})+$";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String BIRTHDAY_REGEX = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";

//    ^[1-9]\d{2}-\d{3}-\d{4}
//^\(\d{3}\)\s\d{3}-\d{4}
//^[1-9]\d{2}\s\d{3}\s\d{4}
//^[1-9]\d{2}\.\d{3}\.\d{4}

    public static boolean isEmpty(String input) {
        Pattern pattern = Pattern.compile(EMPTY_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isValidDeviceId(String input) {
        Pattern pattern = Pattern.compile(DEVICE_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean isValidEmail(String input) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static boolean isValidPhone(String input) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static boolean isValidBirthday(String input) {
        try {
            LocalDate birthDate = LocalDate.parse(input, DATE_FORMAT);
            LocalDate today = LocalDate.now();

            // Ngày sinh phải trước ngày hiện tại
            if (birthDate.isAfter(today)) {
                return false;
            }

            // Tuổi phải >= 18
            int age = Period.between(birthDate, today).getYears();
            return age >= 18;
        } catch (DateTimeParseException e) {
            return false; // Định dạng không đúng hoặc lỗi parse
        }
    }

    public static boolean isValidNamSanXuat(int namSanXuat) {
        int namHienTai = Year.now().getValue();
        return namSanXuat >= 1900 && namSanXuat <= namHienTai;
    }

    public static boolean isPositive(Double number) {
        return number > 0;
    }

    public static boolean isWithinRange(int number, int min, int max) {
        return number >= min && number <= max;
    }
}
