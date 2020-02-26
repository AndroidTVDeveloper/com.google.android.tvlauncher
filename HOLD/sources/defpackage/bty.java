package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: bty  reason: default package */
/* compiled from: PG */
public final class bty {
    public static byte[] a(UUID uuid, byte[] bArr) {
        return a(uuid, null, bArr);
    }

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length << 4) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length2);
        allocate.putInt(length2);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(r5);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || (length = bArr.length) == 0)) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID a(byte[] r9) {
        /*
            bky r0 = new bky
            r0.<init>(r9)
            int r9 = r0.c
            r1 = 0
            r2 = 32
            if (r9 >= r2) goto L_0x000f
        L_0x000c:
        L_0x000d:
            r9 = r1
            goto L_0x007b
        L_0x000f:
            r9 = 0
            r0.c(r9)
            int r2 = r0.j()
            int r3 = r0.b()
            int r3 = r3 + 4
            if (r2 != r3) goto L_0x000c
            int r2 = r0.j()
            r3 = 1886614376(0x70737368, float:3.013775E29)
            if (r2 != r3) goto L_0x000c
            int r2 = r0.j()
            int r2 = defpackage.apu.c(r2)
            r3 = 1
            if (r2 <= r3) goto L_0x004d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r0 = 37
            r9.<init>(r0)
            java.lang.String r0 = "Unsupported pssh version: "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "PsshAtomUtil"
            android.util.Log.w(r0, r9)
            goto L_0x000d
        L_0x004d:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.l()
            long r7 = r0.l()
            r4.<init>(r5, r7)
            if (r2 != r3) goto L_0x0065
            int r2 = r0.n()
            int r2 = r2 << 4
            r0.d(r2)
        L_0x0065:
            int r2 = r0.n()
            int r3 = r0.b()
            if (r2 != r3) goto L_0x007a
            byte[] r3 = new byte[r2]
            r0.a(r3, r9, r2)
            aqm r9 = new aqm
            r9.<init>(r4)
            goto L_0x007b
        L_0x007a:
            goto L_0x000c
        L_0x007b:
            if (r9 == 0) goto L_0x0080
            java.util.UUID r9 = r9.a
            return r9
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bty.a(byte[]):java.util.UUID");
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static btx a(Object obj) {
        return new btx(obj);
    }
}
