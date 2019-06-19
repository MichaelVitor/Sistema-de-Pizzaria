/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author João Henrique
 */
public class FuncoesIntegridade {
    
   /* @org.junit.Test
    public void testCadastrarClienteRemover() {
        System.out.println("cadastrarCliente");
        String nome = "joão";
        String cpf = "888.999.888-99";
        String endereco = "av piaui";
        String telefone = "(88) 8 8888-8888";
        Funcoes instance = new Funcoes();
        String expResult = "correto";
        String result = instance.cadastrarCliente(nome, cpf, endereco, telefone);
        String result2 = instance.removerCliente(cpf);
        String expResult2 = "removido";
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
        
    } 
    */
    @org.junit.Test
    public void testCadastrarClienteBuscar() {
         System.out.println("loginAdmin");
        String uu = "admin";
        String ss = "admin";
        Funcoes instance = new Funcoes();
        String expResult = "Aceito";
        String result = instance.loginAdmin(uu, ss);
        
        System.out.println("cadastrarCliente");
        String nome = "joão";
        String cpf = "888.999.888-99";
        String endereco = "av piaui";
        String telefone = "(88) 8 8888-8888";
        String expResult2 = "correto";
        String result2 = instance.cadastrarCliente(nome, cpf, endereco, telefone);
        
        String result3 = instance.removerCliente(cpf);
        String expResult3 = "removido";
        
        System.out.println("cadastrarEntrega");
        String tamPizza = "grande";
        String saborPizza = "calabresa";
        String qnt = "2";
        String tamBebida = "1litro";
        String saborBebida = "fanta";
        String qntRefri = "3";
        String cpf2 = "000.000.000-00";
        Funcoes instance2 = new Funcoes();
        String expResult4 = "correto";
        String result4 = instance.cadastrarEntrega(tamPizza, saborPizza, qnt, tamBebida, saborBebida, qntRefri, cpf2);
        String result5 = instance.entregaPendente(tamPizza, saborPizza, qnt, tamBebida, saborBebida, qntRefri, cpf2);
        
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
        assertEquals(expResult3, result3);
        assertEquals(expResult4, result4);
        assertEquals(expResult4, result5);
        
    }
    
    
    
}
