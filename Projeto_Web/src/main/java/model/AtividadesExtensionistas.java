package model;

import java.util.Date;
import java.util.List;

public class AtividadesExtensionistas {
	 	private int id;
	    private String nome;
	    private String descricao;
	    private Date dataInicio;
	    private Date dataTermino;
	    private int horasSemanais;
	    private List<String> atribuicoes;
	    private String status;
	    private int numeroProcesso;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public Date getDataInicio() {
			return dataInicio;
		}
		public void setDataInicio(Date dataInicio) {
			this.dataInicio = dataInicio;
		}
		public Date getDataTermino() {
			return dataTermino;
		}
		public void setDataTermino(Date dataTermino) {
			this.dataTermino = dataTermino;
		}
		public int getHorasSemanais() {
			return horasSemanais;
		}
		public void setHorasSemanais(int horasSemanais) {
			this.horasSemanais = horasSemanais;
		}
		public List<String> getAtribuicoes() {
			return atribuicoes;
		}
		public void setAtribuicoes(List<String> atribuicoes) {
			this.atribuicoes = atribuicoes;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public int getNumeroProcesso() {
			return numeroProcesso;
		}
		public void setNumeroProcesso(int numeroProcesso) {
			this.numeroProcesso = numeroProcesso;
		}
		public AtividadesExtensionistas(int id, String nome, String descricao, Date dataInicio, Date dataTermino,
				int horasSemanais, List<String> atribuicoes, String status, int numeroProcesso) {

			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
			this.dataInicio = dataInicio;
			this.dataTermino = dataTermino;
			this.horasSemanais = horasSemanais;
			this.atribuicoes = atribuicoes;
			this.status = status;
			this.numeroProcesso = numeroProcesso;
		}
}
