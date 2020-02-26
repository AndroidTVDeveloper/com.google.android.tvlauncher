package p000;

import java.util.Arrays;

/* renamed from: bli */
/* compiled from: PG */
public final class bli {

    /* renamed from: a */
    private long[] f4285a = new long[10];

    /* renamed from: b */
    private Object[] f4286b = new Object[10];

    /* renamed from: c */
    private int f4287c;

    /* renamed from: d */
    private int f4288d;

    /* renamed from: a */
    public final synchronized void mo2112a(long j, Object obj) {
        int i = this.f4288d;
        if (i > 0) {
            if (j <= this.f4285a[((this.f4287c + i) - 1) % this.f4286b.length]) {
                mo2111a();
            }
        }
        int length = this.f4286b.length;
        if (this.f4288d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.f4287c;
            int i4 = length - i3;
            System.arraycopy(this.f4285a, i3, jArr, 0, i4);
            System.arraycopy(this.f4286b, this.f4287c, objArr, 0, i4);
            int i5 = this.f4287c;
            if (i5 > 0) {
                System.arraycopy(this.f4285a, 0, jArr, i4, i5);
                System.arraycopy(this.f4286b, 0, objArr, i4, this.f4287c);
            }
            this.f4285a = jArr;
            this.f4286b = objArr;
            this.f4287c = 0;
        }
        int i6 = this.f4287c;
        int i7 = this.f4288d;
        Object[] objArr2 = this.f4286b;
        int length2 = (i6 + i7) % objArr2.length;
        this.f4285a[length2] = j;
        objArr2[length2] = obj;
        this.f4288d = i7 + 1;
    }

    /* renamed from: a */
    public final synchronized void mo2111a() {
        this.f4287c = 0;
        this.f4288d = 0;
        Arrays.fill(this.f4286b, (Object) null);
    }

    /* renamed from: a */
    public final synchronized Object mo2110a(long j) {
        Object obj;
        obj = null;
        while (true) {
            int i = this.f4288d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.f4285a;
            int i2 = this.f4287c;
            if (j - jArr[i2] < 0) {
                break;
            }
            Object[] objArr = this.f4286b;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.f4287c = (i2 + 1) % objArr.length;
            this.f4288d = i - 1;
            obj = obj2;
        }
        return obj;
    }
}
