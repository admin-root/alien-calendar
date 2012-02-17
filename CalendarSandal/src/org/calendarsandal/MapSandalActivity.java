package org.calendarsandal;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;

public class MapSandalActivity extends MapActivity {

	private MapView main_view;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maplayout);

		main_view = (MapView) this.findViewById(R.id.SandalMapView);
		main_view.setStreetView(false);
		main_view.setBuiltInZoomControls(true);
		main_view.setEnabled(true);
		main_view.setClickable(true);
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
