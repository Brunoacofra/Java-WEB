package model;

public class ModelIngrediente {
	private String id;
	private String nome;
	
	public ModelIngrediente(String id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public ModelIngrediente() {
		super();
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
	
	
}
