package defpackage;

/* renamed from: cp  reason: default package */
/* compiled from: PG */
public final class cp {
    public int[] a;
    public int b;
    public int c;

    public cp() {
        int i = 8;
        if (Integer.bitCount(8) != 1) {
            int highestOneBit = Integer.highestOneBit(7);
            i = highestOneBit + highestOneBit;
        }
        this.c = i - 1;
        this.a = new int[i];
    }

    public final int b() {
        return this.b & this.c;
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.c & (i2 + 1);
        this.b = i3;
        if (i3 == 0) {
            int length = iArr.length;
            int i4 = length + length;
            if (i4 >= 0) {
                int[] iArr2 = new int[i4];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                System.arraycopy(this.a, 0, iArr2, length, 0);
                this.a = iArr2;
                this.b = length;
                this.c = i4 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final void a() {
        this.b = 0;
    }

    public final int b(int i) {
        if (i >= 0 && i < b()) {
            return this.a[i & this.c];
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
