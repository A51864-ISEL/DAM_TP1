# Tutorial 1 - _Hello World_

Curso: Engenharia Informática e Multimédia
<br>
Estudante: Nuno Santos
<br>
Data: 14/03/2026
<br>
Link do Repositório: https://github.com/A51864-ISEL/DAM_TP1

## 1. Introdução
Neste Trabalho Prático 1, o propósito foi ganhar os conhecimentos base da linguagem Kotlin e as suas capacidades de linguage orientada a objetos, do ambiente de desenvolvimento do Android Studio e do seu _workflow_, instalação dos SDK do Android Studio e das suas máquinas virtuais que iremos usar para o desenvolvimento das aplicações, uso de ADB para desenvolvimento da app com um dispositivo local, criação de interfaces usando as ferramentas do Android Studio e do uso do strings.xml para se definir texto na interface facilitando as traduções da app para outros idiomas.

## 2. Visão Geral do Sistema

### Programas de Consola de Kotlin

1 - **Exercicio 1**: Criação de arrays com os primeiros 50 quadrados perfeitos, criados de formas diferentes
<br>
2 - **Exercício 2**: Calculadora de consola que suporta operações aritméticas, lógicas e de _bitshift_
<br>
3 - **Exercício 3**: Simulação de saltos de uma bola que salta até 60% do salto anterior
<br>
4 - **Library Management System**: Uma implementação de um programa em Kotlin para gestão de uma biblioteca.

### Projetos de Android Studio
1 - **HelloWorld**: Uma pequena app de android de teste feita para testar a workflow do Android Studio
<br>
2 - **HelloWorldOptional**: Uma app de android que mostra informações sobre o dispositivo em que é rodado

## 3. Arquitetura e Design

### Exercícios Kotlin

```text
DAM_TP1
├── pom.xml
├── src
│   ├── main
│   │   ├── kotlin
│   │   │   ├── dam
│   │   │   │   ├── exer_1
│   │   │   │   │   └── exer_1.kt
│   │   │   │   ├── exer_2
│   │   │   │   │   └── exer_2.kt
│   │   │   │   ├── exer_3
│   │   │   │   │   └── exer_3.kt
│   │   │   │   ├── exer_v1
│   │   │   │   │   ├── Book.kt
│   │   │   │   │   ├── DigitalBook.kt
│   │   │   │   │   ├── Library.kt
│   │   │   │   │   ├── LibraryManagementSystem.kt
│   │   │   │   │   ├── LibraryMember.kt
│   │   │   │   │   └── PhysicalBook.kt
│   │   │   │   └── virtual_library
│   │   │   └── main.kt
│   │   └── resources
│   └── test
│       ├── kotlin
│       └── resources
└── target
    ├── classes
    │   ├── dam
    │   │   ├── exer_3
    │   │   │   ├── Exer_3Kt.class
    │   │   │   ├── Exer_3Kt$main$bounceSequence$1.class
    │   │   │   └── Exer_3Kt$main$bounceSequence$2.class
    │   │   └── exer_v1
    │   │       ├── Book.class
    │   │       ├── DigitalBook.class
    │   │       ├── Library.class
    │   │       ├── Library$Companion.class
    │   │       ├── LibraryManagementSystemKt.class
    │   │       ├── LibraryMember.class
    │   │       └── PhysicalBook.class
    │   ├── Exer_1Kt.class
    │   ├── Exer_2Kt.class
    │   ├── MainKt.class
    │   └── META-INF
    │       └── DAM_TP1.kotlin_module
    └── generated-sources
        └── annotations
```

Exercícios feitos na linguagem Kotlin no modo Maven. Este tinha um repositório local com os seus respetivos commits, estes foram transcritos para a secção 7. Cada exercício foi realizado dentro do seu próprio package conforme especificado.

