package cms.user;
public class AdminUser {
  private final int id; private final String nome; private final String email; private final String password;
  public AdminUser(int id, String nome, String email, String password){
    this.id=id; this.nome=nome; this.email=email; this.password=password;
  }
  public int getId(){ return id; } public String getNome(){ return nome; } public String getEmail(){ return email; }
  public boolean checkPassword(String p){ return password.equals(p); }
  public void deleteContent(int contentId){ /* exclusivo do admin */ }
}
