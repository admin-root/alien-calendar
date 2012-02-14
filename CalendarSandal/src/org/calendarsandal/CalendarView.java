package org.calendarsandal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class CalendarView extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.calendarlayout);
	}
}
