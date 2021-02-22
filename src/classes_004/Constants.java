// Классы. Свойства с одним методом доступа.

package classes_004;

class Constants {
    private double pi = 3.14D;
    private double e = 2.71D;

    // Свойство только для чтения.  -  ReadOnly Property
    double getPI(){
        return pi;
    }

    // Свойство только для записи.  - WriteOnly Property
    void setE(double var){
        e = var;
    }
}
