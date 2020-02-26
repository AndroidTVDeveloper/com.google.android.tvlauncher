package p000;

import java.util.Arrays;

/* renamed from: bhz */
/* compiled from: PG */
public final class bhz implements bhk {

    /* renamed from: a */
    private final bhj[] f4006a = new bhj[1];

    /* renamed from: b */
    private int f4007b;

    /* renamed from: c */
    private int f4008c;

    /* renamed from: d */
    private int f4009d = 0;

    /* renamed from: e */
    private bhj[] f4010e = new bhj[100];

    public bhz() {
        bks.m3510a(true);
        bks.m3510a(true);
    }

    /* renamed from: d */
    public final synchronized int mo1961d() {
        return this.f4008c << 16;
    }

    /* renamed from: a */
    public final synchronized bhj mo1937a() {
        bhj bhj;
        this.f4008c++;
        int i = this.f4009d;
        if (i > 0) {
            bhj[] bhjArr = this.f4010e;
            int i2 = i - 1;
            this.f4009d = i2;
            bhj = bhjArr[i2];
            bhjArr[i2] = null;
        } else {
            bhj = new bhj(new byte[65536]);
        }
        return bhj;
    }

    /* renamed from: a */
    public final synchronized void mo1938a(bhj bhj) {
        bhj[] bhjArr = this.f4006a;
        bhjArr[0] = bhj;
        mo1939a(bhjArr);
    }

    /* renamed from: a */
    public final synchronized void mo1939a(bhj[] bhjArr) {
        int i = this.f4009d;
        int i2 = i + r1;
        bhj[] bhjArr2 = this.f4010e;
        int length = bhjArr2.length;
        if (i2 >= length) {
            this.f4010e = (bhj[]) Arrays.copyOf(bhjArr2, Math.max(length + length, i2));
        }
        for (bhj bhj : bhjArr) {
            bhj[] bhjArr3 = this.f4010e;
            int i3 = this.f4009d;
            this.f4009d = i3 + 1;
            bhjArr3[i3] = bhj;
        }
        this.f4008c -= bhjArr.length;
        notifyAll();
    }

    /* renamed from: c */
    public final synchronized void mo1960c() {
        mo1959a(0);
    }

    /* renamed from: a */
    public final synchronized void mo1959a(int i) {
        int i2 = this.f4007b;
        this.f4007b = i;
        if (i < i2) {
            mo1940b();
        }
    }

    /* renamed from: b */
    public final synchronized void mo1940b() {
        int max = Math.max(0, blm.m3623a(this.f4007b, 65536) - this.f4008c);
        int i = this.f4009d;
        if (max < i) {
            Arrays.fill(this.f4010e, max, i, (Object) null);
            this.f4009d = max;
        }
    }
}
