package pack00_x;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class 샌드백 {
    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();

        // 날짜와 시간 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 포맷에 맞게 출력
        String formattedDateTime = now.format(formatter);
        System.out.println("현재 날짜와 시간: " + formattedDateTime);

        // 현재 년도 출력
        int year = now.getYear();
        System.out.println("현재 년도: " + year);

        // 현재 시간 출력
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println("현재 시간: " + hour + ":" + minute + ":" + second);
    }
}
