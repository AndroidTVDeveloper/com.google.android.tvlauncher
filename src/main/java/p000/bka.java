package p000;

import android.os.ConditionVariable;

/* renamed from: bka */
/* compiled from: PG */
final class bka extends Thread {

    /* renamed from: a */
    private final /* synthetic */ ConditionVariable f4187a;

    /* renamed from: b */
    private final /* synthetic */ bkb f4188b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bka(bkb bkb, String str, ConditionVariable conditionVariable) {
        super(str);
        this.f4188b = bkb;
        this.f4187a = conditionVariable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkb.a(java.io.File, boolean, java.io.File[]):void
     arg types: [java.io.File, int, java.io.File[]]
     candidates:
      bkb.a(java.lang.String, long, long):java.io.File
      bjk.a(java.lang.String, long, long):java.io.File
      bkb.a(java.io.File, boolean, java.io.File[]):void */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0254, code lost:
        r19 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02de, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02df, code lost:
        r19 = r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f2 A[Catch:{ IOException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02ff A[Catch:{ IOException -> 0x0319 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0350 A[Catch:{ IOException -> 0x0347, all -> 0x035a }, LOOP:4: B:119:0x033f->B:126:0x0350, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02de A[Catch:{ IOException -> 0x0319 }, ExcHandler: all (th java.lang.Throwable), PHI: r3 
      PHI: (r3v8 bkb) = (r3v0 bkb), (r3v13 bkb), (r3v13 bkb) binds: [B:49:0x01b5, B:66:0x0213, B:67:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:49:0x01b5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r1 = r23
            bkb r2 = r1.f4188b
            monitor-enter(r2)
            android.os.ConditionVariable r0 = r1.f4187a     // Catch:{ all -> 0x0395 }
            r0.open()     // Catch:{ all -> 0x0395 }
            bkb r3 = r1.f4188b     // Catch:{ all -> 0x0395 }
            int r0 = p000.bkb.f4189e     // Catch:{ all -> 0x0395 }
            java.io.File r0 = r3.f4191a     // Catch:{ all -> 0x0395 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0395 }
            if (r0 != 0) goto L_0x004d
            java.io.File r0 = r3.f4191a     // Catch:{ all -> 0x0395 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0395 }
            if (r0 != 0) goto L_0x004d
            java.io.File r0 = r3.f4191a     // Catch:{ all -> 0x0395 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0395 }
            int r4 = r4.length()     // Catch:{ all -> 0x0395 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            int r4 = r4 + 34
            r5.<init>(r4)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = "Failed to create cache directory: "
            r5.append(r4)     // Catch:{ all -> 0x0395 }
            r5.append(r0)     // Catch:{ all -> 0x0395 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = "SimpleCache"
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x0395 }
            bji r4 = new bji     // Catch:{ all -> 0x0395 }
            r4.<init>(r0)     // Catch:{ all -> 0x0395 }
            r3.f4194d = r4     // Catch:{ all -> 0x0395 }
            goto L_0x038d
        L_0x004d:
            java.io.File r0 = r3.f4191a     // Catch:{ all -> 0x0395 }
            java.io.File[] r4 = r0.listFiles()     // Catch:{ all -> 0x0395 }
            if (r4 != 0) goto L_0x0084
            java.io.File r0 = r3.f4191a     // Catch:{ all -> 0x0395 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0395 }
            int r4 = r4.length()     // Catch:{ all -> 0x0395 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            int r4 = r4 + 38
            r5.<init>(r4)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = "Failed to list cache directory files: "
            r5.append(r4)     // Catch:{ all -> 0x0395 }
            r5.append(r0)     // Catch:{ all -> 0x0395 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = "SimpleCache"
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x0395 }
            bji r4 = new bji     // Catch:{ all -> 0x0395 }
            r4.<init>(r0)     // Catch:{ all -> 0x0395 }
            r3.f4194d = r4     // Catch:{ all -> 0x0395 }
            goto L_0x038d
        L_0x0084:
            int r5 = r4.length     // Catch:{ all -> 0x0395 }
            r6 = 0
            r7 = 0
        L_0x0087:
            r0 = 16
            r8 = -1
            if (r7 >= r5) goto L_0x00d5
            r10 = r4[r7]     // Catch:{ all -> 0x0395 }
            java.lang.String r11 = r10.getName()     // Catch:{ all -> 0x0395 }
            java.lang.String r12 = ".uid"
            boolean r12 = r11.endsWith(r12)     // Catch:{ all -> 0x0395 }
            if (r12 == 0) goto L_0x00d2
            r12 = 46
            int r12 = r11.indexOf(r12)     // Catch:{ NumberFormatException -> 0x00aa }
            java.lang.String r11 = r11.substring(r6, r12)     // Catch:{ NumberFormatException -> 0x00aa }
            long r10 = java.lang.Long.parseLong(r11, r0)     // Catch:{ NumberFormatException -> 0x00aa }
            goto L_0x00d7
        L_0x00aa:
            r0 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0395 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0395 }
            int r8 = r8.length()     // Catch:{ all -> 0x0395 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            int r8 = r8 + 20
            r9.<init>(r8)     // Catch:{ all -> 0x0395 }
            java.lang.String r8 = "Malformed UID file: "
            r9.append(r8)     // Catch:{ all -> 0x0395 }
            r9.append(r0)     // Catch:{ all -> 0x0395 }
            java.lang.String r0 = "SimpleCache"
            java.lang.String r8 = r9.toString()     // Catch:{ all -> 0x0395 }
            android.util.Log.e(r0, r8)     // Catch:{ all -> 0x0395 }
            r10.delete()     // Catch:{ all -> 0x0395 }
        L_0x00d2:
            int r7 = r7 + 1
            goto L_0x0087
        L_0x00d5:
            r10 = r8
        L_0x00d7:
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 != 0) goto L_0x0163
            java.io.File r5 = r3.f4191a     // Catch:{ IOException -> 0x0133 }
            java.security.SecureRandom r7 = new java.security.SecureRandom     // Catch:{ IOException -> 0x0133 }
            r7.<init>()     // Catch:{ IOException -> 0x0133 }
            long r7 = r7.nextLong()     // Catch:{ IOException -> 0x0133 }
            r9 = -9223372036854775808
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x00f1
            long r7 = java.lang.Math.abs(r7)     // Catch:{ IOException -> 0x0133 }
            goto L_0x00f3
        L_0x00f1:
            r7 = 0
        L_0x00f3:
            java.lang.String r0 = java.lang.Long.toString(r7, r0)     // Catch:{ IOException -> 0x0133 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0133 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0133 }
            java.lang.String r8 = ".uid"
            java.lang.String r0 = r0.concat(r8)     // Catch:{ IOException -> 0x0133 }
            r7.<init>(r5, r0)     // Catch:{ IOException -> 0x0133 }
            boolean r0 = r7.createNewFile()     // Catch:{ IOException -> 0x0133 }
            if (r0 == 0) goto L_0x010e
            goto L_0x0163
        L_0x010e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0133 }
            java.lang.String r4 = java.lang.String.valueOf(r7)     // Catch:{ IOException -> 0x0133 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x0133 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x0133 }
            int r5 = r5 + 27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0133 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0133 }
            java.lang.String r5 = "Failed to create UID file: "
            r6.append(r5)     // Catch:{ IOException -> 0x0133 }
            r6.append(r4)     // Catch:{ IOException -> 0x0133 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x0133 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0133 }
            throw r0     // Catch:{ IOException -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            java.io.File r4 = r3.f4191a     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0395 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0395 }
            int r5 = r5.length()     // Catch:{ all -> 0x0395 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0395 }
            int r5 = r5 + 28
            r6.<init>(r5)     // Catch:{ all -> 0x0395 }
            java.lang.String r5 = "Failed to create cache UID: "
            r6.append(r5)     // Catch:{ all -> 0x0395 }
            r6.append(r4)     // Catch:{ all -> 0x0395 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0395 }
            java.lang.String r5 = "SimpleCache"
            android.util.Log.e(r5, r4, r0)     // Catch:{ all -> 0x0395 }
            bji r5 = new bji     // Catch:{ all -> 0x0395 }
            r5.<init>(r4, r0)     // Catch:{ all -> 0x0395 }
            r3.f4194d = r5     // Catch:{ all -> 0x0395 }
            goto L_0x038d
        L_0x0163:
            bjv r0 = r3.f4193c     // Catch:{ IOException -> 0x035e }
            bju r5 = r0.f4176c     // Catch:{ IOException -> 0x035e }
            bjt r5 = (p000.bjt) r5     // Catch:{ IOException -> 0x035e }
            bke r5 = r5.f4171a     // Catch:{ IOException -> 0x035e }
            r5.mo2031a()     // Catch:{ IOException -> 0x035e }
            bju r5 = r0.f4176c     // Catch:{ IOException -> 0x035e }
            java.util.HashMap r7 = r0.f4174a     // Catch:{ IOException -> 0x035e }
            android.util.SparseArray r8 = r0.f4175b     // Catch:{ IOException -> 0x035e }
            r0 = r5
            bjt r0 = (p000.bjt) r0     // Catch:{ IOException -> 0x035e }
            boolean r0 = r0.f4172b     // Catch:{ IOException -> 0x035e }
            r9 = 1
            r0 = r0 ^ r9
            p000.bks.m3512b(r0)     // Catch:{ IOException -> 0x035e }
            r0 = r5
            bjt r0 = (p000.bjt) r0     // Catch:{ IOException -> 0x035e }
            bke r0 = r0.f4171a     // Catch:{ IOException -> 0x035e }
            boolean r0 = r0.mo2031a()     // Catch:{ IOException -> 0x035e }
            if (r0 == 0) goto L_0x031d
            r10 = 0
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r11 = r5
            bjt r11 = (p000.bjt) r11     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            bke r11 = r11.f4171a     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            java.io.File r12 = r11.f4205b     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            boolean r12 = r12.exists()     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            if (r12 != 0) goto L_0x019a
            goto L_0x01a6
        L_0x019a:
            java.io.File r12 = r11.f4204a     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r12.delete()     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            java.io.File r12 = r11.f4205b     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            java.io.File r13 = r11.f4204a     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r12.renameTo(r13)     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
        L_0x01a6:
            java.io.FileInputStream r12 = new java.io.FileInputStream     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            java.io.File r11 = r11.f4204a     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r12.<init>(r11)     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r0.<init>(r12)     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            java.io.DataInputStream r11 = new java.io.DataInputStream     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            r11.<init>(r0)     // Catch:{ IOException -> 0x02f6, all -> 0x02ed }
            int r0 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            if (r0 < 0) goto L_0x02d7
            r10 = 2
            if (r0 > r10) goto L_0x02d7
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r12 = r12 & r9
            if (r12 != 0) goto L_0x02cd
            int r12 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r13 = 0
            r14 = 0
        L_0x01cb:
            if (r13 >= r12) goto L_0x02ac
            int r15 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            java.lang.String r6 = r11.readUTF()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            if (r0 >= r10) goto L_0x01f5
            long r9 = r11.readLong()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r16 = r12
            bjx r12 = new bjx     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r12.<init>()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            p000.bjx.m3448a(r12, r9)     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            bjy r9 = p000.bjy.f4181a     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            bjy r9 = r9.mo2019a(r12)     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r19 = r3
            r18 = r4
            r20 = r5
            r21 = r13
            goto L_0x0285
        L_0x01f5:
            r16 = r12
            int r9 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r10.<init>()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            r12 = 0
        L_0x0201:
            if (r12 >= r9) goto L_0x0277
            r17 = r9
            java.lang.String r9 = r11.readUTF()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            int r1 = r11.readInt()     // Catch:{ IOException -> 0x02e4, all -> 0x02de }
            if (r1 < 0) goto L_0x0258
            r18 = r4
            r4 = 10485760(0xa00000, float:1.469368E-38)
            int r19 = java.lang.Math.min(r1, r4)     // Catch:{ IOException -> 0x0253, all -> 0x02de }
            byte[] r20 = p000.blm.f4298f     // Catch:{ IOException -> 0x0253, all -> 0x02de }
            r4 = 0
            r22 = r19
            r19 = r3
            r3 = r20
            r20 = r5
            r5 = r22
        L_0x0224:
            if (r4 == r1) goto L_0x023f
            r21 = r13
            int r13 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOf(r3, r13)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r11.readFully(r3, r4, r5)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r4 = r1 - r13
            r5 = 10485760(0xa00000, float:1.469368E-38)
            int r4 = java.lang.Math.min(r4, r5)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r5 = r4
            r4 = r13
            r13 = r21
            goto L_0x0224
        L_0x023f:
            r21 = r13
            r10.put(r9, r3)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r12 = r12 + 1
            r1 = r23
            r9 = r17
            r4 = r18
            r3 = r19
            r5 = r20
            r13 = r21
            goto L_0x0201
        L_0x0253:
            r0 = move-exception
            r19 = r3
            goto L_0x02e9
        L_0x0258:
            r19 = r3
            r18 = r4
            r20 = r5
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r4 = 31
            r3.<init>(r4)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            java.lang.String r4 = "Invalid value size: "
            r3.append(r4)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r3.append(r1)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            java.lang.String r1 = r3.toString()     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            throw r0     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
        L_0x0277:
            r19 = r3
            r18 = r4
            r20 = r5
            r21 = r13
            bjy r9 = new bjy     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r9.<init>(r10)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
        L_0x0285:
            bjs r1 = new bjs     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r1.<init>(r15, r6, r9)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            java.lang.String r3 = r1.f4167b     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r7.put(r3, r1)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r3 = r1.f4166a     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            java.lang.String r4 = r1.f4167b     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            r8.put(r3, r4)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r1 = p000.bjt.m3439a(r1, r0)     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r14 = r14 + r1
            int r13 = r21 + 1
            r6 = 0
            r9 = 1
            r10 = 2
            r1 = r23
            r12 = r16
            r4 = r18
            r3 = r19
            r5 = r20
            goto L_0x01cb
        L_0x02ac:
            r19 = r3
            r18 = r4
            r20 = r5
            int r0 = r11.readInt()     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            int r1 = r11.read()     // Catch:{ IOException -> 0x02cb, all -> 0x02c9 }
            if (r0 != r14) goto L_0x02c5
            r0 = -1
            if (r1 == r0) goto L_0x02c0
            goto L_0x02c5
        L_0x02c0:
            p000.blm.m3645a(r11)     // Catch:{ IOException -> 0x0319 }
            goto L_0x0321
        L_0x02c5:
            p000.blm.m3645a(r11)     // Catch:{ IOException -> 0x0319 }
            goto L_0x0302
        L_0x02c9:
            r0 = move-exception
            goto L_0x02e1
        L_0x02cb:
            r0 = move-exception
            goto L_0x02eb
        L_0x02cd:
            r19 = r3
            r18 = r4
            r20 = r5
            p000.blm.m3645a(r11)     // Catch:{ IOException -> 0x0319 }
            goto L_0x0302
        L_0x02d7:
            r19 = r3
            r18 = r4
            r20 = r5
            goto L_0x02c5
        L_0x02de:
            r0 = move-exception
            r19 = r3
        L_0x02e1:
            r10 = r11
            goto L_0x02f0
        L_0x02e4:
            r0 = move-exception
            r19 = r3
            r18 = r4
        L_0x02e9:
            r20 = r5
        L_0x02eb:
            r10 = r11
            goto L_0x02fd
        L_0x02ed:
            r0 = move-exception
            r19 = r3
        L_0x02f0:
            if (r10 == 0) goto L_0x02f5
            p000.blm.m3645a(r10)     // Catch:{ IOException -> 0x0319 }
        L_0x02f5:
            throw r0     // Catch:{ IOException -> 0x0319 }
        L_0x02f6:
            r0 = move-exception
            r19 = r3
            r18 = r4
            r20 = r5
        L_0x02fd:
            if (r10 == 0) goto L_0x0302
            p000.blm.m3645a(r10)     // Catch:{ IOException -> 0x0319 }
        L_0x0302:
            r7.clear()     // Catch:{ IOException -> 0x0319 }
            r8.clear()     // Catch:{ IOException -> 0x0319 }
            r5 = r20
            bjt r5 = (p000.bjt) r5     // Catch:{ IOException -> 0x0319 }
            bke r0 = r5.f4171a     // Catch:{ IOException -> 0x0319 }
            java.io.File r1 = r0.f4204a     // Catch:{ IOException -> 0x0319 }
            r1.delete()     // Catch:{ IOException -> 0x0319 }
            java.io.File r0 = r0.f4205b     // Catch:{ IOException -> 0x0319 }
            r0.delete()     // Catch:{ IOException -> 0x0319 }
            goto L_0x0321
        L_0x0319:
            r0 = move-exception
            r1 = r19
            goto L_0x0360
        L_0x031d:
            r19 = r3
            r18 = r4
        L_0x0321:
            r1 = r19
            java.io.File r0 = r1.f4191a     // Catch:{ IOException -> 0x0358 }
            r3 = r18
            r4 = 1
            r1.mo2025a(r0, r4, r3)     // Catch:{ IOException -> 0x0358 }
            bjv r0 = r1.f4193c     // Catch:{ all -> 0x035a }
            java.util.HashMap r3 = r0.f4174a     // Catch:{ all -> 0x035a }
            int r3 = r3.size()     // Catch:{ all -> 0x035a }
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ all -> 0x035a }
            java.util.HashMap r5 = r0.f4174a     // Catch:{ all -> 0x035a }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x035a }
            r5.toArray(r4)     // Catch:{ all -> 0x035a }
            r5 = 0
        L_0x033f:
            if (r5 < r3) goto L_0x0350
            bjv r0 = r1.f4193c     // Catch:{ IOException -> 0x0347 }
            r0.mo2013a()     // Catch:{ IOException -> 0x0347 }
            goto L_0x038d
        L_0x0347:
            r0 = move-exception
            java.lang.String r1 = "SimpleCache"
            java.lang.String r3 = "Storing index file failed"
            android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x035a }
            goto L_0x038d
        L_0x0350:
            r6 = r4[r5]     // Catch:{ all -> 0x035a }
            r0.mo2015c(r6)     // Catch:{ all -> 0x035a }
            int r5 = r5 + 1
            goto L_0x033f
        L_0x0358:
            r0 = move-exception
            goto L_0x0360
        L_0x035a:
            r0 = move-exception
            r1 = r23
            goto L_0x0396
        L_0x035e:
            r0 = move-exception
            r1 = r3
        L_0x0360:
            java.io.File r3 = r1.f4191a     // Catch:{ all -> 0x035a }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x035a }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x035a }
            int r4 = r4.length()     // Catch:{ all -> 0x035a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x035a }
            int r4 = r4 + 36
            r5.<init>(r4)     // Catch:{ all -> 0x035a }
            java.lang.String r4 = "Failed to initialize cache indices: "
            r5.append(r4)     // Catch:{ all -> 0x035a }
            r5.append(r3)     // Catch:{ all -> 0x035a }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x035a }
            java.lang.String r4 = "SimpleCache"
            android.util.Log.e(r4, r3, r0)     // Catch:{ all -> 0x035a }
            bji r4 = new bji     // Catch:{ all -> 0x035a }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x035a }
            r1.f4194d = r4     // Catch:{ all -> 0x035a }
        L_0x038d:
            r1 = r23
            bkb r0 = r1.f4188b     // Catch:{ all -> 0x0395 }
            bjq r0 = r0.f4192b     // Catch:{ all -> 0x0395 }
            monitor-exit(r2)     // Catch:{ all -> 0x0395 }
            return
        L_0x0395:
            r0 = move-exception
        L_0x0396:
            monitor-exit(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0399
        L_0x0398:
            throw r0
        L_0x0399:
            goto L_0x0398
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bka.run():void");
    }
}
