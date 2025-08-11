# Aula 1 — Atividade (OO turbo em Java)
**Objetivo:** refatorar três classes duplicadas (`AdminUser`, `EditorUser`, `GuestUser`) extraindo uma **classe abstrata `User`** e demonstrar **polimorfismo**.

## Entregáveis
1. `User.java` (abstract) com campos `id`, `nome`, `email`, `password`, getters e `checkPassword`.
2. `AdminUser`, `EditorUser`, `GuestUser` **estendendo** `User` (sem duplicar estado).
3. Testes JUnit passando (vide `UserStructureTest`).

## Como rodar localmente
```bash
mvn -q test
```

## Passo a passo (aluno)
1. **Clone** o repositório da atividade.
2. Abra no **IDE** (IntelliJ/VS Code/Eclipse).
3. Leia o código legado em `src/main/java/cms/user/`.
4. Crie `User.java` (abstract), mova os **campos e métodos** comuns.
5. Faça `AdminUser/EditorUser/GuestUser` **extends User** (remova duplicações).
6. Garanta **polimorfismo**: nada de `instanceof` para esta atividade.
7. Rode os testes: `mvn -q test`. Corrija até ficar **verde**.
8. Faça **commits pequenos** e **push**.
9. Verifique o **Actions** (CI) no GitHub para validar o autograde.

## Rubrica (10 pts)
- Compila (2)
- `User` abstrata e correta (3)
- Subclasses sem duplicação de estado (3)
- Teste de polimorfismo verde (2)

## Referências oficiais
- dev.java — Classes & Objects: https://dev.java/learn/classes-objects/
- dev.java — Inheritance/Polymorphism: https://dev.java/learn/inheritance/
- JUnit 5 User Guide: https://docs.junit.org/current/user-guide/
- Maven Surefire (JUnit Platform): https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html
- GitHub Classroom — Autograding: https://docs.github.com/en/education/manage-coursework-with-github-classroom/teach-with-github-classroom/use-autograding
