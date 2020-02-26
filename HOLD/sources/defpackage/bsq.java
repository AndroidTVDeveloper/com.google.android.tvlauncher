package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: bsq  reason: default package */
/* compiled from: PG */
public final class bsq extends bsi {
    private final IBinder c;
    private final /* synthetic */ bst d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bsq(bst bst, int i, IBinder iBinder, Bundle bundle) {
        super(bst, i, bundle);
        this.d = bst;
        this.c = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void a(bno bno) {
        bsk bsk = this.d.l;
        if (bsk != null) {
            bsk.a(bno);
        }
        this.d.a(bno);
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        try {
            String interfaceDescriptor = this.c.getInterfaceDescriptor();
            if (!this.d.b().equals(interfaceDescriptor)) {
                String b = this.d.b();
                StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(b);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface a = this.d.a(this.c);
            if (a == null || (!this.d.a(2, 4, a) && !this.d.a(3, 4, a))) {
                return false;
            }
            bst bst = this.d;
            bst.m = null;
            bsj bsj = bst.k;
            if (bsj == null) {
                return true;
            }
            ((btc) bsj).a.a((Bundle) null);
            return true;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
