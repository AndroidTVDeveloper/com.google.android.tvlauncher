package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: dik  reason: default package */
/* compiled from: PG */
public abstract class dik implements Iterable, Serializable {
    private static final dif a = (dhx.a() ? new dij((byte) 0) : new did((byte) 0));
    public static final dik b = new dii(djl.b);
    public int c = 0;

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    public abstract void a(diq diq);

    public abstract byte b(int i);

    public abstract dik c(int i);

    public abstract boolean c();

    public abstract boolean equals(Object obj);

    static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public static dik a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static dik a(byte[] bArr, int i, int i2) {
        a(i, i + i2, bArr.length);
        return new dii(a.a(bArr, i, i2));
    }

    public static dik a(String str) {
        return new dii(str.getBytes(djl.a));
    }

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int a2 = a();
            i = a(a2, a2);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new dic(this);
    }

    static dig d(int i) {
        return new dig(i);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(a());
        objArr[2] = a() > 50 ? String.valueOf(dlk.a(c(47))).concat("...") : dlk.a(this);
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String d() {
        return a() == 0 ? "" : a(djl.a);
    }
}
