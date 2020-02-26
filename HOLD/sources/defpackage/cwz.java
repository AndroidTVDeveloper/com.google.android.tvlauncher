package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.List;

/* renamed from: cwz  reason: default package */
/* compiled from: PG */
public final class cwz implements cwi {
    public final Context a;
    public final cxn b;
    public Uri c;
    public String d;
    public cwh e;
    public int f;
    public int g = 1;
    public boolean h = false;
    public boolean i = false;
    public long j = 0;
    private float k = 1.0f;

    public cwz(Context context, cxn cxn) {
        this.a = context;
        this.b = cxn;
    }

    public final int a() {
        return this.g;
    }

    public final void a(int i2, int i3) {
    }

    public final Uri b() {
        return this.c;
    }

    public final int e() {
        return (int) this.j;
    }

    public final View f() {
        return this.b;
    }

    public static boolean b(Uri uri) {
        return c(uri) && a(uri, "preview_program");
    }

    public static boolean a(Uri uri) {
        return c(uri) && a(uri, "recorded_program");
    }

    private static boolean c(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "android.media.tv".equals(uri.getAuthority());
    }

    private static boolean a(Uri uri, String str) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() != 2 || !str.equals(pathSegments.get(0))) {
            return false;
        }
        return true;
    }

    public final void c() {
        this.h = true;
        this.i = false;
        this.g = 2;
        this.b.setCallback(new cww(this));
        if (this.f == 2) {
            this.b.setTimeShiftPositionCallback(new cwx(this));
        }
        if (this.d != null) {
            g();
            this.b.setStreamVolume(0.0f);
        } else if (this.f == 3) {
            Log.e("TvPlayerImpl", "TV input id must be given via URI query parameter");
            d();
            cwh cwh = this.e;
            if (cwh != null) {
                cwh.b();
            }
        } else {
            new cwy(this).execute(new Void[0]);
        }
    }

    public final void g() {
        int i2 = this.f;
        if (i2 == 1) {
            this.b.tune(this.d, this.c);
        } else if (i2 == 2) {
            this.b.timeShiftPlay(this.d, this.c);
        } else if (i2 == 3) {
            this.b.tune(this.d, this.c);
        }
    }

    public final void a(boolean z) {
        this.i = true;
        this.b.setStreamVolume(this.k);
    }

    public final void a(cwh cwh) {
        this.e = cwh;
    }

    public final void a(float f2) {
        this.k = f2;
        if (this.i) {
            this.b.setStreamVolume(f2);
        }
    }

    public final void d() {
        this.h = false;
        this.g = 1;
        this.b.reset();
        this.b.setCallback(null);
        this.b.setTimeShiftPositionCallback(null);
        this.j = 0;
    }
}
