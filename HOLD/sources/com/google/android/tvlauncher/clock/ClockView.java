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
    private BroadcastReceiver a;
    private final ContentObserver b;

    public ClockView(Context context) {
        this(context, null, 0);
    }

    public ClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new cjn(this);
        this.b = new cjo(this, new Handler());
        a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.b);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        getContext().registerReceiver(this.a, intentFilter, null, null);
        a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContext().getContentResolver().unregisterContentObserver(this.b);
        getContext().unregisterReceiver(this.a);
    }

    public final void a() {
        String trim = ((SimpleDateFormat) DateFormat.getTimeFormat(getContext())).toPattern().replace("a", "").trim();
        setFormat12Hour(trim);
        setFormat24Hour(trim);
    }
}
