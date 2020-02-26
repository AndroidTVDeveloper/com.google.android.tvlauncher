package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ara */
/* compiled from: PG */
final class ara extends ard {

    /* renamed from: a */
    private static final byte[] f1944a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: o */
    private boolean f1945o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo1269a(bky bky) {
        int i;
        byte[] bArr = bky.f4258a;
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
        return mo1276b(((long) b3) * ((long) i));
    }

    /* renamed from: a */
    private static final void m1863a(List list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1271a(bky bky, long j, arb arb) {
        boolean z = true;
        if (this.f1945o) {
            if (bky.mo2083j() != 1332770163) {
                z = false;
            }
            bky.mo2073c(0);
            return z;
        }
        byte[] copyOf = Arrays.copyOf(bky.f4258a, bky.f4260c);
        byte b = copyOf[9];
        byte b2 = copyOf[11];
        byte b3 = copyOf[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(copyOf);
        m1863a(arrayList, ((b2 & 255) << 8) | (b3 & 255));
        m1863a(arrayList, 3840);
        arb.f1946a = akh.m731a((String) null, "audio/opus", -1, -1, b & 255, 48000, arrayList, (anq) null, (String) null);
        this.f1945o = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1270a(boolean z) {
        super.mo1270a(z);
        if (z) {
            this.f1945o = false;
        }
    }

    /* renamed from: b */
    public static boolean m1864b(bky bky) {
        int b = bky.mo2070b();
        byte[] bArr = f1944a;
        if (b < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        bky.mo2069a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f1944a);
    }
}
