package mx.edu.utcancun.josue.lista;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.List;

/**
 * Created by Josue on 05/07/2015.
 */
public class PronosticoAdapter extends ArrayAdapter<Pronostico> {


    public PronosticoAdapter(Context context, List<Pronostico> pronosticos) {
        super(context, 0, pronosticos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Pronostico pronostico = getItem (position);
        if ( convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_forecast,parent,false);
        }
        TextView dia = (TextView) convertView.findViewById(R.id.TextView_dia);
        TextView estado = (TextView) convertView.findViewById(R.id.TextView_estado);
        TextView temperatura = (TextView) convertView.findViewById(R.id.TextView_temperatura);
        ImageView icono = (ImageView) convertView.findViewById(R.id.ImageView_icono);
        dia.setText(pronostico.getDia());
        estado.setText(pronostico.getEstado());
        temperatura.setText(pronostico.getTemperatura());
        icono.setImageResource(pronostico.getIcono());
        return convertView;
    }
}
