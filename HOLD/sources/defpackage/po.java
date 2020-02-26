package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: po  reason: default package */
/* compiled from: PG */
public final class po {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public po(int i2, int i3) {
        this.c = Color.red(i2);
        this.d = Color.green(i2);
        this.e = Color.blue(i2);
        this.a = i2;
        this.b = i3;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    private final void b() {
        int i2;
        int i3;
        if (!this.f) {
            int a2 = bd.a(-1, this.a, 4.5f);
            int a3 = bd.a(-1, this.a, 3.0f);
            if (a2 == -1 || a3 == -1) {
                int a4 = bd.a(-16777216, this.a, 4.5f);
                int a5 = bd.a(-16777216, this.a, 3.0f);
                if (a4 == -1 || a5 == -1) {
                    if (a2 == -1) {
                        i2 = bd.b(-16777216, a4);
                    } else {
                        i2 = bd.b(-1, a2);
                    }
                    this.h = i2;
                    if (a3 != -1) {
                        i3 = bd.b(-1, a3);
                    } else {
                        i3 = bd.b(-16777216, a5);
                    }
                    this.g = i3;
                    this.f = true;
                    return;
                }
                this.h = bd.b(-16777216, a4);
                this.g = bd.b(-16777216, a5);
                this.f = true;
                return;
            }
            this.h = bd.b(-1, a2);
            this.g = bd.b(-1, a3);
            this.f = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            po poVar = (po) obj;
            return this.b == poVar.b && this.a == poVar.a;
        }
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        bd.a(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.a));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(a()));
        sb.append("] [Population: ");
        sb.append(this.b);
        sb.append("] [Title Text: #");
        b();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        b();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}
