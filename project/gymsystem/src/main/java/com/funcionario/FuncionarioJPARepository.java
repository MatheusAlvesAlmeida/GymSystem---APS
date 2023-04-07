package com.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioJPARepository implements IFuncionarioRepository {

        @Autowired private FuncionarioDAO funcionarioDAO;
    
        @Override
        public void insert(Funcionario funcionario) {
            funcionarioDAO.save(funcionario);
        }
    
        @Override
        public void delete(String cpf) {
            funcionarioDAO.deleteById(cpf);
        }
    
        @Override
        public Iterable<Funcionario> getAll() {
            return funcionarioDAO.findAll();
        }
    
        @Override
        public Funcionario getFuncionarioByCpf(String cpf) {
            return funcionarioDAO.findById(cpf).get();
        }
    
        @Override
        public void update(String cpf, Funcionario funcionario) {
            funcionarioDAO.deleteById(cpf);
            funcionarioDAO.save(funcionario);
        }
}
