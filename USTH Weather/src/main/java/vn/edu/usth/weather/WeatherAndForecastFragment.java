package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherAndForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherAndForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WeatherAndForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeatherAndForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherAndForecastFragment newInstance(String param1, String param2) {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout parentView = new LinearLayout(getContext());
        parentView.setOrientation(LinearLayout.VERTICAL);

        View weatherView = inflater.inflate(R.layout.fragment_weather, container, false);
        View forecastView = inflater.inflate(R.layout.fragment_forecast, container, false);

        parentView.addView(weatherView);
        parentView.addView(forecastView);

        return parentView;
    }
}