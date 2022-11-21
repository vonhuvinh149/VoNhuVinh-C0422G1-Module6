public class OCA_3 {
    String type = "4w";
    int maxSpeed = 100;

    public OCA_3(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

}


class Car extends OCA_3 {

    String trans;

    public Car(String trans) {
        this.trans = trans;
    }

    public Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed);
        this(trans);
    }
public static void main(String[]args){
    Car c1=new Car("auto");
    Car c2=new Car("2ww",150,"mana");
    System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
    System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
}
};



