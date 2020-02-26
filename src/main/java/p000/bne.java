package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: bne */
/* compiled from: PG */
public final class bne extends bpn {

    /* renamed from: h */
    private final bmw f4461h;

    public bne(bmw bmw, bos bos) {
        super(bmy.f4435a, bos);
        this.f4461h = bmw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ box mo2178a(Status status) {
        return status;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: ceh} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r5 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo2179a(p000.boi r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            bnf r2 = (p000.bnf) r2
            bng r3 = new bng
            r3.<init>(r1)
            bmw r0 = r1.f4461h     // Catch:{ RuntimeException -> 0x0210 }
            bmy r5 = r0.f4427a     // Catch:{ RuntimeException -> 0x0210 }
            java.util.List r5 = r5.f4446j     // Catch:{ RuntimeException -> 0x0210 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x0210 }
        L_0x0015:
            boolean r6 = r5.hasNext()     // Catch:{ RuntimeException -> 0x0210 }
            r7 = 0
            if (r6 == 0) goto L_0x002a
            java.lang.Object r0 = r5.next()     // Catch:{ RuntimeException -> 0x0210 }
            bmv r0 = (p000.bmv) r0     // Catch:{ RuntimeException -> 0x0210 }
            bmw r0 = r0.mo2162a()     // Catch:{ RuntimeException -> 0x0210 }
            if (r0 != 0) goto L_0x0015
        L_0x0028:
            r5 = r7
            goto L_0x0044
        L_0x002a:
            java.util.List r5 = p000.bmy.f4437i     // Catch:{ RuntimeException -> 0x0210 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RuntimeException -> 0x0210 }
        L_0x0030:
            boolean r6 = r5.hasNext()     // Catch:{ RuntimeException -> 0x0210 }
            if (r6 == 0) goto L_0x0043
            java.lang.Object r0 = r5.next()     // Catch:{ RuntimeException -> 0x0210 }
            bmv r0 = (p000.bmv) r0     // Catch:{ RuntimeException -> 0x0210 }
            bmw r0 = r0.mo2162a()     // Catch:{ RuntimeException -> 0x0210 }
            if (r0 != 0) goto L_0x0030
            goto L_0x0028
        L_0x0043:
            r5 = r0
        L_0x0044:
            if (r5 == 0) goto L_0x020a
            bmy r0 = r5.f4427a
            bmx r0 = r0.f4445h
            java.lang.String r6 = r5.f4430d
            int r8 = r5.f4431e
            djb r9 = r5.f4433g
            dje r9 = r9.f8672a
            dng r9 = (p000.dng) r9
            int r9 = r9.f8934e
            if (r6 == 0) goto L_0x0060
            boolean r10 = r6.isEmpty()
            if (r10 != 0) goto L_0x0060
            r7 = r6
            goto L_0x0066
        L_0x0060:
            if (r8 >= 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            java.lang.String r7 = "0"
        L_0x0066:
            if (r7 != 0) goto L_0x006a
            goto L_0x0180
        L_0x006a:
            bnk r0 = (p000.bnk) r0
            android.content.Context r8 = r0.f4468c
            if (r8 == 0) goto L_0x009b
            java.util.concurrent.ConcurrentHashMap r8 = p000.bnk.f4465d
            java.lang.Object r8 = r8.get(r7)
            ceh r8 = (p000.ceh) r8
            if (r8 != 0) goto L_0x0091
            ceg r8 = p000.bnk.f4464b
            dni r10 = p000.dni.f8945b
            cef r11 = new cef
            r11.<init>(r8, r7, r10)
            java.util.concurrent.ConcurrentHashMap r8 = p000.bnk.f4465d
            java.lang.Object r7 = r8.putIfAbsent(r7, r11)
            r8 = r7
            ceh r8 = (p000.ceh) r8
            if (r8 == 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r8 = r11
            goto L_0x0092
        L_0x0091:
        L_0x0092:
            java.lang.Object r7 = r8.mo2694c()
            dni r7 = (p000.dni) r7
            djk r7 = r7.f8946a
            goto L_0x009f
        L_0x009b:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x009f:
            java.util.Iterator r7 = r7.iterator()
        L_0x00a3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0180
            java.lang.Object r8 = r7.next()
            dnh r8 = (p000.dnh) r8
            int r10 = r8.f8940a
            r11 = 1
            r10 = r10 & r11
            if (r10 != 0) goto L_0x00b6
            goto L_0x00bc
        L_0x00b6:
            int r10 = r8.f8941b
            if (r10 == 0) goto L_0x00bc
            if (r10 != r9) goto L_0x00a3
        L_0x00bc:
            java.lang.String r10 = r8.f8942c
            android.content.Context r12 = r0.f4468c
            java.lang.Long r13 = p000.bnk.f4467f
            r14 = 0
            if (r13 == 0) goto L_0x00c8
            goto L_0x0106
        L_0x00c8:
            if (r12 == 0) goto L_0x010d
            java.lang.Boolean r13 = p000.bnk.f4466e
            if (r13 != 0) goto L_0x00e6
            bun r13 = p000.buo.m4260a(r12)
            android.content.Context r13 = r13.f4854a
            java.lang.String r11 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r11 = r13.checkCallingOrSelfPermission(r11)
            if (r11 != 0) goto L_0x00de
            r11 = 1
            goto L_0x00e0
        L_0x00de:
            r11 = 0
        L_0x00e0:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            p000.bnk.f4466e = r11
        L_0x00e6:
            java.lang.Boolean r11 = p000.bnk.f4466e
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x00ff
            android.content.ContentResolver r11 = r12.getContentResolver()
            java.lang.String r12 = "android_id"
            long r11 = p000.byi.m4372b(r11, r12)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            p000.bnk.f4467f = r11
            goto L_0x0106
        L_0x00ff:
            java.lang.Long r11 = java.lang.Long.valueOf(r14)
            p000.bnk.f4467f = r11
        L_0x0106:
            java.lang.Long r11 = p000.bnk.f4467f
            long r11 = r11.longValue()
            goto L_0x010f
        L_0x010d:
            r11 = r14
        L_0x010f:
            r13 = 8
            if (r10 == 0) goto L_0x0134
            boolean r16 = r10.isEmpty()
            if (r16 != 0) goto L_0x0134
            java.nio.charset.Charset r4 = p000.bnk.f4463a
            byte[] r4 = r10.getBytes(r4)
            int r10 = r4.length
            int r10 = r10 + r13
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocate(r10)
            r10.put(r4)
            r10.putLong(r11)
            byte[] r4 = r10.array()
            long r10 = p000.boc.m3816a(r4)
            goto L_0x0145
        L_0x0134:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r13)
            java.nio.ByteBuffer r4 = r4.putLong(r11)
            byte[] r4 = r4.array()
            long r10 = p000.boc.m3816a(r4)
        L_0x0145:
            long r12 = r8.f8943d
            r16 = r7
            long r6 = r8.f8944e
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x017c
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x017c
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 >= 0) goto L_0x016a
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r17 = r14 % r6
            r19 = 1
            long r17 = r17 + r19
            long r10 = r10 & r14
            long r10 = r10 % r6
            long r17 = r17 + r10
            long r17 = r17 % r6
            goto L_0x016e
        L_0x016a:
            long r17 = r10 % r6
        L_0x016e:
            int r6 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r6 < 0) goto L_0x0178
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f6260a
            r1.mo3195a(r0)
            return
        L_0x0178:
            r7 = r16
            goto L_0x00a3
        L_0x017c:
            r7 = r16
            goto L_0x00a3
        L_0x0180:
            bnc r6 = new bnc     // Catch:{ RuntimeException -> 0x01f5 }
            bnl r13 = new bnl     // Catch:{ RuntimeException -> 0x01f5 }
            bmy r0 = r5.f4427a     // Catch:{ RuntimeException -> 0x01f5 }
            java.lang.String r8 = r0.f4441d     // Catch:{ RuntimeException -> 0x01f5 }
            android.content.Context r0 = r0.f4440c     // Catch:{ RuntimeException -> 0x01f5 }
            int r7 = p000.bmy.f4436b     // Catch:{ RuntimeException -> 0x01f5 }
            r9 = -1
            if (r7 != r9) goto L_0x01b5
            java.lang.Class<bmy> r7 = p000.bmy.class
            monitor-enter(r7)     // Catch:{ RuntimeException -> 0x01f5 }
            int r10 = p000.bmy.f4436b     // Catch:{ all -> 0x01b2 }
            if (r10 != r9) goto L_0x01b0
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01a8 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x01a8 }
            r4 = 0
            android.content.pm.PackageInfo r0 = r9.getPackageInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x01a8 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x01a8 }
            p000.bmy.f4436b = r0     // Catch:{ NameNotFoundException -> 0x01a8 }
            goto L_0x01b0
        L_0x01a8:
            r0 = move-exception
            java.lang.String r4 = "ClearcutLogger"
            java.lang.String r9 = "This can't happen."
            android.util.Log.wtf(r4, r9, r0)     // Catch:{ all -> 0x01b2 }
        L_0x01b0:
            monitor-exit(r7)     // Catch:{ all -> 0x01b2 }
            goto L_0x01b5
        L_0x01b2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01b2 }
            throw r0     // Catch:{ RuntimeException -> 0x01f5 }
        L_0x01b5:
            int r9 = p000.bmy.f4436b     // Catch:{ RuntimeException -> 0x01f5 }
            int r10 = r5.f4431e     // Catch:{ RuntimeException -> 0x01f5 }
            java.lang.String r11 = r5.f4430d     // Catch:{ RuntimeException -> 0x01f5 }
            int r12 = r5.f4432f     // Catch:{ RuntimeException -> 0x01f5 }
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ RuntimeException -> 0x01f5 }
            djb r0 = r5.f4433g     // Catch:{ RuntimeException -> 0x01f5 }
            dje r0 = r0.mo4509g()     // Catch:{ RuntimeException -> 0x01f5 }
            dng r0 = (p000.dng) r0     // Catch:{ RuntimeException -> 0x01f5 }
            r6.<init>(r13, r0)     // Catch:{ RuntimeException -> 0x01f5 }
            dng r0 = r6.f4452b     // Catch:{ RuntimeException -> 0x01f5 }
            r4 = 5
            java.lang.Object r4 = r0.mo4513b(r4)     // Catch:{ RuntimeException -> 0x01f5 }
            dja r4 = (p000.dja) r4     // Catch:{ RuntimeException -> 0x01f5 }
            r4.mo4366a(r0)     // Catch:{ RuntimeException -> 0x01f5 }
            djb r4 = (p000.djb) r4     // Catch:{ RuntimeException -> 0x01f5 }
            dje r0 = r4.mo4509g()     // Catch:{ RuntimeException -> 0x01f5 }
            dng r0 = (p000.dng) r0     // Catch:{ RuntimeException -> 0x01f5 }
            r6.f4452b = r0     // Catch:{ RuntimeException -> 0x01f5 }
            dng r0 = r6.f4452b     // Catch:{ RuntimeException -> 0x01f5 }
            byte[] r0 = r0.mo4371j()     // Catch:{ RuntimeException -> 0x01f5 }
            r6.f4451a = r0     // Catch:{ RuntimeException -> 0x01f5 }
            android.os.IInterface r0 = r2.mo2400p()
            bnj r0 = (p000.bnj) r0
            r0.mo2185a(r3, r6)
            return
        L_0x01f5:
            r0 = move-exception
            java.lang.String r2 = "ClearcutLoggerApiImpl"
            java.lang.String r3 = "derived ClearcutLogger.MessageProducer "
            android.util.Log.e(r2, r3, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "MessageProducer"
            r3 = 10
            r0.<init>(r3, r2)
            r1.mo2282b(r0)
            return
        L_0x020a:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.f6260a
            r3.mo2184a(r0)
            return
        L_0x0210:
            r0 = move-exception
            java.lang.String r2 = "ClearcutLoggerApiImpl"
            java.lang.String r3 = "derived ClearcutLogger.EventModifier "
            android.util.Log.e(r2, r3, r0)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r2 = "EventModifier"
            r3 = 10
            r0.<init>(r3, r2)
            r1.mo2282b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bne.mo2179a(boi):void");
    }
}
