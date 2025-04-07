public class Salesperson extends Employee {

    private double commmissionPercentage;

    public Salesperson (String name, int age,double salary, double commissionPercentage) {
        super(name, age, salary);
        this.commissionPercentage = commissionPercentage;
    }
    public double getCommissionpercentage() {
        return this.getCommissionpercentage();



    }
public void raiseCommission() {
    if( this.commissionPercentage < .30) {
        this.commissionPercentage = this.commissionPercentage * 1.2;
    }
}


  






}

    
