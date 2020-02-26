package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: bsl */
/* compiled from: PG */
final class bsl extends bvm {

    /* renamed from: a */
    private final /* synthetic */ bst f4729a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsl(bst bst, Looper looper) {
        super(looper);
        this.f4729a = bst;
    }

    /* renamed from: a */
    private static final void m4099a(Message message) {
        bsm bsm = (bsm) message.obj;
        bsm.mo2375b();
        bsm.mo2379d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            bst r0 = r7.f4729a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f4755p
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = m4100b(r8)
            if (r0 == 0) goto L_0x0015
            m4099a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002b
            int r0 = r8.what
            r4 = 7
            if (r0 == r4) goto L_0x002b
            int r0 = r8.what
            if (r0 != r1) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0033
        L_0x002b:
            bst r0 = r7.f4729a
            boolean r0 = r0.mo2393f()
            if (r0 == 0) goto L_0x0178
        L_0x0033:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0087
            bst r0 = r7.f4729a
            bno r1 = new bno
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f4752m = r1
            bst r8 = r7.f4729a
            boolean r0 = r8.f4753n
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            goto L_0x006f
        L_0x004d:
            java.lang.String r0 = r8.mo2182b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006f
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x006f
            java.lang.String r8 = r8.mo2182b()     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x006e }
            bst r8 = r7.f4729a
            boolean r0 = r8.f4753n
            if (r0 != 0) goto L_0x004c
            r8.m4111a(r5, (android.os.IInterface) null)
            return
        L_0x006e:
            r8 = move-exception
        L_0x006f:
            bst r8 = r7.f4729a
            bno r8 = r8.f4752m
            if (r8 != 0) goto L_0x007a
            bno r8 = new bno
            r8.<init>(r4)
        L_0x007a:
            bst r0 = r7.f4729a
            bsn r0 = r0.f4747h
            r0.mo2314a(r8)
            bst r0 = r7.f4729a
            r0.mo2385a(r8)
            return
        L_0x0087:
            int r0 = r8.what
            if (r0 == r3) goto L_0x0160
            int r0 = r8.what
            if (r0 != r5) goto L_0x00b1
            java.lang.Object r0 = r8.obj
            boolean r0 = r0 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r8.obj
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            goto L_0x009d
        L_0x009b:
        L_0x009d:
            bno r0 = new bno
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            bst r8 = r7.f4729a
            bsn r8 = r8.f4747h
            r8.mo2314a(r0)
            bst r8 = r7.f4729a
            r8.mo2385a(r0)
            return
        L_0x00b1:
            int r0 = r8.what
            r1 = 6
            if (r0 != r1) goto L_0x00dc
            bst r0 = r7.f4729a
            r0.m4111a(r3, (android.os.IInterface) null)
            bst r0 = r7.f4729a
            bsj r0 = r0.f4750k
            if (r0 == 0) goto L_0x00ca
            int r1 = r8.arg2
            btc r0 = (p000.btc) r0
            bpy r0 = r0.f4794a
            r0.mo2288a(r1)
        L_0x00ca:
            bst r0 = r7.f4729a
            int r8 = r8.arg2
            r0.f4740a = r8
            long r4 = java.lang.System.currentTimeMillis()
            r0.f4741b = r4
            bst r8 = r7.f4729a
            r8.mo2390a(r3, r2, r6)
            return
        L_0x00dc:
            int r0 = r8.what
            r1 = 2
            if (r0 != r1) goto L_0x00ee
            bst r0 = r7.f4729a
            boolean r0 = r0.mo2392e()
            if (r0 == 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            m4099a(r8)
            return
        L_0x00ee:
            boolean r0 = m4100b(r8)
            if (r0 == 0) goto L_0x0140
            java.lang.Object r8 = r8.obj
            r0 = r8
            bsm r0 = (p000.bsm) r0
            monitor-enter(r0)
            java.lang.Object r8 = r0.f4730a     // Catch:{ all -> 0x013d }
            boolean r1 = r0.f4731b     // Catch:{ all -> 0x013d }
            if (r1 == 0) goto L_0x0129
            java.lang.String r1 = "GmsClient"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x013d }
            int r4 = r4.length()     // Catch:{ all -> 0x013d }
            int r4 = r4 + 47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x013d }
            r5.<init>(r4)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = "Callback proxy "
            r5.append(r4)     // Catch:{ all -> 0x013d }
            r5.append(r3)     // Catch:{ all -> 0x013d }
            java.lang.String r3 = " being reused. This is not safe."
            r5.append(r3)     // Catch:{ all -> 0x013d }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x013d }
            android.util.Log.w(r1, r3)     // Catch:{ all -> 0x013d }
        L_0x0129:
            monitor-exit(r0)     // Catch:{ all -> 0x013d }
            if (r8 == 0) goto L_0x0132
            r0.mo2376c()     // Catch:{ RuntimeException -> 0x0130 }
            goto L_0x0132
        L_0x0130:
            r8 = move-exception
            throw r8
        L_0x0132:
            monitor-enter(r0)
            r0.f4731b = r2     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            r0.mo2379d()
            return
        L_0x013a:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            throw r8
        L_0x013d:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x013d }
            throw r8
        L_0x0140:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 45
            r0.<init>(r1)
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x0160:
            bst r8 = r7.f4729a
            bno r8 = r8.f4752m
            if (r8 != 0) goto L_0x016b
            bno r8 = new bno
            r8.<init>(r4)
        L_0x016b:
            bst r0 = r7.f4729a
            bsn r0 = r0.f4747h
            r0.mo2314a(r8)
            bst r0 = r7.f4729a
            r0.mo2385a(r8)
            return
        L_0x0178:
            m4099a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bsl.handleMessage(android.os.Message):void");
    }

    /* renamed from: b */
    private static final boolean m4100b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
