package p000;

/* renamed from: co */
/* compiled from: PG */
public final class C0070co {

    /* renamed from: a */
    public Object[] f6133a;

    /* renamed from: b */
    public int f6134b;

    /* renamed from: c */
    public int f6135c;

    /* renamed from: d */
    public int f6136d;

    public C0070co() {
        this((byte) 0);
    }

    /* renamed from: c */
    public final int mo3158c() {
        return (this.f6135c - this.f6134b) & this.f6136d;
    }

    public C0070co(byte b) {
        int i = 64;
        if (Integer.bitCount(64) != 1) {
            int highestOneBit = Integer.highestOneBit(63);
            i = highestOneBit + highestOneBit;
        }
        this.f6136d = i - 1;
        this.f6133a = new Object[i];
    }

    /* renamed from: b */
    public final void mo3156b() {
        mo3155a(mo3158c());
    }

    /* renamed from: a */
    public final void mo3154a() {
        Object[] objArr = this.f6133a;
        int length = objArr.length;
        int i = this.f6134b;
        int i2 = length - i;
        int i3 = length + length;
        if (i3 >= 0) {
            Object[] objArr2 = new Object[i3];
            System.arraycopy(objArr, i, objArr2, 0, i2);
            System.arraycopy(this.f6133a, 0, objArr2, i2, this.f6134b);
            this.f6133a = objArr2;
            this.f6134b = 0;
            this.f6135c = length;
            this.f6136d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: b */
    public final void mo3157b(int i) {
        int i2;
        int i3;
        if (i <= 0) {
            return;
        }
        if (i <= mo3158c()) {
            int i4 = this.f6135c;
            if (i < i4) {
                i2 = i4 - i;
            } else {
                i2 = 0;
            }
            int i5 = i2;
            while (true) {
                i3 = this.f6135c;
                if (i5 >= i3) {
                    break;
                }
                this.f6133a[i5] = null;
                i5++;
            }
            int i6 = i3 - i2;
            int i7 = i - i6;
            this.f6135c = i3 - i6;
            if (i7 > 0) {
                int length = this.f6133a.length;
                this.f6135c = length;
                int i8 = length - i7;
                for (int i9 = i8; i9 < this.f6135c; i9++) {
                    this.f6133a[i9] = null;
                }
                this.f6135c = i8;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final void mo3155a(int i) {
        if (i <= 0) {
            return;
        }
        if (i <= mo3158c()) {
            int length = this.f6133a.length;
            int i2 = this.f6134b;
            if (i < length - i2) {
                length = i2 + i;
            }
            while (i2 < length) {
                this.f6133a[i2] = null;
                i2++;
            }
            int i3 = this.f6134b;
            int i4 = length - i3;
            int i5 = i - i4;
            this.f6134b = this.f6136d & (i3 + i4);
            if (i5 > 0) {
                for (int i6 = 0; i6 < i5; i6++) {
                    this.f6133a[i6] = null;
                }
                this.f6134b = i5;
                return;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
