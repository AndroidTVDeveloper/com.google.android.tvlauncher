package p000;

import java.nio.charset.Charset;

/* renamed from: dii */
/* compiled from: PG */
class dii extends dih {
    public static final long serialVersionUID = 1;

    /* renamed from: a */
    public final byte[] f8581a;

    public dii(byte[] bArr) {
        if (bArr != null) {
            this.f8581a = bArr;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public int mo4408a() {
        return this.f8581a.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo4410b() {
        return 0;
    }

    /* renamed from: a */
    public byte mo4407a(int i) {
        return this.f8581a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dik) || mo4408a() != ((dik) obj).mo4408a()) {
            return false;
        }
        if (mo4408a() == 0) {
            return true;
        }
        if (!(obj instanceof dii)) {
            return obj.equals(this);
        }
        dii dii = (dii) obj;
        int i = this.f8584c;
        int i2 = dii.f8584c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int a = mo4408a();
        if (a > dii.mo4408a()) {
            int a2 = mo4408a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(a);
            sb.append(a2);
            throw new IllegalArgumentException(sb.toString());
        } else if (a > dii.mo4408a()) {
            int a3 = dii.mo4408a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(a);
            sb2.append(", ");
            sb2.append(a3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(dii instanceof dii)) {
            return dii.mo4416c(a).equals(mo4416c(a));
        } else {
            byte[] bArr = this.f8581a;
            byte[] bArr2 = dii.f8581a;
            int b = mo4410b() + a;
            int b2 = mo4410b();
            int b3 = dii.mo4410b();
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

    /* renamed from: b */
    public byte mo4409b(int i) {
        return this.f8581a[i];
    }

    /* renamed from: c */
    public final boolean mo4417c() {
        int b = mo4410b();
        return dmb.m7090a(this.f8581a, b, mo4408a() + b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo4413a(int i, int i2) {
        return djl.m6721a(i, this.f8581a, mo4410b(), i2);
    }

    /* renamed from: c */
    public final dik mo4416c(int i) {
        int a = m6512a(0, i, mo4408a());
        return a != 0 ? new die(this.f8581a, mo4410b(), a) : dik.f8583b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo4414a(Charset charset) {
        return new String(this.f8581a, mo4410b(), mo4408a(), charset);
    }

    /* renamed from: a */
    public final void mo4415a(diq diq) {
        ((din) diq).mo4430a(this.f8581a, mo4410b(), mo4408a());
    }
}
