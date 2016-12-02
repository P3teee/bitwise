/**
 * Created by bepe14 on 2016-11-25.
 */
public class bitwise {
    private short coord;

    public bitwise(int x, int y) {
        coord = 0;
        setHigh(x);
        setLow(y);
    }

    public void setHigh(int x) {
        coord = (short)((coord & 0xFF) | (x<<8));
    }

    public void setLow(int y) {
        coord = (short)((coord & 0xFF00) | y);
    }

    public int getHigh() {
        return ((coord>>>8)&0x000000FF);
    }

    public int getLow(){
        return (coord & 0xFF);
    }

    public static void main(String[] args) {
        bitwise test = new bitwise(200, 200);
        System.out.println("x = " + test.getHigh() + ", y = " + test.getLow());
    }
}
