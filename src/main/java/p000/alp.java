package p000;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: alp */
/* compiled from: PG */
public final class alp {

    /* renamed from: a */
    private static final int[] f715a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: a */
    public static void m1040a(int i, bky bky) {
        bky.mo2065a(7);
        byte[] bArr = bky.f4258a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) (i >> 16);
        bArr[5] = (byte) (i >> 8);
        bArr[6] = (byte) i;
    }

    /* renamed from: a */
    public static akh m1038a(bky bky, String str, String str2, anq anq) {
        bky.mo2075d(1);
        return akh.m731a(str, "audio/ac4", -1, -1, 2, ((bky.mo2074d() & 32) >> 5) == 0 ? 44100 : 48000, (List) null, anq, str2);
    }

    /* renamed from: a */
    public static int m1036a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return m1039a(new bkx(bArr)).f714c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r9 != 11) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0096, code lost:
        if (r9 == 11) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        if (r9 == 8) goto L_0x00a0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.alo m1039a(p000.bkx r9) {
        /*
            r0 = 16
            int r1 = r9.mo2057c(r0)
            int r0 = r9.mo2057c(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r9.mo2057c(r0)
            r3 = 7
            goto L_0x001a
        L_0x0018:
            r3 = 4
        L_0x001a:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 == r3) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            int r0 = r0 + 2
        L_0x0024:
            r1 = 2
            int r3 = r9.mo2057c(r1)
            r4 = 3
            if (r3 != r4) goto L_0x0037
        L_0x002d:
            r9.mo2057c(r1)
            boolean r3 = r9.mo2060e()
            if (r3 != 0) goto L_0x002d
        L_0x0037:
            r3 = 10
            int r3 = r9.mo2057c(r3)
            boolean r5 = r9.mo2060e()
            if (r5 == 0) goto L_0x004c
            int r5 = r9.mo2057c(r4)
            if (r5 <= 0) goto L_0x004c
            r9.mo2054b(r1)
        L_0x004c:
            boolean r5 = r9.mo2060e()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 != 0) goto L_0x005c
            r5 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0060
        L_0x005c:
            r5 = 48000(0xbb80, float:6.7262E-41)
        L_0x0060:
            int r9 = r9.mo2057c(r2)
            r8 = 0
            if (r5 != r6) goto L_0x0070
            r6 = 13
            if (r9 != r6) goto L_0x0070
            int[] r9 = p000.alp.f715a
            r8 = r9[r6]
            goto L_0x00a4
        L_0x0070:
            if (r5 != r7) goto L_0x00a3
            int[] r6 = p000.alp.f715a
            int r7 = r6.length
            if (r9 >= r7) goto L_0x00a3
            r8 = r6[r9]
            int r3 = r3 % 5
            r6 = 8
            r7 = 1
            if (r3 == r7) goto L_0x0099
            r7 = 11
            if (r3 == r1) goto L_0x0092
            if (r3 == r4) goto L_0x0099
            if (r3 == r2) goto L_0x0089
            goto L_0x00a3
        L_0x0089:
            if (r9 != r4) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            if (r9 == r6) goto L_0x009c
            if (r9 == r7) goto L_0x009c
            goto L_0x00a3
        L_0x0092:
            if (r9 != r6) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            if (r9 == r7) goto L_0x009c
            goto L_0x00a3
        L_0x0099:
            if (r9 != r4) goto L_0x009d
        L_0x009c:
            goto L_0x00a0
        L_0x009d:
            if (r9 == r6) goto L_0x009c
            goto L_0x00a3
        L_0x00a0:
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x00a3:
        L_0x00a4:
            alo r9 = new alo
            r9.<init>(r5, r0, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.alp.m1039a(bkx):alo");
    }

    /* renamed from: a */
    public static int m1037a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        byte b = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (b == 65535) {
            b = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return b + i2;
    }
}
