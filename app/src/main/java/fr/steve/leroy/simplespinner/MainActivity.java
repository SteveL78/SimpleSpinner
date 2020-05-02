package fr.steve.leroy.simplespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner spinneruse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinneruse = findViewById(R.id.spinner);

        spinneruse.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    // Here we using listener as position of item which user select.
                    case 0:
                        // Adding toast in each spinner item. You can use any code here.
                        Toast.makeText(getApplicationContext(), "Selected ", Toast.LENGTH_LONG).show();
                        break;

                    case 1:
                        Toast.makeText(getApplicationContext(), "Selected ", Toast.LENGTH_LONG).show();
                        break;

                    case 2:
                        Toast.makeText(getApplicationContext(), "Selected ", Toast.LENGTH_LONG).show();
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
