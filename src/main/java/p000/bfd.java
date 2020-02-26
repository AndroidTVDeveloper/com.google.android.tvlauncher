package p000;

import android.text.Layout;

/* renamed from: bfd */
/* compiled from: PG */
final class bfd {

    /* renamed from: a */
    public String f3644a;

    /* renamed from: b */
    public int f3645b;

    /* renamed from: c */
    public boolean f3646c;

    /* renamed from: d */
    public int f3647d;

    /* renamed from: e */
    public boolean f3648e;

    /* renamed from: f */
    public int f3649f = -1;

    /* renamed from: g */
    public int f3650g = -1;

    /* renamed from: h */
    public int f3651h = -1;

    /* renamed from: i */
    public int f3652i = -1;

    /* renamed from: j */
    public int f3653j = -1;

    /* renamed from: k */
    public float f3654k;

    /* renamed from: l */
    public String f3655l;

    /* renamed from: m */
    public Layout.Alignment f3656m;

    /* renamed from: a */
    public final int mo1813a() {
        int i = this.f3651h;
        if (i == -1 && this.f3652i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f3652i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: a */
    public final void mo1815a(bfd bfd) {
        if (bfd != null) {
            if (!this.f3646c && bfd.f3646c) {
                mo1817b(bfd.f3645b);
            }
            if (this.f3651h == -1) {
                this.f3651h = bfd.f3651h;
            }
            if (this.f3652i == -1) {
                this.f3652i = bfd.f3652i;
            }
            if (this.f3644a == null) {
                this.f3644a = bfd.f3644a;
            }
            if (this.f3649f == -1) {
                this.f3649f = bfd.f3649f;
            }
            if (this.f3650g == -1) {
                this.f3650g = bfd.f3650g;
            }
            if (this.f3656m == null) {
                this.f3656m = bfd.f3656m;
            }
            if (this.f3653j == -1) {
                this.f3653j = bfd.f3653j;
                this.f3654k = bfd.f3654k;
            }
            if (!this.f3648e && bfd.f3648e) {
                mo1814a(bfd.f3647d);
            }
        }
    }

    /* renamed from: a */
    public final void mo1814a(int i) {
        this.f3647d = i;
        this.f3648e = true;
    }

    /* renamed from: b */
    public final void mo1817b(int i) {
        bks.m3512b(true);
        this.f3645b = i;
        this.f3646c = true;
    }

    /* renamed from: a */
    public final void mo1816a(boolean z) {
        bks.m3512b(true);
        this.f3649f = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo1818b(boolean z) {
        bks.m3512b(true);
        this.f3650g = z ? 1 : 0;
    }
}
