package model;

import java.util.Date;

public class DocumentacaoComprobatoria {
	private int id;
    private int idAluno;
    private int idAtividade;
    private Date dataEnvio;
    private String status;
    private byte[] arquivo;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdAtividade() {
		return idAtividade;
	}
	public void setIdAtividade(int idAtividade) {
		this.idAtividade = idAtividade;
	}
	public Date getDataEnvio() {
		return dataEnvio;
	}
	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}
	
	public DocumentacaoComprobatoria(int id, int idAluno, int idAtividade, Date dataEnvio, String status,
			byte[] arquivo) {
		this.id = id;
		this.idAluno = idAluno;
		this.idAtividade = idAtividade;
		this.dataEnvio = dataEnvio;
		this.status = status;
		this.arquivo = arquivo;
	}

}