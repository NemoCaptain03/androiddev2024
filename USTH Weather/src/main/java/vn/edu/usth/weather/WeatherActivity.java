package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import vn.edu.usth.weather.R.layout;

@Metadata(
    mv = {1, 9, 0},
    k = 1,
    xi = 48,
    d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014J\b\u0010\t\u001a\u00020\u0004H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\u0004H\u0014¨\u0006\f"},
    d2 = {"Lvn/edu/usth/weather/WeatherActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "USTH Weather_debug"}
)
@StabilityInferred(
    parameters = 1
)
public final class WeatherActivity extends AppCompatActivity {

    public WeatherActivity() {
        Log.i("WeatherActivity", "Debug");
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(layout.main_activity);

        //Create a new fragment to be placed
        ForecastFragment ForecastFragment = new ForecastFragment();

        //Get the support fragment manager instance
        getSupportFragmentManager().beginTransaction().add(R.id.main_activity, ForecastFragment).commit();
        Log.i("WeatherActivity", "onCreate");
    }

    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "onStart");
    }

    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "onResume");
    }

    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "onPause");
    }

    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "onStop");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "onDestroy");
    }
}