package PromedioNotas;

public class PromedioDeNotas {

    public int pta;

    public int emc;

    public int efc;



    public void setPTA(int PTA) {
        this.pta = PTA;
    }

    public void setEMC(int EMC) {
        this.emc = EMC;
    }

    public void setEFC(int EFC) {
        this.efc = EFC;
    }



    public int getPTA() {
        return pta;
    }

    public int getEMC() {
        return emc;
    }

    public int getEFC() {
        return efc;
    }


    public int getSuma()
    {
        int suma;

        suma = getPTA()+getEMC()+getEFC();

        return suma;
    }


    public int getPromedioFinal()
    {
        int promedioFinal;

        promedioFinal = getSuma()/3;

        return promedioFinal;
    }
}
