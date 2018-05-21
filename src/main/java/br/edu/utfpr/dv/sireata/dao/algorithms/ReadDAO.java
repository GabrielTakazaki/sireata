/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dv.sireata.dao.algorithms;

import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MEU
 */
public interface ReadDAO {
    public DAOEntity buscarPorId(int id) throws SQLException;
    public List<? extends DAOEntity> listarPorAta(int idAta) throws SQLException;
}
