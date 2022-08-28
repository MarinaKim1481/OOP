package OOP;

public class birthYear {
    private String birthYear;

    public birthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthName(String birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "{" + birthYear + "}";
    }
}