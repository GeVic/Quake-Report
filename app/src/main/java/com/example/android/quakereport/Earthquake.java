package com.example.android.quakereport;

/**
 * Created by GeVic on 15-06-2018.
 */

public class Earthquake {
    private double mmagnitude;
    private String mplace;
    private String mdate;
    private String url;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /**
     *
     * @param magnitude
     * @param place
     * @param time
     * @param url
     */
    public Earthquake(double magnitude, String place, long time, String url){
        mmagnitude = magnitude;
        mplace = place;
        mTimeInMilliseconds = time;
        this.url = url;
    }

    /**
     * Get the name of the magnitude
     */
    public double getMagnitude() {
        return mmagnitude;
    }

    /**
     * Get the place
     */
    public String getPlace() {
        return mplace;
    }

    /**
     * Get the Date
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Get the name of the magnitude
     */
    public String getUrl() {
        return url;
    }
}
