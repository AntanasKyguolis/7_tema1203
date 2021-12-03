package isvestine;

import java.util.Comparator;

public class StatybininkasImpl implements Statybininkas,  Comparable<StatybininkasImpl>{

    private String issilavinimas;
    private String specializacija;
    private double atlyginimas;
    private double stazas;

    public StatybininkasImpl(String issilavinimas, String specializacija, double atlyginimas, double stazas) {
        this.stazas = stazas;
        this.atlyginimas = atlyginimas;
        this.specializacija = specializacija;
        this.issilavinimas = issilavinimas;
    }


    @Override
    public double getStazas() {

        return stazas;
    }

    @Override
    public void setStazas(double stazas) {

        this.stazas = stazas;
    }

    @Override
    public String getIssilavinimas() {

        return issilavinimas;
    }

    @Override
    public void setIssilavinimas(String issilavinimas) {

        this.issilavinimas = issilavinimas;
    }

    @Override
    public String getSpecializacija() {
        return specializacija;
    }

    @Override
    public void setSpecializacija(String specializacija) {

        this.specializacija = specializacija;
    }

    @Override
    public double getAtlyginimas() {

        return atlyginimas;
    }

    @Override
    public void setAtlyginimas(double atlyginimas) {

        this.atlyginimas = atlyginimas;
    }

    @Override
    public String toString() {
        return "Statybininkas " +
                "stazas = " + stazas +
                ", issilavinimas ='" + issilavinimas + '\'' +
                ", specializacija ='" + specializacija + '\'' +
                ", atlyginimas = " + atlyginimas +
                '}';
    }
    //lyginimas pagal atlyginima su Comperator
    public static Comparator<StatybininkasImpl> lyginimasPagalAtlyginima = new Comparator<StatybininkasImpl>() {
        @Override
        public int compare(StatybininkasImpl o1, StatybininkasImpl o2) {
            double atlyginimas1Statybininko = o1.getAtlyginimas();
            double atlyginimas2Statybininko = o2.getAtlyginimas();
            return Double.compare(atlyginimas1Statybininko, atlyginimas2Statybininko);
        }
    };



    @Override
    public int compareTo(StatybininkasImpl o) {

        return Comparator
                .comparing(StatybininkasImpl::getAtlyginimas) //nurodome pozymi pagal kuri atliksime palyginima
               .thenComparing(StatybininkasImpl::getStazas)
                //.reversed() //z-a
                .compare(this, o); //lyginame 2 objektus tarpusavyje
    }

  /*  @Override
    public int compareTo(StatybininkasImpl o) {

        return Comparator
                .comparing(StatybininkasImpl::getAtlyginimas) //nurodome pozymi pagal kuri atliksime palyginima
                .reversed() //z-a
                .compare(this, o); //lyginame 2 objektus tarpusavyje
    }

    @Override
    public int compareTo(StatybininkasImpl o) {

        return Comparator
                .comparing(StatybininkasImpl::getAtlyginimas) //nurodome pozymi pagal kuri atliksime palyginima
                .thenComparing(StatybininkasImpl::getStazas)
                .reversed() //z-a
                .compare(this, o); //lyginame 2 objektus tarpusavyje
    }  */

}
