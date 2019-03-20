package nullability


class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

/*
Rewrite Java method 'MessageUtil.sendMessageToClient' in Kotlin in 3 lines:

public class MessageUtil {
    public static void sendMessageToClient(@Nullable Client client, @Nullable String message, @NotNull Mailer mailer) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }
}
*/
fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email
    if (message != null && email != null) {
        mailer.sendMessage(email, message)
    }
}