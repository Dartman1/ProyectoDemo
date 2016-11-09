package programaciondario_1.proyectodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class registrar_egreso extends AppCompatActivity {
    //Spinner lista2;
    Spinner lista3;
    String[] datos2 = {"Elige tu opcion", "cama", "bus", "helado", "Pollo asado"};
    //String[] datos1 = {"Elige tu opcion", "Hogar", "Transporte", "Recreacion", "Comida"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_egreso);

        lista3 = (Spinner)findViewById(R.id.lista2);

        ArrayAdapter<String> adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
        lista3.setAdapter(adaptador1);


        /*lista2 = (Spinner)findViewById(R.id.lista1);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos1);
        lista2.setAdapter(adaptador);*/
    }
}
