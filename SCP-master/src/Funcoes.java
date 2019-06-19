/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author João Henrique
 */
public class Funcoes {
    
    public String loginAdmin(String uu, String ss){
        String resposta = " ";
        
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        String buscar = "SELECT * "
                + " FROM admin"
                + " WHERE usuario = ?;";
        
        String dados = uu;
        String senha = ss;
            
        preparedStatement = conexaoSQLite.criarPreparedStatement(buscar);
          
        try{
            
            preparedStatement.setString(1, dados);
            
            resultSet = preparedStatement.executeQuery();
            
            String u = null, s = null;
            while (resultSet.next()) {
                System.out.println("PESSOA SELECIONADA");
                System.out.println("USER = " + resultSet.getString("usuario"));
                u = resultSet.getString("usuario");
                System.out.println("SENHA = " + resultSet.getString("senha"));
                s = resultSet.getString("senha");
                
            }
            
            if(u.equals(dados) && s.equals(senha)){
                resposta = "Aceito";
                System.out.println("respota : "+resposta);
            }else{
                resposta = " ";
                System.out.println("respota : "+resposta);
            }
            
            
        }catch(SQLException e){
            resposta = " ";
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
      
      return resposta;  
    }
    
    
    public String cadastrarCliente(String nome, String cpf, String endereco, String telefone){
        String line = " ";
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        System.out.println("Inserindo Cliente!!!");
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = " INSERT INTO cliente ("
                + "nome,"
                + "cpf,"
                + "endereco,"
                + "telefone"
                + ") VALUES(?,?,?,?)"
                + ";";
        
         preparedStatement = conexaoSQLite.criarPreparedStatement(cad);
        
        try{
           
            preparedStatement.setString(1, nome);
            preparedStatement.setString(2, cpf);
            preparedStatement.setString(3,endereco );
            preparedStatement.setString(4,telefone);
            
            int result = preparedStatement.executeUpdate();
            
            if(result == 1){
                System.out.println("Cliente Inserido...");
                line = "correto";
            }else{
                System.out.println("Não inserido...");
                line = " ";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        return line;
    }
    
    
    public String cadastrarHistorico(int id_entrega){
        String line = " ";
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        System.out.println("Inserindo Cliente!!!");
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = " INSERT INTO entregaHistorico ("
                + "id_entregas"
                + ") VALUES(?)"
                + ";";
        
         preparedStatement = conexaoSQLite.criarPreparedStatement(cad);
        
        try{
           
            preparedStatement.setInt(1, id_entrega);
            int result = preparedStatement.executeUpdate();
            
            if(result == 1){
                System.out.println("Historico Inserido...");
                JOptionPane.showMessageDialog(null, "Pedido Finalizado com Sucesso..");
                line = "correto";
            }else{
                System.out.println("Não inserido...");
                line = " ";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        return line;
    }
    
    
    
     public String buscaCliente(String idAluno){
        String resultado = " ";
        String line = " ";
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        

        String cad = "SELECT * FROM cliente WHERE cpf = ?";
        
        preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
           preparedStatement.setString(1, idAluno);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                resultado = resultSet.getString("nome")+","+resultSet.getString("cpf")+","+resultSet.getString("endereco")+","+resultSet.getString("telefone"); 
            }
            System.out.println("resultado a ser enviado : "+resultado);
            
            line = resultado;
               //line = " ";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }
     
     
     public String listaHisEntregas(){
        String resultado = null;
        String line = " ";
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        

        String cad = "SELECT entregaHistorico.id_his,entregaHistorico.id_entregas,entrega.saborP,entrega.saborB FROM entregaHistorico INNER JOIN entrega ON entrega.id_entrega = entregaHistorico.id_entregas";
        
        preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                resultado = resultado+";"+resultSet.getInt("id_his")+","+resultSet.getInt("id_entregas")+","+resultSet.getString("saborP")+","+resultSet.getString("saborB"); 
            }
            System.out.println("resultado a ser enviado : "+resultado);
            
            line = resultado;
               //line = " ";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }
     
        public String listaHisCliente(String cpf){
        String resultado = null;
        String line = " ";
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        

        String cad = "SELECT entregaHistorico.id_his,entregaHistorico.id_entregas,entrega.saborP,entrega.saborB FROM entregaHistorico INNER JOIN entrega ON entrega.id_entrega = entregaHistorico.id_entregas WHERE entrega.cpf = ?";
        
        preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
             preparedStatement.setString(1, cpf);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                resultado = resultado+";"+resultSet.getInt("id_his")+","+resultSet.getInt("id_entregas")+","+resultSet.getString("saborP")+","+resultSet.getString("saborB"); 
            }
            System.out.println("resultado a ser enviado : "+resultado);
            
            line = resultado;
               //line = " ";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }

     
     public String listaEntregas(){
        String resultado = null;
        String line = " ";
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        

        String cad = "SELECT cliente.nome,cliente.cpf,cliente.endereco,cliente.telefone,entregaPendente.id_entrega FROM cliente INNER JOIN entregaPendente ON cliente.cpf = entregaPendente.cpf";
        
        preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
            //preparedStatement.setString(1, idPedido);
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                resultado = resultado+";"+resultSet.getString("nome")+","+resultSet.getString("cpf")+","+resultSet.getString("endereco")+","+resultSet.getString("telefone")+","+resultSet.getInt("id_entrega"); 
            }
            System.out.println("resultado a ser enviado : "+resultado);
            
            line = resultado;
               //line = " ";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }
     
     public String removerCliente(String idcliente){
        String resultado = null;
        String line = " ";
        int resulta;
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = "DELETE FROM cliente WHERE cpf =?";
        
         preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
           preparedStatement.setString(1, idcliente);
           resulta = preparedStatement.executeUpdate();
            if(resulta == 1)
               line = "removido";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }
     
     public String removerEntrega(String idEntrega){
        String resultado = null;
        String line = " ";
        int resulta;
        ConexaoSQLite conexao = new ConexaoSQLite();
        conexao.conectar();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = "DELETE FROM entregaPendente WHERE id_entrega =?";
        
         preparedStatement = conexao.criarPreparedStatement(cad);
         
        try{
           preparedStatement.setString(1, idEntrega);
           resulta = preparedStatement.executeUpdate();
            if(resulta == 1)
               line = "removido";
            
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(deletraCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexao.desconectar();
        }
        return line;
    }
    
      public String cadastrarEntrega(String tamPizza, String saborPizza, String qnt, String tamBebida, String saborBebida, String qntRefri,String cpf){
        String line = null;
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        System.out.println("Inserindo entrega!!!");
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = " INSERT INTO entrega ("
                + "tamP,"
                + "saborP,"
                + "qntP,"
                + "tamB,"
                + "saborB,"
                + "qntB,"
                + "cpf"
                + ") VALUES(?,?,?,?,?,?,?)"
                + ";";
        
         preparedStatement = conexaoSQLite.criarPreparedStatement(cad);
        
        try{
           
            preparedStatement.setString(1,tamPizza);
            preparedStatement.setString(2,saborPizza);
            preparedStatement.setString(3,qnt);
            preparedStatement.setString(4,tamBebida);
            preparedStatement.setString(5,saborBebida);
            preparedStatement.setString(6,qntRefri);
            preparedStatement.setString(7,cpf);
            
            
            int result = preparedStatement.executeUpdate();
            
            if(result == 1){
                System.out.println("Entrega Inserida...");
                line = "correto";
            }else{
                System.out.println("Não inserido...");
                line = " ";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        return line;
    }
      
      public String entregaPendente(String tamPizza, String saborPizza, String qnt, String tamBebida, String saborBebida, String qntRefri,String cpf){
        String line = null;
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        System.out.println("Inserindo entrega!!!");
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = " INSERT INTO entregaPendente ("
                + "tamP,"
                + "saborP,"
                + "qntP,"
                + "tamB,"
                + "saborB,"
                + "qntB,"
                + "cpf"
                + ") VALUES(?,?,?,?,?,?,?)"
                + ";";
        
         preparedStatement = conexaoSQLite.criarPreparedStatement(cad);
        
        try{
           
            preparedStatement.setString(1,tamPizza);
            preparedStatement.setString(2,saborPizza);
            preparedStatement.setString(3,qnt);
            preparedStatement.setString(4,tamBebida);
            preparedStatement.setString(5,saborBebida);
            preparedStatement.setString(6,qntRefri);
            preparedStatement.setString(7,cpf);
            
            
            int result = preparedStatement.executeUpdate();
            
            if(result == 1){
                System.out.println("Entrega Inserida...");
                line = "correto";
            }else{
                System.out.println("Não inserido...");
                line = " ";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        return line;
    }
      
      public String historicoEntrega(String entrega){
          
        String line = null;
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        conexaoSQLite.conectar();
        
        System.out.println("Inserindo entrega!!!");
        
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        
        

        String cad = " INSERT INTO entregaHistorico ("
                + "entrega"
                + ") VALUES(?)"
                + ";";
        
         preparedStatement = conexaoSQLite.criarPreparedStatement(cad);
        
        try{
           
            preparedStatement.setString(1,entrega);
            
            
            int result = preparedStatement.executeUpdate();
            
            if(result == 1){
                System.out.println("Entrega Inserida no historico...");
                line = "correto";
            }else{
                System.out.println("Não inserido...");
                line = " ";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(preparedStatement != null){
                try {
                    preparedStatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Funcoes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            conexaoSQLite.desconectar();
        }
        return line;
      }
    
    
}

