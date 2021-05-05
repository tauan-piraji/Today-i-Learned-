package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	
	public Pessoa() {
	}
	
	public Pessoa (Integer ID, String NAME, String EMAIL) {
		this.id = ID;
		this.name = NAME;
		this.email = EMAIL;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String NAME) {
		this.name = NAME;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String EMAIL) {
		this.email = EMAIL;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id="+id+", nome="+name+", e-mail="+email+"]";
	}
	
}
