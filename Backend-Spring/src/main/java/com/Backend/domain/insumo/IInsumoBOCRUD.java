/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Backend.domain.insumo;

import com.Backend.entities.Insumo;
import java.util.List;

public interface IInsumoBOCRUD {
    public Insumo create(Insumo insumo);
    public List<Insumo> findAll();
    public Insumo findById(int insumo_Id);
    public void delete(int insumo_Id);
}