package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: bfk */
/* compiled from: PG */
public final class bfk {

    /* renamed from: a */
    public String f3677a = "";

    /* renamed from: b */
    public String f3678b = "";

    /* renamed from: c */
    public List f3679c = Collections.emptyList();

    /* renamed from: d */
    public String f3680d = "";

    /* renamed from: e */
    public String f3681e = null;

    /* renamed from: f */
    public int f3682f;

    /* renamed from: g */
    public boolean f3683g = false;

    /* renamed from: h */
    public int f3684h;

    /* renamed from: i */
    public boolean f3685i = false;

    /* renamed from: j */
    public int f3686j = -1;

    /* renamed from: k */
    public int f3687k = -1;

    /* renamed from: l */
    public int f3688l = -1;

    /* renamed from: a */
    public final int mo1819a() {
        int i = this.f3687k;
        if (i == -1 && this.f3688l == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = i == 1 ? 1 : 0;
        if (this.f3688l == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    /* renamed from: a */
    public static int m3057a(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
