package proyecto.vero.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormPago extends AppCompatActivity {

    Button AtrasPago;

    Button EnviarPago;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pago);
        AtrasPago = findViewById(R.id.buttonAtraspago);
        EnviarPago = findViewById(R.id.buttonEnviarpago);

        EnviarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        InDelivery.class
                );
                startActivity(intent);
            }
        });

        AtrasPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SegundaPantalla.class
                );
                startActivity(intent);
            }
        });
        }

    }
