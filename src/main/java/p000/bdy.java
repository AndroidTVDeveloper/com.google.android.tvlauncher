package p000;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bdy */
/* compiled from: PG */
final class bdy {

    /* renamed from: a */
    public static final int f3475a = m2949a(2, 2, 2, 0);

    /* renamed from: b */
    public static final int f3476b = m2949a(0, 0, 0, 0);

    /* renamed from: c */
    public static final int[] f3477c = {0, 0, 0, 0, 0, 2, 0};

    /* renamed from: d */
    public static final int[] f3478d;

    /* renamed from: e */
    public static final int[] f3479e;

    /* renamed from: v */
    private static final int f3480v;

    /* renamed from: A */
    private int f3481A;

    /* renamed from: B */
    private int f3482B;

    /* renamed from: f */
    public final List f3483f = new ArrayList();

    /* renamed from: g */
    public final SpannableStringBuilder f3484g = new SpannableStringBuilder();

    /* renamed from: h */
    public boolean f3485h;

    /* renamed from: i */
    public boolean f3486i;

    /* renamed from: j */
    public int f3487j;

    /* renamed from: k */
    public boolean f3488k;

    /* renamed from: l */
    public int f3489l;

    /* renamed from: m */
    public int f3490m;

    /* renamed from: n */
    public int f3491n;

    /* renamed from: o */
    public int f3492o;

    /* renamed from: p */
    public boolean f3493p;

    /* renamed from: q */
    public int f3494q;

    /* renamed from: r */
    public int f3495r;

    /* renamed from: s */
    public int f3496s;

    /* renamed from: t */
    public int f3497t;

    /* renamed from: u */
    public int f3498u;

    /* renamed from: w */
    private int f3499w;

    /* renamed from: x */
    private int f3500x;

    /* renamed from: y */
    private int f3501y;

    /* renamed from: z */
    private int f3502z;

    static {
        int a = m2949a(0, 0, 0, 3);
        f3480v = a;
        int i = f3476b;
        f3478d = new int[]{i, a, i, i, a, i, i};
        f3479e = new int[]{i, i, i, i, i, a, a};
    }

    public bdy() {
        mo1802b();
    }

    /* renamed from: a */
    public final void mo1798a(char c) {
        if (c == 10) {
            this.f3483f.add(mo1805d());
            this.f3484g.clear();
            if (this.f3499w != -1) {
                this.f3499w = 0;
            }
            if (this.f3500x != -1) {
                this.f3500x = 0;
            }
            if (this.f3501y != -1) {
                this.f3501y = 0;
            }
            if (this.f3481A != -1) {
                this.f3481A = 0;
            }
            while (true) {
                if ((this.f3493p && this.f3483f.size() >= this.f3492o) || this.f3483f.size() >= 15) {
                    this.f3483f.remove(0);
                } else {
                    return;
                }
            }
        } else {
            this.f3484g.append(c);
        }
    }

    /* renamed from: d */
    public final SpannableString mo1805d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3484g);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f3499w != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f3499w, length, 33);
            }
            if (this.f3500x != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f3500x, length, 33);
            }
            if (this.f3501y != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f3502z), this.f3501y, length, 33);
            }
            if (this.f3481A != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f3482B), this.f3481A, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    /* renamed from: c */
    public final void mo1804c() {
        this.f3483f.clear();
        this.f3484g.clear();
        this.f3499w = -1;
        this.f3500x = -1;
        this.f3501y = -1;
        this.f3481A = -1;
        this.f3498u = 0;
    }

    /* renamed from: a */
    public static void m2950a(int i, int i2, int i3) {
        m2949a(i, i2, i3, 0);
    }

    /* renamed from: a */
    public static int m2949a(int i, int i2, int i3, int i4) {
        int i5;
        bks.m3509a(i, 4);
        bks.m3509a(i2, 4);
        bks.m3509a(i3, 4);
        bks.m3509a(i4, 4);
        int i6 = 0;
        if (i4 == 0 || i4 == 1) {
            i5 = 255;
        } else {
            i5 = i4 != 2 ? i4 != 3 ? 255 : 0 : 127;
        }
        int i7 = i > 1 ? 255 : 0;
        int i8 = i2 > 1 ? 255 : 0;
        if (i3 > 1) {
            i6 = 255;
        }
        return Color.argb(i5, i7, i8, i6);
    }

    /* renamed from: a */
    public final boolean mo1801a() {
        if (this.f3485h) {
            return this.f3483f.isEmpty() && this.f3484g.length() == 0;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo1802b() {
        mo1804c();
        this.f3485h = false;
        this.f3486i = false;
        this.f3487j = 4;
        this.f3488k = false;
        this.f3489l = 0;
        this.f3490m = 0;
        this.f3491n = 0;
        this.f3492o = 15;
        this.f3493p = true;
        this.f3494q = 0;
        this.f3495r = 0;
        this.f3496s = 0;
        int i = f3476b;
        this.f3497t = i;
        this.f3502z = f3475a;
        this.f3482B = i;
    }

    /* renamed from: a */
    public final void mo1800a(boolean z, boolean z2) {
        if (this.f3499w != -1) {
            if (!z) {
                this.f3484g.setSpan(new StyleSpan(2), this.f3499w, this.f3484g.length(), 33);
                this.f3499w = -1;
            }
        } else if (z) {
            this.f3499w = this.f3484g.length();
        }
        if (this.f3500x == -1) {
            if (z2) {
                this.f3500x = this.f3484g.length();
            }
        } else if (!z2) {
            this.f3484g.setSpan(new UnderlineSpan(), this.f3500x, this.f3484g.length(), 33);
            this.f3500x = -1;
        }
    }

    /* renamed from: a */
    public final void mo1799a(int i, int i2) {
        int i3;
        int i4;
        if (!(this.f3501y == -1 || (i4 = this.f3502z) == i)) {
            this.f3484g.setSpan(new ForegroundColorSpan(i4), this.f3501y, this.f3484g.length(), 33);
        }
        if (i != f3475a) {
            this.f3501y = this.f3484g.length();
            this.f3502z = i;
        }
        if (!(this.f3481A == -1 || (i3 = this.f3482B) == i2)) {
            this.f3484g.setSpan(new BackgroundColorSpan(i3), this.f3481A, this.f3484g.length(), 33);
        }
        if (i2 != f3476b) {
            this.f3481A = this.f3484g.length();
            this.f3482B = i2;
        }
    }

    /* renamed from: b */
    public final void mo1803b(int i, int i2) {
        this.f3497t = i;
        this.f3494q = i2;
    }
}
