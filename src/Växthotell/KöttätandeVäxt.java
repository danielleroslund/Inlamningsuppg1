package Växthotell;

public class KöttätandeVäxt extends Växt{
    private final String vätska = Vätska.PROTEINDRYCK.getLiquid();
    private final double basnivå = 0.1;
    private final double tillskott = 0.2;

    public KöttätandeVäxt(String namn, double längd){
        super(namn, längd);
        setMängdVätska();
    }

    //polymorfism
    @Override
    public void setMängdVätska() {
        mängdVätska = basnivå + (tillskott * getLängd());

    }

    public String toString(){
        return getNamn() + " ska få " + getMängdVätska() + " liter " + vätska;

    }
}