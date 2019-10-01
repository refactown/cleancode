package refactown.cleancode.c08boundary.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LogonControllerTest {

    @Test
    public void logonManualDependency() {
        User userMock = new User("admin", "admin");
        GsonJsonParser parser = new GsonJsonParser();
        LogonController controller = new LogonController(parser);
        User user = controller.logon("admin", "123");

        assertEquals(userMock.getLogin(), user.getLogin());
        assertEquals(userMock.getRole(), user.getRole());
    }

    @Test
    public void  logonInjectDependency() {
        User userMock = new User("admin", "admin");
        LogonController controller = inject(LogonController.class);
        User user = controller.logon("admin", "123");

        assertEquals(userMock.getLogin(), user.getLogin());
        assertEquals(userMock.getRole(), user.getRole());

    }

	private LogonController inject(Class<LogonController> class1) {
		return new LogonController(new GsonJsonParser());
	}

}
