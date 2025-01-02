package com.pms.genesis.common;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class GenesisDateUtils {

    // Define common date formats
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    public static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    public static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private GenesisDateUtils() {
        // Prevent instantiation
    }

    // Convert LocalDate to String
    public static String formatDate(LocalDate date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return date.format(formatter);
    }

    // Convert LocalDateTime to String
    public static String formatDateTime(LocalDateTime dateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return dateTime.format(formatter);
    }

    // Parse String to LocalDate
    public static LocalDate parseDate(String date, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(date, formatter);
    }

    // Parse String to LocalDateTime
    public static LocalDateTime parseDateTime(String dateTime, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDateTime.parse(dateTime, formatter);
    }

    // Get current date
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    // Get current time
    public static LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    // Get current date and time
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    // Add days to a date
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    // Subtract days from a date
    public static LocalDate subtractDays(LocalDate date, int days) {
        return date.minusDays(days);
    }

    // Calculate difference in days between two dates
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    // Convert java.util.Date to LocalDateTime
    public static LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    // Convert LocalDateTime to java.util.Date
    public static Date convertToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    // Get start of the day for a given date
    public static LocalDateTime getStartOfDay(LocalDate date) {
        return date.atStartOfDay();
    }

    // Get end of the day for a given date
    public static LocalDateTime getEndOfDay(LocalDate date) {
        return date.atTime(LocalTime.MAX);
    }


}