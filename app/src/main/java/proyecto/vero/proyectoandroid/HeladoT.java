package proyecto.vero.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class HeladoT extends AppCompatActivity {

    Button Atras;
    CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helado_t);
        Atras = findViewById(R.id.btnAtrasHT);
        c1 = findViewById(R.id.cplam);
        c2 = findViewById(R.id.cplatano);
        c3 = findViewById(R.id.cblue);
        c4 = findViewById(R.id.calegre);
        c5 = findViewById(R.id.ccoco);
        c6 = findViewById(R.id.clucuma);
        c7 = findViewById(R.id.cpistacho);
        c8 = findViewById(R.id.carandano);
        c9 = findViewById(R.id.cfrutilla);
        c10 = findViewById(R.id.cchocolate);
        c11 = findViewById(R.id.cvainilla);
        c12 = findViewById(R.id.csimplet);
        c13 = findViewById(R.id.cdoblet);

        Atras.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SegundaPantalla.class);
                startActivity(intent);

            }
        });
    }
}



