public class Postion {
    private int xpos;
    private int ypos;

    public Postion(int x, int y){
        this.xpos = x;
        this.ypos = y;
    }


    public void setXpos(int xpos) {
        this.xpos = xpos;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public void setYpos(int ypos) {
        this.ypos = ypos;
    }

    public String toPrintString(){
        return Integer.toString(xpos) + Integer.toString(ypos);
    }

    public void add(Postion move) {
        xpos = xpos + move.getXpos();
        ypos = ypos + move.getYpos();
    }
}
