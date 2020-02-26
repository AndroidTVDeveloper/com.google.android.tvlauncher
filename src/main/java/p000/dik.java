package p000;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: dik */
/* compiled from: PG */
public abstract class dik implements Iterable, Serializable {

    /* renamed from: a */
    private static final dif f8582a = (dhx.m6468a() ? new dij((byte) 0) : new did((byte) 0));

    /* renamed from: b */
    public static final dik f8583b = new dii(djl.f8683b);

    /* renamed from: c */
    public int f8584c = 0;

    /* renamed from: a */
    public abstract byte mo4407a(int i);

    /* renamed from: a */
    public abstract int mo4408a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo4413a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo4414a(Charset charset);

    /* renamed from: a */
    public abstract void mo4415a(diq diq);

    /* renamed from: b */
    public abstract byte mo4409b(int i);

    /* renamed from: c */
    public abstract dik mo4416c(int i);

    /* renamed from: c */
    public abstract boolean mo4417c();

    public abstract boolean equals(Object obj);

    /* renamed from: a */
    static int m6512a(int i, int i2, int i3) {
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

    /* renamed from: a */
    public static dik m6514a(byte[] bArr) {
        return m6515a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static dik m6515a(byte[] bArr, int i, int i2) {
        m6512a(i, i + i2, bArr.length);
        return new dii(f8582a.mo4406a(bArr, i, i2));
    }

    /* renamed from: a */
    public static dik m6513a(String str) {
        return new dii(str.getBytes(djl.f8682a));
    }

    public final int hashCode() {
        int i = this.f8584c;
        if (i == 0) {
            int a = mo4408a();
            i = mo4413a(a, a);
            if (i == 0) {
                i = 1;
            }
            this.f8584c = i;
        }
        return i;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new dic(this);
    }

    /* renamed from: d */
    static dig m6516d(int i) {
        return new dig(i);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo4408a());
        objArr[2] = mo4408a() > 50 ? String.valueOf(dlk.m6964a(mo4416c(47))).concat("...") : dlk.m6964a(this);
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: d */
    public final String mo4419d() {
        return mo4408a() == 0 ? "" : mo4414a(djl.f8682a);
    }
}
