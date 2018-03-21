/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vinic
 */
public abstract class absPropriedades
{
    private Double n1, n2, res;
    private String op, resultado, errorMessage, num1, num2;
    
    //getter

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public Double getRes()
    {
        return res;
    }

    public String getOp()
    {
        return op;
    }

    public String getResultado()
    {
        return resultado;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public String getNum1()
    {
        return num1;
    }

    public String getNum2()
    {
        return num2;
    }
    
    //setter

    public void setN1(Double n1)
    {
        this.n1 = n1;
    }

    public void setN2(Double n2)
    {
        this.n2 = n2;
    }

    public void setRes(Double res)
    {
        this.res = res;
    }

    public void setOp(String op)
    {
        this.op = op;
    }

    public void setResultado(String resultado)
    {
        this.resultado = resultado;
    }

    public void setErrorMessage(String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public void setNum1(String num1)
    {
        this.num1 = num1;
    }

    public void setNum2(String num2)
    {
        this.num2 = num2;
    }
    
    
    
    
    
}
