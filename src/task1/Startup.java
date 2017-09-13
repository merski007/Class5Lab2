package task1;

public class Startup {
    public static void main(String[] args) {
        Bicycle b1 = new TimeTrialBike();
        
        b1.setFrameMaterial("Carbon");
        b1.setFrameSize(55);
        
        System.out.println("The frame material is "+b1.getFrameMaterial()+" and the size is "+b1.getFrameSize()+"cm");
        System.out.println(b1.getFrameCost());
    }
}
