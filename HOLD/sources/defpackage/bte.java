package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: bte  reason: default package */
/* compiled from: PG */
public abstract class bte extends bst implements boj, btf {
    public final Set q;

    public final bnr[] s() {
        return new bnr[0];
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected bte(android.content.Context r14, android.os.Looper r15, int r16, defpackage.bsv r17, defpackage.boq r18, defpackage.bor r19) {
        /*
            r13 = this;
            r0 = r17
            java.lang.Object r1 = defpackage.bti.a
            monitor-enter(r1)
            bti r2 = defpackage.bti.b     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0014
            btk r2 = new btk     // Catch:{ all -> 0x006b }
            android.content.Context r3 = r14.getApplicationContext()     // Catch:{ all -> 0x006b }
            r2.<init>(r3)     // Catch:{ all -> 0x006b }
            defpackage.bti.b = r2     // Catch:{ all -> 0x006b }
        L_0x0014:
            monitor-exit(r1)     // Catch:{ all -> 0x006b }
            bti r7 = defpackage.bti.b
            bnu r8 = defpackage.bnu.a
            java.lang.Object r1 = defpackage.buh.a(r18)
            bpy r1 = (defpackage.bpy) r1
            java.lang.Object r2 = defpackage.buh.a(r19)
            brs r2 = (defpackage.brs) r2
            r3 = 0
            if (r1 == 0) goto L_0x002f
            btc r4 = new btc
            r4.<init>(r1)
            r10 = r4
            goto L_0x0031
        L_0x002f:
            r10 = r3
        L_0x0031:
            if (r2 == 0) goto L_0x003a
            btd r1 = new btd
            r1.<init>(r2)
            r11 = r1
            goto L_0x003c
        L_0x003a:
            r11 = r3
        L_0x003c:
            java.lang.String r12 = r0.e
            r4 = r13
            r5 = r14
            r6 = r15
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            java.util.Set r0 = r0.b
            java.util.Iterator r1 = r0.iterator()
        L_0x004c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r1.next()
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x005f
            goto L_0x004c
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expanding scopes is not permitted, use implied scopes instead"
            r0.<init>(r1)
            throw r0
        L_0x0067:
            r2 = r13
            r2.q = r0
            return
        L_0x006b:
            r0 = move-exception
            r2 = r13
        L_0x006d:
            monitor-exit(r1)     // Catch:{ all -> 0x006f }
            throw r0
        L_0x006f:
            r0 = move-exception
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.<init>(android.content.Context, android.os.Looper, int, bsv, boq, bor):void");
    }

    public final Set i() {
        return g() ? this.q : Collections.emptySet();
    }
}
