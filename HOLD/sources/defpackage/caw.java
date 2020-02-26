package defpackage;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: caw  reason: default package */
/* compiled from: PG */
final class caw implements Runnable {
    private final /* synthetic */ caz a;
    private final /* synthetic */ dnj b;
    private final /* synthetic */ dff c;
    private final /* synthetic */ dff d;
    private final /* synthetic */ cax e;
    private final /* synthetic */ cay f;

    public caw(caz caz, dnj dnj, dff dff, dff dff2, cax cax, cay cay) {
        this.a = caz;
        this.b = dnj;
        this.c = dff;
        this.d = dff2;
        this.e = cax;
        this.f = cay;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            bog.c("Primes", "background initialization", new Object[0]);
            caz caz = this.a;
            dnj dnj = this.b;
            dff dff = this.c;
            dff dff2 = this.d;
            cax cax = this.e;
            cay cay = this.f;
            cev.a(Integer.valueOf((int) R.string.primes_marker));
            Application application = caz.a;
            dff dff3 = caz.b;
            AtomicReference atomicReference = caz.c;
            cck a2 = ccy.a();
            a2.a(cax);
            a2.a(cay);
            cct cct = new cct(application);
            a2.a(cct);
            if (!a2.a) {
                application.registerReceiver(new ccs(a2, cct, dff3), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
            }
            if (!a2.a) {
                SharedPreferences sharedPreferences = (SharedPreferences) dff2.a();
                cbi a3 = cbi.a((cbi) cev.a((cbi) dnj.a()));
                cgb cgb = (cgb) cev.a((cgb) dff.a());
                if (!a2.a) {
                    cat cat = (cat) atomicReference.get();
                    car car = cat instanceof car ? (car) cat : null;
                    if (cat != null) {
                        cck cck = a2;
                        AtomicReference atomicReference2 = atomicReference;
                        bzs bzs = new bzs(application, dff3, a3, sharedPreferences, a2, car.c);
                        application.getPackageName();
                        bzh bzh = new bzh(bzs);
                        if (!cck.a) {
                            cat cat2 = (cat) atomicReference2.get();
                            if (cat2 instanceof car) {
                                if (atomicReference2.compareAndSet(cat2, bzh)) {
                                    ArrayList<cbx> arrayList = new ArrayList<>();
                                    if (bzh.a.a()) {
                                        arrayList.add(bzh.a.b());
                                    }
                                    bzs bzs2 = bzh.a;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        if (StrictMode.ThreadPolicy.LAX.equals(StrictMode.getThreadPolicy()) && StrictMode.VmPolicy.LAX.equals(StrictMode.getVmPolicy())) {
                                            if (bzs2.g.j().a()) {
                                                cgb cgb2 = (cgb) bzs2.g.j().b();
                                                throw null;
                                            }
                                        }
                                    }
                                    bzs bzs3 = bzh.a;
                                    if (bzs3.g.f().a()) {
                                        if (((cbw) bzs3.g.f().b()).a) {
                                            cbw cbw = (cbw) bzs3.g.f().b();
                                            bzs bzs4 = bzh.a;
                                            dnj dnj2 = bzs4.d;
                                            Application application2 = bzs4.c;
                                            dff dff4 = bzs4.e;
                                            dff dff5 = bzs4.f;
                                            SharedPreferences sharedPreferences2 = bzs4.h;
                                            cbw cbw2 = (cbw) bzs4.g.f().b();
                                            arrayList.add((cam) bzs4.a(new cam(dnj2, application2, dff4, dff5, sharedPreferences2)));
                                        }
                                    }
                                    bzs bzs5 = bzh.a;
                                    int i = Build.VERSION.SDK_INT;
                                    if (bzs5.g.i().a()) {
                                        cbd cbd = (cbd) bzs5.g.i().b();
                                    }
                                    bzs bzs6 = bzh.a;
                                    int i2 = Build.VERSION.SDK_INT;
                                    if (!bzs6.g.g().a()) {
                                        bzs bzs7 = bzh.a;
                                        int i3 = Build.VERSION.SDK_INT;
                                        if (!bzs7.g.j().a()) {
                                            bzs bzs8 = bzh.a;
                                            if (bzs8.g.d().a() && ((cci) bzs8.g.d().b()).a && cce.a.c > 0) {
                                                bzs bzs9 = bzh.a;
                                                ccg ccg = (ccg) bzs9.a(new ccg(bze.a(bzs9.c), bzs9.b, new bzq(bzs9), bzs9.g.h()));
                                            }
                                            for (cbx cbx : arrayList) {
                                                cbx.f();
                                                synchronized (cax) {
                                                    if (!cax.b) {
                                                        cax.a.add(cbx);
                                                    } else {
                                                        cbx.g();
                                                    }
                                                }
                                            }
                                            if (!cck.a) {
                                                car car2 = (car) cat2;
                                                car2.a(bzh);
                                                synchronized (car2.b) {
                                                    car2.a = bzh;
                                                }
                                                car2.a(bzh);
                                            }
                                            cat2.a();
                                        } else {
                                            cgb cgb3 = (cgb) bzs7.g.j().b();
                                            throw null;
                                        }
                                    } else {
                                        cbp cbp = (cbp) bzs6.g.g().b();
                                        throw null;
                                    }
                                }
                            }
                            bog.a("Primes", "Primes shutdown during initialization", new Object[0]);
                            bzh.a();
                        } else {
                            caz.a();
                        }
                    }
                } else {
                    caz.a();
                }
            } else {
                caz.a();
            }
            countDownLatch = this.a.d;
        } catch (RuntimeException e2) {
            try {
                bog.b("Primes", "Primes failed to initialize in the background", e2, new Object[0]);
                this.a.a();
                countDownLatch = this.a.d;
            } catch (Throwable th) {
                this.a.d.countDown();
                throw th;
            }
        }
        countDownLatch.countDown();
    }
}
