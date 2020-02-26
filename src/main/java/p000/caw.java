package p000;

import android.app.Application;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: caw */
/* compiled from: PG */
final class caw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ caz f5149a;

    /* renamed from: b */
    private final /* synthetic */ dnj f5150b;

    /* renamed from: c */
    private final /* synthetic */ dff f5151c;

    /* renamed from: d */
    private final /* synthetic */ dff f5152d;

    /* renamed from: e */
    private final /* synthetic */ cax f5153e;

    /* renamed from: f */
    private final /* synthetic */ cay f5154f;

    public caw(caz caz, dnj dnj, dff dff, dff dff2, cax cax, cay cay) {
        this.f5149a = caz;
        this.f5150b = dnj;
        this.f5151c = dff;
        this.f5152d = dff2;
        this.f5153e = cax;
        this.f5154f = cay;
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            bog.m3837c("Primes", "background initialization", new Object[0]);
            caz caz = this.f5149a;
            dnj dnj = this.f5150b;
            dff dff = this.f5151c;
            dff dff2 = this.f5152d;
            cax cax = this.f5153e;
            cay cay = this.f5154f;
            cev.m4629a(Integer.valueOf((int) R.string.primes_marker));
            Application application = caz.f5163a;
            dff dff3 = caz.f5164b;
            AtomicReference atomicReference = caz.f5165c;
            cck a = ccy.m4552a();
            a.mo2669a(cax);
            a.mo2669a(cay);
            cct cct = new cct(application);
            a.mo2668a(cct);
            if (!a.f5274a) {
                application.registerReceiver(new ccs(a, cct, dff3), new IntentFilter("com.google.gservices.intent.action.GSERVICES_CHANGED"));
            }
            if (!a.f5274a) {
                SharedPreferences sharedPreferences = (SharedPreferences) dff2.mo2551a();
                cbi a2 = cbi.m4495a((cbi) cev.m4629a((cbi) dnj.mo2550a()));
                cgb cgb = (cgb) cev.m4629a((cgb) dff.mo2551a());
                if (!a.f5274a) {
                    cat cat = (cat) atomicReference.get();
                    car car = cat instanceof car ? (car) cat : null;
                    if (cat != null) {
                        cck cck = a;
                        AtomicReference atomicReference2 = atomicReference;
                        bzs bzs = new bzs(application, dff3, a2, sharedPreferences, a, car.f5137c);
                        application.getPackageName();
                        bzh bzh = new bzh(bzs);
                        if (!cck.f5274a) {
                            cat cat2 = (cat) atomicReference2.get();
                            if (cat2 instanceof car) {
                                if (atomicReference2.compareAndSet(cat2, bzh)) {
                                    ArrayList<cbx> arrayList = new ArrayList<>();
                                    if (bzh.f5047a.mo2589a()) {
                                        arrayList.add(bzh.f5047a.mo2590b());
                                    }
                                    bzs bzs2 = bzh.f5047a;
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        if (StrictMode.ThreadPolicy.LAX.equals(StrictMode.getThreadPolicy()) && StrictMode.VmPolicy.LAX.equals(StrictMode.getVmPolicy())) {
                                            if (bzs2.f5076g.mo2622j().mo4219a()) {
                                                cgb cgb2 = (cgb) bzs2.f5076g.mo2622j().mo4220b();
                                                throw null;
                                            }
                                        }
                                    }
                                    bzs bzs3 = bzh.f5047a;
                                    if (bzs3.f5076g.mo2618f().mo4219a()) {
                                        if (((cbw) bzs3.f5076g.mo2618f().mo4220b()).f5230a) {
                                            cbw cbw = (cbw) bzs3.f5076g.mo2618f().mo4220b();
                                            bzs bzs4 = bzh.f5047a;
                                            dnj dnj2 = bzs4.f5073d;
                                            Application application2 = bzs4.f5072c;
                                            dff dff4 = bzs4.f5074e;
                                            dff dff5 = bzs4.f5075f;
                                            SharedPreferences sharedPreferences2 = bzs4.f5077h;
                                            cbw cbw2 = (cbw) bzs4.f5076g.mo2618f().mo4220b();
                                            arrayList.add((cam) bzs4.mo2588a(new cam(dnj2, application2, dff4, dff5, sharedPreferences2)));
                                        }
                                    }
                                    bzs bzs5 = bzh.f5047a;
                                    int i = Build.VERSION.SDK_INT;
                                    if (bzs5.f5076g.mo2621i().mo4219a()) {
                                        cbd cbd = (cbd) bzs5.f5076g.mo2621i().mo4220b();
                                    }
                                    bzs bzs6 = bzh.f5047a;
                                    int i2 = Build.VERSION.SDK_INT;
                                    if (!bzs6.f5076g.mo2619g().mo4219a()) {
                                        bzs bzs7 = bzh.f5047a;
                                        int i3 = Build.VERSION.SDK_INT;
                                        if (!bzs7.f5076g.mo2622j().mo4219a()) {
                                            bzs bzs8 = bzh.f5047a;
                                            if (bzs8.f5076g.mo2616d().mo4219a() && ((cci) bzs8.f5076g.mo2616d().mo4220b()).f5269a && cce.f5247a.f5251c > 0) {
                                                bzs bzs9 = bzh.f5047a;
                                                ccg ccg = (ccg) bzs9.mo2588a(new ccg(bze.m4405a(bzs9.f5072c), bzs9.f5071b, new bzq(bzs9), bzs9.f5076g.mo2620h()));
                                            }
                                            for (cbx cbx : arrayList) {
                                                cbx.mo2586f();
                                                synchronized (cax) {
                                                    if (!cax.f5156b) {
                                                        cax.f5155a.add(cbx);
                                                    } else {
                                                        cbx.mo2587g();
                                                    }
                                                }
                                            }
                                            if (!cck.f5274a) {
                                                car car2 = (car) cat2;
                                                car2.mo2609a(bzh);
                                                synchronized (car2.f5136b) {
                                                    car2.f5135a = bzh;
                                                }
                                                car2.mo2609a(bzh);
                                            }
                                            cat2.mo2576a();
                                        } else {
                                            cgb cgb3 = (cgb) bzs7.f5076g.mo2622j().mo4220b();
                                            throw null;
                                        }
                                    } else {
                                        cbp cbp = (cbp) bzs6.f5076g.mo2619g().mo4220b();
                                        throw null;
                                    }
                                }
                            }
                            bog.m3832a("Primes", "Primes shutdown during initialization", new Object[0]);
                            bzh.mo2576a();
                        } else {
                            caz.mo2576a();
                        }
                    }
                } else {
                    caz.mo2576a();
                }
            } else {
                caz.mo2576a();
            }
            countDownLatch = this.f5149a.f5166d;
        } catch (RuntimeException e) {
            try {
                bog.m3834b("Primes", "Primes failed to initialize in the background", e, new Object[0]);
                this.f5149a.mo2576a();
                countDownLatch = this.f5149a.f5166d;
            } catch (Throwable th) {
                this.f5149a.f5166d.countDown();
                throw th;
            }
        }
        countDownLatch.countDown();
    }
}
