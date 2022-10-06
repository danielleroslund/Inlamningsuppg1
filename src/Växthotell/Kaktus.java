package Växthotell;

public class Kaktus extends Växt {

    private final String vätska = Vätska.MINERALVATTEN.getLiquid();
    private final double basnivå = 0.02;

    public Kaktus(String namn, double längd) {
        super(namn, längd);
        setMängdVätska();

    }

    //polymorfism
    @Override
    public void setMängdVätska() {
        mängdVätska = basnivå;
    }

    public String toString(){
        return getNamn() + " ska få " + getMängdVätska() + " liter " + vätska;
    }


}