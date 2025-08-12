package cms.user;

public abstract class User {
    final int id; 
    final String nome; 
    final String email; 
    final String password;

    public User(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }
}
