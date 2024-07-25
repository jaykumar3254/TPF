package com.example.projectw;
import android.content.Context;

import android.speech.tts.TextToSpeech;
import java.util.Locale;

public class TextToSpeechHelper implements TextToSpeech.OnInitListener{
    private TextToSpeech tts;
    private boolean isReady = false;

    public TextToSpeechHelper(Context context) {
        tts = new TextToSpeech(context, this);
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = tts.setLanguage(Locale.US);
            isReady = result != TextToSpeech.LANG_MISSING_DATA && result != TextToSpeech.LANG_NOT_SUPPORTED;
        }
    }

    public void speak(String text) {
        if (isReady) {
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }

    public void shutdown() {
        tts.stop();
        tts.shutdown();
    }
}
