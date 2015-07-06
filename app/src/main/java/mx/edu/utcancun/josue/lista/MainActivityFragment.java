package mx.edu.utcancun.josue.lista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<Pronostico> pronosticos = new ArrayList<Pronostico>();

        pronosticos.add(new Pronostico("Lunes", "Soleado", "20/31", R.drawable.sol));
        pronosticos.add(new Pronostico("Martes", "Nublado", "21/32", R.drawable.nublado));
        pronosticos.add(new Pronostico("Miercoles", "Lluvioso", "22/33", R.drawable.lluvia));
        pronosticos.add(new Pronostico("Jueves", "Soleado", "23/34", R.drawable.sol));
        pronosticos.add(new Pronostico("Viernes", "Nublado", "24/35", R.drawable.nublado));
        pronosticos.add(new Pronostico("Sabado", "Lluvioso", "25/36", R.drawable.lluvia));
        pronosticos.add(new Pronostico("Domingo", "Soleado", "26/37", R.drawable.sol));

        PronosticoAdapter adapter=new PronosticoAdapter(getActivity(), pronosticos);
        ListView listView  = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), pronosticos.get(position).toString(),Toast.LENGTH_SHORT).show();
            }
        };
        listView.setOnItemClickListener(itemClickListener);

        return rootView;
    }
}
