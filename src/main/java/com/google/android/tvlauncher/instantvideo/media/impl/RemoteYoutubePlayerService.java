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

    /* renamed from: a */
    public Handler f6595a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final Map f6596b = new HashMap();

    /* renamed from: c */
    public int f6597c;

    /* renamed from: d */
    private cwo f6598d = new cwo(this);

    public final IBinder onBind(Intent intent) {
        return this.f6598d;
    }
}