### Android Studio
```text
.
└── HelloWorld
    ├── app
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   └── src
    │       ├── androidTest
    │       │   └── java
    │       │       └── dam_a51864
    │       │           └── helloworld
    │       │               └── ExampleInstrumentedTest.kt
    │       ├── main
    │       │   ├── AndroidManifest.xml
    │       │   ├── ic_launcher-playstore.png
    │       │   ├── java
    │       │   │   └── dam_a51864
    │       │   │       └── helloworld
    │       │   │           ├── FishingMsgs.kt
    │       │   │           └── MainActivity.kt
    │       │   └── res
    │       │       ├── drawable
    │       │       │   ├── banana.png
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   └── ic_launcher_foreground.xml
    │       │       ├── drawable-night
    │       │       │   └── brightness_and_contrast.png
    │       │       ├── layout
    │       │       │   └── activity_main.xml
    │       │       ├── layout-land
    │       │       │   └── activity_main.xml
    │       │       ├── mipmap-anydpi-v26
    │       │       │   ├── ic_launcher_round.xml
    │       │       │   └── ic_launcher.xml
    │       │       ├── mipmap-hdpi
    │       │       │   ├── ic_launcher_foreground.webp
    │       │       │   ├── ic_launcher_monochrome.webp
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-mdpi
    │       │       │   ├── ic_launcher_foreground.webp
    │       │       │   ├── ic_launcher_monochrome.webp
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xhdpi
    │       │       │   ├── ic_launcher_foreground.webp
    │       │       │   ├── ic_launcher_monochrome.webp
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xxhdpi
    │       │       │   ├── ic_launcher_foreground.webp
    │       │       │   ├── ic_launcher_monochrome.webp
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xxxhdpi
    │       │       │   ├── ic_launcher_foreground.webp
    │       │       │   ├── ic_launcher_monochrome.webp
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── values
    │       │       │   ├── colors.xml
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   ├── strings.xml
    │       │       │   └── themes.xml
    │       │       ├── values-night
    │       │       │   └── themes.xml
    │       │       └── xml
    │       │           ├── backup_rules.xml
    │       │           └── data_extraction_rules.xml
    │       └── test
    │           └── java
    │               └── dam_a51864
    │                   └── helloworld
    │                       └── ExampleUnitTest.kt
    ├── build.gradle.kts
    ├── gradle
    │   ├── gradle-daemon-jvm.properties
    │   ├── libs.versions.toml
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradle.properties
    ├── gradlew
    ├── gradlew.bat
    ├── hellodeviceinfo
    │   ├── build.gradle.kts
    │   ├── proguard-rules.pro
    │   └── src
    │       ├── androidTest
    │       │   └── java
    │       │       └── dam_a51864
    │       │           └── hellodeviceinfo
    │       │               └── ExampleInstrumentedTest.kt
    │       ├── main
    │       │   ├── AndroidManifest.xml
    │       │   ├── java
    │       │   │   └── dam_a51864
    │       │   │       └── hellodeviceinfo
    │       │   │           └── MainActivity.kt
    │       │   └── res
    │       │       ├── drawable
    │       │       │   ├── ic_launcher_background.xml
    │       │       │   └── ic_launcher_foreground.xml
    │       │       ├── layout
    │       │       │   └── activity_main.xml
    │       │       ├── mipmap-anydpi-v26
    │       │       │   ├── ic_launcher_round.xml
    │       │       │   └── ic_launcher.xml
    │       │       ├── mipmap-hdpi
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-mdpi
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xhdpi
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xxhdpi
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── mipmap-xxxhdpi
    │       │       │   ├── ic_launcher_round.webp
    │       │       │   └── ic_launcher.webp
    │       │       ├── values
    │       │       │   ├── colors.xml
    │       │       │   ├── strings.xml
    │       │       │   └── themes.xml
    │       │       └── values-night
    │       │           └── themes.xml
    │       └── test
    │           └── java
    │               └── dam_a51864
    │                   └── hellodeviceinfo
    │                       └── ExampleUnitTest.kt
    └── settings.gradle.kts
```

**Linguagem de Programação da App**: Kotlin
**SDK Mínimo**: API 24 (Android 7.0)

