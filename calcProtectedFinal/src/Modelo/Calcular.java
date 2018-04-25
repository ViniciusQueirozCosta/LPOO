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
public final class Calcular extends absPropriedades
{
   
    public Calcular(String op, Double n1, Double n2)
    {
        super(op, n1, n2);
        Executar();
    }
   
    public void Executar()
    {
        //faz checagem do op, dependendo da op, chama um dos 4 métodos abaixo
        if(this.op.equals("+"))
        {
            
            Somar(this.n1, this.n2);
            
        }
        
        else if(this.op.equals("-"))
        {
            
            Subtrair(this.n1, this.n2);
            
        }
        
        else if(this.op.equals("*"))
        {
            
            Multiplicar(this.n1, this.n2);
                      
        }
        
        else if(this.op.equals("/"))
        {
            
           Dividir(this.n1, this.n2);
           
        }
        
    }
    
    @Override
    public void Somar(Double n1, Double n2)
    {
        
        this.resultado = this.n1 + this.n2;
        this.resposta = Double.toString(resultado);
        
    }
    @Override
    public void Subtrair(Double n1, Double n2)
    {
        
        this.resultado = this.n1 - this.n2;
        this.resposta = Double.toString(resultado);
        
    }
    @Override
    public void Multiplicar(Double n1, Double n2)
    {
        
        this.resultado = this.n1 * this.n2;
        this.resposta = Double.toString(resultado); 
        
    }
    @Override
    public void Dividir(Double n1, Double n2)
    {
        
        this.resultado = this.n1 / this.n2;
        this.resposta = Double.toString(resultado); 
        
    }
    
    
    
}
