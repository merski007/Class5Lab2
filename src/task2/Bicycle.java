package task2;

public abstract class Bicycle {
    private int frameSize;
    private String frameMaterial;
    
    public abstract int getFrameCost();

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
        if(frameMaterial == null || frameMaterial.isEmpty()){
            throw new IllegalArgumentException("cannot be left blank");
        }
        this.frameMaterial = frameMaterial;
    }
}
