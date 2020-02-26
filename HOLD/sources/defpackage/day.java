package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: day  reason: default package */
/* compiled from: PG */
public final class day {
    public final int a;
    public String b;
    public final Drawable c;
    public boolean d;
    public boolean e;
    public boolean f = true;
    public dax g;

    public day(int i, String str, Drawable drawable) {
        this.a = i;
        this.b = str;
        this.c = drawable;
        this.d = true;
        this.e = false;
    }

    private final void c() {
        int i;
        dax dax = this.g;
        if (dax != null) {
            daa daa = (daa) dax;
            View view = (View) daa.a.b.get(this.a);
            if (view != null) {
                view.setEnabled(this.d);
                if (!this.d) {
                    i = daa.a.e;
                } else {
                    i = daa.a.d;
                }
                view.setBackgroundColor(i);
            }
        }
    }

    public final void a() {
        this.f = false;
    }

    public final void a(boolean z) {
        if (this.d != z) {
            this.d = z;
            c();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.e = true;
    }

    public final void a(String str) {
        if (!TextUtils.equals(this.b, str)) {
            this.b = str;
            c();
        }
    }
}
