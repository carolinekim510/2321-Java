package Program12;

public class HourlyEmployee extends Employee {

    private double regularHour;
    private double overTime;
    double payRate;
    double grossPay;
    double netAmount;

    public HourlyEmployee(String firstName, String lastName, double payRate, double regularHour, double overTime) {
        super(firstName, lastName, payRate, (regularHour + overTime));

        this.regularHour = regularHour;
        this.overTime = overTime;
        this.payRate = payRate;
    }

    public double getRegularHour() {
        return regularHour;
    }

    public double getOverTime() {
        return overTime;
    }

    public double getGrossPay() {
        grossPay = (regularHour * payRate) + (overTime * payRate * 1.5);
        return grossPay;
    }

    public double getTaxAmount() {

        double gross = getGrossPay();
        double taxAmount;

        if (gross <= 2000)
            taxAmount = .10;
        else if (gross <= 3500)
            taxAmount = .15;
        else if (gross <= 6000)
            taxAmount = .28;
        else if (gross <= 10000)
            taxAmount = .31;
        else
            taxAmount = .36;

        return taxAmount;
    }

    public double getNetAmount() {
        netAmount = getGrossPay() - getTaxAmount();
        return netAmount;
    }

    @Override
    public String toString() {
        return (super.toString() + String.format("\n\n%-30s %8.1f \n%-30s %8.1f "
                        + "\n%-30s $%8.2f \n%-30s $%8.2f \n%-30s $%8.2f \n%-30s $%8.2f \n%-30s $%8.2f",
                "Total Regular Hours Worked: ", getRegularHour(),
                "Total Overtime Hours Worked: ", getOverTime(),
                "Monthly Regular Pay: ", regularHour * payRate,
                "Monthly Overtime pay: ", overTime * payRate * 1.5,
                "Monthly Gross Pay: ", getGrossPay(),
                "Monthly Taxes: ", getTaxAmount(),
                "Monthly Net Pay: ", getNetAmount()));
    }
}