package programaciondario_1.proyectodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Registrar_Ingreso extends AppCompatActivity {
    Spinner lista;
    String[] datos = {"Elige tu opcion", "Efectivo", "Tarjeta de Credito", "Tarjeta Debito", "Cheque"};
    Button btn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar__ingreso);
        lista = (Spinner)findViewById(R.id.lista1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);


        btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Ejecutar();
            }
        });



    }

    private void Ejecutar(){

        Intent i= new Intent(this,menu1.class);
        startActivity(i);
        finish();
    }


}
