package Växthotell;

public enum Vätska {

    KRANVATTEN ("kranvatten"),
    MINERALVATTEN ("mineralvatten"),
    PROTEINDRYCK ("proteindryck");

    public String liquid;

    Vätska(String l){
        liquid = l;
    }

    String getLiquid() {
        return liquid;
    }

}
