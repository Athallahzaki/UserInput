package me.athallah.userinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox ayam1, ayam2, ayam3;
    private String menu1, menu2, menu3;
    private TextView pilih1, pilih2, pilih3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ayam1 = findViewById(R.id.ayam1);
        ayam2 = findViewById(R.id.ayam2);
        ayam3 = findViewById(R.id.ayam3);

        pilih1 = findViewById(R.id.menu_1);
        pilih2 = findViewById(R.id.menu_2);
        pilih3 = findViewById(R.id.menu_3);

        Button pesan = findViewById(R.id.btnpesan);

        pesan.setOnClickListener(view -> {
            menu1 = ayam1.isChecked() ? "Ayam Geprek" : " ";
//            if (ayam1.isChecked()) {
//                menu1 = "Ayam Geprek";
//            } else if (!ayam1.isChecked()) {
//                menu1 = " ";
//            }
            if (ayam2.isChecked()) {
                menu2 = "Ayam Geprek";
            } else if (!ayam2.isChecked()) {
                menu2 = " ";
            }
            if (ayam3.isChecked()) {
                menu3 = "Ayam Geprek";
            } else if (!ayam3.isChecked()) {
                menu3 = " ";
            }

            if (!ayam1.isChecked() && !ayam2.isChecked() && !ayam3.isChecked()) {
                Toast.makeText(getApplicationContext(), "Tidak Ada Menu Yang Dipilih", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Pesanan Terkirim", Toast.LENGTH_SHORT).show();
                pilih1.setText(String.format("Menu 1 : %s", menu1));
                pilih2.setText(String.format("Menu 2 : %s", menu2));
                pilih3.setText(String.format("Menu 3 : %s", menu3));
            }
        });
    }
}