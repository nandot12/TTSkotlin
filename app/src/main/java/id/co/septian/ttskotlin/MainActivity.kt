package id.co.septian.ttskotlin

import android.os.Build.VERSION_CODES.O
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import kotlinx.android.synthetic.main.activity_main.*
import org.intellij.lang.annotations.Language
import java.util.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //deklrasi variable
        var tts : TextToSpeech? = null

        //setting tts
         tts = TextToSpeech(this, TextToSpeech.OnInitListener {
            status ->

            //check ttts
            if(status == TextToSpeech.SUCCESS){

                //kalau success set bahasanya
                var locale = Locale("ID")
                tts?.setLanguage(locale)

            }
             else{

            }
        })
        btnSpeak.setOnClickListener {
                //proses ubah jadi suara
            tts.speak(inputsomething.text.toString(),TextToSpeech.QUEUE_FLUSH,null)

        }





    }
}
