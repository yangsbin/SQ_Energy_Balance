public class NetRadiationEquivalentEvaporation
{
    public double netRadiationEquivalentEvaporation;
    public NetRadiationEquivalentEvaporation(double _netRadiationEquivalentEvaporation)
    {
        netRadiationEquivalentEvaporation=_netRadiationEquivalentEvaporation;
    }
}

public static class Estimation_NetRadiationEquivalentEvaporation
{
    public static NetRadiationEquivalentEvaporation CalculateNetRadiationEquivalentEvaporation(double lambdaV=2.454,double netRadiation=1.566)
    {


/*
     NetRadiationEquivalentEvaporation Model

    Author: 
    Reference: Modelling energy balance in the wheat crop model SiriusQuality2:
            Evapotranspiration and canopy and soil temperature calculations
    Instituton: INRA/LEPSE Montpellier
    Abstract:  It is given by dividing net radiation by latent heat of vaporization of water 
    
*/
        double netRadiationEquivalentEvaporation;

        netRadiationEquivalentEvaporation = netRadiation / lambdaV * 1000.0;
        return new NetRadiationEquivalentEvaporation(netRadiationEquivalentEvaporation);
    }
}

