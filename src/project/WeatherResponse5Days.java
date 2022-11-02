package lesson7.project;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class WeatherResponse5Days {

    @JsonProperty("DailyForecasts")
    public List<DailyData> dailyForecasts;

    public static class DailyData {

        @JsonProperty("Date")
        public String date;

        @JsonProperty("Temperature")
        public Temperature temperature;

        @JsonProperty("Day")
        public PeriodData day;

        @JsonProperty("Night")
        public PeriodData night;

        public String getDate() {
            return date;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public PeriodData getDay() {
            return day;
        }

        public PeriodData getNight() {
            return night;
        }
    }

    public static class Temperature {
        @JsonProperty("Minimum")
        public Metric minimum;

        @JsonProperty("Maximum")
        public Metric maximum;

        public Metric getMinimum() {
            return minimum;
        }

        public Metric getMaximum() {
            return maximum;
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

            @Override
            public String toString() {return String.format("%s%s", value, unit);}
        }
    }

    public static class PeriodData {
        @JsonProperty("IconPhrase")
        public String phrase;

        public String getPhrase() {
            return phrase;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        dailyForecasts.forEach(dailyData -> {
            str.append(String.format("В %s дата: %s, Днем: %s, Ночью: %s, Температура: от = %s, до = %s\n",
                    ApplicationGlobalState.getInstance().getSelectedCity(),
                    dailyData.date,
                    dailyData.day.phrase,
                    dailyData.night.phrase,
                    dailyData.temperature.minimum,
                    dailyData.temperature.maximum));
        });
        return str.toString();
    }
}
