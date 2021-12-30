package io.viic.imc;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;

public class Imc extends AndroidNonvisibleComponent {

  public Imc(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "")
  public String Imc(double seuPeso, double suaAltura) {

    double newPeso = seuPeso;
    double newAltura = suaAltura;
    double IMC = newPeso / (newAltura * newAltura);
    String resultado = "";

    if (IMC < 18.5){
      resultado = "Magreza";
    } else if(IMC >= 18.5 && IMC < 24.9){
      resultado = "Normal";
    } else if(IMC >= 25 && IMC < 29.9) {
      resultado = "Sobrepeso";
    } else if (IMC >= 30 && IMC < 39.9){
      resultado = "Obesidade";
    } else if (IMC >= 30) {
      resultado = "Obesidade Grave";
    }
    return resultado;
  }
}
