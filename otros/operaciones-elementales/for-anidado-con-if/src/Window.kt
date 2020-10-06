import services.graphicService.*
import services.graphicService.components.mainBar.MainBar
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*
import kotlin.random.Random

class Window: JFrame() {
    private val screenWidth = 800
    private val screenHeight = 550

    private val mainBar = MainBar(screenWidth, this)
    private val title = JLabel()
    private val title1 = JLabel()
    private val title2 = JLabel()
    private val title3 = JLabel()
    private val text = JTextArea()
    private val text1 = JTextArea()
    private val text2 = JTextArea()
    private val text3 = JTextArea()
    private val text4 = JTextArea()
    private val text5 = JTextArea()
    private val text6 = JTextArea()
    private val text7 = JTextArea()
    private val text8 = JTextArea()

    init {
        val n = 50
        var a: IntArray
        val formulaCaso1: Int
        val formulaCaso2: Int

        //caso 1, descendente 100, 99, ..., 2, 1 siempre ejecuta las instrucciones del if
        a = IntArray(n) {n - it}
        formulaCaso1 = 12*((n*n - n )/ 2) + 6*n - 3

        title.setProperties(50, 100, 800, 64, "Matriz organizada de forma descendente", darkWhite, fontTitle2)
        add(title)

        text.setProperties(50, 150, 700, 100, "Por contador: ${Algoritmo.calcular(n, a)}\nPor fórmula: $formulaCaso1" +
                "\nFórmula: 6N - 3", darkWhite, fontText, false)
        add(text)

        text3.setProperties(132, 185, 700, 100, "2", darkWhite, fontTextMini, false)
        add(text3)

        //caso 2, ascendente 0, 1, 2, ..., 98, 99 nunca ejecuta las instrucciones del if
        a = IntArray(n) {it}
        formulaCaso2 = 5*((n*n - n )/ 2) + 6*n - 3

        title1.setProperties(50, 200, 800, 64, "Matriz organizada de forma ascendente", darkWhite, fontTitle2)
        add(title1)

        text1.setProperties(50, 250, 700, 100, "Por contador: ${Algoritmo.calcular(n, a)}\nPor fórmula: $formulaCaso2" +
                    "\nFórmula: (5N + 7N - 6) / 2", darkWhite, fontText, false)
        add(text1)

        text4.setProperties(137, 285, 700, 100, "2", darkWhite, fontTextMini, false)
        add(text4)

        //caso 3, random 4, 5, 2, 6, 7, 4, 5, 8, 9 las ejecuta la mitad de las veces.
        a = IntArray(n) { Random.nextInt(0, n)}

        mainBar.setLogo(ImageIcon("resources/logo.png"))
        add(mainBar)

        title2.setProperties(50, 300, 800, 64, "Matriz random", darkWhite, fontTitle2)
        add(title2)

        text2.setProperties(50, 350, 700, 100, "Por contador: ${Algoritmo.calcular(n, a)}\nEstimación:  ${(formulaCaso2 + formulaCaso1) / 2}" +
                    "\nFórmula: (17N + 7N - 12) / 4", darkWhite, fontText, false)
        add(text2)

        text5.setProperties(145, 385, 700, 100, "2", darkWhite, fontTextMini, false)
        add(text5)

        //Complejidad de todos los casos
        text6.setProperties(50, 440, 700, 100, "Complejidad de todos los casos: ", darkWhite, fontText, false)
        add(text6)

        text7.setProperties(265, 440, 700, 100, "O(n )", darkWhite, fontEcuation, false)
        add(text7)

        text8.setProperties(290, 435, 700, 100, "2", darkWhite, fontText, false)
        add(text8)

        //Titulo
        title3.setProperties(150, 50, 800, 64, "Método de clasificación por burbuja", darkWhite, fontTitle2)
        add(title3)

        //frame
        setProperties(screenWidth, screenHeight)
    }
}

object Calcular: ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
        try {
            val tareas = JOptionPane.showInputDialog(null, "Ingrese cantidad de etapas", "Pregunta",
                JOptionPane.QUESTION_MESSAGE).toInt()

            var formas = 1
            for(i in 0 until tareas) {
                formas *= (JOptionPane.showInputDialog(null, "Ingrese la cantidad de resultados posibles de la etapa" +
                        " ${i+1}", "Pregunta", JOptionPane.QUESTION_MESSAGE).toInt())
            }
            JOptionPane.showMessageDialog(null, "Todas sus tareas se pueden realizar de $formas formas diferentes")
        }catch (nulls: NullPointerException) {
        }catch (format: NumberFormatException) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número", "Error", JOptionPane.ERROR_MESSAGE)
        }
    }
}