package mx.edu.utcancun.josue.lista;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        String [] valores = {
                "Lunes = Nublado 20/25",
                "Martes = Nublado 23/35",
                "Miercoles = Lluvioso 25/30",
                "Jueves = Soleado 20/30",
                "Viernes = Soleado 21/27",
                "Sabado = Nublado 24/28",
                "Domingo = Soleado 23/29",
        };
        List<String> lista=new ArrayList<String>(Arrays.asList(valores));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            getActivity(),
            R.layout.list_item_forecast,
            R.id.list_item_forecast_textView,
            lista
        );
        ListView listView  = (ListView) rootView.findViewById(R.id.list_item_forecast);
        listView.setAdapter(adapter);
        return rootView;
    }
}
