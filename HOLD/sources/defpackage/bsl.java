package defpackage;

import android.os.Looper;
import android.os.Message;

/* renamed from: bsl  reason: default package */
/* compiled from: PG */
final class bsl extends bvm {
    private final /* synthetic */ bst a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsl(bst bst, Looper looper) {
        super(looper);
        this.a = bst;
    }

    private static final void a(Message message) {
        bsm bsm = (bsm) message.obj;
        bsm.b();
        bsm.d();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            bst r0 = r7.a
            java.util.concurrent.atomic.AtomicInteger r0 = r0.p
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
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
            bst r0 = r7.a
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0178
        L_0x0033:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x0087
            bst r0 = r7.a
            bno r1 = new bno
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.m = r1
            bst r8 = r7.a
            boolean r0 = r8.n
            if (r0 == 0) goto L_0x004d
        L_0x004c:
            goto L_0x006f
        L_0x004d:
            java.lang.String r0 = r8.b()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006f
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x006f
            java.lang.String r8 = r8.b()     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x006e }
            bst r8 = r7.a
            boolean r0 = r8.n
            if (r0 != 0) goto L_0x004c
            r8.a(r5, (android.os.IInterface) null)
            return
        L_0x006e:
            r8 = move-exception
        L_0x006f:
            bst r8 = r7.a
            bno r8 = r8.m
            if (r8 != 0) goto L_0x007a
            bno r8 = new bno
            r8.<init>(r4)
        L_0x007a:
            bst r0 = r7.a
            bsn r0 = r0.h
            r0.a(r8)
            bst r0 = r7.a
            r0.a(r8)
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
            bst r8 = r7.a
            bsn r8 = r8.h
            r8.a(r0)
            bst r8 = r7.a
            r8.a(r0)
            return
        L_0x00b1:
            int r0 = r8.what
            r1 = 6
            if (r0 != r1) goto L_0x00dc
            bst r0 = r7.a
            r0.a(r3, (android.os.IInterface) null)
            bst r0 = r7.a
            bsj r0 = r0.k
            if (r0 == 0) goto L_0x00ca
            int r1 = r8.arg2
            btc r0 = (defpackage.btc) r0
            bpy r0 = r0.a
            r0.a(r1)
        L_0x00ca:
            bst r0 = r7.a
            int r8 = r8.arg2
            r0.a = r8
            long r4 = java.lang.System.currentTimeMillis()
            r0.b = r4
            bst r8 = r7.a
            r8.a(r3, r2, r6)
            return
        L_0x00dc:
            int r0 = r8.what
            r1 = 2
            if (r0 != r1) goto L_0x00ee
            bst r0 = r7.a
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            a(r8)
            return
        L_0x00ee:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0140
            java.lang.Object r8 = r8.obj
            r0 = r8
            bsm r0 = (defpackage.bsm) r0
            monitor-enter(r0)
            java.lang.Object r8 = r0.a     // Catch:{ all -> 0x013d }
            boolean r1 = r0.b     // Catch:{ all -> 0x013d }
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
            r0.c()     // Catch:{ RuntimeException -> 0x0130 }
            goto L_0x0132
        L_0x0130:
            r8 = move-exception
            throw r8
        L_0x0132:
            monitor-enter(r0)
            r0.b = r2     // Catch:{ all -> 0x013a }
            monitor-exit(r0)     // Catch:{ all -> 0x013a }
            r0.d()
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
            bst r8 = r7.a
            bno r8 = r8.m
            if (r8 != 0) goto L_0x016b
            bno r8 = new bno
            r8.<init>(r4)
        L_0x016b:
            bst r0 = r7.a
            bsn r0 = r0.h
            r0.a(r8)
            bst r0 = r7.a
            r0.a(r8)
            return
        L_0x0178:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsl.handleMessage(android.os.Message):void");
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }
}
