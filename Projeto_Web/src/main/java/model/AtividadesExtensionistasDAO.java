package model;

import java.util.Date;
import java.util.List;

public interface AtividadesExtensionistasDAO {
    
    public void salvar(AtividadesExtensionistas atividade);
    
    public void atualizar(AtividadesExtensionistas atividade);
    
    public void excluir(AtividadesExtensionistas atividade);
    
    public List<AtividadesExtensionistas> buscarTodas();
    
    public List<AtividadesExtensionistas> buscarPorAluno(Aluno aluno);
    
    public List<AtividadesExtensionistas> buscarPorPeriodo(Date inicio, Date fim);
    
    public List<AtividadesExtensionistas> buscarEncerradas();
    
    public List<AtividadesExtensionistas> buscarEmAndamento();
    
    public AtividadesExtensionistas buscarPorId(int id);
    
}
