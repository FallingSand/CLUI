package io

import golbal.Language.Companion.Lang

val dis = golbal.Dis(Lang.Default)

class Display(l: Lang) {
    companion object {
        fun init() {
            println(dis.initHint)
        }

        fun clear() {
            print("\u001b[H\u001b[2J")
        }

        class FormatLetterType(Ta: TextAttr = TextAttr.Default, Ff: ForeFront? = null, Bg: BackGround? = null) {
            enum class TextAttr {
                Default,
                Bold,
                Underline,
                Flash,
                Reverse,
                Hide
            }

            enum class ForeFront {
                Black,
                Red,
                Green,
                Yellow,
                Blue,
                Magenta,
                Cyan,
                White
            }

            enum class BackGround {
                Black,
                Red,
                Green,
                Yellow,
                Blue,
                Magenta,
                Cyan,
                White
            }

            private val getTextAttr: Int = when(Ta) {
                TextAttr.Default -> 0
                TextAttr.Bold -> 1
                TextAttr.Underline -> 4
                TextAttr.Flash -> 5
                TextAttr.Reverse -> 7
                TextAttr.Hide -> 8
            }

            private val getForeFront: Int? = when(Ff) {
                null -> null
                ForeFront.Black -> 30
                ForeFront.Red -> 31
                ForeFront.Green -> 32
                ForeFront.Yellow -> 33
                ForeFront.Blue -> 34
                ForeFront.Magenta -> 35
                ForeFront.Cyan -> 36
                ForeFront.White -> 37
            }

            private val getBackGround: Int? = when(Bg) {
                null -> null
                BackGround.Black -> 40
                BackGround.Red -> 41
                BackGround.Green -> 42
                BackGround.Yellow -> 43
                BackGround.Blue -> 44
                BackGround.Magenta -> 45
                BackGround.Cyan -> 46
                BackGround.White -> 47
            }


            val getAll: String = "\u001b[${
                if (getTextAttr == 0 && getForeFront == null && getBackGround == null) "0m"
//                else if (getForeFront == null && getBackGround != null) "$getTextAttr;$getBackGround"
//                else if (getForeFront != null && getBackGround == null) "$getTextAttr;$getForeFront"
//                else if (getForeFront != null && getBackGround != null) "$getTextAttr;$getForeFront;$getBackGround"
//                else "$getTextAttr"
                else when {
                    (getForeFront == null && getBackGround != null) ->
                        "$getTextAttr;$getBackGround"
                    (getForeFront != null && getBackGround == null) ->
                        "$getTextAttr;$getForeFront"
                    (getForeFront != null && getBackGround != null) ->
                        "$getTextAttr;$getForeFront;$getBackGround"
                    else ->
                        "$getTextAttr"
                }
            };"
        }
    }

}