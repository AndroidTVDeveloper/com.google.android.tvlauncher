package p000;

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

/* renamed from: bst */
/* compiled from: PG */
public abstract class bst {

    /* renamed from: q */
    private static final bnr[] f4739q = new bnr[0];

    /* renamed from: a */
    public int f4740a;

    /* renamed from: b */
    public long f4741b;

    /* renamed from: c */
    public final Context f4742c;

    /* renamed from: d */
    public final Handler f4743d;

    /* renamed from: e */
    public final Object f4744e = new Object();

    /* renamed from: f */
    public final Object f4745f = new Object();

    /* renamed from: g */
    public btv f4746g;

    /* renamed from: h */
    public bsn f4747h;

    /* renamed from: i */
    public final ArrayList f4748i = new ArrayList();

    /* renamed from: j */
    public int f4749j = 1;

    /* renamed from: k */
    public final bsj f4750k;

    /* renamed from: l */
    public final bsk f4751l;

    /* renamed from: m */
    public bno f4752m = null;

    /* renamed from: n */
    public boolean f4753n = false;

    /* renamed from: o */
    public volatile bsx f4754o = null;

    /* renamed from: p */
    public final AtomicInteger f4755p = new AtomicInteger(0);

    /* renamed from: r */
    private long f4756r;

    /* renamed from: s */
    private int f4757s;

    /* renamed from: t */
    private long f4758t;

    /* renamed from: u */
    private btm f4759u;

    /* renamed from: v */
    private final bti f4760v;

    /* renamed from: w */
    private IInterface f4761w;

    /* renamed from: x */
    private bso f4762x;

    /* renamed from: y */
    private final int f4763y;

