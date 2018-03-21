
package Modelo;


public class Controle extends absPropriedades
{

    public void calcular()
    {
        this.setErrorMessage("");
        Modelo.Validacao validacao = new Validacao();
        
        validacao.setNum1(this.getNum1());
        validacao.setNum2(this.getNum2());
        validacao.setOp(this.getOp());
        
        validacao.validar();
        
        if(validacao.getErrorMessage().equals(""))
        {
            Modelo.Calculo calculo = new Calculo();
            calculo.setN1(validacao.getN1());
            calculo.setN2(validacao.getN2());
            calculo.setOp(validacao.getOp());
            
            calculo.calcular();
            
            this.setResultado(calculo.getResultado());
        }
        
        else
        {
            this.setErrorMessage(validacao.getErrorMessage());
        }
    }
}



