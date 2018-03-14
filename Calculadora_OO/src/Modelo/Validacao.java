
package Modelo;

import Modelo.Controle.*;

public class Validacao
{
    public String num1, num2, errorMessage;
    public Double n1, n2;
    

    public void validar()
    {
        this.errorMessage = "";
        try
        {
            
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);
            
        }
        
        catch(Exception e)
        {
            this.errorMessage = "Erro de Conversão!";
        }
    }
}

