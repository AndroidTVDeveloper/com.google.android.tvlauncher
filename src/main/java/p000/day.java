package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;

/* renamed from: day */
/* compiled from: PG */
public final class day {

    /* renamed from: a */
    public final int f8117a;

    /* renamed from: b */
    public String f8118b;

    /* renamed from: c */
    public final Drawable f8119c;

    /* renamed from: d */
    public boolean f8120d;

    /* renamed from: e */
    public boolean f8121e;

    /* renamed from: f */
    public boolean f8122f = true;

    /* renamed from: g */
    public dax f8123g;

    public day(int i, String str, Drawable drawable) {
        this.f8117a = i;
        this.f8118b = str;
        this.f8119c = drawable;
        this.f8120d = true;
        this.f8121e = false;
    }

    /* renamed from: c */
    private final void m6068c() {
        int i;
        dax dax = this.f8123g;
        if (dax != null) {
            daa daa = (daa) dax;
            View view = (View) daa.f8013a.f8018b.get(this.f8117a);
            if (view != null) {
                view.setEnabled(this.f8120d);
                if (!this.f8120d) {
                    i = daa.f8013a.f8021e;
                } else {
                    i = daa.f8013a.f8020d;
                }
                view.setBackgroundColor(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo4056a() {
        this.f8122f = false;
    }

    /* renamed from: a */
    public final void mo4058a(boolean z) {
        if (this.f8120d != z) {
            this.f8120d = z;
            m6068c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4059b() {
        this.f8121e = true;
    }

    /* renamed from: a */
    public final void mo4057a(String str) {
        if (!TextUtils.equals(this.f8118b, str)) {
            this.f8118b = str;
            m6068c();
        }
    }
}
