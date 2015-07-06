package mx.edu.utcancun.josue.lista;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent bolsita=getIntent();
        Pronostico pronostico = (Pronostico) bolsita.getSerializableExtra("pronostico");
        setContentView(R.layout.activity_main_activity2);

        TextView dia = (TextView)findViewById(R.id.TextView_dia);
        TextView estado = (TextView)findViewById(R.id.TextView_estado);
        TextView temperatura = (TextView)findViewById(R.id.TextView_temperatura);
        ImageView icono = (ImageView) findViewById(R.id.ImageView_icono);
        dia.setText(pronostico.getDia());
        estado.setText(pronostico.getEstado());
        temperatura.setText(pronostico.getTemperatura());
        icono.setImageResource(pronostico.getIcono());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
