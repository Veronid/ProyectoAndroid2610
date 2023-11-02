package proyecto.vero.proyectoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeladoVegan extends AppCompatActivity {

        Button Atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helado_vegan);
        Atras = findViewById(R.id.btnAtrasHV);
        /*toast.show*/
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