## 4. Implementação

### Exercícios de Kotlin

#### Exercício 1 (exer_1)
No exercício 1 de Kotlin, os arrays de numeros dos primeiros 50 quadrados perfeitos foram criados de 3 maneiras diferentes.

No primeiro método o primeiro array é um ```IntArray``` e é criado multiplicando o índice atual por ele próprio sendo cada um deles somado a mais um visto que é preciso ter em conta que neste método o primeiro indíce é 0 e não 1.
```kotlin
val fitftySquaresOfP_intArrayOf = IntArray(50){ (it + 1) * (it + 1) };
```

O segundo é criado pelo método map, que numa iteração de 1 a 50 mapeia os valores de cada indíce por multiplicações entre eles mesmos e transforma num ```IntArray```
```kotlin
val fitftySquaresOfP_map = (1..50).map { it * it }.toIntArray();
```

O terceiro é criado com um ```Array``` normal de inteiros de tamanho 50, sendo os seus valores atribuidos da mesma maneira que foram no primeiro método mencionado
```kotlin
val fitftySquaresOfP_array = Array<Int>(50) {(it + 1) * (it + 1) };
```

### Exercício 2 (exer_2)
Para ser feita a calculadora foi decidido implementa-la criando um menu interativo para dividir o programa em 2 partes:
1 - Artimética e Bitshift
2 - Lógica

O programa funciona de maneira similar para ambas as operações. Na primeira, são aceites números, operações de multiplicar, dividir, subtrair e somar e bitshift para a esquerda e bitshift para a direita. Já para o segundo o utilizador apenas pode usar termo lógicos (true e false) e os operadores lógicos (&&, || e !), onde && e || terão de estar obrigatóriamente entre 2 termos lógicos e ! tem de estar logo atrás de um termo lógico.

Assim que recebido o input do utilizador é verificado se ele é válido, comparando-o com uma lista de símbolos permitidos para a operação e caso falhe, o utilizador terá de reintroduzir o input dado.

Assim são chamados os métodos recursivos ```logicamente(logicas: String)``` e ```operationsThink(continhas: String)``` para fazer o cálculo dos valores entre cada operador até chegar a uma conclusão.

### Exercício 3
No exercício 3, a sequência pode ser facilmente criada com o ```generateSequence(bounceHeight)```, onde ```bounceHeight``` é a altura onde a bola é lançada, criando essa sequência até ter 15 termos ou até o próximo valor da sequência ser menor ou igual à altura mínima definida no enunciado que está definida na variável global ```minHeight```

```kotlin
val bounceSequence = generateSequence(bounceHeight) { it * 0.6f }
        .take(15)
        .takeWhile { it >= minHeight }
```

Para se visualizar as alturas da bola cria-se uma lista com uma determinada altura de caracteres e largura equivalente aos valor númerico dos saltos mais as linhas de visualização, 2 de cada lado do valor numérico, e faz-se o cálculo ```(bounce / maxBounce) * (bouncesTerminalHeight - 1)``` para se saber onde nesse array ficará a representação da altura da bola para ter a representação mais fiél na terminal.

### exer_v1 (LibraryManagementSystem)

LibraryManagementSystem é uma pequena biblioteca em Kotlin que é composta por uma classe abstrada ```Book``` pai de ```PhysicalBook``` e ```DigitalBook``` que contém informações sobre o seu ano de lançamento, o seu autor, título e o seu número de stock na biblioteca para sabermos se podem ser alugados.

```LibraryMember``` apenas guarda o nome, o ID e os livros que um determinado membro da biblioteca requesitou.

```Library``` permite então registar-se novos livros, novos utilizadores e registar requesições de livros feitos por pessoas e devoluções feitas.

### Android Studio

#### HelloWorld (app)

O ```activity_main.xml``` da app do HelloWorld é composto pelos seguintes elementos na ordem de cima para baixo com as suas respetivas funcções

