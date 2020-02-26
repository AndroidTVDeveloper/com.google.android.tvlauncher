package defpackage;

import android.app.Fragment;
import android.support.v7.widget.RecyclerView;
import androidx.leanback.transition.FadeAndShortSlide;

/* renamed from: atc  reason: default package */
/* compiled from: PG */
public class atc {
    public void a(RecyclerView recyclerView) {
    }

    public static void a(Fragment fragment) {
        FadeAndShortSlide fadeAndShortSlide = new FadeAndShortSlide(8388611);
        FadeAndShortSlide fadeAndShortSlide2 = new FadeAndShortSlide(8388613);
        fragment.setEnterTransition(fadeAndShortSlide2);
        fragment.setExitTransition(fadeAndShortSlide);
        fragment.setReenterTransition(fadeAndShortSlide);
        fragment.setReturnTransition(fadeAndShortSlide2);
    }

    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long a(bky bky, int i, int i2) {
        bky.c(i);
        if (bky.b() >= 5) {
            int j = bky.j();
            if ((8388608 & j) == 0 && ((j >> 8) & 8191) == i2 && (j & 32) != 0 && bky.d() >= 7 && bky.b() >= 7 && (bky.d() & 16) == 16) {
                byte[] bArr = new byte[6];
                bky.a(bArr, 0, 6);
                byte b = bArr[0];
                byte b2 = bArr[1];
                byte b3 = bArr[2];
                long j2 = ((long) bArr[3]) & 255;
                return ((((long) b2) & 255) << 17) | ((((long) b) & 255) << 25) | ((((long) b3) & 255) << 9) | (j2 + j2) | ((((long) bArr[4]) & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ata a(defpackage.aoj r15) {
        /*
            defpackage.bks.a(r15)
            bky r0 = new bky
            r1 = 16
            r0.<init>(r1)
            atb r2 = defpackage.atb.a(r15, r0)
            int r2 = r2.a
            r3 = 0
            r4 = 1380533830(0x52494646, float:2.16116855E11)
            if (r2 != r4) goto L_0x0109
            byte[] r2 = r0.a
            r4 = 4
            r5 = 0
            r15.c(r2, r5, r4)
            r0.c(r5)
            int r2 = r0.j()
            r6 = 1463899717(0x57415645, float:2.12576269E14)
            java.lang.String r7 = "WavHeaderReader"
            if (r2 == r6) goto L_0x0042
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 36
            r15.<init>(r0)
            java.lang.String r0 = "Unsupported RIFF format: "
            r15.append(r0)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            android.util.Log.e(r7, r15)
            return r3
        L_0x0042:
            atb r2 = defpackage.atb.a(r15, r0)
        L_0x0046:
            int r6 = r2.a
            r8 = 1718449184(0x666d7420, float:2.8033575E23)
            if (r6 == r8) goto L_0x0058
            long r8 = r2.b
            int r2 = (int) r8
            r15.b(r2)
            atb r2 = defpackage.atb.a(r15, r0)
            goto L_0x0046
        L_0x0058:
            long r8 = r2.b
            r10 = 16
            r6 = 1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0063
            r8 = 1
            goto L_0x0065
        L_0x0063:
            r8 = 0
        L_0x0065:
            defpackage.bks.b(r8)
            byte[] r8 = r0.a
            r15.c(r8, r5, r1)
            r0.c(r5)
            int r1 = r0.f()
            int r9 = r0.f()
            int r10 = r0.o()
            int r11 = r0.o()
            int r12 = r0.f()
            int r13 = r0.f()
            int r0 = r9 * r13
            int r0 = r0 / 8
            if (r12 != r0) goto L_0x00e8
            if (r1 == r6) goto L_0x00b3
            r0 = 3
            if (r1 == r0) goto L_0x00ac
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r0) goto L_0x00b3
            r0 = 6
            if (r1 == r0) goto L_0x00a6
            r0 = 7
            if (r1 == r0) goto L_0x00a0
        L_0x009e:
            r14 = 0
            goto L_0x00b8
        L_0x00a0:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x00b8
        L_0x00a6:
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00b8
        L_0x00ac:
            r0 = 32
            if (r13 != r0) goto L_0x009e
            r14 = 4
            goto L_0x00b8
        L_0x00b3:
            int r4 = defpackage.blm.b(r13)
            r14 = r4
        L_0x00b8:
            if (r14 != 0) goto L_0x00d9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r0 = 64
            r15.<init>(r0)
            java.lang.String r0 = "Unsupported WAV format: "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r0 = " bit/sample, type "
            r15.append(r0)
            r15.append(r1)
            java.lang.String r15 = r15.toString()
            android.util.Log.e(r7, r15)
            return r3
        L_0x00d9:
            long r0 = r2.b
            int r1 = (int) r0
            int r1 = r1 + -16
            r15.b(r1)
            ata r15 = new ata
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r15
        L_0x00e8:
            ako r15 = new ako
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 55
            r1.<init>(r2)
            java.lang.String r2 = "Expected block alignment: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "; got: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x0109:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atc.a(aoj):ata");
    }
}
