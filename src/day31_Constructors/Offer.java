package day31_Constructors;

public class Offer {
    public String location;
    public String companyName;
    public String jobTitle;
    public int salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWHF;
    public boolean isFullTime;

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=$" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWHF=" + isWHF +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTO, boolean isWHF, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWHF = isWHF;
        this.isFullTime = isFullTime;
    }
}
