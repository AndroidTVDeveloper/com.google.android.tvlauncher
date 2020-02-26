package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: byi */
/* compiled from: PG */
public final class byi {

    /* renamed from: a */
    public static final Uri f5004a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f5005b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f5006c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    public static final AtomicBoolean f5007d = new AtomicBoolean();

    /* renamed from: e */
    public static final HashMap f5008e = new HashMap();

    /* renamed from: f */
    private static final Uri f5009f = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: g */
    private static HashMap f5010g;

    /* renamed from: h */
    private static final HashMap f5011h = new HashMap();

    /* renamed from: i */
    private static final HashMap f5012i = new HashMap();

    /* renamed from: j */
    private static final HashMap f5013j = new HashMap();

    /* renamed from: k */
    private static Object f5014k;

    /* renamed from: l */
    private static boolean f5015l;

    /* renamed from: m */
    private static final String[] f5016m = new String[0];

    /* renamed from: b */
    private static void m4373b(ContentResolver contentResolver) {
        if (f5010g == null) {
            f5007d.set(false);
            f5010g = new HashMap();
            f5014k = new Object();
            f5015l = false;
            contentResolver.registerContentObserver(f5004a, true, new byh());
        } else if (f5007d.getAndSet(false)) {
            f5010g.clear();
            f5011h.clear();
            f5008e.clear();
            f5012i.clear();
            f5013j.clear();
            f5014k = new Object();
            f5015l = false;
        }
    }

