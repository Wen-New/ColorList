package sg.edu.rp.c346.colorlist;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Step 5: Declare the activity_main elements
    ListView lvBoxArrangement;
    ArrayList<ThereIsColor> boxArrangementList;
    CustomAdapter caBoxArrangement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //step 5a: Bind the elements and assign it into Variable
        lvBoxArrangement = (ListView)findViewById(R.id.listViewColor);
        boxArrangementList = new ArrayList<ThereIsColor>();
        caBoxArrangement = new CustomAdapter(this, R.layout.color_row, boxArrangementList);
        lvBoxArrangement.setAdapter(caBoxArrangement);

        //step 5b: Add an object into the Array List
        ThereIsColor item1 = new ThereIsColor("blue");
        boxArrangementList.add(item1);
        ThereIsColor item2 = new ThereIsColor("orange");
        boxArrangementList.add(item2);
        ThereIsColor item3 = new ThereIsColor("brown");
        boxArrangementList.add(item3);
    }
}
