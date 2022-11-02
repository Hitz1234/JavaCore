package lesson7.project;
import com.fasterxml.jackson.annotation.JsonProperty;



public class WeatherResponse {

    @JsonProperty("WeatherText")
    public String weatherText;

    @JsonProperty("Temperature")
    public Temperature temp;

    public String getWeatherText() {
        return weatherText;
    }

    public Temperature getTemp() {
        return temp;
    }
    public static class Temperature {

        @JsonProperty("Metric")
        public Metric metric;

        public Metric getMetric() {
            return metric;
        }
    }

    public static class Metric {

        @JsonProperty("Value")
        public Double value;

        @JsonProperty("Unit")
        public String unit;

        public Double getValue() {
            return value;
        }

        public String getUnit() {
            return unit;
        }
    }

    @Override
    public String toString() {
        return String.format("Погода: %s, Температура: %s %s", weatherText, temp.metric.value, temp.metric.unit);
    }
}
