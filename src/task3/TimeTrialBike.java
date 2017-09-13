package task3;

public class TimeTrialBike extends RoadBike {
    private int FRAME_MAT_CARBON = 1000;
    private int FRAME_MAT_ALUMINUM = 300;
    
    @Override
    public int getFrameCost(){
        int cost;
        
        if(this.getFrameMaterial().equalsIgnoreCase("Carbon")){
            cost = FRAME_MAT_CARBON;
        }
        else{
            cost = FRAME_MAT_ALUMINUM;
        }
        
        return cost;
    }
}
