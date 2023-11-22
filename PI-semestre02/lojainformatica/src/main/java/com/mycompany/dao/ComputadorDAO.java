package com.mycompany.dao;

import com.mycompany.model.Computador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author janaina costa
 */
public class ComputadorDAO {

    private static String url = "jdbc:mysql://localhost:3306/lojainformatica";
    private static String login = "root";
    private static String senha = "";
    
    public static boolean salvar(Computador obj){
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            comandoSQL = conexao.prepareStatement
                ("INSERT INTO Computador (hd,processador) VALUES(?,?) ",
                        PreparedStatement.RETURN_GENERATED_KEYS );
            
            comandoSQL.setInt(1, obj.getHd());
            comandoSQL.setString(2, obj.getProcessador());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                retorno = true;
                
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if(rs != null){
                    while(rs.next()){
                        int idGerado = rs.getInt(1);
                        obj.setIdComputador(idGerado);
                    }
                }
            }
            
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }
        return retorno;
    }
    
    public static ArrayList<Computador> listar(){
    
        ArrayList<Computador> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            comandoSQL = conexao.prepareStatement("SELECT * FROM Computador");
            
            rs = comandoSQL.executeQuery();
            
            if(rs != null){
            
                while(rs.next()){
                    
                    int id = rs.getInt("idComputador");
                    int hd = rs.getInt("hd");
                    String processador = rs.getString("processador");
                    
                    Computador item = new Computador(id, hd, processador);
                    
                    lista.add(item);  
                }
            }
            
        } catch (Exception e) {
            lista = null;
        }finally{
        
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
        }
        return lista;
    }
    
    public static boolean alterar(Computador obj){
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
          
            comandoSQL = 
            conexao.prepareStatement("UPDATE computador SET hd = ?, processador = ? WHERE idComputador = ?"  );
            
            comandoSQL.setInt(1, obj.getIdComputador());
            comandoSQL.setInt(2, obj.getHd());
            comandoSQL.setString(3, obj.getProcessador());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                retorno = true;
            }
                        
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }
        return retorno;
    }
    
    public static boolean excluir(int idExcluir){
        
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            comandoSQL = 
            conexao.prepareStatement("DELETE FROM Computador WHERE idComputador = ?"  );
            
            comandoSQL.setInt(1, idExcluir);
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            
            if(linhasAfetadas > 0){
                retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            retorno = false;
        } catch (SQLException ex) {
            retorno = false;
        }
        
        return retorno;
    }
    
    
    public static ArrayList<Computador> buscarPorProcessador(String filtroProcessador){
    
        ArrayList<Computador> lista = new ArrayList<>();
        Connection conexao = null;
        PreparedStatement comandoSQL = null;
        ResultSet rs = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url, login, senha);
            
            comandoSQL = conexao.prepareStatement("SELECT * FROM Computador WHERE processador = ?");
            comandoSQL.setString(1, filtroProcessador);
            
            rs = comandoSQL.executeQuery();
            
            if(rs != null){
            
                while(rs.next()){
                    
                    int id = rs.getInt("idComputador");
                    int hd = rs.getInt("hd");
                    String processador = rs.getString("processador");

                    
                    Computador item = new Computador(id, hd, processador);
                    
                    lista.add(item);     
                }
            }
            
        } catch (Exception e) {
            lista = null;
        }finally{
        
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ComputadorDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return lista;
    }   
}
