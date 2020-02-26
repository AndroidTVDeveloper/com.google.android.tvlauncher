package defpackage;

import android.app.Fragment;
import android.os.Bundle;

/* renamed from: cfc  reason: default package */
/* compiled from: PG */
public abstract class cfc extends cfu {
    public boolean a;
    private dcj c;
    private boolean d;

    public cfc(String str, cek cek) {
        super(cek);
    }

    public abstract void a(Bundle bundle);

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dck a2 = dck.a(this);
        if (!a2.a()) {
            this.a = true;
            cfb cfb = new cfb(this, bundle);
            this.c = cfb;
            a2.a(cfb);
            if (getFragmentManager().findFragmentByTag("blocking_fragment_tag") == null) {
                getFragmentManager().beginTransaction().add(16908290, new cfa(), "blocking_fragment_tag").commit();
                return;
            }
            return;
        }
        b(bundle);
    }

    public final void b(Bundle bundle) {
        this.a = false;
        dck.a(this).b(this.c);
        dbq.a(this).a();
        if (!getFragmentManager().isStateSaved()) {
            a();
            a(bundle);
            this.d = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!this.a) {
            a();
            if (!this.d) {
                b(null);
            }
        }
    }

    private final void a() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("blocking_fragment_tag");
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }
}
