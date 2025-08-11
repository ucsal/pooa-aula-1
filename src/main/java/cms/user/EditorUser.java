package cms.user;
public class EditorUser {
  private final int id; private final String nome; private final String email; private final String password;
  public EditorUser(int id, String nome, String email, String password){
    this.id=id; this.nome=nome; this.email=email; this.password=password;
  }
  public int getId(){ return id; } public String getNome(){ return nome; } public String getEmail(){ return email; }
  public boolean checkPassword(String p){ return password.equals(p); }
  public void editContent(int contentId, String body){ /* exclusivo do editor */ }
}
