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
public class FuncoesIT {
    
    @org.junit.Test
    public void testLoginAdmin() {
        System.out.println("loginAdmin");
        String uu = "admin";
        String ss = "admin";
        Funcoes instance = new Funcoes();
        String expResult = "Aceito";
        String result = instance.loginAdmin(uu, ss);
        assertEquals(expResult, result);
    }

   
    @org.junit.Test
    public void testCadastrarCliente() {
        System.out.println("cadastrarCliente");
        String nome = "joão";
        String cpf = "021.123.345-56";
        String endereco = "av piaui";
        String telefone = "(88) 8 8888-8888";
        Funcoes instance = new Funcoes();
        String expResult = "correto";
        String result = instance.cadastrarCliente(nome, cpf, endereco, telefone);
        assertEquals(expResult, result);
    }

    /*
    @org.junit.Test
    public void testCadastrarHistorico() {
        System.out.println("cadastrarHistorico");
        int id_entrega = 0;
        Funcoes instance = new Funcoes();
        String expResult = "";
        String result = instance.cadastrarHistorico(id_entrega);
        assertEquals(expResult, result);
    }
*/
    @org.junit.Test
    public void testRemoverCliente() {
        System.out.println("removerCliente");
        String idAluno = "021.123.345-56";
        Funcoes instance = new Funcoes();
        String expResult = "removido";
        String result = instance.removerCliente(idAluno);
        assertEquals(expResult, result);
    }

 /*   
    @org.junit.Test
    public void testCadastrarEntrega() {
        System.out.println("cadastrarEntrega");
        String tamPizza = "";
        String saborPizza = "";
        String qnt = "";
        String tamBebida = "";
        String saborBebida = "";
        String qntRefri = "";
        String cpf = "";
        Funcoes instance = new Funcoes();
        String expResult = "";
        String result = instance.cadastrarEntrega(tamPizza, saborPizza, qnt, tamBebida, saborBebida, qntRefri, cpf);
        assertEquals(expResult, result);
    }

    */
    
}
