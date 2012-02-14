package org.calendarsandal;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TabHost;
import android.widget.TabWidget;

public class CalendarSandalActivity extends TabActivity {
    /** Called when the activity is first created. */
	
	ImageButton imageButton_add_newevent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    	TabHost tabHost = this.getTabHost();
		TabWidget tw = this.getTabWidget();
		tw.setBackgroundColor(Color.BLACK);

		imageButton_add_newevent = (ImageButton) findViewById(R.id.imageButton_add_newevent);
		imageButton_add_newevent
				.setOnClickListener(new ImageButton_title_checkin_Listener());

		Intent map_intent = new Intent(this, MapView.class);
		Intent calendar_intent = new Intent(this, CalendarView.class);

		// add FollowBox tab
		tabHost.addTab(tabHost.newTabSpec("Tab_map")
				.setIndicator("Map", getResources()// set up tab style
						.getDrawable(R.drawable.mapview))
				.setContent(map_intent));// set up tab content

		// add Me tab
		tabHost.addTab(tabHost
				.newTabSpec("Tab_calendar")
				.setIndicator("Calendar",
						getResources().getDrawable(R.drawable.calendarview))
				.setContent(calendar_intent));

		tabHost.setCurrentTab(1);
    }
    
	class ImageButton_title_checkin_Listener implements OnClickListener {
		public void onClick(View v) {
			Intent intent = new Intent();
			intent.setClass(CalendarSandalActivity.this, SubjectDefine.class);//
			CalendarSandalActivity.this.startActivity(intent);
		}
	}
}