1. - TextView1: Mostra a mensagem de _Hello Android World_ com letras na cor roxa
2. - TextView2: Mostra a mensagem _My First App_ num fundo amarelo que cobre a largura da _activity_ da app
3. - CalendarView: Mostra uma calendário ao utilizador onde aponta de forma predefinida o dia atual
4. - Switch (Extra): Muda a mensagem do TextView2 para "Nice Day for fishing Ain't it?"

Todas os valores de string para os TextView que a app usa, inclusive os textos que só aparecem quando o switch é acionado, foram escritos no ```string.xml```

Para processar o toggle do switch e alterar-se assim a mensagem do TextView2 foi criando uma classe auxiliar chamada _FishingMsgs_ que é chamada no fim do ```onCreate(savedInstanceState: Bundle?)``` da classe ```MainActivity```. Passando a própria ```MainActivity``` para a classe auxiliar é possivel detetarmos os eventos do switch através do seu ID e vendo se está ativo ou não quando este é pressionado.

```kotlin
fun niceDayForFishingMessageToggle(activity: MainActivity) {
            // Find the views
            val fishingSwitch = activity.findViewById<SwitchMaterial>(R.id.fishingTextSwitch)
            val firstAppMessage = activity.findViewById<TextView>(R.id.firstAppMessage)

            if (fishingSwitch != null && firstAppMessage != null){
                fishingSwitch.setOnCheckedChangeListener { _, isChecked ->
                    if (!isChecked) {
                        firstAppMessage.text = activity.getString(R.string.first)
                    } else {
                        firstAppMessage.text = activity.getString(R.string.fishing)
                    }
                }
            }
        }
```

#### HelloWorldOpcional (helloworlddeviceinfo)

Para ser apresentada a informação do dispositivo ao utilizador foi criado um elemento de _Multiline Text_ no ```activity_main.xml``` que aponta para uma entrada no ```string.xml``` com parametros que são injetados na altura de execução do programa.

```xml
<string name="system_info">
        Manufacturer: %1$s\nModel: %2$s\nBrand: %3$s\nType: %4$s\nUser: %5$s\nBase: %6$d\nIncremental: %7$s\nSDK: %8$d\nVersion: %9$s\nDisplay: %10$s
</string>
```

Quando a app é iniciada, esta, através do id do elemento do _Multiline Text_, forma uma nova string com todas as informações relevantes mostradas no exemplo do enunciado usando a biblioteca ```android.os.build``` e introduzindo esse valor de texto na caixa de texto da interface da atividade da app

```kotlin
val infoTextView = findViewById<TextView>(R.id.systemInfoTextMultiline)

        //Write system information
        val infoText = getString(
            R.string.system_info,
            Build.MANUFACTURER,
            Build.MODEL,
            Build.BRAND,
            Build.TYPE,
            Build.USER,
            Build.VERSION.SDK_INT_FULL,
            Build.VERSION.INCREMENTAL,
            Build.VERSION.SDK_INT,
            Build.VERSION.RELEASE,
            Build.DISPLAY
        )

        infoTextView.text = infoText
```


## 5. Testes e Validação

### Exercícios Kotlin

1. - **Exercício 1**: Verificou-se na altura de execução de os valores existentes em cada um dos arrays criados das 3 formas diferentes eram iguais (1, 4, 9, 16, ..., 2500).
2. - **Exercício 2**: Testou-se se os resultados de uma operação eram coerentes e se era pedido uma nova operação ao utilizador caso este usa-se lógica inválida ou parentesis (uma das limitações do código por causa das prioridades de operações).
3. - **Exercício 3**: Como os valores não mudam, testou-se apenas se os valores eram coerentes, sempre 60% do anterior e se eram todos maiores que 1.
4. - **LibraryManagementSystem**: Após a execução, verificou-se se o _output_ da consola era similar aquele dado no enunciado.

