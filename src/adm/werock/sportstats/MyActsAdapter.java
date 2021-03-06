package adm.werock.sportstats;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyActsAdapter extends BaseAdapter {
	private final Activity activity;
    private List<Act> list;

    public MyActsAdapter(Activity activity, List<Act> scoreList) {
        super();
        this.activity = activity;
        this.list = scoreList;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View rootView = inflater.inflate(R.layout.activity_my_acts_row, null,true);
        TextView pointsGuest = (TextView) rootView.findViewById(R.id.pointsGuest);
        TextView pointsHome = (TextView) rootView.findViewById(R.id.pointsHome);
        TextView teamGuest = (TextView) rootView.findViewById(R.id.teamGuest);
        TextView teamHome = (TextView) rootView.findViewById(R.id.teamHome);
        TextView date = (TextView) rootView.findViewById(R.id.date);

        teamHome.setText(list.get(position).getTeamHome());
        teamGuest.setText(list.get(position).getTeamGuest());
        pointsHome.setText(Integer.toString(list.get(position).getPointsHome()));
        pointsGuest.setText(Integer.toString(list.get(position).getPointsGuest()));
        date.setText(list.get(position).getDate());
        
        return rootView;
    }

    public int getCount() {
        return list.size();
    }

    public Object getItem(int arg0) {
        return list.get(arg0);
    }

    public long getItemId(int position) {
        return position;
    }

}
