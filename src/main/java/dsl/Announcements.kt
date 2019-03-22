package dsl

fun getAnnouncements(passingStudentsListText: String, bestStudentsListText: String): List<Announcement> = announcements {
    reminder("If you want to receive internship, you need to provide documents till end of September")
    info {
        title = "Students who are passing:"
        content = passingStudentsListText
    }
    info {
        title = "Internships:"
        content = bestStudentsListText
    }
    reminder("Work hard whole year and prepare to all classes")
    info {
        content = "Checking this app periodically will help you be up to date with your university"
    }
}

fun announcements(init: AnnouncementBuilder.() -> Unit): List<Announcement> {
    return AnnouncementBuilder().apply(init).announcements
}

class AnnouncementBuilder {
    var announcements = listOf<Announcement>()
    fun reminder(text: String) {
        announcements += Announcement("Remember!", text)
    }

    fun info(init: InfoBuilder.() -> Unit) {
        val builder = InfoBuilder()
        init.invoke(builder)
        init(builder)
        builder.init()
        announcements += builder.announcement
    }
}

class InfoBuilder {
    var title: String? = null
    var content: String? = null
    val announcement: Announcement
        get() = Announcement(title, content!!)
}

data class Announcement(
        val title: String?,
        val text: String
)

fun main() {
    print(getAnnouncements("passing", "internships"))
}