package com.google.android.tvlauncher.clock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.widget.TextClock;
import java.text.SimpleDateFormat;

/* compiled from: PG */
public class ClockView extends TextClock {

    /* renamed from: a */
    private BroadcastReceiver f6430a;

    /* renamed from: b */
    private final ContentObserver f6431b;

    public ClockView(Context context) {
        this(context, null, 0);
    }

    public ClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6430a = new cjn(this);
        this.f6431b = new cjo(this, new Handler());
        mo3252a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f6431b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        getContext().registerReceiver(this.f6430a, intentFilter, null, null);
        mo3252a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().getContentResolver().unregisterContentObserver(this.f6431b);
        getContext().unregisterReceiver(this.f6430a);
    }

    /* renamed from: a */
    public final void mo3252a() {
        String trim = ((SimpleDateFormat) DateFormat.getTimeFormat(getContext())).toPattern().replace("a", "").trim();
        setFormat12Hour(trim);
        setFormat24Hour(trim);
    }
}
