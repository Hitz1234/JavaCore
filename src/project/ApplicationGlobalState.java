package lesson7.project;

public final class ApplicationGlobalState {

    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "7Memrvzk08r1uhi0kz5gbw9b1poCDMTp";

    private ApplicationGlobalState() {
    }

    // Непотокобезопасный код для упрощения
    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }

    public String getSelectedCity() {
        return selectedCity;
    }

    public void setSelectedCity(String selectedCity) {
        this.selectedCity = selectedCity;
    }

    public String getApiKey() {
        return this.API_KEY;
    }
}
