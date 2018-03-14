
package Modelo;

import Modelo.*;


public class Controle
{
    public String num1, num2, op, finalResult, errorMessage;
    public Double n1, n2, result;
    
    public void calcular()
    {
        this.errorMessage = "";
        Modelo.Validacao validacao = new Validacao();
        
        validacao.num1 = this.num1;
        validacao.num2 = this.num2; 
        
        validacao.validar();
        
        if(validacao.errorMessage.equals(""))
        {
            Modelo.Calculo calculo = new Calculo();
            
            calculo.n1 = validacao.n1;
            calculo.n2 = validacao.n2;
            calculo.op = this.op;
            
            calculo.calcular();
            this.finalResult = calculo.finalResult;
            
        }
        
        else
        {
            this.errorMessage = validacao.errorMessage;
        }
    }
}



