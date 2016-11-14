package programaciondario_1.proyectodemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumador);
        //final EditText et1 = (EditText) findViewById(R.id.ET_num1);
        final EditText et2 = (EditText) findViewById(R.id.ET_num2);
        //final TextView tvres = (TextView) findViewById(R.id.tvsuma);
        Button btnsum = (Button) findViewById(R.id.button7);
        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //int e1 = Integer.parseInt(et1.getText().toString());
                int e2 = Integer.parseInt(et2.getText().toString());
               // tvres.setText(String.valueOf(e1+e2));
                Intent i = new Intent(getApplication(), Registrar_Ingreso.class);
                startActivity(i);
            }
        });
    }
}