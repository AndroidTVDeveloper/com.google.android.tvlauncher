package p000;

import android.app.Fragment;
import android.os.Bundle;

/* renamed from: cfc */
/* compiled from: PG */
public abstract class cfc extends cfu {

    /* renamed from: a */
    public boolean f5394a;

    /* renamed from: c */
    private dcj f5395c;

    /* renamed from: d */
    private boolean f5396d;

    public cfc(String str, cek cek) {
        super(cek);
    }

    /* renamed from: a */
    public abstract void mo2709a(Bundle bundle);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dck a = dck.m6123a(this);
        if (!a.mo4092a()) {
            this.f5394a = true;
            cfb cfb = new cfb(this, bundle);
            this.f5395c = cfb;
            a.mo4091a(cfb);
            if (getFragmentManager().findFragmentByTag("blocking_fragment_tag") == null) {
                getFragmentManager().beginTransaction().add(16908290, new cfa(), "blocking_fragment_tag").commit();
                return;
            }
            return;
        }
        mo2710b(bundle);
    }

    /* renamed from: b */
    public final void mo2710b(Bundle bundle) {
        this.f5394a = false;
        dck.m6123a(this).mo4094b(this.f5395c);
        dbq.m6093a(this).mo2883a();
        if (!getFragmentManager().isStateSaved()) {
            mo2743a();
            mo2709a(bundle);
            this.f5396d = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!this.f5394a) {
            mo2743a();
            if (!this.f5396d) {
                mo2710b(null);
            }
        }
    }

    /* renamed from: a */
    private final void mo2743a() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("blocking_fragment_tag");
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }
}
