package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

/* renamed from: yf  reason: default package */
/* compiled from: PG */
public final class yf implements xy {
    private final yq a;
    private final File b;
    private final yc c = new yc();
    private te d;

    @Deprecated
    public yf(File file) {
        this.b = file;
        this.a = new yq();
    }

    public final File a(ts tsVar) {
        try {
            td a2 = a().a(this.a.a(tsVar));
            if (a2 != null) {
                return a2.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    private final synchronized te a() {
        if (this.d == null) {
            File file = this.b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    te.a(file2, file3, false);
                }
            }
            te teVar = new te(file);
            if (teVar.b.exists()) {
                try {
                    teVar.a();
                    te.a(teVar.c);
                    Iterator it = teVar.g.values().iterator();
                    while (it.hasNext()) {
                        tc tcVar = (tc) it.next();
                        if (tcVar.e != null) {
                            tcVar.e = null;
                            for (int i = 0; i < teVar.d; i = 1) {
                                te.a(tcVar.b());
                                te.a(tcVar.c());
                            }
                            it.remove();
                        } else {
                            for (int i2 = 0; i2 < teVar.d; i2 = 1) {
                                teVar.e += tcVar.b[0];
                            }
                        }
                    }
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    String valueOf = String.valueOf(file);
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(message).length());
                    sb.append("DiskLruCache ");
                    sb.append(valueOf);
                    sb.append(" is corrupt: ");
                    sb.append(message);
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    teVar.close();
                    th.a(teVar.a);
                }
                this.d = teVar;
            }
            file.mkdirs();
            teVar = new te(file);
            teVar.b();
            this.d = teVar;
        }
        return this.d;
    }

    public final void a(ts tsVar, xx xxVar) {
        ya yaVar;
        yc ycVar;
        File c2;
        String a2 = this.a.a(tsVar);
        yc ycVar2 = this.c;
        synchronized (ycVar2) {
            yaVar = (ya) ycVar2.a.get(a2);
            if (yaVar == null) {
                yb ybVar = ycVar2.b;
                synchronized (ybVar.a) {
                    yaVar = (ya) ybVar.a.poll();
                }
                if (yaVar == null) {
                    yaVar = new ya();
                }
                ycVar2.a.put(a2, yaVar);
            }
            yaVar.b++;
        }
        yaVar.a.lock();
        try {
            te a3 = a();
            if (a3.a(a2) == null) {
                tb b2 = a3.b(a2);
                if (b2 == null) {
                    String valueOf = String.valueOf(a2);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Had two simultaneous puts for: ") : "Had two simultaneous puts for: ".concat(valueOf));
                }
                try {
                    synchronized (b2.d) {
                        tc tcVar = b2.a;
                        if (tcVar.e == b2) {
                            if (!tcVar.d) {
                                b2.b[0] = true;
                            }
                            c2 = tcVar.c();
                            if (!b2.d.a.exists()) {
                                b2.d.a.mkdirs();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (((vj) xxVar).a.a(((vj) xxVar).b, c2, ((vj) xxVar).c)) {
                        b2.d.a(b2, true);
                        b2.c = true;
                    }
                    b2.b();
                    ycVar = this.c;
                    ycVar.a(a2);
                } catch (Throwable th) {
                    b2.b();
                    throw th;
                }
            } else {
                ycVar = this.c;
                ycVar.a(a2);
            }
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th2) {
                this.c.a(a2);
                throw th2;
            }
        }
    }
}
