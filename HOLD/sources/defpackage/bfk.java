package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: bfk  reason: default package */
/* compiled from: PG */
public final class bfk {
    public String a = "";
    public String b = "";
    public List c = Collections.emptyList();
    public String d = "";
    public String e = null;
    public int f;
    public boolean g = false;
    public int h;
    public boolean i = false;
    public int j = -1;
    public int k = -1;
    public int l = -1;

    public final int a() {
        int i2 = this.k;
        if (i2 == -1 && this.l == -1) {
            return -1;
        }
        int i3 = 0;
        int i4 = i2 == 1 ? 1 : 0;
        if (this.l == 1) {
            i3 = 2;
        }
        return i4 | i3;
    }

    public static int a(int i2, String str, String str2, int i3) {
        if (str.isEmpty() || i2 == -1) {
            return i2;
        }
        if (str.equals(str2)) {
            return i2 + i3;
        }
        return -1;
    }
}
