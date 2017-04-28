package sg.edu.rp.c347.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static sg.edu.rp.c347.demolistview.R.id.lvFood;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Food> food;

//    ArrayList<String>alColours = new ArrayList<String>();
//    ArrayAdapter<String> aaFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.lvFood);

        //create a few food obj in food array
        food = new ArrayList<Food>();
        food.add(new Food("Ah Lat Coffee",false));
        food.add(new Food("Rocky Choc",true));
        food.add(new Food("Kid Cat Choc",true));

        //Link this activity object, the row.xml layout for each row and the food String array together
        aa = new FoodAdapter(this,R.layout.row,food);
        lv.setAdapter(aa);

    }
}
