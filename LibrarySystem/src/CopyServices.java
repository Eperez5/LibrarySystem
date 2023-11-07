
public class CopyServices {
    private int bw;
    private int color;
    
    CopyServices(int bw,int color){
        this.bw = bw;
        this.color = color;
    }
    
    public double paperPrinter(){
        double cost = 0;
        cost = cost + (.25*bw);
        cost = cost + (.50*color);
        return cost;
    }
}