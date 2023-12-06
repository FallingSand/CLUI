package golbal

import golbal.Language.Companion.Lang.*

class Dis(l: Language.Companion.Lang) {
    val initHint: String = when(l) {
        Chinese ->
            """欢迎来到 CommandLine UI
                |作者:(github)qqxnkrut
            """.trimMargin()

        English ->
            """Welcome to CommandLine UI
                |Owner:(github)qqxnkrut
            """.trimMargin()

        Default -> when(Language.getUserLanguage) {
            "en" -> Dis(English).initHint
            "cn" -> Dis(Chinese).initHint

            else -> Dis(English).initHint
        }
    }

    val languageChange: String = if (l != Default) "" else when(Language.getUserLanguage) {
        "cn" ->
            """软件检测到你的系统语言为${Language.getUserLanguage}, 请问你想要更改吗？
                |0/c
            """.trimMargin()

        else ->
            """The software checked your system language and it is ${Language.getUserLanguage}, do you want to change it?
                |0/c
            """.trimMargin()
    }
}