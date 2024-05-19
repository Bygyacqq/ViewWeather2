package weather.viewweather2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinadorLayout);
        Snackbar.make(coordinatorLayout, "Mensaje del Snackbar", Snackbar.LENGTH_LONG).show();
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setImageResource(R.drawable.baseline_done_24);
    }
}