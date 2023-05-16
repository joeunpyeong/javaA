package pack00_x;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ����� {
    public static void main(String[] args) {
        // ���� ��¥�� �ð� ��������
        LocalDateTime now = LocalDateTime.now();

        // ��¥�� �ð� ���� ����
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // ���˿� �°� ���
        String formattedDateTime = now.format(formatter);
        System.out.println("���� ��¥�� �ð�: " + formattedDateTime);

        // ���� �⵵ ���
        int year = now.getYear();
        System.out.println("���� �⵵: " + year);

        // ���� �ð� ���
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println("���� �ð�: " + hour + ":" + minute + ":" + second);
    }
}
