package com.example.alexkeith.weather.api_calls.dark_sky;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather implements Parcelable{

    @SerializedName("latitude")
    private double latitude;

    @SerializedName("longitude")
    private double longitude;

    @SerializedName("currently")
    private CurrentProperties mCurrentProperties;

    @SerializedName("daily")
    private DailyProperties mDailyProperties;

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public CurrentProperties getmCurrentProperties() {
        return mCurrentProperties;
    }

    public DailyProperties getmDailyProperties() {
        return mDailyProperties;
    }
    class CurrentProperties {
        @SerializedName("summary")
        private String summary;

        @SerializedName("icon")
        private String icon;

        @SerializedName("temperature")
        private double temperature;

        public String getSummary() {
            return summary;
        }

        public String getIcon() {
            return icon;
        }

        public double getTemperature() {
            return temperature;
        }
    }
    class DailyProperties {
        @SerializedName("data")
        private List<DailyData> mDailyDataList;

        public List<DailyData> getDailyDataList() {
            return mDailyDataList;
        }
        class DailyData {
            @SerializedName("temperatureLow")
            private double temperatureLow;

            @SerializedName("temperatureHigh")
            private double temperatureHigh;

            @SerializedName("precipProbability")
            private double precipProbability;

            public double getTemperatureLow() {
                return temperatureLow;
            }
        }
    }

    protected Weather(Parcel in) {
        latitude = in.readDouble();
        longitude = in.readDouble();
    }
    public static final Creator<Weather> CREATOR = new Creator<Weather>() {
        @Override
        public Weather createFromParcel(Parcel in) {
            return new Weather(in);
        }

        @Override
        public Weather[] newArray(int size) {
            return new Weather[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(latitude);
        dest.writeDouble(longitude);

    }
}
