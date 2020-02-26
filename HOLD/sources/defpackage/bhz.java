package defpackage;

import java.util.Arrays;

/* renamed from: bhz  reason: default package */
/* compiled from: PG */
public final class bhz implements bhk {
    private final bhj[] a = new bhj[1];
    private int b;
    private int c;
    private int d = 0;
    private bhj[] e = new bhj[100];

    public bhz() {
        bks.a(true);
        bks.a(true);
    }

    public final synchronized int d() {
        return this.c << 16;
    }

    public final synchronized bhj a() {
        bhj bhj;
        this.c++;
        int i = this.d;
        if (i > 0) {
            bhj[] bhjArr = this.e;
            int i2 = i - 1;
            this.d = i2;
            bhj = bhjArr[i2];
            bhjArr[i2] = null;
        } else {
            bhj = new bhj(new byte[65536]);
        }
        return bhj;
    }

    public final synchronized void a(bhj bhj) {
        bhj[] bhjArr = this.a;
        bhjArr[0] = bhj;
        a(bhjArr);
    }

    public final synchronized void a(bhj[] bhjArr) {
        int i = this.d;
        int i2 = i + r1;
        bhj[] bhjArr2 = this.e;
        int length = bhjArr2.length;
        if (i2 >= length) {
            this.e = (bhj[]) Arrays.copyOf(bhjArr2, Math.max(length + length, i2));
        }
        for (bhj bhj : bhjArr) {
            bhj[] bhjArr3 = this.e;
            int i3 = this.d;
            this.d = i3 + 1;
            bhjArr3[i3] = bhj;
        }
        this.c -= bhjArr.length;
        notifyAll();
    }

    public final synchronized void c() {
        a(0);
    }

    public final synchronized void a(int i) {
        int i2 = this.b;
        this.b = i;
        if (i < i2) {
            b();
        }
    }

    public final synchronized void b() {
        int max = Math.max(0, blm.a(this.b, 65536) - this.c);
        int i = this.d;
        if (max < i) {
            Arrays.fill(this.e, max, i, (Object) null);
            this.d = max;
        }
    }
}
