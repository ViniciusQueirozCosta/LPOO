
package Modelo;


public class Calculo extends absPropriedades
{
    public void calcular()
    {
        
        if (this.getOp().equals("+"))
        {
            this.setRes(this.getN1() + this.getN2());
            this.setResultado(getRes().toString());
        }

        if (this.getOp().equals("-"))
        {
            this.setRes(this.getN1() - this.getN2());
            this.setResultado(getRes().toString());
        }

        if (this.getOp().equals("*"))
        {
            this.setRes(this.getN1() * this.getN2());
            this.setResultado(getRes().toString());
        }
        
        if (this.getOp().equals("/"))
        {
            this.setRes(this.getN1() / this.getN2());
            this.setResultado(getRes().toString());
        }
        
    }
}
