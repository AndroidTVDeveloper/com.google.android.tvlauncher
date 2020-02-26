package defpackage;

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

/* renamed from: bri  reason: default package */
/* compiled from: PG */
public final class bri implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f = new Object();
    private static bri n;
    public final long c = 5000;
    public final long d = 120000;
    public long e = 10000;
    public final Context g;
    public final btn h;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public final Handler l;
    public final bpp m = null;
    private final bnu o;
    private final Set p;

    private bri(Context context, Looper looper, bnu bnu) {
        new cn();
        this.p = new cn();
        this.g = context;
        this.l = new bvm(looper, this);
        this.o = bnu;
        this.h = new btn(bnu);
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static bri a(Context context) {
        bri bri;
        synchronized (f) {
            if (n == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                n = new bri(context.getApplicationContext(), handlerThread.getLooper(), bnu.a);
            }
            bri = n;
        }
        return bri;
    }

    public final boolean handleMessage(Message message) {
        bre bre;
        Status status;
        bnr[] a2;
        long j2 = 300000;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j2 = 10000;
                }
                this.e = j2;
                this.l.removeMessages(12);
                for (bpk obtainMessage : this.k.keySet()) {
                    Handler handler = this.l;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.e);
                }
                break;
            case 2:
                cel cel = (cel) message.obj;
                throw null;
            case 3:
                for (bre bre2 : this.k.values()) {
                    bre2.e();
                    bre2.h();
                }
                break;
            case 4:
            case 8:
            case 13:
                brt brt = (brt) message.obj;
                bre bre3 = (bre) this.k.get(brt.c.c);
                if (bre3 == null) {
                    a(brt.c);
                    bre3 = (bre) this.k.get(brt.c.c);
                }
                if (bre3.i() && this.j.get() != brt.b) {
                    brt.a.a(a);
                    bre3.d();
                    break;
                } else {
                    bre3.a(brt.a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                bno bno = (bno) message.obj;
                Iterator it = this.k.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        bre = (bre) it.next();
                        if (bre.e == i2) {
                        }
                    } else {
                        bre = null;
                    }
                }
                if (bre == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    break;
                } else {
                    String a3 = bof.a(bno.b);
                    String str = bno.d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 69 + String.valueOf(str).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(a3);
                    sb2.append(": ");
                    sb2.append(str);
                    bre.a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.g.getApplicationContext();
                    synchronized (bpm.a) {
                        if (!bpm.a.e) {
                            application.registerActivityLifecycleCallbacks(bpm.a);
                            application.registerComponentCallbacks(bpm.a);
                            bpm.a.e = true;
                        }
                    }
                    bpm bpm = bpm.a;
                    bqz bqz = new bqz(this);
                    synchronized (bpm.a) {
                        bpm.d.add(bqz);
                    }
                    bpm bpm2 = bpm.a;
                    if (!bpm2.c.get()) {
                        int i3 = Build.VERSION.SDK_INT;
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!bpm2.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            bpm2.b.set(true);
                        }
                    }
                    if (!bpm2.b.get()) {
                        this.e = 300000;
                        break;
                    }
                }
                break;
            case 7:
                a((boo) message.obj);
                break;
            case 9:
                if (this.k.containsKey(message.obj)) {
                    bre bre4 = (bre) this.k.get(message.obj);
                    buh.a(bre4.h.l);
                    if (bre4.f) {
                        bre4.h();
                        break;
                    }
                }
                break;
            case 10:
                for (bpk remove : this.p) {
                    ((bre) this.k.remove(remove)).d();
                }
                this.p.clear();
                break;
            case 11:
                if (this.k.containsKey(message.obj)) {
                    bre bre5 = (bre) this.k.get(message.obj);
                    buh.a(bre5.h.l);
                    if (bre5.f) {
                        bre5.f();
                        bri bri = bre5.h;
                        if (bri.o.a(bri.g) == 18) {
                            status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                        }
                        bre5.a(status);
                        bre5.b.d();
                        break;
                    }
                }
                break;
            case 12:
                if (this.k.containsKey(message.obj)) {
                    bre bre6 = (bre) this.k.get(message.obj);
                    buh.a(bre6.h.l);
                    if (bre6.b.e() && bre6.d.size() == 0) {
                        bqb bqb = bre6.c;
                        if (bqb.a.isEmpty() && bqb.b.isEmpty()) {
                            bre6.b.d();
                            break;
                        } else {
                            bre6.g();
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
                if (this.k.containsKey(null)) {
                    bre bre7 = (bre) this.k.get(null);
                    if (bre7.g.contains(brf) && !bre7.f) {
                        if (bre7.b.e()) {
                            bre7.c();
                            break;
                        } else {
                            bre7.h();
                            break;
                        }
                    }
                }
                break;
            case 16:
                brf brf2 = (brf) message.obj;
                if (this.k.containsKey(null)) {
                    bre bre8 = (bre) this.k.get(null);
                    if (bre8.g.remove(brf2)) {
                        bre8.h.l.removeMessages(15, brf2);
                        bre8.h.l.removeMessages(16, brf2);
                        ArrayList arrayList = new ArrayList(bre8.a.size());
                        for (bpi bpi : bre8.a) {
                            if ((bpi instanceof bpd) && (a2 = ((bpd) bpi).a(bre8)) != null) {
                                int length = a2.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 < length) {
                                        if (!bty.a(a2[i4], (Object) null)) {
                                            i4++;
                                        } else if (i4 >= 0) {
                                            arrayList.add(bpi);
                                        }
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            bpi bpi2 = (bpi) arrayList.get(i5);
                            bre8.a.remove(bpi2);
                            bpi2.a(new bpc(null));
                        }
                        break;
                    }
                }
                break;
            default:
                int i6 = message.what;
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i6);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    private final void a(boo boo) {
        bpk bpk = boo.c;
        bre bre = (bre) this.k.get(bpk);
        if (bre == null) {
            bre = new bre(this, boo);
            this.k.put(bpk, bre);
        }
        if (bre.i()) {
            this.p.add(bpk);
        }
        bre.h();
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
    public final boolean a(bno bno, int i2) {
        PendingIntent pendingIntent;
        bnu bnu = this.o;
        Context context = this.g;
        if (!bno.a()) {
            pendingIntent = bnu.b(context, bno.b, null);
        } else {
            pendingIntent = bno.c;
        }
        if (pendingIntent == null) {
            return false;
        }
        int i3 = bno.b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", true);
        bnu.a(context, i3, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }
}
