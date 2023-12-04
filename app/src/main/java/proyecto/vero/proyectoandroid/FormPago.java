package proyecto.vero.proyectoandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormPago extends AppCompatActivity {

    Button AtrasPago;
    Button EnviarPago;
    Button Verdelivery;
    TextView Nombre;
    TextView Apellido;
    TextView Rut;
    TextView Poblacion;
    TextView Pasaje;
    TextView Calle;
    TextView Casa;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_pago);
        AtrasPago = findViewById(R.id.buttonAtraspago);
        EnviarPago = findViewById(R.id.VerDelivery);
        Verdelivery = findViewById(R.id.Enviarpago);

        Nombre = findViewById(R.id.txtNombreC);
        Apellido = findViewById(R.id.txtApellidoC);
        Rut = findViewById(R.id.txtRutC);
        Poblacion = findViewById(R.id.txtPC);
        Pasaje = findViewById(R.id.txtPasajeC);
        Calle = findViewById(R.id.txtCalle);
        Casa = findViewById(R.id.txtCasa);

        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

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
        Verdelivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("Nombre").setValue(Nombre.getText().toString());
                databaseReference.child("Apellido").setValue(Apellido.getText().toString());
                databaseReference.child("Rut").setValue(Rut.getText().toString());
                databaseReference.child("Poblacion").setValue(Poblacion.getText().toString());
                databaseReference.child("Pasaje").setValue(Pasaje.getText().toString());
                databaseReference.child("Calle").setValue(Calle.getText().toString());
                databaseReference.child("Casa").setValue(Casa.getText().toString());
                Toast.makeText(getApplicationContext(),"Pedido Enviado Con éxito",Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),"Vea el estado de su delivery",Toast.LENGTH_LONG).show();


            }
        });

        EnviarPago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
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
