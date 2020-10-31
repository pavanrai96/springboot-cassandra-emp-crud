package com.pavan;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.cassandra.mapping.Table;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalDate {

    private long millisSinceEpoch;
    private int daysSinceEpoch;
    private int month;
    private int year;
    private int day;

    public LocalDate() {
    }

    public LocalDate(long millisSinceEpoch, int daysSinceEpoch, int month, int year, int day) {
        this.millisSinceEpoch = millisSinceEpoch;
        this.daysSinceEpoch = daysSinceEpoch;
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public long getMillisSinceEpoch() {
        return millisSinceEpoch;
    }

    public void setMillisSinceEpoch(long millisSinceEpoch) {
        this.millisSinceEpoch = millisSinceEpoch;
    }

    public int getDaysSinceEpoch() {
        return daysSinceEpoch;
    }

    public void setDaysSinceEpoch(int daysSinceEpoch) {
        this.daysSinceEpoch = daysSinceEpoch;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
