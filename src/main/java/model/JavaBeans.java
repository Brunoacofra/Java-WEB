package model;

public class JavaBeans {
	private String id;
	private String nome;
	private String preco;
	private String idIngrediente;
	
	public JavaBeans() {
		super();
	}
	public JavaBeans(String id, String nome, String preco, String idIngrediente) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.idIngrediente = idIngrediente;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getIdIngrediente() {
		return idIngrediente;
	}
	public void setIdIngrediente(String idIngrediente) {
		this.idIngrediente = idIngrediente;
	}
}
