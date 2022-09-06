package me.athallah.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        final RadioGroup grupPert_1 = findViewById(R.id.grupPert_1);
        Button btSubmit = findViewById(R.id.btn_jawab);
        final TextView scoreTxt = findViewById(R.id.scoretxt);

        btSubmit.setOnClickListener(view -> {
            int id = grupPert_1.getCheckedRadioButtonId();
            int score = 0;

            switch (id) {
                case R.id.jwb_1:
                case R.id.jwb_2:
                    Toast.makeText(getApplicationContext(), String.format("Pilihan Anda %s Salah", ((RadioButton) findViewById(id)).getText()), Toast.LENGTH_SHORT).show();
                    scoreTxt.setText(String.format("Score :  %s",score));
                    break;
                case R.id.jwb_3:
                    Toast.makeText(getApplicationContext(), String.format("Pilihan Anda %s Benar", ((RadioButton) findViewById(id)).getText()), Toast.LENGTH_SHORT).show();
                    score += 1;
                    scoreTxt.setText(String.format("Score :  %s",score));
                    break;
            }
        });
    }
}