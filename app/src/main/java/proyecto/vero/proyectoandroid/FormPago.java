package proyecto.vero.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormPago extends AppCompatActivity {

    Button AtrasPago;

    Button EnviarPago;

    TextView Nombre;
    TextView Apellido;
    TextView Rut;
    TextView Poblacion;
    TextView Pasaje;
    TextView Calle;
    TextView Casa;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pago);
        AtrasPago = findViewById(R.id.buttonAtraspago);
        EnviarPago = findViewById(R.id.buttonEnviarpago);
        Nombre = findViewById(R.id.txtNombreC);
        Apellido = findViewById(R.id.txtApellidoC);
        Rut = findViewById(R.id.txtRutC);
        Poblacion = findViewById(R.id.txtPC);
        Pasaje = findViewById(R.id.txtPasajeC);
        Calle = findViewById(R.id.txtCalle);
        Casa = findViewById(R.id.txtCasa);

        String nombre = Nombre.getText().toString().trim();
        String apellido = Apellido.getText().toString().trim();
        String rut = Rut.getText().toString().trim();
        String poblacion = Poblacion.getText().toString().trim();
        String pasaje = Pasaje.getText().toString().trim();
        String calle = Calle.getText().toString().trim();
        String casa = Casa.getText().toString().trim();

        if (nombre.isEmpty()){
            Nombre.setError("Campo Vacio");
            Apellido.setError("Campo Vacio");
            Rut.setError("Campo Vacio");
            Poblacion.setError("Campo Vacio");
            Pasaje.setError("Campo Vacio");
            Calle.setError("Campo Vacio");
            Casa.setError("Campo Vacio");
        }
        else{

        }

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
