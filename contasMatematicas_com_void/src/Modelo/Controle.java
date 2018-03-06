
package Modelo;

public class Controle
{
    
    public String calcular(String operacao, String num1, String num2)
    {

        Double n1 = 0.0, n2 = 0.0, result = 0.0;
        
        try
        {
            
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);

            if (operacao.equals("+"))
                result = n1 + n2;
            if (operacao.equals("-"))
                result = n1 - n2;
            if (operacao.equals("*"))
                result = n1 * n2;
            if (operacao.equals("/"))
            {
                
                if(n2 == 0)
                    return "Divisão por zero!";

                else
                result = n1 / n2;
            }
        }
        
        catch(Exception e)
        {
            return "Erro de conversão!";
        }
        
        return result.toString();
    }
}