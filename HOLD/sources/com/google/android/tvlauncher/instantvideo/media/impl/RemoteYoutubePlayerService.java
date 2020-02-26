package com.google.android.tvlauncher.instantvideo.media.impl;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class RemoteYoutubePlayerService extends Service {
    public Handler a = new Handler(Looper.getMainLooper());
    public final Map b = new HashMap();
    public int c;
    private cwo d = new cwo(this);

    public final IBinder onBind(Intent intent) {
        return this.d;
    }
}
