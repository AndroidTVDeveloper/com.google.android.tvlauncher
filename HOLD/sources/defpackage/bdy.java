package defpackage;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdy  reason: default package */
/* compiled from: PG */
final class bdy {
    public static final int a = a(2, 2, 2, 0);
    public static final int b = a(0, 0, 0, 0);
    public static final int[] c = {0, 0, 0, 0, 0, 2, 0};
    public static final int[] d;
    public static final int[] e;
    private static final int v;
    private int A;
    private int B;
    public final List f = new ArrayList();
    public final SpannableStringBuilder g = new SpannableStringBuilder();
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    private int w;
    private int x;
    private int y;
    private int z;

    static {
        int a2 = a(0, 0, 0, 3);
        v = a2;
        int i2 = b;
        d = new int[]{i2, a2, i2, i2, a2, i2, i2};
        e = new int[]{i2, i2, i2, i2, i2, a2, a2};
    }

    public bdy() {
        b();
    }

    public final void a(char c2) {
        if (c2 == 10) {
            this.f.add(d());
            this.g.clear();
            if (this.w != -1) {
                this.w = 0;
            }
            if (this.x != -1) {
                this.x = 0;
            }
            if (this.y != -1) {
                this.y = 0;
            }
            if (this.A != -1) {
                this.A = 0;
            }
            while (true) {
                if ((this.p && this.f.size() >= this.o) || this.f.size() >= 15) {
                    this.f.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.g.append(c2);
        }
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.g);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.w != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.w, length, 33);
            }
            if (this.x != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.x, length, 33);
            }
            if (this.y != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.z), this.y, length, 33);
            }
            if (this.A != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.B), this.A, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void c() {
        this.f.clear();
        this.g.clear();
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.A = -1;
        this.u = 0;
    }

    public static void a(int i2, int i3, int i4) {
        a(i2, i3, i4, 0);
    }

    public static int a(int i2, int i3, int i4, int i5) {
        int i6;
        bks.a(i2, 4);
        bks.a(i3, 4);
        bks.a(i4, 4);
        bks.a(i5, 4);
        int i7 = 0;
        if (i5 == 0 || i5 == 1) {
            i6 = 255;
        } else {
            i6 = i5 != 2 ? i5 != 3 ? 255 : 0 : 127;
        }
        int i8 = i2 > 1 ? 255 : 0;
        int i9 = i3 > 1 ? 255 : 0;
        if (i4 > 1) {
            i7 = 255;
        }
        return Color.argb(i6, i8, i9, i7);
    }

    public final boolean a() {
        if (this.h) {
            return this.f.isEmpty() && this.g.length() == 0;
        }
        return true;
    }

    public final void b() {
        c();
        this.h = false;
        this.i = false;
        this.j = 4;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = 15;
        this.p = true;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        int i2 = b;
        this.t = i2;
        this.z = a;
        this.B = i2;
    }

    public final void a(boolean z2, boolean z3) {
        if (this.w != -1) {
            if (!z2) {
                this.g.setSpan(new StyleSpan(2), this.w, this.g.length(), 33);
                this.w = -1;
            }
        } else if (z2) {
            this.w = this.g.length();
        }
        if (this.x == -1) {
            if (z3) {
                this.x = this.g.length();
            }
        } else if (!z3) {
            this.g.setSpan(new UnderlineSpan(), this.x, this.g.length(), 33);
            this.x = -1;
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        int i5;
        if (!(this.y == -1 || (i5 = this.z) == i2)) {
            this.g.setSpan(new ForegroundColorSpan(i5), this.y, this.g.length(), 33);
        }
        if (i2 != a) {
            this.y = this.g.length();
            this.z = i2;
        }
        if (!(this.A == -1 || (i4 = this.B) == i3)) {
            this.g.setSpan(new BackgroundColorSpan(i4), this.A, this.g.length(), 33);
        }
        if (i3 != b) {
            this.A = this.g.length();
            this.B = i3;
        }
    }

    public final void b(int i2, int i3) {
        this.t = i2;
        this.q = i3;
    }
}
