package org.calendarsandal;

import org.calendarsandal.CalendarView;

import org.calendarsandal.R;

import org.calendarsandal.CalendarActivity;
import org.calendarsandal.Cell;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.format.DateUtils;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CalendarActivity extends Activity implements CalendarView.OnCellTouchListener{
	
	public static final String MIME_TYPE = "vnd.android.cursor.dir/vnd.exina.android.calendar.date";
	CalendarView mView = null;
	TextView mHit;
	Handler mHandler = new Handler();
	ImageButton previous_month_button=null;
	
	ImageButton next_month_button=null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.calendarlayout);
		
        mView = (CalendarView)findViewById(R.id.calendar);
        mView.setOnCellTouchListener(this);
        
        previous_month_button = (ImageButton) findViewById(R.id.previous_month_button);
        this.previous_month_button.setOnClickListener(new Previous_Month_Listener());
        
        this.next_month_button=(ImageButton)this.findViewById(R.id.next_month_button);
        this.next_month_button.setOnClickListener(new Next_Month_Listener());
        
/*        imageButton_add_newevent
		.setOnClickListener(new ImageButton_title_checkin_Listener());*/

        
        //if(getIntent().getAction().equals(Intent.ACTION_PICK))
        	//findViewById(R.id.hint).setVisibility(View.INVISIBLE);
		
	}
	
	public void onTouch(Cell cell) {
		//Intent intent = getIntent();
		//String action = intent.getAction();
		/*if(action.equals(Intent.ACTION_PICK) || action.equals(Intent.ACTION_GET_CONTENT)) {
			int year  = mView.getYear();
			int month = mView.getMonth();
			int day   = cell.getDayOfMonth();
			
			// FIX issue 6: make some correction on month and year
			if(cell instanceof CalendarView.GrayCell) {
				// oops, not pick current month...				
				if (day < 15) {
					// pick one beginning day? then a next month day
					if(month==11)
					{
						month = 0;
						year++;
					} else {
						month++;
					}
					
				} else {
					// otherwise, previous month
					if(month==0) {
						month = 11;
						year--;
					} else {
						month--;
					}
				}
			}
			
			Intent ret = new Intent();
			ret.putExtra("year", year);
			ret.putExtra("month", month);
			ret.putExtra("day", day);
			this.setResult(RESULT_OK, ret);
			//finish();
			//return;
//		}*/
		int day = cell.getDayOfMonth();
		if(mView.firstDay(day))
			mView.previousMonth();
		else if(mView.lastDay(day))
			mView.nextMonth();
		else
			return;

/*		mHandler.post(new Runnable() {
			public void run() {
				Toast.makeText(CalendarActivity.this, DateUtils.getMonthString(mView.getMonth(), DateUtils.LENGTH_LONG) + " "+mView.getYear(), Toast.LENGTH_SHORT).show();
			}
		});*/
	}
	
	class Previous_Month_Listener implements OnClickListener {
		public void onClick(View v) {
			
			mView.previousMonth();
/*			Intent intent = new Intent();
			intent.setClass(CalendarSandalActivity.this, SubjectDefine.class);//
			CalendarSandalActivity.this.startActivity(intent);*/
		}
	}
	
	class Next_Month_Listener implements OnClickListener {
		public void onClick(View v) {
			
			mView.nextMonth();

		}
	}
	
}
