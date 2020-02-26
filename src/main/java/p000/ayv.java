package p000;

import java.util.Arrays;

/* renamed from: ayv */
/* compiled from: PG */
public abstract class ayv extends ayl {

    /* renamed from: a */
    public byte[] f2826a;

    /* renamed from: b */
    private volatile boolean f2827b;

    public ayv(bhv bhv, bhy bhy, akh akh, int i, Object obj, byte[] bArr) {
        super(bhv, bhy, 3, akh, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f2826a = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1643a(byte[] bArr, int i);

    /* renamed from: a */
    public final void mo1538a() {
        this.f2827b = true;
    }

    /* renamed from: b */
    public final void mo1540b() {
        try {
            this.f2774l.mo1499a(this.f2767e);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f2827b) {
                byte[] bArr = this.f2826a;
                if (bArr == null) {
                    this.f2826a = new byte[16384];
                } else {
                    int length = bArr.length;
                    if (length < i2 + 16384) {
                        this.f2826a = Arrays.copyOf(bArr, length + 16384);
                    }
                }
                i = this.f2774l.mo1498a(this.f2826a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f2827b) {
                mo1643a(this.f2826a, i2);
            }
        } finally {
            blm.m3644a((bhv) this.f2774l);
        }
    }
}
