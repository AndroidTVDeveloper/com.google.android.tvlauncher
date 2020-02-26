package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

/* renamed from: yf */
/* compiled from: PG */
public final class C0656yf implements C0648xy {

    /* renamed from: a */
    private final C0667yq f10811a;

    /* renamed from: b */
    private final File f10812b;

    /* renamed from: c */
    private final C0653yc f10813c = new C0653yc();

    /* renamed from: d */
    private C0520te f10814d;

    @Deprecated
    public C0656yf(File file) {
        this.f10812b = file;
        this.f10811a = new C0667yq();
    }

    /* renamed from: a */
    public final File mo6128a(C0534ts tsVar) {
        try {
            C0519td a = m8670a().mo5965a(this.f10811a.mo6134a(tsVar));
            if (a != null) {
                return a.f10447a[0];
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

    /* renamed from: a */
    private final synchronized C0520te m8670a() {
        if (this.f10814d == null) {
            File file = this.f10812b;
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    C0520te.m8349a(file2, file3, false);
                }
            }
            C0520te teVar = new C0520te(file);
            if (teVar.f10449b.exists()) {
                try {
                    teVar.mo5966a();
                    C0520te.m8348a(teVar.f10450c);
                    Iterator it = teVar.f10454g.values().iterator();
                    while (it.hasNext()) {
                        C0518tc tcVar = (C0518tc) it.next();
                        if (tcVar.f10444e != null) {
                            tcVar.f10444e = null;
                            for (int i = 0; i < teVar.f10451d; i = 1) {
                                C0520te.m8348a(tcVar.mo5963b());
                                C0520te.m8348a(tcVar.mo5964c());
                            }
                            it.remove();
                        } else {
                            for (int i2 = 0; i2 < teVar.f10451d; i2 = 1) {
                                teVar.f10452e += tcVar.f10441b[0];
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
                    C0523th.m8364a(teVar.f10448a);
                }
                this.f10814d = teVar;
            }
            file.mkdirs();
            teVar = new C0520te(file);
            teVar.mo5969b();
            this.f10814d = teVar;
        }
        return this.f10814d;
    }

    /* renamed from: a */
    public final void mo6129a(C0534ts tsVar, C0647xx xxVar) {
        C0651ya yaVar;
        C0653yc ycVar;
        File c;
        String a = this.f10811a.mo6134a(tsVar);
        C0653yc ycVar2 = this.f10813c;
        synchronized (ycVar2) {
            yaVar = (C0651ya) ycVar2.f10808a.get(a);
            if (yaVar == null) {
                C0652yb ybVar = ycVar2.f10809b;
                synchronized (ybVar.f10807a) {
                    yaVar = (C0651ya) ybVar.f10807a.poll();
                }
                if (yaVar == null) {
                    yaVar = new C0651ya();
                }
                ycVar2.f10808a.put(a, yaVar);
            }
            yaVar.f10806b++;
        }
        yaVar.f10805a.lock();
        try {
            C0520te a2 = m8670a();
            if (a2.mo5965a(a) == null) {
                C0517tb b = a2.mo5968b(a);
                if (b == null) {
                    String valueOf = String.valueOf(a);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Had two simultaneous puts for: ") : "Had two simultaneous puts for: ".concat(valueOf));
                }
                try {
                    synchronized (b.f10439d) {
                        C0518tc tcVar = b.f10436a;
                        if (tcVar.f10444e == b) {
                            if (!tcVar.f10443d) {
                                b.f10437b[0] = true;
                            }
                            c = tcVar.mo5964c();
                            if (!b.f10439d.f10448a.exists()) {
                                b.f10439d.f10448a.mkdirs();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (((C0579vj) xxVar).f10586a.mo29a(((C0579vj) xxVar).f10587b, c, ((C0579vj) xxVar).f10588c)) {
                        b.f10439d.mo5967a(b, true);
                        b.f10438c = true;
                    }
                    b.mo5961b();
                    ycVar = this.f10813c;
                    ycVar.mo6130a(a);
                } catch (Throwable th) {
                    b.mo5961b();
                    throw th;
                }
            } else {
                ycVar = this.f10813c;
                ycVar.mo6130a(a);
            }
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th2) {
                this.f10813c.mo6130a(a);
                throw th2;
            }
        }
    }
}
