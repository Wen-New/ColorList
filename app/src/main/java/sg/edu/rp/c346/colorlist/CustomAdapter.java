package sg.edu.rp.c346.colorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
//Step 4: Extending the Adapter Class to ArrayAdapter
public class CustomAdapter extends ArrayAdapter{
    //Step 4a: Standard Code
    Context parent_context;
    int layout_id;

    //Step 4b: Edit the Data class name
    ArrayList<ThereIsColor> boxList;

    //Step 4c: Standard Code, Change the third argument only
    public CustomAdapter(Context context,int resource, ArrayList<ThereIsColor> objects) {
        super(context, resource, objects);
        this.parent_context = context;
        this.layout_id = resource;
        this.boxList = objects; //Change this line
    }
    //Step 4d: Get the data to set into layout
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Standard code
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        //Obtain the UI Elements and assign to variables
        TextView tvColor = (TextView) rowView.findViewById(R.id.textViewColor);
        ImageView ivColor = (ImageView) rowView.findViewById(R.id.imageViewColor);

        ThereIsColor currentItem = boxList.get(position);//Standard Code

        //Setting the data
        tvColor.setText(currentItem.getColor());
        if (currentItem.getColor().equals("blue")) {
            ivColor.setImageResource(R.drawable.blue_box);
        }else if (currentItem.getColor().equals("orange")) {
            ivColor.setImageResource(R.drawable.orange_box);
        }else if (currentItem.getColor().equals("brown")){
            ivColor.setImageResource(R.drawable.brown_box);
        }

        return rowView;
    }
}
