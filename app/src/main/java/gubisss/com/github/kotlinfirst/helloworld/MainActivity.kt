package gubisss.com.github.kotlinfirst.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

/*in java
public class MainActivity() extends ComponentActivity {
}

@override
public void onCreate(Bundle savedInstanceState) {
}
*/
class MainActivity : ComponentActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Criando um objeto de texto
        val texto = TextView(this)
        texto.text = "Hello Kotlin"

        //definindo o conteudo da tela
        setContentView(texto)
    }

}