public class Elderly extends Passenger{
    private int personalDiscount = (isDisabled()?35:15);
    public Elderly(String name , String surname,int age,String IIN,String disabled ,int idOfVagon,Train train) {
        super(name, surname, age,IIN,disabled,idOfVagon,train);
    }
    public Elderly(String name , String surname,int age,String IIN,String disabled ,int idOfVagon,Train train,int seat){
        super(name, surname, age,IIN,disabled,idOfVagon,train,seat);
    }
    @Override
    public int getPersonalDiscount(){
        return personalDiscount;
    }
}
