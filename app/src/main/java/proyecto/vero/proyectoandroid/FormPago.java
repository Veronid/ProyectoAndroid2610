package proyecto.vero.proyectoandroid;

import static android.view.Gravity.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FormPago extends AppCompatActivity {

    Button AtrasPago;

    Button EnviarPago;
    Button EnviarPago2;

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
        EnviarPago = findViewById(R.id.buttonEnviarpago);
        EnviarPago2 = findViewById(R.id.buttonEnviarpago2);

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
        EnviarPago2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseReference.child("Nombre").setValue(Nombre.getText().toString());
                databaseReference.child("Apellido").setValue(Apellido.getText().toString());
                databaseReference.child("Rut").setValue(Rut.getText().toString());
                databaseReference.child("Poblacion").setValue(Poblacion.getText().toString());
                databaseReference.child("Pasaje").setValue(Pasaje.getText().toString());
                databaseReference.child("Calle").setValue(Calle.getText().toString());
                databaseReference.child("Casa").setValue(Casa.getText().toString());


            }
        });


        EnviarPago.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            CharSequence text = "¡Su pedido a sido recibido!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context,text,duration);
            toast.setGravity(Gravity.BOTTOM|Gravity.CENTER,80,300);
            toast.show();
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
