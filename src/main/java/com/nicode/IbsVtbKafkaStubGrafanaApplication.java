package com.nicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class IbsVtbKafkaStubGrafanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbsVtbKafkaStubGrafanaApplication.class, args);
		long startTime = System.currentTimeMillis(); // Фиксируем время старта

		while (true) {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			long elapsedTime = System.currentTimeMillis() - startTime; // Вычисляем прошедшее время
			System.out.println("Прошло времени: " + formatTime(elapsedTime));
		}
	}

	// Метод для форматирования времени (часы, минуты, секунды)
	private static String formatTime(long millis) {
		long hours = TimeUnit.MILLISECONDS.toHours(millis);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
		long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

}
