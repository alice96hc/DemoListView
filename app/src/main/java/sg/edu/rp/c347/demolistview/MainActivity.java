package sg.edu.rp.c347.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;

    ArrayList<String>alColours = new ArrayList<String>();
    ArrayAdapter<String> aaFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvFood = (ListView)findViewById(R.id.lvFood);
        lvFood.setAdapter(aaFood);


    }
}
