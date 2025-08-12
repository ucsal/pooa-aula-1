package cms.user;

public class GuestUser extends User {
	
	
	public GuestUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
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
