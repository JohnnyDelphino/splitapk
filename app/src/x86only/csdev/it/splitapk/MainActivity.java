package csdev.it.splitapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button libActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        libActivityButton = ((Button) findViewById(R.id.button_lib_activity));
        libActivityButton.setVisibility(View.INVISIBLE);
    }
}
