package task1;

public class Bicycle {
    private int frameSize;
    private String frameMaterial;
    
    public double getFrameCost(){
        return 0;   //set method in child classes
    }

    public int getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(int frameSize) {
        if(frameSize < 10 || frameSize > 68){
            throw new IllegalArgumentException("That is not a valid frame size");
        }
        this.frameSize = frameSize;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        if(frameMaterial != null || frameMaterial.isEmpty()){
            throw new IllegalArgumentException("cannot be left blank");
        }
        this.frameMaterial = frameMaterial;
    }
    
    
}
