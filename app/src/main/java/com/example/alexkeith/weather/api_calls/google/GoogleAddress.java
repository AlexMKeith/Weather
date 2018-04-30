package com.example.alexkeith.weather.api_calls.google;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GoogleAddress {

    @SerializedName("results")
    private List<Results> mResultsList;

    public List<Results> getmResultsList() {
        return mResultsList;
    }
    class Results {
        @SerializedName("formatted_address")
        private String mAddressName;

        @SerializedName("geometry")
        private Geometry mGeometry;

        public String getmAddressName() {
            return mAddressName;
        }

        public Geometry getmGeometry() {
            return mGeometry;
        }
        class Geometry {
            @SerializedName("location")
            private GoogleLocation mGoogleLocation;

            public GoogleLocation getmGoogleLocation() {
                return mGoogleLocation;
            }
            class GoogleLocation {
                @SerializedName("lat")
                private double latitude;

                @SerializedName("lng")
                private double longitude;

                public double getLatitude() {
                    return latitude;
                }

                public double getLongitude() {
                    return longitude;
                }
            }
        }
    }
}
