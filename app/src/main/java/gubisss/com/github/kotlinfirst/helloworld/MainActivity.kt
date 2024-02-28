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


        //definindo o conteudo da tela
        setContentView(R.layout.activity_main)
    }

}