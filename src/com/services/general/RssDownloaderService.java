package com.services.general;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class RssDownloaderService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		this.downloadRss(startId);
		return START_STICKY;
	}
	
	public boolean downloadRss(int serviceId) {
		
		Context context = getApplicationContext();
		CharSequence text = "Refresh terminado.";
		int duration = Toast.LENGTH_SHORT;
		
		Toast toast = Toast.makeText(context, text, duration);
		toast.show();
		
		this.stopSelf(serviceId);
		
		return true;
	}
	

}
