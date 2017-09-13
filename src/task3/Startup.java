package task3;

public class Startup {
    public static void main(String[] args) {
        Bicycle b1 = new TimeTrialBike();
        Bicycle b2 = new RoadBike();
        
        b1.setFrameMaterial("Carbon");
        b1.setFrameSize(55);
        
        b2.setFrameMaterial("Aluminum");
        b2.setFrameSize(40);
        
        System.out.println("The frame material is "+b1.getFrameMaterial()+" and the size is "+b1.getFrameSize()+"cm");
        System.out.println(b1.getFrameCost());
        
        System.out.println("The frame material is "+b2.getFrameMaterial()+" and the size is "+b2.getFrameSize()+"cm");
        System.out.println(b2.getFrameCost());

    }
}
