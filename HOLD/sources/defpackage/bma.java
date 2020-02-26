package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: bma  reason: default package */
/* compiled from: PG */
public final class bma {
    public final WindowManager a;
    public final blz b;
    public final bly c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public long j;
    public long k;
    public long l;

    public bma() {
        this(null);
    }

    public bma(Context context) {
        DisplayManager displayManager;
        bly bly = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.a = (WindowManager) context.getSystemService("window");
        } else {
            this.a = null;
        }
        if (this.a != null) {
            if (blm.a >= 17 && (displayManager = (DisplayManager) context.getSystemService("display")) != null) {
                bly = new bly(this, displayManager);
            }
            this.c = bly;
            this.b = blz.b;
        } else {
            this.c = null;
            this.b = null;
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
    }

    public final boolean a(long j2, long j3) {
        return Math.abs((j3 - this.j) - (j2 - this.k)) > 20000000;
    }

    public final void a() {
        Display defaultDisplay = this.a.getDefaultDisplay();
        if (defaultDisplay != null) {
            double refreshRate = (double) defaultDisplay.getRefreshRate();
            Double.isNaN(refreshRate);
            long j2 = (long) (1.0E9d / refreshRate);
            this.d = j2;
            this.e = (j2 * 80) / 100;
        }
    }
}
