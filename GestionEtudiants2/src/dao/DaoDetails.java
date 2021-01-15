/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Details;

/**
 *
 * @author Fatima
 */
public class DaoDetails {
    private final String SQL_INSERT="INSERT INTO `gestion_etudiants`.`details` (`classe_id`, `professeur_id`, `modules`, `annee`) VALUES (?, ?, ?, ?);";
public int insert ( Details details){
int nbreLigne=0;
//Traitement insertion
return nbreLigne;
}
}

