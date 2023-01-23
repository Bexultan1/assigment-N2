abstract class Passenger {
    private int id;
    private String name;
    private String surname;
    private String IIN;
    private int age;
    private boolean disabled;
    private int idOfVagon;
    private Train train;
    private int seat;
    public Passenger(String name , String surname,int age,String IIN,String disabled ,int idOfVagon,Train train){
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.IIN = IIN;
        this.disabled = (disabled.equalsIgnoreCase("Y"));
        id = (train.getPassengers().size()==0?0:train.getPassengers().get(train.getPassengers().size()-1).id+1);
        this.train = train;
        this.idOfVagon = idOfVagon;
    }

    public Passenger(String name , String surname,int age,String IIN,String disabled ,int idOfVagon,Train train,int seat){
        this(name,surname,age,IIN,disabled,idOfVagon,train);
        train.getVagon(idOfVagon-1).seats()[seat-1] = true;
        this.seat = seat;
    }
    public void infoAboutPassenger(){
        System.out.println("ID : " + id + " || Full name : " + name + " " + surname + " || Age : " + age + " || IIN : " + IIN + " || " + train.getName()+  " :  place " + seat+" in " + idOfVagon + "("+ train.getVagon(idOfVagon-1).getType()+")" +" || He/She has a disability : " + (isDisabled()?"Yes":"No"));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public abstract int getPersonalDiscount();

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIIN() {
        return IIN;
    }

    public void setIIN(String IIN) {
        this.IIN = IIN;
    }
    public void setSeat(int seat){
        this.seat = seat;
    }

    public int getIdOfVagon(){
        return idOfVagon;
    }
    public int getSeat(){
        return seat;
    }
}
