
package Modelo;


public class Validacao extends absPropriedades
{

    public void validar()
    {
        this.setErrorMessage("");
        
        //validacao do n1
        try
        {     
            this.setN1(Double.parseDouble(this.getNum1()));
        }
        
        catch(Exception e)
        {
            this.setErrorMessage("Erro de Conversão do Primeiro número \n");
        }
        
        //validacao do n2
        try
        {
            this.setN2(Double.parseDouble(this.getNum2()));
        }
        
        catch(Exception e)
        {
            this.setErrorMessage(this.getErrorMessage() + "Erro de Conversão do Segundo número \n");
        }
        
        //validacao de divisao por zero
        if(this.getOp().equals("/"))
            if(this.getNum2().equals("0"))
            {
                this.setErrorMessage("Divisão por Zero!");
            }
    }
}

