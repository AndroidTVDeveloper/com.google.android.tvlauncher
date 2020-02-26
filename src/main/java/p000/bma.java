package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: bma */
/* compiled from: PG */
public final class bma {

    /* renamed from: a */
    public final WindowManager f4378a;

    /* renamed from: b */
    public final blz f4379b;

    /* renamed from: c */
    public final bly f4380c;

    /* renamed from: d */
    public long f4381d;

    /* renamed from: e */
    public long f4382e;

    /* renamed from: f */
    public long f4383f;

    /* renamed from: g */
    public long f4384g;

    /* renamed from: h */
    public long f4385h;

    /* renamed from: i */
    public boolean f4386i;

    /* renamed from: j */
    public long f4387j;

    /* renamed from: k */
    public long f4388k;

    /* renamed from: l */
    public long f4389l;

    public bma() {
        this(null);
    }

    public bma(Context context) {
        DisplayManager displayManager;
        bly bly = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f4378a = (WindowManager) context.getSystemService("window");
        } else {
            this.f4378a = null;
        }
        if (this.f4378a != null) {
            if (blm.f4293a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                bly = new bly(this, displayManager);
            }
            this.f4380c = bly;
            this.f4379b = blz.f4372b;
        } else {
            this.f4380c = null;
            this.f4379b = null;
        }
        this.f4381d = -9223372036854775807L;
        this.f4382e = -9223372036854775807L;
    }

    /* renamed from: a */
    public final boolean mo2139a(long j, long j2) {
        return Math.abs((j2 - this.f4387j) - (j - this.f4388k)) > 20000000;
    }

    /* renamed from: a */
    public final void mo2138a() {
        Display defaultDisplay = this.f4378a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            this.f4381d = j;
            this.f4382e = (j * 80) / 100;
        }
    }
}
