
package Modelo;

public class Controle
{
    public String num1,num2,op,finalResult;
    
    public void calcular()
    {

        Double n1 = 0.0, n2 = 0.0, result;
        
        try
        {
            
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);

            if (op.equals("+"))
            {
                result = n1 + n2;
                this.finalResult = result.toString();
            }

            if (op.equals("-"))
            {
                result = n1 - n2;
                this.finalResult = result.toString();
            }

            if (op.equals("*"))
            {
                result = n1 * n2;
                this.finalResult = result.toString();
            }

            if (op.equals("/"))
            {       
                if(n2 == 0)
                    this.finalResult = "Divisão por zero!";

                else
                {
                result = n1 / n2;
                this.finalResult = result.toString();
                }
            }
        }
        
        catch(Exception e)
        {
            this.finalResult = "Erro!";
        }
        
    }
}