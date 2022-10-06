package Växthotell;

public abstract class Växt implements MängdVätska {
    private final String namn;
    private final double längd;
    protected double mängdVätska;

    public Växt(String namn, double längd){
        this.namn = namn;
        this.längd = längd;
    }

    //inkapsling
    public String getNamn() {
        return namn;
    }

    public double getLängd(){ return längd; }

    @Override
    public Double getMängdVätska() { return mängdVätska; }

}
