package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bri */
/* compiled from: PG */
public final class bri implements Handler.Callback {

    /* renamed from: a */
    public static final Status f4685a = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: b */
    public static final Status f4686b = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: f */
    public static final Object f4687f = new Object();

    /* renamed from: n */
    private static bri f4688n;

    /* renamed from: c */
    public final long f4689c = 5000;

    /* renamed from: d */
    public final long f4690d = 120000;

    /* renamed from: e */
    public long f4691e = 10000;

    /* renamed from: g */
    public final Context f4692g;

    /* renamed from: h */
    public final btn f4693h;

    /* renamed from: i */
    public final AtomicInteger f4694i = new AtomicInteger(1);

    /* renamed from: j */
    public final AtomicInteger f4695j = new AtomicInteger(0);

    /* renamed from: k */
    public final Map f4696k = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: l */
    public final Handler f4697l;

    /* renamed from: m */
    public final bpp f4698m = null;

    /* renamed from: o */
    private final bnu f4699o;

    /* renamed from: p */
    private final Set f4700p;

    private bri(Context context, Looper looper, bnu bnu) {
        new C0069cn();
        this.f4700p = new C0069cn();
        this.f4692g = context;
        this.f4697l = new bvm(looper, this);
        this.f4699o = bnu;
        this.f4693h = new btn(bnu);
        Handler handler = this.f4697l;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static bri m4059a(Context context) {
        bri bri;
        synchronized (f4687f) {
            if (f4688n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f4688n = new bri(context.getApplicationContext(), handlerThread.getLooper(), bnu.f4493a);
            }
            bri = f4688n;
        }
        return bri;
    }

    public final boolean handleMessage(Message message) {
        bre bre;
        Status status;
        bnr[] a;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f4691e = j;
                this.f4697l.removeMessages(12);
                for (bpk obtainMessage : this.f4696k.keySet()) {
                    Handler handler = this.f4697l;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f4691e);
                }
                break;
            case 2:
                cel cel = (cel) message.obj;
                throw null;
            case 3:
                for (bre bre2 : this.f4696k.values()) {
                    bre2.mo2344e();
                    bre2.mo2347h();
                }
                break;
            case 4:
            case 8:
            case 13:
                brt brt = (brt) message.obj;
                bre bre3 = (bre) this.f4696k.get(brt.f4708c.f4517c);
                if (bre3 == null) {
                    m4060a(brt.f4708c);
                    bre3 = (bre) this.f4696k.get(brt.f4708c.f4517c);
                }
                if (bre3.mo2348i() && this.f4695j.get() != brt.f4707b) {
                    brt.f4706a.mo2263a(f4685a);
                    bre3.mo2343d();
                    break;
                } else {
                    bre3.mo2339a(brt.f4706a);
                    break;
                }
            case 5:
                int i = message.arg1;
                bno bno = (bno) message.obj;
                Iterator it = this.f4696k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        bre = (bre) it.next();
                        if (bre.f4668e == i) {
                        }
                    } else {
                        bre = null;
                    }
                }
                if (bre == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String a2 = bof.m3823a(bno.f4482b);
                    String str = bno.f4484d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a2);
                    sb2.append(": ");
                    sb2.append(str);
                    bre.mo2340a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.f4692g.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f4692g.getApplicationContext();
                    synchronized (bpm.f4544a) {
                        if (!bpm.f4544a.f4548e) {
                            application.registerActivityLifecycleCallbacks(bpm.f4544a);
                            application.registerComponentCallbacks(bpm.f4544a);
                            bpm.f4544a.f4548e = true;
                        }
                    }
                    bpm bpm = bpm.f4544a;
                    bqz bqz = new bqz(this);
                    synchronized (bpm.f4544a) {
                        bpm.f4547d.add(bqz);
                    }
                    bpm bpm2 = bpm.f4544a;
                    if (!bpm2.f4546c.get()) {
                        int i2 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!bpm2.f4546c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            bpm2.f4545b.set(true);
                        }
                    }
                    if (!bpm2.f4545b.get()) {
                        this.f4691e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m4060a((boo) message.obj);
                break;
            case 9:
                if (this.f4696k.containsKey(message.obj)) {
                    bre bre4 = (bre) this.f4696k.get(message.obj);
                    buh.m4202a(bre4.f4671h.f4697l);
                    if (bre4.f4669f) {
                        bre4.mo2347h();
                        break;
                    }
                }
                break;
            case 10:
                for (bpk remove : this.f4700p) {
                    ((bre) this.f4696k.remove(remove)).mo2343d();
                }
                this.f4700p.clear();
                break;
            case 11:
                if (this.f4696k.containsKey(message.obj)) {
                    bre bre5 = (bre) this.f4696k.get(message.obj);
                    buh.m4202a(bre5.f4671h.f4697l);
                    if (bre5.f4669f) {
                        bre5.mo2345f();
                        bri bri = bre5.f4671h;
                        if (bri.f4699o.mo2213a(bri.f4692g) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        bre5.mo2340a(status);
                        bre5.f4665b.mo2228d();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f4696k.containsKey(message.obj)) {
                    bre bre6 = (bre) this.f4696k.get(message.obj);
                    buh.m4202a(bre6.f4671h.f4697l);
                    if (bre6.f4665b.mo2229e() && bre6.f4667d.size() == 0) {
                        bqb bqb = bre6.f4666c;
                        if (bqb.f4572a.isEmpty() && bqb.f4573b.isEmpty()) {
                            bre6.f4665b.mo2228d();
                            break;
                        } else {
                            bre6.mo2346g();
                            break;
                        }
                    }
                }
                break;
            case 14:
                bro bro = (bro) message.obj;
                throw null;
            case 15:
                brf brf = (brf) message.obj;
                if (this.f4696k.containsKey(null)) {
                    bre bre7 = (bre) this.f4696k.get(null);
                    if (bre7.f4670g.contains(brf) && !bre7.f4669f) {
                        if (bre7.f4665b.mo2229e()) {
                            bre7.mo2342c();
                            break;
                        } else {
                            bre7.mo2347h();
                            break;
                        }
                    }
                }
                break;
            case 16:
                brf brf2 = (brf) message.obj;
                if (this.f4696k.containsKey(null)) {
                    bre bre8 = (bre) this.f4696k.get(null);
                    if (bre8.f4670g.remove(brf2)) {
                        bre8.f4671h.f4697l.removeMessages(15, brf2);
                        bre8.f4671h.f4697l.removeMessages(16, brf2);
                        ArrayList arrayList = new ArrayList(bre8.f4664a.size());
                        for (bpi bpi : bre8.f4664a) {
                            if ((bpi instanceof bpd) && (a = ((bpd) bpi).mo2260a(bre8)) != null) {
                                int length = a.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 < length) {
                                        if (!bty.m4184a(a[i3], (Object) null)) {
                                            i3++;
                                        } else if (i3 >= 0) {
                                            arrayList.add(bpi);
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            bpi bpi2 = (bpi) arrayList.get(i4);
                            bre8.f4664a.remove(bpi2);
                            bpi2.mo2264a(new bpc(null));
                        }
                        break;
                    }
                }
                break;
            default:
                int i5 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i5);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: a */
    private final void m4060a(boo boo) {
        bpk bpk = boo.f4517c;
        bre bre = (bre) this.f4696k.get(bpk);
        if (bre == null) {
            bre = new bre(this, boo);
            this.f4696k.put(bpk, bre);
        }
        if (bre.mo2348i()) {
            this.f4700p.add(bpk);
        }
        bre.mo2347h();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public final boolean mo2355a(bno bno, int i) {
        PendingIntent pendingIntent;
        bnu bnu = this.f4699o;
        Context context = this.f4692g;
        if (!bno.mo2194a()) {
            pendingIntent = bnu.mo2216b(context, bno.f4482b, null);
        } else {
            pendingIntent = bno.f4483c;
        }
        if (pendingIntent == null) {
            return false;
        }
        int i2 = bno.f4482b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        bnu.mo2212a(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }
}
