package Constructor.TriAngle;

public class TriAngle {
    private int base;
    private int height;
    public void setHeight(int b){
        base = b;
    }
    public int getHeight(){
        return height;
    }
    public void setBase(int h){
        height = h;
    }
    public int getBase(){
        return base;
    }
    public TriAngle(){

    }
    public TriAngle(int b, int h){
        base = b;
        height = h;
    }
    public int S(int b,int h){
        return (b * h) / 2;
    }
}
