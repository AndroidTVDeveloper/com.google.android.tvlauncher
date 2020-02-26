package p000;

/* renamed from: cp */
/* compiled from: PG */
public final class C0072cp {

    /* renamed from: a */
    public int[] f6860a;

    /* renamed from: b */
    public int f6861b;

    /* renamed from: c */
    public int f6862c;

    public C0072cp() {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int highestOneBit = Integer.highestOneBit(7);
            i = highestOneBit + highestOneBit;
        }
        this.f6862c = i - 1;
        this.f6860a = new int[i];
    }

    /* renamed from: b */
    public final int mo3541b() {
        return this.f6861b & this.f6862c;
    }

    /* renamed from: a */
    public final void mo3540a(int i) {
        int[] iArr = this.f6860a;
        int i2 = this.f6861b;
        iArr[i2] = i;
        int i3 = this.f6862c & (i2 + 1);
        this.f6861b = i3;
        if (i3 == 0) {
            int length = iArr.length;
            int i4 = length + length;
            if (i4 >= 0) {
                int[] iArr2 = new int[i4];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                System.arraycopy(this.f6860a, 0, iArr2, length, 0);
                this.f6860a = iArr2;
                this.f6861b = length;
                this.f6862c = i4 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    /* renamed from: a */
    public final void mo3539a() {
        this.f6861b = 0;
    }

    /* renamed from: b */
    public final int mo3542b(int i) {
        if (i >= 0 && i < mo3541b()) {
            return this.f6860a[i & this.f6862c];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
