package p000;

import android.graphics.PorterDuff;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: cs */
/* compiled from: PG */
public final class C0075cs {

    /* renamed from: a */
    private final LinkedHashMap f7158a;

    /* renamed from: b */
    private int f7159b;

    /* renamed from: c */
    private int f7160c;

    /* renamed from: d */
    private int f7161d;

    /* renamed from: e */
    private int f7162e;

    /* renamed from: f */
    private int f7163f;

    /* renamed from: g */
    private int f7164g;

    public C0075cs(int i) {
        this.f7160c = i;
        this.f7158a = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: a */
    public final Object mo3692a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f7158a.get(obj);
                if (obj2 == null) {
                    this.f7164g++;
                    return null;
                }
                this.f7163f++;
                return obj2;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3693a(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0090
            monitor-enter(r2)
            int r0 = r2.f7161d     // Catch:{ all -> 0x008d }
            int r0 = r0 + 1
            r2.f7161d = r0     // Catch:{ all -> 0x008d }
            int r0 = r2.f7159b     // Catch:{ all -> 0x008d }
            int r0 = r0 + 1
            r2.f7159b = r0     // Catch:{ all -> 0x008d }
            java.util.LinkedHashMap r0 = r2.f7158a     // Catch:{ all -> 0x008d }
            java.lang.Object r3 = r0.put(r3, r4)     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x001f
            int r4 = r2.f7159b     // Catch:{ all -> 0x008d }
            int r4 = r4 + -1
            r2.f7159b = r4     // Catch:{ all -> 0x008d }
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x008d }
            int r4 = r2.f7160c
        L_0x0022:
            monitor-enter(r2)
            int r0 = r2.f7159b     // Catch:{ all -> 0x008a }
            if (r0 < 0) goto L_0x006b
            java.util.LinkedHashMap r0 = r2.f7158a     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0033
            int r0 = r2.f7159b     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x006b
        L_0x0033:
            int r0 = r2.f7159b     // Catch:{ all -> 0x008a }
            if (r0 <= r4) goto L_0x0069
            java.util.LinkedHashMap r0 = r2.f7158a     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0069
            java.util.LinkedHashMap r0 = r2.f7158a     // Catch:{ all -> 0x008a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x008a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x008a }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x008a }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x008a }
            r0.getValue()     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap r0 = r2.f7158a     // Catch:{ all -> 0x008a }
            r0.remove(r1)     // Catch:{ all -> 0x008a }
            int r0 = r2.f7159b     // Catch:{ all -> 0x008a }
            int r0 = r0 + -1
            r2.f7159b = r0     // Catch:{ all -> 0x008a }
            int r0 = r2.f7162e     // Catch:{ all -> 0x008a }
            int r0 = r0 + 1
            r2.f7162e = r0     // Catch:{ all -> 0x008a }
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0075cs.mo3693a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f7163f;
        int i3 = this.f7164g + i2;
        if (i3 == 0) {
            i = 0;
        } else {
            i = (i2 * 100) / i3;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f7160c), Integer.valueOf(this.f7163f), Integer.valueOf(this.f7164g), Integer.valueOf(i));
    }

    public C0075cs() {
        this(6);
    }

    /* renamed from: a */
    public static int m5615a(int i, PorterDuff.Mode mode) {
        return ((i + 31) * 31) + mode.hashCode();
    }
}
