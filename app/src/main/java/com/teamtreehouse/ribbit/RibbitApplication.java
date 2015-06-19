package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
		Parse.initialize(this, "4KEYgNgSKwqHqUcdgCr12gvBcFXK69mY2uvrl0bN", "IIxsSwgueKW3DMb2uEw4eO80FL59OXkl8B9VydU1");
	}
}
