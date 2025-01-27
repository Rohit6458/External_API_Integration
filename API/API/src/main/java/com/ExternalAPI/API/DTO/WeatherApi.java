package com.ExternalAPI.API.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
public class WeatherApi {
    private Location location;
    private Current current;

    @Getter
    @Setter
    @ToString
    public static class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String tz_id;

        @JsonProperty("localtime_epoch")
        private long localtimeEpoch;

        private String localtime;
    }

    @Getter
    @Setter
    @ToString
    public static class Current {
        @JsonProperty("last_updated_epoch")
        private long lastUpdatedEpoch;

        @JsonProperty("last_updated")
        private String lastUpdated;

        @JsonProperty("temp_c")
        private double tempC;

        @JsonProperty("temp_f")
        private double tempF;

        @JsonProperty("is_day")
        private int isDay;

        private Condition condition;

        @JsonProperty("wind_mph")
        private double windMph;

        @JsonProperty("wind_kph")
        private double windKph;

        @JsonProperty("wind_degree")
        private int windDegree;

        @JsonProperty("wind_dir")
        private String windDir;

        @JsonProperty("pressure_mb")
        private int pressureMb;

        @JsonProperty("pressure_in")
        private double pressureIn;

        @JsonProperty("precip_mm")
        private double precipMm;

        @JsonProperty("precip_in")
        private double precipIn;

        private int humidity;
        private int cloud;

        @JsonProperty("feelslike_c")
        private double feelsLikeC;

        @JsonProperty("feelslike_f")
        private double feelsLikeF;

        @JsonProperty("windchill_c")
        private double windChillC;

        @JsonProperty("windchill_f")
        private double windChillF;

        @JsonProperty("heatindex_c")
        private double heatIndexC;

        @JsonProperty("heatindex_f")
        private double heatIndexF;

        @JsonProperty("dewpoint_c")
        private double dewPointC;

        @JsonProperty("dewpoint_f")
        private double dewPointF;

        @JsonProperty("vis_km")
        private double visibilityKm;

        @JsonProperty("vis_miles")
        private double visibilityMiles;

        private double uv;

        @JsonProperty("gust_mph")
        private double gustMph;

        @JsonProperty("gust_kph")
        private double gustKph;
    }

    @Getter
    @Setter
    @ToString
    public static class Condition {
        private String text;
        private String icon;
        private int code;
    }
}
