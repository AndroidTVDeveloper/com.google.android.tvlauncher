package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: cd  reason: default package */
/* compiled from: PG */
public final class cd {
    public static final cs a = new cs(16);
    public static final Object b = new Object();
    public static final dd c = new dd();
    private static final cj d = new cj("fonts");
    private static final Comparator e = new bz();

    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e A[Catch:{ NameNotFoundException -> 0x0218 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static defpackage.cc a(android.content.Context r24, defpackage.bv r25, int r26) {
        /*
            r0 = r25
            java.lang.String r1 = "result_code"
            java.lang.String r2 = "font_italic"
            java.lang.String r3 = "font_weight"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "_id"
            java.lang.String r7 = "content"
            android.content.pm.PackageManager r10 = r24.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0218 }
            android.content.res.Resources r11 = r24.getResources()     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r12 = r0.a     // Catch:{ NameNotFoundException -> 0x0218 }
            r13 = 0
            android.content.pm.ProviderInfo r14 = r10.resolveContentProvider(r12, r13)     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r14 == 0) goto L_0x0201
            java.lang.String r15 = r14.packageName     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r8 = r0.b     // Catch:{ NameNotFoundException -> 0x0218 }
            boolean r8 = r15.equals(r8)     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r8 == 0) goto L_0x01e0
            java.lang.String r8 = r14.packageName     // Catch:{ NameNotFoundException -> 0x0218 }
            r12 = 64
            android.content.pm.PackageInfo r8 = r10.getPackageInfo(r8, r12)     // Catch:{ NameNotFoundException -> 0x0218 }
            android.content.pm.Signature[] r8 = r8.signatures     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0218 }
            r10.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            r12 = 0
        L_0x003b:
            int r15 = r8.length     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r12 < r15) goto L_0x01cd
            java.util.Comparator r8 = defpackage.cd.e     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.Collections.sort(r10, r8)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.List r8 = r0.d     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r8 != 0) goto L_0x004b
            java.util.List r8 = defpackage.el.a(r11, r13)     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x004b:
            r11 = 0
        L_0x004c:
            int r12 = r8.size()     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r11 >= r12) goto L_0x0091
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.Object r15 = r8.get(r11)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.Collection r15 = (java.util.Collection) r15     // Catch:{ NameNotFoundException -> 0x0218 }
            r12.<init>(r15)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.Comparator r15 = defpackage.cd.e     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.Collections.sort(r12, r15)     // Catch:{ NameNotFoundException -> 0x0218 }
            int r15 = r10.size()     // Catch:{ NameNotFoundException -> 0x0218 }
            int r9 = r12.size()     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r15 == r9) goto L_0x006d
            goto L_0x008c
        L_0x006d:
            r9 = 0
        L_0x006e:
            int r15 = r10.size()     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r9 >= r15) goto L_0x0090
            java.lang.Object r15 = r10.get(r9)     // Catch:{ NameNotFoundException -> 0x0218 }
            byte[] r15 = (byte[]) r15     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.Object r16 = r12.get(r9)     // Catch:{ NameNotFoundException -> 0x0218 }
            r13 = r16
            byte[] r13 = (byte[]) r13     // Catch:{ NameNotFoundException -> 0x0218 }
            boolean r13 = java.util.Arrays.equals(r15, r13)     // Catch:{ NameNotFoundException -> 0x0218 }
            if (r13 == 0) goto L_0x008c
            int r9 = r9 + 1
            r13 = 0
            goto L_0x006e
        L_0x008c:
            int r11 = r11 + 1
            r13 = 0
            goto L_0x004c
        L_0x0090:
            goto L_0x0093
        L_0x0091:
            r14 = 0
        L_0x0093:
            r13 = 1
            if (r14 == 0) goto L_0x01a2
            java.lang.String r8 = r14.authority     // Catch:{ NameNotFoundException -> 0x0218 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0218 }
            r9.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r10 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x0218 }
            r10.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r10 = r10.scheme(r7)     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r10 = r10.authority(r8)     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri r10 = r10.build()     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r11 = new android.net.Uri$Builder     // Catch:{ NameNotFoundException -> 0x0218 }
            r11.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r7 = r11.scheme(r7)     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri$Builder r7 = r7.authority(r8)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r8 = "file"
            android.net.Uri$Builder r7 = r7.appendPath(r8)     // Catch:{ NameNotFoundException -> 0x0218 }
            android.net.Uri r7 = r7.build()     // Catch:{ NameNotFoundException -> 0x0218 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x019a }
            android.content.ContentResolver r17 = r24.getContentResolver()     // Catch:{ all -> 0x019a }
            r8 = 7
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x019a }
            r11 = 0
            r8[r11] = r6     // Catch:{ all -> 0x019a }
            r8[r13] = r5     // Catch:{ all -> 0x019a }
            r11 = 2
            r8[r11] = r4     // Catch:{ all -> 0x019a }
            r11 = 3
            java.lang.String r12 = "font_variation_settings"
            r8[r11] = r12     // Catch:{ all -> 0x019a }
            r11 = 4
            r8[r11] = r3     // Catch:{ all -> 0x019a }
            r11 = 5
            r8[r11] = r2     // Catch:{ all -> 0x019a }
            r11 = 6
            r8[r11] = r1     // Catch:{ all -> 0x019a }
            java.lang.String r20 = "query = ?"
            java.lang.String[] r11 = new java.lang.String[r13]     // Catch:{ all -> 0x019a }
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x019a }
            r12 = 0
            r11[r12] = r0     // Catch:{ all -> 0x019a }
            r22 = 0
            r23 = 0
            r18 = r10
            r19 = r8
            r21 = r11
            android.database.Cursor r8 = r17.query(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x019a }
            if (r8 == 0) goto L_0x0126
            int r0 = r8.getCount()     // Catch:{ all -> 0x0181 }
            if (r0 <= 0) goto L_0x0126
            int r0 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0181 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0181 }
            r9.<init>()     // Catch:{ all -> 0x0181 }
            int r1 = r8.getColumnIndex(r6)     // Catch:{ all -> 0x0181 }
            int r5 = r8.getColumnIndex(r5)     // Catch:{ all -> 0x0181 }
            int r4 = r8.getColumnIndex(r4)     // Catch:{ all -> 0x0181 }
            int r3 = r8.getColumnIndex(r3)     // Catch:{ all -> 0x0181 }
            int r2 = r8.getColumnIndex(r2)     // Catch:{ all -> 0x0181 }
        L_0x0120:
            boolean r6 = r8.moveToNext()     // Catch:{ all -> 0x0181 }
            if (r6 != 0) goto L_0x0127
        L_0x0126:
            goto L_0x0184
        L_0x0127:
            r6 = -1
            if (r0 == r6) goto L_0x0131
            int r6 = r8.getInt(r0)     // Catch:{ all -> 0x0181 }
            r22 = r6
            goto L_0x0134
        L_0x0131:
            r22 = 0
        L_0x0134:
            r6 = -1
            if (r4 == r6) goto L_0x013e
            int r6 = r8.getInt(r4)     // Catch:{ all -> 0x0181 }
            r19 = r6
            goto L_0x0141
        L_0x013e:
            r19 = 0
        L_0x0141:
            r6 = -1
            if (r5 == r6) goto L_0x014f
            long r11 = r8.getLong(r5)     // Catch:{ all -> 0x0181 }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r7, r11)     // Catch:{ all -> 0x0181 }
            r18 = r6
            goto L_0x0159
        L_0x014f:
            long r11 = r8.getLong(r1)     // Catch:{ all -> 0x0181 }
            android.net.Uri r6 = android.content.ContentUris.withAppendedId(r10, r11)     // Catch:{ all -> 0x0181 }
            r18 = r6
        L_0x0159:
            r6 = -1
            if (r3 == r6) goto L_0x0163
            int r6 = r8.getInt(r3)     // Catch:{ all -> 0x0181 }
            r20 = r6
            goto L_0x0167
        L_0x0163:
            r6 = 400(0x190, float:5.6E-43)
            r20 = 400(0x190, float:5.6E-43)
        L_0x0167:
            r6 = -1
            if (r2 == r6) goto L_0x0174
            int r6 = r8.getInt(r2)     // Catch:{ all -> 0x0181 }
            if (r6 != r13) goto L_0x0173
            r21 = 1
            goto L_0x0176
        L_0x0173:
        L_0x0174:
            r21 = 0
        L_0x0176:
            cb r6 = new cb     // Catch:{ all -> 0x0181 }
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0181 }
            r9.add(r6)     // Catch:{ all -> 0x0181 }
            goto L_0x0120
        L_0x0181:
            r0 = move-exception
            goto L_0x019c
        L_0x0184:
            if (r8 != 0) goto L_0x0187
            goto L_0x018a
        L_0x0187:
            r8.close()     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x018a:
            r0 = 0
            cb[] r1 = new defpackage.cb[r0]     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.Object[] r0 = r9.toArray(r1)     // Catch:{ NameNotFoundException -> 0x0218 }
            cb[] r0 = (defpackage.cb[]) r0     // Catch:{ NameNotFoundException -> 0x0218 }
            ca r1 = new ca     // Catch:{ NameNotFoundException -> 0x0218 }
            r9 = 0
            r1.<init>(r9, r0)     // Catch:{ NameNotFoundException -> 0x0218 }
            goto L_0x01a9
        L_0x019a:
            r0 = move-exception
            r8 = 0
        L_0x019c:
            if (r8 == 0) goto L_0x01a1
            r8.close()     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x01a1:
            throw r0     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x01a2:
            r9 = 0
            ca r1 = new ca     // Catch:{ NameNotFoundException -> 0x0218 }
            r2 = 0
            r1.<init>(r13, r2)     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x01a9:
            int r0 = r1.a
            if (r0 != 0) goto L_0x01c5
            cb[] r0 = r1.b
            bp r1 = defpackage.bh.a
            r13 = r24
            r15 = r26
            android.graphics.Typeface r0 = r1.a(r13, r0, r15)
            if (r0 == 0) goto L_0x01bd
            r13 = 0
            goto L_0x01bf
        L_0x01bd:
            r13 = -3
        L_0x01bf:
            cc r1 = new cc
            r1.<init>(r0, r13)
            return r1
        L_0x01c5:
            cc r0 = new cc
            r1 = -2
            r2 = 0
            r0.<init>(r2, r1)
            return r0
        L_0x01cd:
            r13 = r24
            r15 = r26
            r9 = 0
            r16 = r8[r12]     // Catch:{ NameNotFoundException -> 0x0218 }
            byte[] r9 = r16.toByteArray()     // Catch:{ NameNotFoundException -> 0x0218 }
            r10.add(r9)     // Catch:{ NameNotFoundException -> 0x0218 }
            int r12 = r12 + 1
            r13 = 0
            goto L_0x003b
        L_0x01e0:
            android.content.pm.PackageManager$NameNotFoundException r1 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0218 }
            r2.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r3 = "Found content provider "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x0218 }
            r2.append(r12)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r3 = ", but package was not "
            r2.append(r3)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r0 = r0.b     // Catch:{ NameNotFoundException -> 0x0218 }
            r2.append(r0)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ NameNotFoundException -> 0x0218 }
            r1.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0218 }
            throw r1     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x0201:
            android.content.pm.PackageManager$NameNotFoundException r0 = new android.content.pm.PackageManager$NameNotFoundException     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0218 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r2 = "No package found for authority: "
            r1.append(r2)     // Catch:{ NameNotFoundException -> 0x0218 }
            r1.append(r12)     // Catch:{ NameNotFoundException -> 0x0218 }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0218 }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x0218 }
            throw r0     // Catch:{ NameNotFoundException -> 0x0218 }
        L_0x0218:
            r0 = move-exception
            cc r0 = new cc
            r1 = 0
            r2 = -1
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.a(android.content.Context, bv, int):cc");
    }

    public static Typeface a(Context context, bv bvVar, bc bcVar, boolean z, int i, int i2) {
        ReentrantLock reentrantLock;
        Object obj;
        String str = bvVar.e + "-" + i2;
        Typeface typeface = (Typeface) a.a(str);
        if (typeface != null) {
            bcVar.a(typeface);
            return typeface;
        } else if (z && i == -1) {
            cc a2 = a(context, bvVar, i2);
            if (a2.b == 0) {
                bcVar.b(a2.a);
            } else {
                bc.a();
            }
            return a2.a;
        } else {
            bw bwVar = new bw(context, bvVar, i2, str);
            if (!z) {
                bx bxVar = new bx(bcVar);
                synchronized (b) {
                    ArrayList arrayList = (ArrayList) c.get(str);
                    if (arrayList == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(bxVar);
                        c.put(str, arrayList2);
                        d.a(new cg(bwVar, new Handler(), new by(str)));
                        return null;
                    }
                    arrayList.add(bxVar);
                    return null;
                }
            }
            try {
                cj cjVar = d;
                reentrantLock = new ReentrantLock();
                Condition newCondition = reentrantLock.newCondition();
                AtomicReference atomicReference = new AtomicReference();
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                cjVar.a(new ch(atomicReference, bwVar, reentrantLock, atomicBoolean, newCondition));
                reentrantLock.lock();
                if (atomicBoolean.get()) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                    while (true) {
                        try {
                            nanos = newCondition.awaitNanos(nanos);
                        } catch (InterruptedException e2) {
                        }
                        if (!atomicBoolean.get()) {
                            obj = atomicReference.get();
                            break;
                        } else if (nanos <= 0) {
                            throw new InterruptedException("timeout");
                        }
                    }
                } else {
                    obj = atomicReference.get();
                }
                reentrantLock.unlock();
                return ((cc) obj).a;
            } catch (InterruptedException e3) {
                return null;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        defpackage.dhr.a(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0051, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005d, code lost:
        throw r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map a(android.content.Context r14, defpackage.cb[] r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r15.length
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x0068
            r3 = r15[r2]
            int r4 = r3.e
            if (r4 == 0) goto L_0x0010
            goto L_0x0065
        L_0x0010:
            android.net.Uri r3 = r3.a
            boolean r4 = r0.containsKey(r3)
            if (r4 != 0) goto L_0x0065
            android.content.ContentResolver r4 = r14.getContentResolver()
            r5 = 0
            java.lang.String r6 = "r"
            android.os.ParcelFileDescriptor r4 = r4.openFileDescriptor(r3, r6, r5)     // Catch:{ IOException -> 0x0060 }
            if (r4 == 0) goto L_0x005e
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0052 }
            java.io.FileDescriptor r7 = r4.getFileDescriptor()     // Catch:{ all -> 0x0052 }
            r6.<init>(r7)     // Catch:{ all -> 0x0052 }
            java.nio.channels.FileChannel r8 = r6.getChannel()     // Catch:{ all -> 0x0046 }
            long r12 = r8.size()     // Catch:{ all -> 0x0046 }
            java.nio.channels.FileChannel$MapMode r9 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0046 }
            r10 = 0
            java.nio.MappedByteBuffer r7 = r8.map(r9, r10, r12)     // Catch:{ all -> 0x0046 }
            r6.close()     // Catch:{ all -> 0x0052 }
            r4.close()     // Catch:{ IOException -> 0x0060 }
            r5 = r7
            goto L_0x0062
        L_0x0046:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r8 = move-exception
            r6.close()     // Catch:{ all -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r6 = move-exception
            defpackage.dhr.a(r7, r6)     // Catch:{ all -> 0x0052 }
        L_0x0051:
            throw r8     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r7 = move-exception
            r4.close()     // Catch:{ all -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r4 = move-exception
            defpackage.dhr.a(r6, r4)     // Catch:{ IOException -> 0x0060 }
        L_0x005d:
            throw r7     // Catch:{ IOException -> 0x0060 }
        L_0x005e:
            goto L_0x0062
        L_0x0060:
            r4 = move-exception
        L_0x0062:
            r0.put(r3, r5)
        L_0x0065:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0068:
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd.a(android.content.Context, cb[]):java.util.Map");
    }
}
