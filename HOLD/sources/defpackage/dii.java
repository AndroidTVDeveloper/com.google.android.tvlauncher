package defpackage;

import java.nio.charset.Charset;

/* renamed from: dii  reason: default package */
/* compiled from: PG */
class dii extends dih {
    public static final long serialVersionUID = 1;
    public final byte[] a;

    public dii(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw null;
    }

    public int a() {
        return this.a.length;
    }

    /* access modifiers changed from: protected */
    public int b() {
        return 0;
    }

    public byte a(int i) {
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dik) || a() != ((dik) obj).a()) {
            return false;
        }
        if (a() == 0) {
            return true;
        }
        if (!(obj instanceof dii)) {
            return obj.equals(this);
        }
        dii dii = (dii) obj;
        int i = this.c;
        int i2 = dii.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int a2 = a();
        if (a2 > dii.a()) {
            int a3 = a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(a2);
            sb.append(a3);
            throw new IllegalArgumentException(sb.toString());
        } else if (a2 > dii.a()) {
            int a4 = dii.a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(a2);
            sb2.append(", ");
            sb2.append(a4);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(dii instanceof dii)) {
            return dii.c(a2).equals(c(a2));
        } else {
            byte[] bArr = this.a;
            byte[] bArr2 = dii.a;
            int b = b() + a2;
            int b2 = b();
            int b3 = dii.b();
            while (b2 < b) {
                if (bArr[b2] != bArr2[b3]) {
                    return false;
                }
                b2++;
                b3++;
            }
            return true;
        }
    }

    public byte b(int i) {
        return this.a[i];
    }

    public final boolean c() {
        int b = b();
        return dmb.a(this.a, b, a() + b);
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2) {
        return djl.a(i, this.a, b(), i2);
    }

    public final dik c(int i) {
        int a2 = a(0, i, a());
        return a2 != 0 ? new die(this.a, b(), a2) : dik.b;
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.a, b(), a(), charset);
    }

    public final void a(diq diq) {
        ((din) diq).a(this.a, b(), a());
    }
}
