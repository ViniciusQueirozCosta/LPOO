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
public final class Controle extends absPropriedades //"main" do back end; toda transferencia de variáveis passa por aqui.
{
    
    public Controle(String num1, String num2, String op)
    {
        super(num1, num2, op);
        Executar();
    }
    
    private void Executar()
    {
        
        this.mensagem = "";
        
        absPropriedades validacao = new Validacao(num1, num2, op);

        if(validacao.mensagem.equals(""))
        {

            absPropriedades calcular = new Calcular(this.op, validacao.n1, validacao.n2);

            this.resposta = calcular.resposta;

        }

        else
        {

            this.mensagem = validacao.mensagem;

        }
        
    }

    @Override
    public String toString()
    {
        return resposta;
    }
    
    
}
