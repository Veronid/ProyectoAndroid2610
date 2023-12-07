package proyecto.vero.proyectoandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaPantalla extends AppCompatActivity {

    Button HelT;
    Button HeSA;
    Button HeEs;

    Button HeVeg;

    Button Pagar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        HelT = findViewById(R.id.btnHT);
        HeSA = findViewById(R.id.btnSA);
        HeEs = findViewById(R.id.btnHE);
        HeVeg = findViewById(R.id.btnHV);
        Pagar = findViewById(R.id.btnIrPagar);



        HelT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HeladoT.class
                );
                startActivity(intent);
            }
        });

        HeSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HeladoSA.class
                );
                startActivity(intent);
            }
        });

        HeEs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HeladoEspecial.class
                );
                startActivity(intent);
            }
        });

        HeVeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        HeladoVegan.class
                );
                startActivity(intent);
            }
        });

        Pagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        FormPago.class
                );
                startActivity(intent);

            }
        });
    }
}
