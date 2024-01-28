import java.time.LocalDate;
import java.time.Year;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge(){
        Year currentYear = Year.now();  //// Get the current year using the Year class
        int year = currentYear.getValue();
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (year-birthYear);
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

