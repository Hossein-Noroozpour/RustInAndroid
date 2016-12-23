package com.gearoenix.rustinandroid;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initialize();
	}

	public native void  initialize();
	static {
		System.loadLibrary("rust");
	}
}
