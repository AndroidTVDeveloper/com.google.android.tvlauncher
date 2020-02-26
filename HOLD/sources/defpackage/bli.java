package defpackage;

import java.util.Arrays;

/* renamed from: bli  reason: default package */
/* compiled from: PG */
public final class bli {
    private long[] a = new long[10];
    private Object[] b = new Object[10];
    private int c;
    private int d;

    public final synchronized void a(long j, Object obj) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                a();
            }
        }
        int length = this.b.length;
        if (this.d >= length) {
            int i2 = length + length;
            long[] jArr = new long[i2];
            Object[] objArr = new Object[i2];
            int i3 = this.c;
            int i4 = length - i3;
            System.arraycopy(this.a, i3, jArr, 0, i4);
            System.arraycopy(this.b, this.c, objArr, 0, i4);
            int i5 = this.c;
            if (i5 > 0) {
                System.arraycopy(this.a, 0, jArr, i4, i5);
                System.arraycopy(this.b, 0, objArr, i4, this.c);
            }
            this.a = jArr;
            this.b = objArr;
            this.c = 0;
        }
        int i6 = this.c;
        int i7 = this.d;
        Object[] objArr2 = this.b;
        int length2 = (i6 + i7) % objArr2.length;
        this.a[length2] = j;
        objArr2[length2] = obj;
        this.d = i7 + 1;
    }

    public final synchronized void a() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public final synchronized Object a(long j) {
        Object obj;
        obj = null;
        while (true) {
            int i = this.d;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.a;
            int i2 = this.c;
            if (j - jArr[i2] < 0) {
                break;
            }
            Object[] objArr = this.b;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            this.c = (i2 + 1) % objArr.length;
            this.d = i - 1;
            obj = obj2;
        }
        return obj;
    }
}
