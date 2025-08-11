package cms.user;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.reflect.Modifier;

class UserStructureTest {
	@Test
	void userDeveSerAbstrataEAvoDasSubclasses() throws Exception {
		try {
			Class<?> user = Class.forName("cms.user.User");
			assertTrue(Modifier.isAbstract(user.getModifiers()), "User deve ser abstract");
			assertEquals(user, Class.forName("cms.user.AdminUser").getSuperclass());
			assertEquals(user, Class.forName("cms.user.EditorUser").getSuperclass());
			assertEquals(user, Class.forName("cms.user.GuestUser").getSuperclass());
		} catch (ClassNotFoundException e) {
			fail("Crie a classe abstract cms.user.User");
		}
	}

	@Test
	void polimorfismoBasico() {
		// Este teste só compila se você criar cms.user.User e ajustar AdminUser para
		// extends User
		// Ajuste depois de criar a superclasse
		AdminUser a = new AdminUser(1, "Ana", "ana@x", "123");
		assertEquals("Ana", a.getNome());
		assertTrue(a.checkPassword("123"));
	}
}
