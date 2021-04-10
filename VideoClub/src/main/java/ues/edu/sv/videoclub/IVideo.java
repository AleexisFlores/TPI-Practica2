/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.videoclub;

import java.io.InputStream;

/**
 *
 * @author Aleexis
 */
public interface IVideo {

    int getNumber();

    String getTitle();

    InputStream getDataAsStream();

    
}
