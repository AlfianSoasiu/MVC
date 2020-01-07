/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.alfian.latihanmvc.model;

import edu.alfian.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class PelangganModel {
    
    private String nama;
    private String email;
    private String notelp;
    
    private PelangganListener pelangganlistener;

    public PelangganListener getPelangganlistener() {
        return pelangganlistener;
    }

    public void setPelangganlistener(PelangganListener pelangganlistener) {
        this.pelangganlistener = pelangganlistener;
    }
    
    

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNotelp() {
        return notelp;
    }

    public void setNotelp(String notelp) {
        this.notelp = notelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (pelangganlistener!=null) {
            pelangganlistener.onChange(this);
        }
        
    }
    
    public void resetForm(){
        setNama("");
        setEmail("");
        setNotelp("");
    }
    
    public void simpanForm(){
        JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        resetForm();
    }
    
}
