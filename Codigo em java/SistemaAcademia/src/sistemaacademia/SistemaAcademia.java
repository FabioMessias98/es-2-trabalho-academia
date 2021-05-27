/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademia;

import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator; 
import java.util.ArrayList; 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class SistemaAcademia {
    private Aluno[] alunos; 
    private Funcionario[] funcionarios ; 
    
  
   
    public static void main(String[] args) {
        String frase; 
        int opcao; 
        //SistemaAcademico sa = new SistemaAcademico(10, 10); 
        Aluno aluno; 
        Funcionario funcionario;  
        LinkedList ll = new LinkedList();
        Iterator ill; 
        ArrayList<Aluno> al = new ArrayList(); 
        ArrayList<Funcionario> fc = new ArrayList(); 
        
 
         do{
         frase = JOptionPane.showInputDialog("Escolha uma opção:"
                + "\n 1- Cadastrar Aluno"
                + "\n 2- Cadastrar Professor"
                + "\n 3- Excluir Aluno"
                + "\n 4- Excluir Professor"
                + "\n 5- Alterar Aluno "
                + "\n 6- Alterar Professor"
                + "\n 7- Pesquisar Aluno"
                + "\n 8- Pesquisar Professor"
                + "\n 9- Sair");
         opcao = Integer.parseInt(frase);
        
       
        switch  (opcao){
            case 1 :
                String rg, nome, ender, tel, sexo; 
            rg =  JOptionPane.showInputDialog("Digite o Registro do Aluno: "); 
                     
            nome =  JOptionPane.showInputDialog("Digite o Nome do Aluno: "); 
                      
                        
            ender =  JOptionPane.showInputDialog("Digite o Endereço do Aluno: "); 
           
            tel =  JOptionPane.showInputDialog("Digite o Telefone do Aluno: "); 
            
            sexo =  JOptionPane.showInputDialog("Digite o Sexo do Aluno: "); 
            
            aluno = new Aluno(); 
            aluno.setRegistro(rg);
            aluno.setNome(nome);
            aluno.setEndereço(ender);
            aluno.setTelefone(tel);
            aluno.setSexo(sexo);
            al.add(aluno); 
                        
            break;
            
            
            case 2: 
                String regis, nomep, materia, enderp, telp, sexop;
            regis =  JOptionPane.showInputDialog("Digite o Registro do Professor: "); 

            nomep =  JOptionPane.showInputDialog("Digite o Nome do Professor: "); 
            
            materia =  JOptionPane.showInputDialog("Digite a materia do Professor: "); 
                      
            enderp =  JOptionPane.showInputDialog("Digite o Endereço do Professor: "); 
                       
            telp =  JOptionPane.showInputDialog("Digite o Telefone do Professor: "); 
                 
            sexop =  JOptionPane.showInputDialog("Digite o Sexo do Professor: "); 
                      
             funcionario = new Funcionario();
             
            
             fc.add(funcionario); 
                 
                break;
            case 3: // Excluir Aluno
                rg =  JOptionPane.showInputDialog("Digite o Registro do Aluno: "); 
                
              for(int i = 0; i < al.size(); i++){
                  aluno = (Aluno)al.get(i); 
                      if(aluno.getRegistro().equals(rg)){
                          al.remove(aluno); 
                        }
                }
                
                break; 
                
                
            case 4: // Excluir professor
                regis =  JOptionPane.showInputDialog("Digite o Registro do Professor: "); 
                
              for(int i = 0; i < al.size(); i++){
                  funcionario = (Funcionario)fc.get(i); 
                      if(funcionario.getRegistro().equals(regis)){
                          fc.remove(funcionario); 
                        }
                }
                break; 
            case 5: // Alterar Aluno
                break; 
                
            case 6: // Alterar  Professor
                break; 
                
            case 7: // Pesquisar Aluno

                rg =  JOptionPane.showInputDialog("Digite o RA do Aluno: "); 

                 for(int i =0; i < al.size(); i++){
                     aluno = (Aluno)al.get(i); 
                  if(aluno.getRegistro().equals(rg)){
                      System.out.println("RA: " + aluno.getRegistro()); 
                      System.out.println("Nome: " + aluno.getNome());
                      System.out.println("Endereço: " + aluno.getEndereço());
                      System.out.println("Telefone: " + aluno.getTelefone());
                      System.out.println("Sexo: " + aluno.getSexo());
                  }
                
                 }
                 break; 
                
            case 8: // Pesquisar Professor
                regis =  JOptionPane.showInputDialog("Digite o Registro do Professor: "); 

              for(int i = 0; i < al.size(); i++){
                  funcionario = (Funcionario)fc.get(i); 
                 if(funcionario.getRegistro().equals(regis)){
                  System.out.println("Registro: " + funcionario.getRegistro()); 
                  System.out.println("Nome: " + funcionario.getNome());
                  System.out.println("Endereço: " + funcionario.getEndereço());
                  System.out.println("Telefone: " + funcionario.getTelefone());
                  System.out.println("Sexo: " + funcionario.getSexo() + "\n");
                 } 
                }
                break; 
 
        }
        }while(opcao!=9);
        
        
       
        
        
    }
}

