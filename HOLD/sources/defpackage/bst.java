package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bst  reason: default package */
/* compiled from: PG */
public abstract class bst {
    private static final bnr[] q = new bnr[0];
    public int a;
    public long b;
    public final Context c;
    public final Handler d;
    public final Object e = new Object();
    public final Object f = new Object();
    public btv g;
    public bsn h;
    public final ArrayList i = new ArrayList();
    public int j = 1;
    public final bsj k;
    public final bsk l;
    public bno m = null;
    public boolean n = false;
    public volatile bsx o = null;
    public final AtomicInteger p = new AtomicInteger(0);
    private long r;
    private int s;
    private long t;
    private btm u;
    private final bti v;
    private IInterface w;
    private bso x;
    private final int y;
    private final String z;

    /* access modifiers changed from: protected */
    public abstract IInterface a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract String b();

    public int c() {
        return bnv.b;
    }

    public boolean g() {
        return false;
    }

    public final bnr[] h() {
        bsx bsx = this.o;
        if (bsx != null) {
            return bsx.b;
        }
        return null;
    }

    public final void k() {
    }

    public final void l() {
    }

    public void q() {
    }

    public bnr[] s() {
        throw null;
    }

    public bnr[] t() {
        return q;
    }

    protected bst(Context context, Looper looper, bti bti, bnv bnv, int i2, bsj bsj, bsk bsk, String str) {
        this.c = (Context) buh.a(context, "Context must not be null");
        Looper looper2 = (Looper) buh.a(looper, "Looper must not be null");
        this.v = (bti) buh.a(bti, "Supervisor must not be null");
        bnv bnv2 = (bnv) buh.a(bnv, "API availability must not be null");
        this.d = new bsl(this, looper);
        this.y = i2;
        this.k = bsj;
        this.l = bsk;
        this.z = str;
    }

    public final boolean a(int i2, int i3, IInterface iInterface) {
        synchronized (this.e) {
            if (this.j != i2) {
                return false;
            }
            a(i3, iInterface);
            return true;
        }
    }

    public final void a(bsn bsn) {
        this.h = (bsn) buh.a(bsn, "Connection progress callbacks cannot be null.");
        a(2, (IInterface) null);
    }