    /* renamed from: z */
    private final String f4764z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract IInterface mo2180a(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo2181a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo2182b();

    /* renamed from: c */
    public int mo2183c() {
        return bnv.f4495b;
    }

    /* renamed from: g */
    public boolean mo2394g() {
        return false;
    }

    /* renamed from: h */
    public final bnr[] mo2395h() {
        bsx bsx = this.f4754o;
        if (bsx != null) {
            return bsx.f4778b;
        }
        return null;
    }

    /* renamed from: k */
    public final void mo2397k() {
    }

    /* renamed from: l */
    public final void mo2398l() {
    }

    /* renamed from: q */
    public void mo2401q() {
    }

    /* renamed from: s */
    public bnr[] mo2402s() {
        throw null;
    }

    /* renamed from: t */
    public bnr[] mo2403t() {
        return f4739q;
    }

    protected bst(Context context, Looper looper, bti bti, bnv bnv, int i, bsj bsj, bsk bsk, String str) {
        this.f4742c = (Context) buh.m4200a(context, "Context must not be null");
        Looper looper2 = (Looper) buh.m4200a(looper, "Looper must not be null");
        this.f4760v = (bti) buh.m4200a(bti, "Supervisor must not be null");
        bnv bnv2 = (bnv) buh.m4200a(bnv, "API availability must not be null");
        this.f4743d = new bsl(this, looper);
        this.f4763y = i;
        this.f4750k = bsj;
        this.f4751l = bsk;
        this.f4764z = str;
    }

    /* renamed from: a */
    public final boolean mo2390a(int i, int i2, IInterface iInterface) {
        synchronized (this.f4744e) {
            if (this.f4749j != i) {
                return false;
            }
            m4111a(i2, iInterface);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo2386a(bsn bsn) {
        this.f4747h = (bsn) buh.m4200a(bsn, "Connection progress callbacks cannot be null.");
        m4111a(2, (IInterface) null);
    }

    /* renamed from: d */
    public void mo2391d() {
        this.f4755p.incrementAndGet();
        synchronized (this.f4748i) {
            int size = this.f4748i.size();
            for (int i = 0; i < size; i++) {
                ((bsm) this.f4748i.get(i)).mo2380e();
            }
            this.f4748i.clear();
        }
        synchronized (this.f4745f) {
            this.f4746g = null;
        }
        m4111a(1, (IInterface) null);
    }

    /* renamed from: a */
    public final void mo2389a(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        btv btv;
        synchronized (this.f4744e) {
            i = this.f4749j;
            iInterface = this.f4761w;
        }
        synchronized (this.f4745f) {
            btv = this.f4746g;
        }
        printWriter.append((CharSequence) str).append((CharSequence) "mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append((CharSequence) " mService=");
        if (iInterface == null) {
            printWriter.append((CharSequence) "null");
        } else {
            printWriter.append((CharSequence) mo2182b()).append((CharSequence) "@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append((CharSequence) " mServiceBroker=");
        if (btv == null) {
            printWriter.println("null");
        } else {
            printWriter.append((CharSequence) "IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(btv.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f4756r > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append((CharSequence) "lastConnectedTime=");
            long j = this.f4756r;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f4741b > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastSuspendedCause=");
            int i2 = this.f4740a;
            if (i2 == 1) {
                printWriter.append((CharSequence) "CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append((CharSequence) "CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append((CharSequence) " lastSuspendedTime=");
            long j2 = this.f4741b;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f4758t > 0) {
            printWriter.append((CharSequence) str).append((CharSequence) "lastFailedStatus=").append((CharSequence) ccy.m4554a(this.f4757s));
            PrintWriter append3 = printWriter.append((CharSequence) " lastFailedTime=");
            long j3 = this.f4758t;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    /* renamed from: j */
    public final void mo2396j() {
        if (!mo2392e() || this.f4759u == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Bundle mo2399o() {
        return new Bundle();
    }

    /* renamed from: r */
    private final String m4113r() {
        String str = this.f4764z;
        return str == null ? this.f4742c.getClass().getName() : str;
    }

    /* renamed from: a */
    public final void mo2388a(btp btp, Set set) {
        Bundle o = mo2399o();
        bta bta = new bta(this.f4763y);
        bta.f4785d = this.f4742c.getPackageName();
        bta.f4788g = o;
        if (set != null) {
            bta.f4787f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo2394g()) {
            bta.f4789h = new Account("<<default account>>", "com.google");
            if (btp != null) {
                bta.f4786e = btp.asBinder();
            }
        }
        bta.f4790i = mo2402s();
        bta.f4791j = mo2403t();
        try {
            synchronized (this.f4745f) {
                btv btv = this.f4746g;
                if (btv != null) {
                    btv.mo2438a(new bts(this, this.f4755p.get()), bta);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.f4743d;
            handler.sendMessage(handler.obtainMessage(6, this.f4755p.get(), 1));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo2384a(8, null, null, this.f4755p.get());
        }
    }

    /* renamed from: p */
    public final IInterface mo2400p() {
        boolean z;
        IInterface iInterface;
        synchronized (this.f4744e) {
            if (this.f4749j == 5) {
                throw new DeadObjectException();
            } else if (mo2392e()) {
                if (this.f4761w != null) {
                    z = true;
                } else {
                    z = false;
                }
                buh.m4206a(z, "Client is connected but service is null");
                iInterface = this.f4761w;
            } else {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        return iInterface;
    }

    /* renamed from: e */
    public final boolean mo2392e() {
        boolean z;
        synchronized (this.f4744e) {
            if (this.f4749j == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: f */
    public final boolean mo2393f() {
        boolean z;
        synchronized (this.f4744e) {
            int i = this.f4749j;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2385a(bno bno) {
        this.f4757s = bno.f4482b;
        this.f4758t = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2384a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f4743d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new bsq(this, i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2383a(int i, int i2) {
        Handler handler = this.f4743d;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new bsr(this, i)));
    }

    /* renamed from: a */
    public final void mo2387a(bss bss) {
        brd brd = (brd) bss;
        bri bri = brd.f4663a.f4671h;
        Status status = bri.f4685a;
        bri.f4697l.post(new brc(brd));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m4111a(int i, IInterface iInterface) {
        boolean z = false;
        if ((i == 4) == (iInterface != null)) {
            z = true;
        }
        buh.m4212b(z);
        synchronized (this.f4744e) {
            this.f4749j = i;
            this.f4761w = iInterface;
            mo2401q();
            if (i == 1) {
                bso bso = this.f4762x;
                if (bso != null) {
                    bti bti = this.f4760v;
                    btm btm = this.f4759u;
                    String str = btm.f4822a;
                    String str2 = btm.f4823b;
                    m4113r();
                    bti.mo2426a(str, str2, bso);
                    this.f4762x = null;
                }
            } else if (i == 2 || i == 3) {
                if (this.f4762x != null) {
                    btm btm2 = this.f4759u;
                    if (btm2 != null) {
                        String str3 = btm2.f4822a;
                        String str4 = btm2.f4823b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + str4.length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str3);
                        sb.append(" on ");
                        sb.append(str4);
                        Log.e("GmsClient", sb.toString());
                        bti bti2 = this.f4760v;
                        btm btm3 = this.f4759u;
                        String str5 = btm3.f4822a;
                        String str6 = btm3.f4823b;
                        bso bso2 = this.f4762x;
                        m4113r();
                        bti2.mo2426a(str5, str6, bso2);
                        this.f4755p.incrementAndGet();
                    }
                }
                this.f4762x = new bso(this, this.f4755p.get());
                btm btm4 = new btm("com.google.android.gms", mo2181a());
                this.f4759u = btm4;
                bti bti3 = this.f4760v;
                String str7 = btm4.f4822a;
                String str8 = btm4.f4823b;
                bso bso3 = this.f4762x;
                m4113r();
                if (!bti3.mo2427b(new bth(str7, str8), bso3)) {
                    btm btm5 = this.f4759u;
                    String str9 = btm5.f4822a;
                    String str10 = btm5.f4823b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str9).length() + 34 + str10.length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(str9);
                    sb2.append(" on ");
                    sb2.append(str10);
                    Log.e("GmsClient", sb2.toString());
                    mo2383a(16, this.f4755p.get());
                }
            } else if (i == 4) {
                this.f4756r = System.currentTimeMillis();
            }
        }
    }
}
