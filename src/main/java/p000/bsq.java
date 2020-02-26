package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bsq */
/* compiled from: PG */
public final class bsq extends bsi {

    /* renamed from: c */
    private final IBinder f4736c;

    /* renamed from: d */
    private final /* synthetic */ bst f4737d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsq(bst bst, int i, IBinder iBinder, Bundle bundle) {
        super(bst, i, bundle);
        this.f4737d = bst;
        this.f4736c = iBinder;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2373a(bno bno) {
        bsk bsk = this.f4737d.f4751l;
        if (bsk != null) {
            bsk.mo2377a(bno);
        }
        this.f4737d.mo2385a(bno);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo2374a() {
        try {
            String interfaceDescriptor = this.f4736c.getInterfaceDescriptor();
            if (!this.f4737d.mo2182b().equals(interfaceDescriptor)) {
                String b = this.f4737d.mo2182b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(b);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface a = this.f4737d.mo2180a(this.f4736c);
            if (a == null || (!this.f4737d.mo2390a(2, 4, a) && !this.f4737d.mo2390a(3, 4, a))) {
                return false;
            }
            bst bst = this.f4737d;
            bst.f4752m = null;
            bsj bsj = bst.f4750k;
            if (bsj == null) {
                return true;
            }
            ((btc) bsj).f4794a.mo2289a((Bundle) null);
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
