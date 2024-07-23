package Practice_Lecture_LearnJava_QE_Winter2022_.learnJava_06_oop.abstraction;

public abstract class FlyingCar extends ModernCar {

    // abstract class allows abstract and regular classes methods also
    public abstract void boostEngine();
    public abstract void flyingFeature();
    public abstract void airBag();
    public abstract void sensor();

    public  void flyingCarInformation(){
        System.out.println("Flying car Information");
    }



}
