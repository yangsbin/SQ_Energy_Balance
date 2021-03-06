public class PtSoil
{
    public double energyLimitedEvaporation;
    public PtSoil(double _energyLimitedEvaporation)
    {
        this.energyLimitedEvaporation=_energyLimitedEvaporation;
    }
}

public static class Estimation_PtSoil
{
    public static PtSoil CalculatePtSoil(double evapoTranspirationPriestlyTaylor,double Alpha,double tau,double tauAlpha)
    {


/*
     PtSoil EnergyLimitedEvaporation Model

    Author: 
    Reference: Modelling energy balance in the wheat crop model SiriusQuality2:
            Evapotranspiration and canopy and soil temperature calculations
    Instituton: INRA Montpellier
    Abstract: Evaporation from the soil in the energy-limited stage 
    
*/
        double energyLimitedEvaporation;

        double AlphaE;
        if (tau < tauAlpha)
        {
        	AlphaE = 1 ;
        }
        else
        {
        AlphaE = Alpha - ((Alpha - 1) * (1 - tau) / (1 - tauAlpha));
        }
        energyLimitedEvaporation= (evapoTranspirationPriestlyTaylor / Alpha) * AlphaE * tau
        return new PtSoil(energyLimitedEvaporation);
    }

}
