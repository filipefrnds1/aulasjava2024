package javacompletoexer;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ExerDatas {

	public static void main(String[] args) {
		
		LocalDate t01 = LocalDate.now();
		LocalDateTime t02 = LocalDateTime.now();
		Instant t03 = Instant.now();
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.of("Brazil/East"));
		DateTimeFormatter dtf4 = DateTimeFormatter.ISO_INSTANT;
		
		
		LocalDate t04 = LocalDate.parse("2024-08-12");
		LocalDate t05 = LocalDate.parse("08/12/1990", dtf1);
		LocalDateTime t06 = LocalDateTime.parse("2024-08-12T03:08:05");
		LocalDateTime t07 = LocalDateTime.parse("08/12/1990 03:12", DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm"));
		
		Instant t08 = Instant.parse("1990-08-12T03:29:01-03:00");
		Instant t09 = Instant.parse("1990-08-12T21:49:01+03:00");
		Instant t10 = Instant.parse("1990-09-12T01:50:01Z");
		
		LocalDate r1 = LocalDate.ofInstant(t10, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(t10, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(t10, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(t10, ZoneId.of("Portugal"));
		
		
		
		
		System.out.println("t01 = " + t01);
		System.out.println("t02 = " + t02);
		System.out.println("t03 = " + t03.toString());
		System.out.println("t04 = " + t04);
		System.out.println("t05 = " + t05);
		System.out.println("t05 = " + t05.format(dtf1));
		System.out.println("t06 = " + t06);
		System.out.println("t07 = " + t07);
		System.out.println("t07 = " + t07.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		System.out.println("t08 = " + t08);
		System.out.println("t08 with Formatter = " + dtf2.format(t08));
		System.out.println("t09 with Formatter = " + dtf3.format(t09));
		System.out.println("t10  = " + t10);
		System.out.println("t10 with Formatter = " + dtf2.format(t10));
		System.out.println("t10 with Formatter ISO_INSTANT = " + dtf4.format(t10));
		System.out.println("-------------------------------");
		System.out.println("R1 = " + r1);
		System.out.println("R2 = " + r2);
		System.out.println("R3 = " + r3);
		System.out.println("R4 = " + r4);
		System.out.println("----------------------------------------");
		System.out.println("t04 dia = " + t04.getDayOfMonth());
		System.out.println("t04 dia do ano = " + t04.getDayOfYear());
		System.out.println("t04 mes = " + t04.getMonth());
		System.out.println("t04 mes = " + t04.getMonthValue());
		System.out.println("t04 ano = " + t04.getYear());
		System.out.println("t06 hora = " + t06.getHour());
	}

}
