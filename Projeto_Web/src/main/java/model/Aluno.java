package model;

import java.util.Date;
import java.util.List;

public class Aluno {
	private int IdAluno;
	private String nome;
	private String matricula;
	private Date dataNascimento; 
	private String email;
	private String telefone;
	private String endereco;
	private List<AtividadesExtensionistas> atividadesExtensionistas;
	private List<DocumentacaoComprobatoria> documentacoesComprobatorias;
	private String situacao;
	private int horasHomologadas;
	private Date dataRegistroDate;
	private Date dataTermino;
	
	public int getIdAluno() {
		return IdAluno;
	}
	public void setIdAluno(int idAluno) {
		IdAluno = idAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<AtividadesExtensionistas> getAtividadesExtensionistas() {
		return atividadesExtensionistas;
	}
	public void setAtividadesExtensionistas(List<AtividadesExtensionistas> atividadesExtensionistas) {
		this.atividadesExtensionistas = atividadesExtensionistas;
	}
	public List<DocumentacaoComprobatoria> getDocumentacoesComprobatorias() {
		return documentacoesComprobatorias;
	}
	public void setDocumentacoesComprobatorias(List<DocumentacaoComprobatoria> documentacoesComprobatorias) {
		this.documentacoesComprobatorias = documentacoesComprobatorias;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getHorasHomologadas() {
		return horasHomologadas;
	}
	public void setHorasHomologadas(int horasHomologadas) {
		this.horasHomologadas = horasHomologadas;
	}
	public Date getDataRegistroDate() {
		return dataRegistroDate;
	}
	public void setDataRegistroDate(Date dataRegistroDate) {
		this.dataRegistroDate = dataRegistroDate;
	}
	public Date getDataTermino() {
		return dataTermino;
	}
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
}
