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
public final class Validacao extends absPropriedades
{
    
    public Validacao(String num1, String num2, String op)
    {
        super(num1, num2, op);
        Validar();
    }
    
    public void Validar()
    {
        this.mensagem = ""; 
        try
        {
            
            this.n1 = Double.parseDouble(this.num1);
            this.n2 = Double.parseDouble(this.num2);
            
        }
        
        
        catch(NumberFormatException e)//poderia usar (Exception e) para pegar todos os erros (mais genérico)
        {
            
            this.mensagem = "Erro de Conversão!";
            
        }
        
        
        //divisão por zero
        if(this.mensagem.equals(""))
        {
            
            if(this.op.equals("/") && this.n1 == 0)
                this.mensagem = "Divisão por zero!";
        }
        
    }
    
}
