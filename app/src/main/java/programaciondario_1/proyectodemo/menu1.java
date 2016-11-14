package programaciondario_1.proyectodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menu1 extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);


        Button btn1 = (Button) findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*EditText Cajatexto = (EditText) findViewById(R.id.button2);*/
                //Toast.makeText(getApplicationContext(), "Login Exitoso !!! ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), Registrar_Ingreso.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(getApplicationContext(), registrar_egreso.class);
                startActivity(j);
            }
        });

        Button btn3 = (Button) findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(getApplicationContext(), Crear_Transferencia.class);
                startActivity(n);
            }
        });
    }
}
