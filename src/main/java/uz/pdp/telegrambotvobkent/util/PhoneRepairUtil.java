package uz.pdp.telegrambotvobkent.util;

public class PhoneRepairUtil {
    public static String repairPhone(String phone) {
        phone = phone.replaceAll(" ", "");
        phone = phone.startsWith("+") ? phone : "+" + phone;
        return phone;
    }
}
