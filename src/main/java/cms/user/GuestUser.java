package cms.user;

public class GuestUser {
	private final int id;
	private final String nome;
	private final String email;
	private final String password;

	public GuestUser(int id, String nome, String email, String password) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public boolean checkPassword(String p) {
		return password.equals(p);
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
