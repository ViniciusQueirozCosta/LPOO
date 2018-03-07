
package Modelo;


public class Controle
{
    private String num1,num2,op,finalResult;

    public Controle(String num1, String num2, String op)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        calcular();
    }

    public Controle(String num1, String num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void calcular()
    {

        Double n1, n2, result;
        
        try
        {
            
            n1 = Double.parseDouble(this.num1);
            n2 = Double.parseDouble(this.num2);

            if (this.op.equals("+"))
            {
                result = n1 + n2;
                this.finalResult = result.toString();
            }

            if (this.op.equals("-"))
            {
                result = n1 - n2;
                this.finalResult = result.toString();
            }

            if (this.op.equals("*"))
            {
                result = n1 * n2;
                this.finalResult = result.toString();
            }

            if (this.op.equals("/"))
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
    
    //setters
    public String setOp(String op)
    {
        return this.op = op;
    }
    //getter
    public String getFinalResult()
    {
        return finalResult;
    }
    
    
}
