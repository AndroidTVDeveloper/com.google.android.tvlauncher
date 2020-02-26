package p000;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: po */
/* compiled from: PG */
public final class C0422po {

    /* renamed from: a */
    public final int f10163a;

    /* renamed from: b */
    public final int f10164b;

    /* renamed from: c */
    private final int f10165c;

    /* renamed from: d */
    private final int f10166d;

    /* renamed from: e */
    private final int f10167e;

    /* renamed from: f */
    private boolean f10168f;

    /* renamed from: g */
    private int f10169g;

    /* renamed from: h */
    private int f10170h;

    /* renamed from: i */
    private float[] f10171i;

    public C0422po(int i, int i2) {
        this.f10165c = Color.red(i);
        this.f10166d = Color.green(i);
        this.f10167e = Color.blue(i);
        this.f10163a = i;
        this.f10164b = i2;
    }

    public final int hashCode() {
        return (this.f10163a * 31) + this.f10164b;
    }

    /* renamed from: b */
    private final void m8199b() {
        int i;
        int i2;
        if (!this.f10168f) {
            int a = C0032bd.m2860a(-1, this.f10163a, 4.5f);
            int a2 = C0032bd.m2860a(-1, this.f10163a, 3.0f);
            if (a == -1 || a2 == -1) {
                int a3 = C0032bd.m2860a(-16777216, this.f10163a, 4.5f);
                int a4 = C0032bd.m2860a(-16777216, this.f10163a, 3.0f);
                if (a3 == -1 || a4 == -1) {
                    if (a == -1) {
                        i = C0032bd.m2864b(-16777216, a3);
                    } else {
                        i = C0032bd.m2864b(-1, a);
                    }
                    this.f10170h = i;
                    if (a2 != -1) {
                        i2 = C0032bd.m2864b(-1, a2);
                    } else {
                        i2 = C0032bd.m2864b(-16777216, a4);
                    }
                    this.f10169g = i2;
                    this.f10168f = true;
                    return;
                }
                this.f10170h = C0032bd.m2864b(-16777216, a3);
                this.f10169g = C0032bd.m2864b(-16777216, a4);
                this.f10168f = true;
                return;
            }
            this.f10170h = C0032bd.m2864b(-1, a);
            this.f10169g = C0032bd.m2864b(-1, a2);
            this.f10168f = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0422po poVar = (C0422po) obj;
            return this.f10164b == poVar.f10164b && this.f10163a == poVar.f10163a;
        }
    }

    /* renamed from: a */
    public final float[] mo5748a() {
        if (this.f10171i == null) {
            this.f10171i = new float[3];
        }
        C0032bd.m2862a(this.f10165c, this.f10166d, this.f10167e, this.f10171i);
        return this.f10171i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f10163a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(mo5748a()));
        sb.append("] [Population: ");
        sb.append(this.f10164b);
        sb.append("] [Title Text: #");
        m8199b();
        sb.append(Integer.toHexString(this.f10169g));
        sb.append("] [Body Text: #");
        m8199b();
        sb.append(Integer.toHexString(this.f10170h));
        sb.append(']');
        return sb.toString();
    }
}
