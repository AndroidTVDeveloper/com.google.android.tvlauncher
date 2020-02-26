package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ahr  reason: default package */
/* compiled from: PG */
public final class ahr {
    public static /* synthetic */ int a;

    static {
        new AtomicReference();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053 A[SYNTHETIC, Splitter:B:30:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A[SYNTHETIC, Splitter:B:34:0x005a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer a(java.io.File r9) {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004f }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0047
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003f
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004f }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x003c }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0037 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0037 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0037 }
            if (r9 == 0) goto L_0x0031
            r9.close()     // Catch:{ IOException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r9 = move-exception
        L_0x0031:
            r7.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r9 = move-exception
        L_0x0036:
            return r0
        L_0x0037:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0051
        L_0x003c:
            r9 = move-exception
            goto L_0x0051
        L_0x003f:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004f }
            throw r9     // Catch:{ all -> 0x004f }
        L_0x0047:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004f }
            throw r9     // Catch:{ all -> 0x004f }
        L_0x004f:
            r9 = move-exception
            r7 = r0
        L_0x0051:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0058
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            if (r7 == 0) goto L_0x005f
            r7.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahr.a(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A[SYNTHETIC, Splitter:B:18:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC, Splitter:B:22:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.nio.ByteBuffer r4, java.io.File r5) {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x002c }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0029 }
            r1.write(r4)     // Catch:{ all -> 0x0029 }
            r1.force(r0)     // Catch:{ all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ IOException -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            r2.close()     // Catch:{ IOException -> 0x0027 }
            return
        L_0x0027:
            r4 = move-exception
            return
        L_0x0029:
            r4 = move-exception
            goto L_0x002e
        L_0x002c:
            r4 = move-exception
            r2 = r1
        L_0x002e:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r5 = move-exception
        L_0x0035:
            if (r2 != 0) goto L_0x0038
            goto L_0x003d
        L_0x0038:
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003d
        L_0x003c:
            r5 = move-exception
        L_0x003d:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahr.a(java.nio.ByteBuffer, java.io.File):void");
    }

    public static InputStream a(ByteBuffer byteBuffer) {
        return new ahp(byteBuffer);
    }
}
