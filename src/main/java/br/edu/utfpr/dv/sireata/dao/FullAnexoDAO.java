package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.CreateDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.DeleteDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ReadDAO;
import br.edu.utfpr.dv.sireata.model.DAOEntity;
import java.sql.SQLException;
import java.util.List;

public abstract class FullAnexoDAO {
    protected CreateDAO create;
    protected ReadDAO read;
    protected DeleteDAO delete;
    
    public void criar(DAOEntity e) throws SQLException {
        create.salvar(e);
    } 
    public void excluir(int i) throws SQLException {
        delete.excluir(i);
    } 
    public List<? extends DAOEntity> listarPorAta(int idAta) throws SQLException {
        return read.listarPorAta(idAta);
    }  
    public DAOEntity buscarPorId(int id) throws SQLException {
        return read.buscarPorId(id);
    }
}
