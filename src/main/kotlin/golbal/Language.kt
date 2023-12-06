package golbal

class Language {
    companion object {
        enum class Lang {
            Chinese,
            English,
            Default
        }

        val getUserLanguage: String = System.getProperty("user.language")
    }
}