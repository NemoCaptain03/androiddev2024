package vn.edu.usth.weather;

import android.os.Bundle;
import android.graphics.Color;

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
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Set background color
        int color = Color.parseColor("#200000FF");
        view.setBackgroundColor(color);

        // Find the parent view
        LinearLayout parentView = view.findViewById(R.id.fragment_forecast);

        // Create the dynamic LinearLayout
        LinearLayout dynamicLinearLayout = getDynamicLinearLayout();

        // Add the dynamic LinearLayout to the parent view
        parentView.addView(dynamicLinearLayout);

        return view;
    }

    private @NonNull LinearLayout getDynamicLinearLayout() {
        LinearLayout dynamicLinearLayout = new LinearLayout(getContext());
        dynamicLinearLayout.setOrientation(LinearLayout.VERTICAL);

        // Create the TextView for "Thursday"
        TextView dayTextView = new TextView(getContext());
        dayTextView.setText("Thursday");
        dynamicLinearLayout.addView(dayTextView);

        // Create the ImageView for the weather icon
        ImageView weatherIcon = new ImageView(getContext());
        // Set the image resource
        weatherIcon.setImageResource(R.drawable.sun_behind_clouds);
        dynamicLinearLayout.addView(weatherIcon);
        return dynamicLinearLayout;
    }
}