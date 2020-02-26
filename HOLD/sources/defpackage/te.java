package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: te  reason: default package */
/* compiled from: PG */
public final class te implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final int d;
    public long e = 0;
    public Writer f;
    public final LinkedHashMap g = new LinkedHashMap(0, 0.75f, true);
    public int h;
    private final File i;
    private final int j;
    private final long k;
    private long l = 0;
    private final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ta((byte) 0));
    private final Callable n = new sz(this);

    public te(File file) {
        this.a = file;
        this.j = 1;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.i = new File(file, "journal.bkp");
        this.d = 1;
        this.k = 262144000;
    }

    private final void e() {
        if (this.f == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void close() {
        if (this.f != null) {
            ArrayList arrayList = new ArrayList(this.g.values());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                tb tbVar = ((tc) arrayList.get(i2)).e;
                if (tbVar != null) {
                    tbVar.a();
                }
            }
            d();
            a(this.f);
            this.f = null;
        }
    }

    private static void a(Writer writer) {
        int i2 = Build.VERSION.SDK_INT;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bb, code lost:
        if (c() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00be, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(defpackage.tb r11, boolean r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            tc r0 = r11.a     // Catch:{ all -> 0x0101 }
            tb r1 = r0.e     // Catch:{ all -> 0x0101 }
            if (r1 != r11) goto L_0x00fb
            r1 = 1
            r2 = 0
            if (r12 == 0) goto L_0x0045
            boolean r3 = r0.d     // Catch:{ all -> 0x0101 }
            if (r3 != 0) goto L_0x0044
            r3 = 0
        L_0x0010:
            int r4 = r10.d     // Catch:{ all -> 0x0101 }
            if (r3 >= r4) goto L_0x0046
            boolean[] r3 = r11.b     // Catch:{ all -> 0x0101 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0101 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.c()     // Catch:{ all -> 0x0101 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0101 }
            if (r3 == 0) goto L_0x0026
            r3 = 1
            goto L_0x0010
        L_0x0026:
            r11.a()     // Catch:{ all -> 0x0101 }
            monitor-exit(r10)
            return
        L_0x002b:
            r11.a()     // Catch:{ all -> 0x0101 }
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0101 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
            r0 = 61
            r12.<init>(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "Newly created entry didn't create value for index 0"
            r12.append(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0101 }
            r11.<init>(r12)     // Catch:{ all -> 0x0101 }
            throw r11     // Catch:{ all -> 0x0101 }
        L_0x0044:
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            r11 = 0
        L_0x0047:
            int r3 = r10.d     // Catch:{ all -> 0x0101 }
            if (r11 < r3) goto L_0x00c7
            int r11 = r10.h     // Catch:{ all -> 0x0101 }
            int r11 = r11 + r1
            r10.h = r11     // Catch:{ all -> 0x0101 }
            r11 = 0
            r0.e = r11     // Catch:{ all -> 0x0101 }
            boolean r11 = r0.d     // Catch:{ all -> 0x0101 }
            r11 = r11 | r12
            r1 = 10
            r2 = 32
            if (r11 != 0) goto L_0x007c
            java.util.LinkedHashMap r11 = r10.g     // Catch:{ all -> 0x0101 }
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x0101 }
            r11.remove(r12)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            java.lang.String r12 = "REMOVE"
            r11.append(r12)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            r11.append(r2)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            java.lang.String r12 = r0.a     // Catch:{ all -> 0x0101 }
            r11.append(r12)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            r11.append(r1)     // Catch:{ all -> 0x0101 }
            goto L_0x00a9
        L_0x007c:
            r0.d = true     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            java.lang.String r3 = "CLEAN"
            r11.append(r3)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            r11.append(r2)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            java.lang.String r2 = r0.a     // Catch:{ all -> 0x0101 }
            r11.append(r2)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0101 }
            r11.append(r0)     // Catch:{ all -> 0x0101 }
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            r11.append(r1)     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x00a9
            long r11 = r10.l     // Catch:{ all -> 0x0101 }
            r0 = 1
            long r11 = r11 + r0
            r10.l = r11     // Catch:{ all -> 0x0101 }
        L_0x00a9:
            java.io.Writer r11 = r10.f     // Catch:{ all -> 0x0101 }
            b(r11)     // Catch:{ all -> 0x0101 }
            long r11 = r10.e     // Catch:{ all -> 0x0101 }
            long r0 = r10.k     // Catch:{ all -> 0x0101 }
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b7
            goto L_0x00bf
        L_0x00b7:
            boolean r11 = r10.c()     // Catch:{ all -> 0x0101 }
            if (r11 != 0) goto L_0x00bf
        L_0x00bd:
            monitor-exit(r10)
            return
        L_0x00bf:
            java.util.concurrent.ThreadPoolExecutor r11 = r10.m     // Catch:{ all -> 0x0101 }
            java.util.concurrent.Callable r12 = r10.n     // Catch:{ all -> 0x0101 }
            r11.submit(r12)     // Catch:{ all -> 0x0101 }
            goto L_0x00bd
        L_0x00c7:
            java.io.File r11 = r0.c()     // Catch:{ all -> 0x0101 }
            if (r12 == 0) goto L_0x00f4
            boolean r3 = r11.exists()     // Catch:{ all -> 0x0101 }
            if (r3 == 0) goto L_0x00f0
            java.io.File r3 = r0.b()     // Catch:{ all -> 0x0101 }
            r11.renameTo(r3)     // Catch:{ all -> 0x0101 }
            long[] r11 = r0.b     // Catch:{ all -> 0x0101 }
            r4 = r11[r2]     // Catch:{ all -> 0x0101 }
            long r6 = r3.length()     // Catch:{ all -> 0x0101 }
            long[] r11 = r0.b     // Catch:{ all -> 0x0101 }
            r11[r2] = r6     // Catch:{ all -> 0x0101 }
            long r8 = r10.e     // Catch:{ all -> 0x0101 }
            long r8 = r8 - r4
            long r8 = r8 + r6
            r10.e = r8     // Catch:{ all -> 0x0101 }
            r11 = 1
            goto L_0x0047
        L_0x00f0:
            r11 = 1
            goto L_0x0047
        L_0x00f4:
            a(r11)     // Catch:{ all -> 0x0101 }
            r11 = 1
            goto L_0x0047
        L_0x00fb:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0101 }
            r11.<init>()     // Catch:{ all -> 0x0101 }
            throw r11     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x0105
        L_0x0104:
            throw r11
        L_0x0105:
            goto L_0x0104
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.a(tb, boolean):void");
    }

    public static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized tb b(String str) {
        e();
        tc tcVar = (tc) this.g.get(str);
        if (tcVar == null) {
            tcVar = new tc(this, str);
            this.g.put(str, tcVar);
        } else if (tcVar.e != null) {
            return null;
        }
        tb tbVar = new tb(this, tcVar);
        tcVar.e = tbVar;
        this.f.append((CharSequence) "DIRTY");
        this.f.append(' ');
        this.f.append((CharSequence) str);
        this.f.append(10);
        b(this.f);
        return tbVar;
    }

    private static void b(Writer writer) {
        int i2 = Build.VERSION.SDK_INT;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.td a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.e()     // Catch:{ all -> 0x005e }
            java.util.LinkedHashMap r0 = r6.g     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x005e }
            tc r0 = (defpackage.tc) r0     // Catch:{ all -> 0x005e }
            r1 = 0
            if (r0 == 0) goto L_0x005c
            boolean r2 = r0.d     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x005c
            java.io.File[] r2 = r0.c     // Catch:{ all -> 0x005e }
            int r3 = r2.length     // Catch:{ all -> 0x005e }
            r4 = 0
        L_0x0017:
            if (r4 < r3) goto L_0x004f
            int r1 = r6.h     // Catch:{ all -> 0x005e }
            int r1 = r1 + 1
            r6.h = r1     // Catch:{ all -> 0x005e }
            java.io.Writer r1 = r6.f     // Catch:{ all -> 0x005e }
            java.lang.String r2 = "READ"
            r1.append(r2)     // Catch:{ all -> 0x005e }
            java.io.Writer r1 = r6.f     // Catch:{ all -> 0x005e }
            r2 = 32
            r1.append(r2)     // Catch:{ all -> 0x005e }
            java.io.Writer r1 = r6.f     // Catch:{ all -> 0x005e }
            r1.append(r7)     // Catch:{ all -> 0x005e }
            java.io.Writer r7 = r6.f     // Catch:{ all -> 0x005e }
            r1 = 10
            r7.append(r1)     // Catch:{ all -> 0x005e }
            boolean r7 = r6.c()     // Catch:{ all -> 0x005e }
            if (r7 == 0) goto L_0x0046
            java.util.concurrent.ThreadPoolExecutor r7 = r6.m     // Catch:{ all -> 0x005e }
            java.util.concurrent.Callable r1 = r6.n     // Catch:{ all -> 0x005e }
            r7.submit(r1)     // Catch:{ all -> 0x005e }
        L_0x0046:
            td r7 = new td     // Catch:{ all -> 0x005e }
            java.io.File[] r0 = r0.c     // Catch:{ all -> 0x005e }
            r7.<init>(r0)     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r7
        L_0x004f:
            r5 = r2[r4]     // Catch:{ all -> 0x005e }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x005e }
            if (r5 == 0) goto L_0x005a
            int r4 = r4 + 1
            goto L_0x0017
        L_0x005a:
            monitor-exit(r6)
            return r1
        L_0x005c:
            monitor-exit(r6)
            return r1
        L_0x005e:
            r7 = move-exception
            monitor-exit(r6)
            goto L_0x0062
        L_0x0061:
            throw r7
        L_0x0062:
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.a(java.lang.String):td");
    }

    public final boolean c() {
        int i2 = this.h;
        return i2 >= 2000 && i2 >= this.g.size();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (r4.length() != 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        r4 = new java.lang.String("unexpected journal line: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r4 = "unexpected journal line: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        throw new java.io.IOException(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            tg r1 = new tg
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r11.b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = defpackage.th.a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.a()     // Catch:{ all -> 0x01b7 }
            java.lang.String r3 = r1.a()     // Catch:{ all -> 0x01b7 }
            java.lang.String r4 = r1.a()     // Catch:{ all -> 0x01b7 }
            java.lang.String r5 = r1.a()     // Catch:{ all -> 0x01b7 }
            java.lang.String r6 = r1.a()     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x01b7 }
            if (r7 == 0) goto L_0x0164
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x01b7 }
            if (r7 == 0) goto L_0x0164
            int r7 = r11.j     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x01b7 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x01b7 }
            if (r4 == 0) goto L_0x0164
            int r4 = r11.d     // Catch:{ all -> 0x01b7 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x01b7 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x01b7 }
            if (r4 == 0) goto L_0x0164
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x01b7 }
            if (r4 == 0) goto L_0x0164
            r0 = 0
            r2 = 0
        L_0x0056:
            r3 = -1
            java.lang.String r4 = r1.a()     // Catch:{ EOFException -> 0x0138 }
            r5 = 32
            int r6 = r4.indexOf(r5)     // Catch:{ EOFException -> 0x0138 }
            java.lang.String r7 = "unexpected journal line: "
            if (r6 != r3) goto L_0x007f
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0138 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ EOFException -> 0x0138 }
            int r5 = r4.length()     // Catch:{ EOFException -> 0x0138 }
            if (r5 != 0) goto L_0x0077
            java.lang.String r4 = new java.lang.String     // Catch:{ EOFException -> 0x0138 }
            r4.<init>(r7)     // Catch:{ EOFException -> 0x0138 }
            goto L_0x007b
        L_0x0077:
            java.lang.String r4 = r7.concat(r4)     // Catch:{ EOFException -> 0x0138 }
        L_0x007b:
            r0.<init>(r4)     // Catch:{ EOFException -> 0x0138 }
            throw r0     // Catch:{ EOFException -> 0x0138 }
        L_0x007f:
            int r8 = r6 + 1
            int r5 = r4.indexOf(r5, r8)     // Catch:{ EOFException -> 0x0138 }
            if (r5 == r3) goto L_0x008c
            java.lang.String r8 = r4.substring(r8, r5)     // Catch:{ EOFException -> 0x0138 }
            goto L_0x00a2
        L_0x008c:
            java.lang.String r8 = r4.substring(r8)     // Catch:{ EOFException -> 0x0138 }
            r9 = 6
            if (r6 != r9) goto L_0x00a2
            java.lang.String r9 = "REMOVE"
            boolean r9 = r4.startsWith(r9)     // Catch:{ EOFException -> 0x0138 }
            if (r9 == 0) goto L_0x00a2
            java.util.LinkedHashMap r4 = r11.g     // Catch:{ EOFException -> 0x0138 }
            r4.remove(r8)     // Catch:{ EOFException -> 0x0138 }
            goto L_0x011a
        L_0x00a2:
            java.util.LinkedHashMap r9 = r11.g     // Catch:{ EOFException -> 0x0138 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ EOFException -> 0x0138 }
            tc r9 = (defpackage.tc) r9     // Catch:{ EOFException -> 0x0138 }
            if (r9 != 0) goto L_0x00b6
            tc r9 = new tc     // Catch:{ EOFException -> 0x0138 }
            r9.<init>(r11, r8)     // Catch:{ EOFException -> 0x0138 }
            java.util.LinkedHashMap r10 = r11.g     // Catch:{ EOFException -> 0x0138 }
            r10.put(r8, r9)     // Catch:{ EOFException -> 0x0138 }
        L_0x00b6:
            r8 = 5
            if (r5 == r3) goto L_0x00f8
            if (r6 != r8) goto L_0x00f8
            java.lang.String r10 = "CLEAN"
            boolean r10 = r4.startsWith(r10)     // Catch:{ EOFException -> 0x0138 }
            if (r10 == 0) goto L_0x00f8
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ EOFException -> 0x0138 }
            java.lang.String r5 = " "
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ EOFException -> 0x0138 }
            r9.d = true     // Catch:{ EOFException -> 0x0138 }
            r5 = 0
            r9.e = r5     // Catch:{ EOFException -> 0x0138 }
            int r5 = r4.length     // Catch:{ EOFException -> 0x0138 }
            te r6 = r9.f     // Catch:{ EOFException -> 0x0138 }
            int r6 = r6.d     // Catch:{ EOFException -> 0x0138 }
            if (r5 != r6) goto L_0x00f3
            r5 = 0
        L_0x00dd:
            int r6 = r4.length     // Catch:{ NumberFormatException -> 0x00ed }
            if (r5 >= r6) goto L_0x011a
            long[] r6 = r9.b     // Catch:{ NumberFormatException -> 0x00ed }
            r7 = r4[r5]     // Catch:{ NumberFormatException -> 0x00ed }
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x00ed }
            r6[r5] = r7     // Catch:{ NumberFormatException -> 0x00ed }
            int r5 = r5 + 1
            goto L_0x00dd
        L_0x00ed:
            r0 = move-exception
            java.io.IOException r0 = defpackage.tc.a(r4)     // Catch:{ EOFException -> 0x0138 }
            throw r0     // Catch:{ EOFException -> 0x0138 }
        L_0x00f3:
            java.io.IOException r0 = defpackage.tc.a(r4)     // Catch:{ EOFException -> 0x0138 }
            throw r0     // Catch:{ EOFException -> 0x0138 }
        L_0x00f8:
            if (r5 != r3) goto L_0x010c
            if (r6 != r8) goto L_0x010c
            java.lang.String r8 = "DIRTY"
            boolean r8 = r4.startsWith(r8)     // Catch:{ EOFException -> 0x0138 }
            if (r8 == 0) goto L_0x010c
            tb r4 = new tb     // Catch:{ EOFException -> 0x0138 }
            r4.<init>(r11, r9)     // Catch:{ EOFException -> 0x0138 }
            r9.e = r4     // Catch:{ EOFException -> 0x0138 }
            goto L_0x011a
        L_0x010c:
            if (r5 == r3) goto L_0x010f
            goto L_0x011e
        L_0x010f:
            r5 = 4
            if (r6 != r5) goto L_0x011e
            java.lang.String r5 = "READ"
            boolean r5 = r4.startsWith(r5)     // Catch:{ EOFException -> 0x0138 }
            if (r5 == 0) goto L_0x011e
        L_0x011a:
            int r2 = r2 + 1
            goto L_0x0056
        L_0x011e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ EOFException -> 0x0138 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ EOFException -> 0x0138 }
            int r5 = r4.length()     // Catch:{ EOFException -> 0x0138 }
            if (r5 != 0) goto L_0x0130
            java.lang.String r4 = new java.lang.String     // Catch:{ EOFException -> 0x0138 }
            r4.<init>(r7)     // Catch:{ EOFException -> 0x0138 }
            goto L_0x0134
        L_0x0130:
            java.lang.String r4 = r7.concat(r4)     // Catch:{ EOFException -> 0x0138 }
        L_0x0134:
            r0.<init>(r4)     // Catch:{ EOFException -> 0x0138 }
            throw r0     // Catch:{ EOFException -> 0x0138 }
        L_0x0138:
            r0 = move-exception
            java.util.LinkedHashMap r0 = r11.g     // Catch:{ all -> 0x01b7 }
            int r0 = r0.size()     // Catch:{ all -> 0x01b7 }
            int r2 = r2 - r0
            r11.h = r2     // Catch:{ all -> 0x01b7 }
            int r0 = r1.b     // Catch:{ all -> 0x01b7 }
            if (r0 == r3) goto L_0x015d
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x01b7 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x01b7 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x01b7 }
            java.io.File r4 = r11.b     // Catch:{ all -> 0x01b7 }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x01b7 }
            java.nio.charset.Charset r4 = defpackage.th.a     // Catch:{ all -> 0x01b7 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x01b7 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b7 }
            r11.f = r0     // Catch:{ all -> 0x01b7 }
            goto L_0x0160
        L_0x015d:
            r11.b()     // Catch:{ all -> 0x01b7 }
        L_0x0160:
            defpackage.th.a(r1)
            return
        L_0x0164:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x01b7 }
            int r7 = r7.length()     // Catch:{ all -> 0x01b7 }
            int r7 = r7 + 35
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b7 }
            int r7 = r7 + r8
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x01b7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b7 }
            int r7 = r7 + r8
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x01b7 }
            int r8 = r8.length()     // Catch:{ all -> 0x01b7 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b7 }
            r8.<init>(r7)     // Catch:{ all -> 0x01b7 }
            java.lang.String r7 = "unexpected journal header: ["
            r8.append(r7)     // Catch:{ all -> 0x01b7 }
            r8.append(r2)     // Catch:{ all -> 0x01b7 }
            r8.append(r0)     // Catch:{ all -> 0x01b7 }
            r8.append(r3)     // Catch:{ all -> 0x01b7 }
            r8.append(r0)     // Catch:{ all -> 0x01b7 }
            r8.append(r5)     // Catch:{ all -> 0x01b7 }
            r8.append(r0)     // Catch:{ all -> 0x01b7 }
            r8.append(r6)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = "]"
            r8.append(r0)     // Catch:{ all -> 0x01b7 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x01b7 }
            r4.<init>(r0)     // Catch:{ all -> 0x01b7 }
            throw r4     // Catch:{ all -> 0x01b7 }
        L_0x01b7:
            r0 = move-exception
            defpackage.th.a(r1)
            goto L_0x01bd
        L_0x01bc:
            throw r0
        L_0x01bd:
            goto L_0x01bc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.a():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    public final synchronized void b() {
        Writer writer = this.f;
        if (writer != null) {
            a(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), th.a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.j));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.d));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (tc tcVar : this.g.values()) {
                if (tcVar.e != null) {
                    String str = tcVar.a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                    sb.append("DIRTY ");
                    sb.append(str);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    String str2 = tcVar.a;
                    String a2 = tcVar.a();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 7 + String.valueOf(a2).length());
                    sb2.append("CLEAN ");
                    sb2.append(str2);
                    sb2.append(a2);
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            a(bufferedWriter);
            if (this.b.exists()) {
                a(this.b, this.i, true);
            }
            a(this.c, this.b, false);
            this.i.delete();
            this.f = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), th.a));
        } catch (Throwable th) {
            a(bufferedWriter);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void c(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.e()     // Catch:{ all -> 0x0095 }
            java.util.LinkedHashMap r0 = r8.g     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0095 }
            tc r0 = (defpackage.tc) r0     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0093
            tb r1 = r0.e     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x0093
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0015:
            int r4 = r8.d     // Catch:{ all -> 0x0095 }
            if (r3 < r4) goto L_0x004c
            int r0 = r8.h     // Catch:{ all -> 0x0095 }
            int r0 = r0 + r1
            r8.h = r0     // Catch:{ all -> 0x0095 }
            java.io.Writer r0 = r8.f     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "REMOVE"
            r0.append(r1)     // Catch:{ all -> 0x0095 }
            java.io.Writer r0 = r8.f     // Catch:{ all -> 0x0095 }
            r1 = 32
            r0.append(r1)     // Catch:{ all -> 0x0095 }
            java.io.Writer r0 = r8.f     // Catch:{ all -> 0x0095 }
            r0.append(r9)     // Catch:{ all -> 0x0095 }
            java.io.Writer r0 = r8.f     // Catch:{ all -> 0x0095 }
            r1 = 10
            r0.append(r1)     // Catch:{ all -> 0x0095 }
            java.util.LinkedHashMap r0 = r8.g     // Catch:{ all -> 0x0095 }
            r0.remove(r9)     // Catch:{ all -> 0x0095 }
            boolean r9 = r8.c()     // Catch:{ all -> 0x0095 }
            if (r9 == 0) goto L_0x004a
            java.util.concurrent.ThreadPoolExecutor r9 = r8.m     // Catch:{ all -> 0x0095 }
            java.util.concurrent.Callable r0 = r8.n     // Catch:{ all -> 0x0095 }
            r9.submit(r0)     // Catch:{ all -> 0x0095 }
        L_0x004a:
            monitor-exit(r8)
            return
        L_0x004c:
            java.io.File r3 = r0.b()     // Catch:{ all -> 0x0095 }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x0095 }
            if (r4 != 0) goto L_0x0057
        L_0x0056:
            goto L_0x005e
        L_0x0057:
            boolean r4 = r3.delete()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x006e
            goto L_0x0056
        L_0x005e:
            long r3 = r8.e     // Catch:{ all -> 0x0095 }
            long[] r5 = r0.b     // Catch:{ all -> 0x0095 }
            r6 = r5[r2]     // Catch:{ all -> 0x0095 }
            long r3 = r3 - r6
            r8.e = r3     // Catch:{ all -> 0x0095 }
            r3 = 0
            r5[r2] = r3     // Catch:{ all -> 0x0095 }
            r3 = 1
            goto L_0x0015
        L_0x006e:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0095 }
            int r1 = r1.length()     // Catch:{ all -> 0x0095 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            int r1 = r1 + 17
            r2.<init>(r1)     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "failed to delete "
            r2.append(r1)     // Catch:{ all -> 0x0095 }
            r2.append(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0095 }
            r9.<init>(r0)     // Catch:{ all -> 0x0095 }
            throw r9     // Catch:{ all -> 0x0095 }
        L_0x0093:
            monitor-exit(r8)
            return
        L_0x0095:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x0099
        L_0x0098:
            throw r9
        L_0x0099:
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te.c(java.lang.String):void");
    }

    public static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void d() {
        while (this.e > this.k) {
            c((String) ((Map.Entry) this.g.entrySet().iterator().next()).getKey());
        }
    }
}
