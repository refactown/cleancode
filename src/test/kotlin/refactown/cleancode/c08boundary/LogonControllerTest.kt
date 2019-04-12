package refactown.cleancode.c08boundary

import org.junit.jupiter.api.*

import org.junit.jupiter.api.Assertions.*

internal class LogonControllerTest {


    @Test
    fun logonManualDependency() {
        val userMock = User("admin", "admin")
        val parser = GsonJsonParser()
        val controller = LogonController(parser)
        val user = controller.logon("admin", "123")

        assertEquals(userMock, user)
    }

    @Test
    fun logonInjectDependency() {
        val userMock = User("admin", "admin")
        val controller = inject(LogonController::class.java) as LogonController
        val user = controller.logon("admin", "123")

        assertEquals(userMock, user)
    }

}

    fun inject(clazz: Class<*>): Any{
        return LogonController(GsonJsonParser())
    }
