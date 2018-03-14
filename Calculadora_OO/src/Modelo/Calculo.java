
package Modelo;


public class Calculo
{
    public Double n1, n2, result;
    public String op, finalResult; 
    
    public void calcular()
    {
        
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
        
        if(this.op.equals("/"))
        {
            result = n1 / n2;
            this.finalResult = result.toString();
        }
    }
}
