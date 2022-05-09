package InteresCom;

public class InteresCompuesto {

    public float capital;

    public float tasaInteres;

    public float numPerio;

    public Math math;


    public void setCapital(float capital)
    {
        this.capital = capital;
    }

    public void setTasaInteres(float tasaInteres)
    {
        this.tasaInteres = tasaInteres;
    }

    public void setNumPerio(float numPerio)
    {
        this.numPerio = numPerio;
    }



    public float getCapital()
    {
        return capital;
    }

    public float getTasaInteres()
    {
        return tasaInteres;
    }

    public float getNumPerio()
    {
        return numPerio;
    }

    //OPERACIONES:

    public float getPorcentaje()
    {
        float porcentaje;

        porcentaje = getTasaInteres()/100;

        return porcentaje;
    }


    public float getSuma()
    {
        float suma;

        suma = 1+getPorcentaje();

        return suma;
    }


    public float getElevado()
    {
        float elevado;

        elevado = (float) this.math.pow(getSuma(),getNumPerio());

        return elevado;
    }


    public float getImporteAcumulado()
    {

        float importeAcumulado;

        importeAcumulado = getCapital()*getElevado();

        return importeAcumulado;

    }

}
