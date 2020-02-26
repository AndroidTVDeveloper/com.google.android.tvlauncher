package defpackage;

import android.text.Layout;

/* renamed from: bfd  reason: default package */
/* compiled from: PG */
final class bfd {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public Layout.Alignment m;

    public final int a() {
        int i2 = this.h;
        if (i2 == -1 && this.i == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.i == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public final void a(bfd bfd) {
        if (bfd != null) {
            if (!this.c && bfd.c) {
                b(bfd.b);
            }
            if (this.h == -1) {
                this.h = bfd.h;
            }
            if (this.i == -1) {
                this.i = bfd.i;
            }
            if (this.a == null) {
                this.a = bfd.a;
            }
            if (this.f == -1) {
                this.f = bfd.f;
            }
            if (this.g == -1) {
                this.g = bfd.g;
            }
            if (this.m == null) {
                this.m = bfd.m;
            }
            if (this.j == -1) {
                this.j = bfd.j;
                this.k = bfd.k;
            }
            if (!this.e && bfd.e) {
                a(bfd.d);
            }
        }
    }

    public final void a(int i2) {
        this.d = i2;
        this.e = true;
    }

    public final void b(int i2) {
        bks.b(true);
        this.b = i2;
        this.c = true;
    }

    public final void a(boolean z) {
        bks.b(true);
        this.f = z ? 1 : 0;
    }

    public final void b(boolean z) {
        bks.b(true);
        this.g = z ? 1 : 0;
    }
}
