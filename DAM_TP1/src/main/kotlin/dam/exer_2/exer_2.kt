import kotlin.system.exitProcess

private val validOperators = arrayOf("shl", "shr", "+", "-", "*", "/", ".", ",")
private val validLogicOperators = arrayOf("||", "&&", "!", "true", "false")
private val validAlternateSymbols = arrayOf("x", ",")
private val findNumbersREGEX = Regex("""\d+(\.\d+)?""")

private fun getUsrInput(): String {
    return readlnOrNull() ?: userRepeatInput()
}

private fun userRepeatInput(): String {
    println("Repita o cálculo...")
    return getUsrInput()
}

/**
 * Limpa o input e valida se existem caracteres proibidos
 */
private fun inputSanitization(continhas: String, validOPs: Array<String>): String {
    var clean = continhas.replace(" ", "").lowercase().trim().replace("x", "*").replace(",", ".")

    // Validação simples: Remove números e operadores válidos. Se sobrar algo, é inválido.
    var testing = clean.replace(Regex("""\d+(\.\d+)?"""), "")
    validOPs.forEach { word -> testing = testing.replace(word, "") }

    if (testing.isNotEmpty()) {
        println("Erro: Caracteres inválidos detectados: $testing")
        if(testing.contains("()")){
            print("Desculpa mas não implementei o uso de parentesis. Essencial, eu sei, mas dava trabalho, muita perguiça.")
        }
        return inputSanitization(userRepeatInput(), validOPs)
    }
    return clean
}

private fun calculate(a: Float, b: Float, symbol: Char): Float? {
    return when (symbol) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> if (b != 0f) a / b else 0f
        else -> null
    }
}

private fun getLeftNumber(s: String): Pair<Float, Int>? {
    val match = findNumbersREGEX.findAll(s).lastOrNull() ?: return null
    return Pair(match.value.toFloat(), match.range.first)
}

private fun getRightNumber(s: String): Pair<Float, Int>? {
    val match = findNumbersREGEX.findAll(s).firstOrNull() ?: return null
    return Pair(match.value.toFloat(), match.range.last)
}

/**
 * Resolve operações aritméticas e bitshifts
 */
private fun operationsThink(continhas: String): Float? {
    if (findNumbersREGEX.matches(continhas)) return continhas.toFloat()

    //Lista de prioridade de operações
    val ops = listOf("*", "/", "+", "-", "shl", "shr")

    for (op in ops) {
        val idx = continhas.indexOf(op)
        if (idx != -1) {
            val leftPart = continhas.substring(0, idx)
            val rightPart = continhas.substring(idx + op.length)

            val leftNum = getLeftNumber(leftPart)
            val rightNum = getRightNumber(rightPart)

            if (leftNum != null && rightNum != null) {
                val res = when (op) {
                    "*" -> leftNum.first * rightNum.first
                    "/" -> leftNum.first / rightNum.first
                    "+" -> leftNum.first + rightNum.first
                    "-" -> leftNum.first - rightNum.first
                    "shl" -> leftNum.first.toInt().shl(rightNum.first.toInt()).toFloat()
                    "shr" -> leftNum.first.toInt().shr(rightNum.first.toInt()).toFloat()
                    else -> 0f
                }

                // Reconstrói a string substituindo a operação pelo resultado
                val newExpr = continhas.substring(0, leftNum.second) + res.toString() + rightPart.substring(rightNum.second + 1)
                return operationsThink(newExpr)
            }
        }
    }
    return continhas.toFloatOrNull()
}

/**
 * Resolve lógica booleana
 */
private fun logicamente(logicas: String): Boolean {
    if (logicas == "true") return true
    if (logicas == "false") return false

    if (logicas.contains("!")) {
        return logicamente(logicas.replace("!true", "false").replace("!false", "true"))
    }

    if (logicas.contains("&&")) {
        val parts = logicas.split("&&", limit = 2)
        return logicamente(parts[0]) && logicamente(parts[1])
    }

    if (logicas.contains("||")) {
        val parts = logicas.split("||", limit = 2)
        return logicamente(parts[0]) || logicamente(parts[1])
    }

    return false
}

private fun menu() {
    println()
    println("--- MENU ---")
    println("1 - Aritmética e Bitshift")
    println("2 - Lógica")
    println("Q - Sair")

    val input = readln().uppercase()

    println()
    when (input) {
        "1" -> {
            println("Escreva a operação:")
            val raw = getUsrInput()
            val clean = inputSanitization(raw, validOperators)
            println("Resultado: ${operationsThink(clean)}")
        }
        "2" -> {
            println("Escreva a lógica:")
            val raw = getUsrInput()
            val clean = inputSanitization(raw, validLogicOperators)
            println("Resultado: ${logicamente(clean)}")
        }
        "Q" -> exitProcess(0)
        else -> println("Opção inválida. Por favor escreva a letra de uma opção válida.")
    }
}

fun main() {
    println("???? DAMN CALCULATOR ????")
    while (true) {
        menu()
    }
}