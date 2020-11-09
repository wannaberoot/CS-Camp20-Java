package com.company;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// LocalDate: (YYYY-MM-DD) tarihi veriyor
// LocalTime: Saati (HH-MM-SS-NS)
// LocalDateTime: Tarihi ve saati veriyor (YYYY-MM-DD-HH-MM-SS-NS)
// DateTimeFormatter: Saat ve tarih gösteren objelerin görüntüsünün formatlanmasını sağlıyor.

public class Main {

    public static void main(String[] args) {
	    LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(LocalDateTime.now());
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter myFormatterObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(myFormatterObj);
        System.out.println(formattedDateTime);


    }
}
