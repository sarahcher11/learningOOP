package SERIE03.EXO2;


public interface AugmentationSalaire {
  
final double SALAIREMax=200000;
    public default void  augmenterSalaire(double salaire, double pourcentage) throws AugmentationImpossibleException {
   
       salaire=salaire+salaire*pourcentage /100 ;
    if (salaire > SALAIREMax)throw new  AugmentationImpossibleException();      

    }
}
