package defpackage;

import java.util.Arrays;

/* renamed from: ayv  reason: default package */
/* compiled from: PG */
public abstract class ayv extends ayl {
    public byte[] a;
    private volatile boolean b;

    public ayv(bhv bhv, bhy bhy, akh akh, int i, Object obj, byte[] bArr) {
        super(bhv, bhy, 3, akh, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.a = bArr;
    }

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i);

    public final void a() {
        this.b = true;
    }

    public final void b() {
        try {
            this.l.a(this.e);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.b) {
                byte[] bArr = this.a;
                if (bArr == null) {
                    this.a = new byte[16384];
                } else {
                    int length = bArr.length;
                    if (length < i2 + 16384) {
                        this.a = Arrays.copyOf(bArr, length + 16384);
                    }
                }
                i = this.l.a(this.a, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.b) {
                a(this.a, i2);
            }
        } finally {
            blm.a((bhv) this.l);
        }
    }
}
