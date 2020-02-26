package defpackage;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: cs  reason: default package */
/* compiled from: PG */
public final class cs {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public cs(int i) {
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.a.get(obj);
                if (obj2 == null) {
                    this.g++;
                    return null;
                }
                this.f++;
                return obj2;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            monitor-enter(r2)
            int r0 = r2.d     // Catch:{ all -> 0x008d }
            int r0 = r0 + 1
            r2.d = r0     // Catch:{ all -> 0x008d }
            int r0 = r2.b     // Catch:{ all -> 0x008d }
            int r0 = r0 + 1
            r2.b = r0     // Catch:{ all -> 0x008d }
            java.util.LinkedHashMap r0 = r2.a     // Catch:{ all -> 0x008d }
            java.lang.Object r3 = r0.put(r3, r4)     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x001f
            int r4 = r2.b     // Catch:{ all -> 0x008d }
            int r4 = r4 + -1
            r2.b = r4     // Catch:{ all -> 0x008d }
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            int r4 = r2.c
        L_0x0022:
            monitor-enter(r2)
            int r0 = r2.b     // Catch:{ all -> 0x008a }
            if (r0 < 0) goto L_0x006b
            java.util.LinkedHashMap r0 = r2.a     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0033
            int r0 = r2.b     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x006b
        L_0x0033:
            int r0 = r2.b     // Catch:{ all -> 0x008a }
            if (r0 <= r4) goto L_0x0069
            java.util.LinkedHashMap r0 = r2.a     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0069
            java.util.LinkedHashMap r0 = r2.a     // Catch:{ all -> 0x008a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x008a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x008a }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x008a }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x008a }
            r0.getValue()     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap r0 = r2.a     // Catch:{ all -> 0x008a }
            r0.remove(r1)     // Catch:{ all -> 0x008a }
            int r0 = r2.b     // Catch:{ all -> 0x008a }
            int r0 = r0 + -1
            r2.b = r0     // Catch:{ all -> 0x008a }
            int r0 = r2.e     // Catch:{ all -> 0x008a }
            int r0 = r0 + 1
            r2.e = r0     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            goto L_0x0022
        L_0x0069:
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            return r3
        L_0x006b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r4.<init>()     // Catch:{ all -> 0x008a }
            java.lang.Class r0 = r2.getClass()     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x008a }
            r4.append(r0)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008a }
            r3.<init>(r4)     // Catch:{ all -> 0x008a }
            throw r3     // Catch:{ all -> 0x008a }
        L_0x008a:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            throw r3
        L_0x008d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            throw r3
        L_0x0090:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            goto L_0x0099
        L_0x0098:
            throw r3
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f;
        int i3 = this.g + i2;
        if (i3 == 0) {
            i = 0;
        } else {
            i = (i2 * 100) / i3;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i));
    }

    public cs() {
        this(6);
    }

    public static int a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
