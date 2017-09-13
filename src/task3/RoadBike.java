package task3;

public class RoadBike implements Bicycle {
    private int frameSize;
    private String frameMaterial;
    
    @Override
    public int getFrameCost(){
        return 0;   //set method in child classes
    }

    @Override
    public int getFrameSize() {
        return frameSize;
    }

    @Override
    public void setFrameSize(int frameSize) {
        if(frameSize < 10 || frameSize > 68){
            throw new IllegalArgumentException("That is not a valid frame size");
        }
        this.frameSize = frameSize;
    }

    @Override
    public String getFrameMaterial() {
        return frameMaterial;
    }

    @Override
    public void setFrameMaterial(String frameMaterial) {
        if(frameMaterial == null || frameMaterial.isEmpty()){
            throw new IllegalArgumentException("cannot be left blank");
        }
        this.frameMaterial = frameMaterial;
    }
}
