package p000;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ContextMenu;
import android.view.View;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: ad */
/* compiled from: PG */
public final class C0003ad implements ComponentCallbacks, View.OnCreateContextMenuListener, C0326m {

    /* renamed from: a */
    public boolean f119a;

    /* renamed from: b */
    public boolean f120b;

    /* renamed from: c */
    public C0011al f121c;

    /* renamed from: d */
    public int f122d;

    /* renamed from: e */
    public int f123e;

    /* renamed from: f */
    public String f124f;

    /* renamed from: g */
    public C0035bg f125g;

    /* renamed from: h */
    private String f126h = UUID.randomUUID().toString();

    /* renamed from: i */
    private C0380o f127i;

    public C0003ad() {
        C0245j jVar;
        Object obj;
        C0245j jVar2 = C0245j.DESTROYED;
        new C0515t();
        this.f127i = new C0380o(this);
        bro.m4076a();
        int i = Build.VERSION.SDK_INT;
        C0380o oVar = this.f127i;
        C0001ab abVar = new C0001ab();
        if (oVar.f10069b != C0245j.DESTROYED) {
            jVar = C0245j.INITIALIZED;
        } else {
            jVar = C0245j.DESTROYED;
        }
        C0353n nVar = new C0353n(abVar, jVar);
        C0055c cVar = oVar.f10068a;
        C0137f fVar = (C0137f) cVar.f5095a.get(abVar);
        if (fVar == null) {
            HashMap hashMap = cVar.f5095a;
            C0137f fVar2 = new C0137f(abVar, nVar);
            cVar.f9536e++;
            C0137f fVar3 = cVar.f9534c;
            if (fVar3 == null) {
                cVar.f9533b = fVar2;
                cVar.f9534c = cVar.f9533b;
            } else {
                fVar3.f9196b = fVar2;
                fVar2.f9197c = fVar3;
                cVar.f9534c = fVar2;
            }
            hashMap.put(abVar, fVar2);
            obj = null;
        } else {
            obj = fVar.f9195a;
        }
        if (obj == null && ((C0326m) oVar.f10070c.get()) != null) {
            boolean z = oVar.f10071d != 0 || oVar.f10072e;
            oVar.f10071d++;
            for (C0245j a = oVar.mo5690a(abVar); nVar.f9967a.compareTo((Enum) a) < 0 && oVar.f10068a.mo2595a(abVar); a = oVar.mo5690a(abVar)) {
                oVar.mo5693a(nVar.f9967a);
                nVar.mo5595a(C0380o.m8130b(nVar.f9967a));
                oVar.mo5691a();
            }
            if (!z) {
                oVar.mo5694b();
            }
            oVar.f10071d--;
        }
    }

    /* renamed from: a */
    public final C0194hc mo61a() {
        return this.f127i;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dc.a(java.lang.Object, java.lang.StringBuilder):void
     arg types: [ad, java.lang.StringBuilder]
     candidates:
      dc.a(java.lang.Object, java.lang.Object):java.lang.Object
      dc.a(java.lang.Object, java.lang.StringBuilder):void */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        C0086dc.m6106a((Object) this, sb);
        sb.append(" (");
        sb.append(this.f126h);
        sb.append(")");
        if (this.f122d != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f122d));
        }
        sb.append('}');
        return sb.toString();
    }
}
