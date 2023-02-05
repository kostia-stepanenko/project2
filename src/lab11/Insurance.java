package lab11;

public  class Insurance {
    private static int id;
    private int number;
    private String firstName;
    private String lastName;
    private String address;
    protected long amountPerPeriod = 13;
    protected String frequency;
    private double sum;

    public Insurance(String firstName,String lastName,
                     String address){

        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
frequency= String.valueOf(1);

    }
    public Insurance(String firstName,String lastName,
                     String address,String frequency){

        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.frequency=frequency;
    }

    public String getFrequency() {
        return frequency;
    }

    public double getSum() {
        return sum;
    }



    @Override
    public String toString() {
        return "Insurance{" +
                "number=" + number +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", amountPerPeriod=" + amountPerPeriod +
                ", frequency='" + frequency + '\'' +
                ", sum=" + sum +
                '}';
    }

    public void computeAmountPerPeriod(){
        if (Integer.valueOf(frequency) == 3){
            amountPerPeriod = (long) (amountPerPeriod+( sum/100*2));
        }
        if (Integer.valueOf(frequency)== 6){
            amountPerPeriod = (long)(amountPerPeriod +(sum/100*5));
        }
        System.out.println("amount per period for insurance is "+amountPerPeriod);
    }
    public void computeSum(){

      sum = amountPerPeriod*Integer.valueOf(frequency);
      if (frequency==null){
          sum = amountPerPeriod;
      }
        System.out.println(" sum of insurance is "+ sum);
    }



    public static void main(String[] args) {
        Insurance AccidentInsurance = new Insurance("Max","Johnson",
                "French bulvar 23/5","6");
Insurance LifeInsurance = new Insurance("Alex","Maverick","Independence street 58");

        AccidentInsurance.computeSum();
        AccidentInsurance.computeAmountPerPeriod();
        System.out.println(AccidentInsurance);


LifeInsurance.computeAmountPerPeriod();
        LifeInsurance.computeSum();
        System.out.println(LifeInsurance);

    }
}
