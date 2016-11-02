package programaciondario_1.proyectodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btningresar = (Button) findViewById(R.id.buttoni);
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText Cajatexto = (EditText) findViewById(R.id.ET_Nombre);
                String nombre = Cajatexto.getText().toString();
                //Ejecuta mensaje
                Toast.makeText(getApplicationContext(), "hola " + nombre, Toast.LENGTH_LONG).show();
                //Inicia una nueva actividad
                Intent i = new Intent(getApplicationContext(), SumadorActivity.class);
                startActivity(i);
            }
        });
    }
}
