/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author Fatima
 */
public class DaoPersonne {
    private final String  SQL_SELECT_BY_CLASSE="select * from personne where type='Etudiant'and classe_id=?";
    private final String  SQL_INSERT="INSERT INTO `gestion_etudiants`.`personne` (`classe.id`, `type`, `nomcomplet`, `tuteur`, `module`, `grade`) VALUES (?, ?,  ?, ?, ?, ?);";
    private final String  SQL_SELECT_PROFESSEUR="select * from personne where matricule=?";
    public List<Personne> findByClasse(Classe classe){
        List<Personne> lEtudiants=new ArrayList<>();
        //Recuperation
        return lEtudiants;
    }
    public int insert(Personne pers){
        int nbreLigne=0;
        //traitement
        return nbreLigne;
    }
    
    public Professeur findProfesseurByMatricule(String matricule){
        Professeur professeur=null;
        
        //Recherche
        return professeur;
    }
    
}
