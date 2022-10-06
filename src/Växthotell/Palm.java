package Växthotell;

public class Palm extends Växt{

    private final String vätska = Vätska.KRANVATTEN.getLiquid();
    private final double basnivå = 0.5;

    public Palm(String namn, double längd){
        super(namn, längd);
        setMängdVätska();

    }


    //polymorfism
    @Override
    public void setMängdVätska() {
        mängdVätska = basnivå * getLängd();

    }

    public String toString(){
        return getNamn() + " ska få " + getMängdVätska() + " liter " + vätska;

    }


}