    public void d() {
        this.p.incrementAndGet();
        synchronized (this.i) {
            int size = this.i.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((bsm) this.i.get(i2)).e();
            }
            this.i.clear();
        }
        synchronized (this.f) {
            this.g = null;
        }
        a(1, (IInterface) null);
    }

    public final void a(String str, PrintWriter printWriter) {
        int i2;
        IInterface iInterface;
        btv btv;
        synchronized (this.e) {
            i2 = this.j;
            iInterface = this.w;
        }
        synchronized (this.f) {
            btv = this.g;
        }
        printWriter.append((CharSequence) str).append((CharSequence) "mConnectState=");
        if (i2 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i2 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i2 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i2 == 4) {
            printWriter.print("CONNECTED");
        } else if (i2 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append((CharSequence) " mService=");
        if (iInterface == null) {
            printWriter.append((CharSequence) "null");
        } else {
            printWriter.append((CharSequence) b()).append((CharSequence) "@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append((CharSequence) " mServiceBroker=");
        if (btv == null) {
            printWriter.println("null");
        } else {
            printWriter.append((CharSequence) "IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(btv.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.r > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) "lastConnectedTime=");
            long j2 = this.r;
            String format = simpleDateFormat.format(new Date(j2));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j2);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastSuspendedCause=");
            int i3 = this.a;
            if (i3 == 1) {
                printWriter.append((CharSequence) "CAUSE_SERVICE_DISCONNECTED");
            } else if (i3 != 2) {
                printWriter.append((CharSequence) String.valueOf(i3));
            } else {
                printWriter.append((CharSequence) "CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append((CharSequence) " lastSuspendedTime=");
            long j3 = this.b;
            String format2 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j3);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.t > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastFailedStatus=").append((CharSequence) ccy.a(this.s));
            PrintWriter append3 = printWriter.append((CharSequence) " lastFailedTime=");
            long j4 = this.t;
            String format3 = simpleDateFormat.format(new Date(j4));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j4);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final void j() {
        if (!e() || this.u == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* access modifiers changed from: protected */
    public Bundle o() {
        return new Bundle();
    }

    private final String r() {
        String str = this.z;
        return str == null ? this.c.getClass().getName() : str;
    }

    public final void a(btp btp, Set set) {
        Bundle o2 = o();
        bta bta = new bta(this.y);
        bta.d = this.c.getPackageName();
        bta.g = o2;
        if (set != null) {
            bta.f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (g()) {
            bta.h = new Account("<<default account>>", "com.google");
            if (btp != null) {
                bta.e = btp.asBinder();
            }
        }
        bta.i = s();
        bta.j = t();
        try {
            synchronized (this.f) {
                btv btv = this.g;
                if (btv != null) {
                    btv.a(new bts(this, this.p.get()), bta);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.d;
            handler.sendMessage(handler.obtainMessage(6, this.p.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException | RuntimeException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            a(8, null, null, this.p.get());
        }
    }

    public final IInterface p() {
        boolean z2;
        IInterface iInterface;
        synchronized (this.e) {
            if (this.j == 5) {
                throw new DeadObjectException();
            } else if (e()) {
                if (this.w != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                buh.a(z2, "Client is connected but service is null");
                iInterface = this.w;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.e) {
            if (this.j == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final boolean f() {
        boolean z2;
        synchronized (this.e) {
            int i2 = this.j;
            z2 = true;
            if (i2 != 2) {
                if (i2 != 3) {
                    z2 = false;
                }
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public final void a(bno bno) {
        this.s = bno.b;
        this.t = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(1, i3, -1, new bsq(this, i2, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        Handler handler = this.d;
        handler.sendMessage(handler.obtainMessage(7, i3, -1, new bsr(this, i2)));
    }

    public final void a(bss bss) {
        brd brd = (brd) bss;
        bri bri = brd.a.h;
        Status status = bri.a;
        bri.l.post(new brc(brd));
    }

    /* access modifiers changed from: private */
    public final void a(int i2, IInterface iInterface) {
        boolean z2 = false;
        if ((i2 == 4) == (iInterface != null)) {
            z2 = true;
        }
        buh.b(z2);
        synchronized (this.e) {
            this.j = i2;
            this.w = iInterface;
            q();
            if (i2 == 1) {
                bso bso = this.x;
                if (bso != null) {
                    bti bti = this.v;
                    btm btm = this.u;
                    String str = btm.a;
                    String str2 = btm.b;
                    r();
                    bti.a(str, str2, bso);
                    this.x = null;
                }
            } else if (i2 == 2 || i2 == 3) {
                if (this.x != null) {
                    btm btm2 = this.u;
                    if (btm2 != null) {
                        String str3 = btm2.a;
                        String str4 = btm2.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + str4.length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        bti bti2 = this.v;
                        btm btm3 = this.u;
                        String str5 = btm3.a;
                        String str6 = btm3.b;
                        bso bso2 = this.x;
                        r();
                        bti2.a(str5, str6, bso2);
                        this.p.incrementAndGet();
                    }
                }
                this.x = new bso(this, this.p.get());
                btm btm4 = new btm("com.google.android.gms", a());
                this.u = btm4;
                bti bti3 = this.v;
                String str7 = btm4.a;
                String str8 = btm4.b;
                bso bso3 = this.x;
                r();
                if (!bti3.b(new bth(str7, str8), bso3)) {
                    btm btm5 = this.u;
                    String str9 = btm5.a;
                    String str10 = btm5.b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 34 + str10.length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str9);
                    sb2.append(" on ");
                    sb2.append(str10);
                    Log.e("GmsClient", sb2.toString());
                    a(16, this.p.get());
                }
            } else if (i2 == 4) {
                this.r = System.currentTimeMillis();
            }
        }
    }
}
