package nullability

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@Suppress("FunctionName")
internal class BasicsTests {

    class MailCollector() : Mailer {
        data class Mail(val email: String, val message: String)

        val emails = mutableListOf<Mail>()

        override fun sendMessage(email: String, message: String) {
            emails += Mail(email, message)
        }
    }

    @Test
    fun `When client is null, email we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(null, "AAA", mailer)
        assertTrue(mailer.emails.isEmpty())
    }

    @Test
    fun `When message is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo("AAA")), null, mailer)
        assertTrue(mailer.emails.isEmpty())
    }

    @Test
    fun `When personal info is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(null), "AAA", mailer)
        assertTrue(mailer.emails.isEmpty())
    }

    @Test
    fun `When email address is null, we do not send email`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo(null)), null, mailer)
        assertTrue(mailer.emails.isEmpty())
    }

    @Test
    fun `Sends messages correctly for correct values`() {
        val mailer = MailCollector()
        sendMessageToClient(Client(PersonalInfo("AAA")), "BBB", mailer)
        assertEquals(mutableListOf(MailCollector.Mail("AAA", "BBB")), mailer.emails)
    }
}