    /* renamed from: a */
    public static boolean m4371a(ContentResolver contentResolver, String str, boolean z) {
        Object a = m4365a(contentResolver);
        Boolean bool = (Boolean) m4366a(f5011h, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String a2 = m4367a(contentResolver, str);
        if (a2 != null && !a2.equals("")) {
            if (f5005b.matcher(a2).matches()) {
                bool = true;
                z = true;
            } else if (!f5006c.matcher(a2).matches()) {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + a2 + "\") as boolean");
            } else {
                bool = false;
                z = false;
            }
        }
        m4370a(a, f5011h, str, bool);
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: byi.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object
     arg types: [java.util.HashMap, java.lang.String, long]
     candidates:
      byi.a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String
      byi.a(java.lang.Object, java.lang.String, java.lang.String):void
      byi.a(android.content.ContentResolver, java.lang.String, boolean):boolean
      byi.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object */
    /* renamed from: b */
    public static long m4372b(ContentResolver contentResolver, String str) {
        Object a = m4365a(contentResolver);
        long j = 0;
        Long l = (Long) m4366a(f5012i, str, (Object) 0L);
        if (l != null) {
            return l.longValue();
        }
        String a2 = m4367a(contentResolver, str);
        if (a2 != null) {
            try {
                long parseLong = Long.parseLong(a2);
                l = Long.valueOf(parseLong);
                j = parseLong;
            } catch (NumberFormatException e) {
            }
        }
        m4370a(a, f5012i, str, l);
        return j;
    }

    @Deprecated
    /* renamed from: a */
    public static String m4367a(ContentResolver contentResolver, String str) {
        return m4368a(contentResolver, str, (String) null);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        r13 = r13.query(p000.byi.f5004a, null, null, new java.lang.String[]{r14}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        if (r13 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        if (r13.moveToFirst() == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        r0 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        if (r0 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r0.equals(r15) != false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a0, code lost:
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a1, code lost:
        m4369a(r1, r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        if (r0 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        r15 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        m4369a(r1, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b1, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b2, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b6, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c4, code lost:
        return r13;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m4368a(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<byi> r0 = p000.byi.class
            monitor-enter(r0)
            m4373b(r13)     // Catch:{ all -> 0x00c5 }
            java.lang.Object r1 = p000.byi.f5014k     // Catch:{ all -> 0x00c5 }
            java.util.HashMap r2 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            boolean r2 = r2.containsKey(r14)     // Catch:{ all -> 0x00c5 }
            if (r2 != 0) goto L_0x00b7
            java.lang.String[] r2 = p000.byi.f5016m     // Catch:{ all -> 0x00c5 }
            int r3 = r2.length     // Catch:{ all -> 0x00c5 }
            r4 = 0
            r5 = 0
        L_0x0015:
            r6 = 1
            if (r5 >= r3) goto L_0x007c
            r7 = r2[r5]     // Catch:{ all -> 0x00c5 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00c5 }
            if (r7 != 0) goto L_0x0023
            int r5 = r5 + 1
            goto L_0x0015
        L_0x0023:
            boolean r1 = p000.byi.f5015l     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x002f
            java.util.HashMap r1 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x007a
        L_0x002f:
            java.lang.String[] r11 = p000.byi.f5016m     // Catch:{ all -> 0x00c5 }
            java.util.HashMap r1 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            android.net.Uri r8 = p000.byi.f5009f     // Catch:{ all -> 0x00c5 }
            r9 = 0
            r10 = 0
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c5 }
            java.util.TreeMap r2 = new java.util.TreeMap     // Catch:{ all -> 0x00c5 }
            r2.<init>()     // Catch:{ all -> 0x00c5 }
            if (r13 == 0) goto L_0x005f
        L_0x0044:
            boolean r3 = r13.moveToNext()     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = r13.getString(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r5 = r13.getString(r6)     // Catch:{ all -> 0x005a }
            r2.put(r3, r5)     // Catch:{ all -> 0x005a }
            goto L_0x0044
        L_0x0056:
            r13.close()     // Catch:{ all -> 0x00c5 }
            goto L_0x005f
        L_0x005a:
            r14 = move-exception
            r13.close()     // Catch:{ all -> 0x00c5 }
            throw r14     // Catch:{ all -> 0x00c5 }
        L_0x005f:
            r1.putAll(r2)     // Catch:{ all -> 0x00c5 }
            p000.byi.f5015l = r6     // Catch:{ all -> 0x00c5 }
            java.util.HashMap r13 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00c5 }
            if (r13 == 0) goto L_0x007a
            java.util.HashMap r13 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00c5 }
            if (r13 == 0) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r13 = r15
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            return r13
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            return r15
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            android.net.Uri r8 = p000.byi.f5004a
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r9 = 0
            r10 = 0
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x00b6
            boolean r0 = r13.moveToFirst()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r13.getString(r6)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x00a1
            boolean r2 = r0.equals(r15)     // Catch:{ all -> 0x00b1 }
            if (r2 != 0) goto L_0x00a0
            goto L_0x00a1
        L_0x00a0:
            r0 = r15
        L_0x00a1:
            m4369a(r1, r14, r0)     // Catch:{ all -> 0x00b1 }
            if (r0 != 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r15 = r0
        L_0x00a8:
            r13.close()
            return r15
        L_0x00ac:
            r0 = 0
            m4369a(r1, r14, r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a8
        L_0x00b1:
            r14 = move-exception
            r13.close()
            throw r14
        L_0x00b6:
            return r15
        L_0x00b7:
            java.util.HashMap r13 = p000.byi.f5010g     // Catch:{ all -> 0x00c5 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00c5 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00c5 }
            if (r13 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r13 = r15
        L_0x00c3:
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            return r13
        L_0x00c5:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c5 }
            goto L_0x00c9
        L_0x00c8:
            throw r13
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.byi.m4368a(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m4366a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
            java.lang.Class<byi> r0 = p000.byi.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0013
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r2 = r4
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r2
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r2 = 0
            return r2
        L_0x0016:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.byi.m4366a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public static Object m4365a(ContentResolver contentResolver) {
        Object obj;
        synchronized (byi.class) {
            m4373b(contentResolver);
            obj = f5014k;
        }
        return obj;
    }

    /* renamed from: a */
    private static void m4369a(Object obj, String str, String str2) {
        synchronized (byi.class) {
            if (obj == f5014k) {
                f5010g.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    public static void m4370a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (byi.class) {
            if (obj == f5014k) {
                hashMap.put(str, obj2);
                f5010g.remove(str);
            }
        }
    }
}
