package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ara  reason: default package */
/* compiled from: PG */
final class ara extends ard {
    private static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private boolean o;

    /* access modifiers changed from: protected */
    public final long a(bky bky) {
        int i;
        byte[] bArr = bky.a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i2 = b >> 3;
        int i3 = i2 & 3;
        if (i2 >= 16) {
            i = 2500 << i3;
        } else {
            i = i2 >= 12 ? 10000 << (i3 & 1) : i3 != 3 ? 10000 << i3 : 60000;
        }
        return b(((long) b3) * ((long) i));
    }

    private static final void a(List list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky, long j, arb arb) {
        boolean z = true;
        if (this.o) {
            if (bky.j() != 1332770163) {
                z = false;
            }
            bky.c(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(bky.a, bky.c);
        byte b = copyOf[9];
        byte b2 = copyOf[11];
        byte b3 = copyOf[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        a(arrayList, ((b2 & 255) << 8) | (b3 & 255));
        a(arrayList, 3840);
        arb.a = akh.a((String) null, "audio/opus", -1, -1, b & 255, 48000, arrayList, (anq) null, (String) null);
        this.o = true;
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.o = false;
        }
    }

    public static boolean b(bky bky) {
        int b = bky.b();
        byte[] bArr = a;
        if (b < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        bky.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, a);
    }
}
