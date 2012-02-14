package com.ac.view;

import com.ac.R;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

public class TabMainActivity extends TabActivity {
	//--------------------Create-----------------------
	@Override
	public void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.tabmainlayout);
		TabHost tabHost = this.getTabHost();
		TabWidget tw = this.getTabWidget();
		tw.setBackgroundColor(Color.BLACK);
	}
	//---------------------------------------------------
	
	//------------------Functional---------------------
	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}
//------------------Functional---------------------
}