### Android Studio
1. - **HelloWorld**: Executou-se a app e verificou-se se o switch de mudança de texto mudava então o texto do _My First App_ para _Nice day for fishing ain't it_
2. - **HelloWorldOpcional**: Executou-se a app num telemóvel real e verificou-se que a informação era coerente com a informação da marca e da versão do android instalada nesse mesmo dispositivo.

## 6. Instruções de uso

### Programas de Kotlin
1. - Abrir o projeto DAM_TP1 no IntelliJ IDEA.
2. - Navegar ate à classe do exercicio pretendido e carregar no botão de run (o que tem o símbolo _play_).
3. - Correr os comandos pedidos na consola caso se aplique ao exercício

### Hello Worlds do Android Studio
1. - Abrir o projeto code no Android Studio.
2. - Expandir a pasta referente à app de HelloWorld desejada, onde app é o HelloWorld normal e HelloWorldDeviceInfo é o que tem a versão com as informações do sistema
3. - Correr a classe MainActivity no caminho relativo ./kotlin+java/dam_a51864.[nomeapp]/MainActivity através do botão de run (o que tem o símbolo _play_).

## 12. - Controlo de versão

No repositório local criado no intelliJ para os exercícios de kotlin foram feitos os seguintes commits:
```
commit d071b5b591d126c45071dea69248b2390ece7630 (HEAD -> master)
Author: ISEL-A51864
Date:   Thu Mar 12 12:13:57 2026 +0000

    Library Management System

commit 7415c3e0684e349b36b8565f79f2fa313add51d5
Author: ISEL-A51864
Date:   Tue Mar 10 18:37:01 2026 +0000

    exercícios 1 e 2

commit 56b2c2d5428150f3fad45f1e756a8d76d63d80e4
Author: ISEL-A51864
Date:   Tue Mar 10 18:36:36 2026 +0000

    exercício 3 completo
```

```
Os commits deste repositório são os seguintes:
commit 2c719e84144e2aaaf57db31c1c50d05b150b6405 (HEAD -> main, origin/main, origin/HEAD)
Author: A15864 <A51864@alunos.isel.pt>
Date:   Sat Mar 14 20:44:25 2026 +0000

    commit inicial com todos os passos dos pontos 2 e 3 já realizados

commit 5e03f559aa1e0c8fd7282389a789c0c49aff2362
Author: A15864 <A51864@alunos.isel.pt>
Date:   Sat Mar 14 20:40:11 2026 +0000

    Initial commit
```

## 13. - Dificuldades e lições aprendidas
1. - No HelloWorld quando foi adicionada a funcionalidade de trocar o texto com o _switch_ foi preciso verificar se o texto e o botão eram nulls porque na troca do texto havia uns instantes onde isso acontecia e por consequência não era possível trocar o texto de volta
2. - No exercício 2 de Kotlin havia um erro onde as operações retornavam nada, isso acontecia porque as strings nas operações recursivas eram separadas com indíces iguais o que causava um erro de separação de strings.

## 14. - Melhorias futuras
1. - Adicionar ordem de operações com parentesis ao exercício 2 de Kotlin
2. - Verificar divisões por 0 no exercício 2 de Kotlin
3. - Adicionar _dark mode_ à app do HelloWorld

## 15. - Declaracao de Uso de IA (Obrigatorio)
Em nenhum destes exercícios foi usada IA de agente nem auto-complete disponível na IDE. Ambos porque não foi pedido mas também para proteger e controlar os dados enviados para servidores controlados por entidades com fins próprios e lucrativos.

Foram apenas usados prompts manuais com, por vezes, pequenos _snippets_ com informação relevante e sem o completo contexto do código ou do trabalho, ou com pedidos de exemplos mais concretos face às documentações consultadas. A IA usada foi o Google Gemini no modo Fast com o histórico de atividade desligado (https://support.google.com/gemini/answer/13594961?visit_id=639044633312039688-578266553&p=privacy_notice&rd=1#privacy_notice) ou com o Gemma3-12B a rodar em LocalLM num PC controlado por mim.

O resto do código foi escrito consultado a documentação do Kotlin, Android Studio ou o site Stack Overflow.