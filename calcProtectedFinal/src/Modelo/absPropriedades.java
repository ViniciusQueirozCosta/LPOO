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
public abstract class absPropriedades implements intMetodos
{
    public String mensagem;
    protected String num1, num2, op, resposta;
    protected Double n1, n2, resultado;
  
    //Construtores
    absPropriedades(String num1, String num2, String op)
    {
        
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        
    }
   
    absPropriedades(String op, Double n1, Double n2)
    {
        
        this.op = op;
        this.n1 = n1;
        this.n2 = n2;
        
    }

    
    //Métodos do intMetodos pra não ter que escrever em todos as classes que herdam absPropriedades
    @Override
    public void Somar(Double n1, Double n2)
    {
    }

    @Override
    public void Subtrair(Double n1, Double n2)
    {
    }

    @Override
    public void Multiplicar(Double n1, Double n2)
    {
    }

    @Override
    public void Dividir(Double n1, Double n2)
    {
    }
    
    
    
}
