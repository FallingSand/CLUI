fun main(args: Array<String>) {
    io.Display.init()
    print(io.Display.Companion.FormatLetterType(io.Display.Companion.FormatLetterType.TextAttr.Bold).getAll + "hi")
}