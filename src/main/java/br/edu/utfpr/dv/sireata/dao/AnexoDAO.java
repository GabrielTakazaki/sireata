package br.edu.utfpr.dv.sireata.dao;

import br.edu.utfpr.dv.sireata.dao.algorithms.CreateDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.DeleteDAO;
import br.edu.utfpr.dv.sireata.dao.algorithms.ReadDAO;

public class AnexoDAO extends FullAnexoDAO {
	
    public AnexoDAO (CreateDAO create, ReadDAO read, DeleteDAO delete) {
        this.create = create;
        this.read = read;
        this.delete = delete;
    }
}
