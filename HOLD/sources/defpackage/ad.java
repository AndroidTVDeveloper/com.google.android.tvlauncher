package defpackage;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Build;
import android.view.ContextMenu;
import android.view.View;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: ad  reason: default package */
/* compiled from: PG */
public final class ad implements ComponentCallbacks, View.OnCreateContextMenuListener, m {
    public boolean a;
    public boolean b;
    public al c;
    public int d;
    public int e;
    public String f;
    public bg g;
    private String h = UUID.randomUUID().toString();
    private o i;

    public ad() {
        j jVar;
        Object obj;
        j jVar2 = j.DESTROYED;
        new t();
        this.i = new o(this);
        bro.a();
        int i2 = Build.VERSION.SDK_INT;
        o oVar = this.i;
        ab abVar = new ab();
        if (oVar.b != j.DESTROYED) {
            jVar = j.INITIALIZED;
        } else {
            jVar = j.DESTROYED;
        }
        n nVar = new n(abVar, jVar);
        c cVar = oVar.a;
        f fVar = (f) cVar.a.get(abVar);
        if (fVar == null) {
            HashMap hashMap = cVar.a;
            f fVar2 = new f(abVar, nVar);
            cVar.e++;
            f fVar3 = cVar.c;
            if (fVar3 == null) {
                cVar.b = fVar2;
                cVar.c = cVar.b;
            } else {
                fVar3.b = fVar2;
                fVar2.c = fVar3;
                cVar.c = fVar2;
            }
            hashMap.put(abVar, fVar2);
            obj = null;
        } else {
            obj = fVar.a;
        }
        if (obj == null && ((m) oVar.c.get()) != null) {
            boolean z = oVar.d != 0 || oVar.e;
            oVar.d++;
            for (j a2 = oVar.a(abVar); nVar.a.compareTo((Enum) a2) < 0 && oVar.a.a(abVar); a2 = oVar.a(abVar)) {
                oVar.a(nVar.a);
                nVar.a(o.b(nVar.a));
                oVar.a();
            }
            if (!z) {
                oVar.b();
            }
            oVar.d--;
        }
    }

    public final hc a() {
        return this.i;
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
        dc.a((Object) this, sb);
        sb.append(" (");
        sb.append(this.h);
        sb.append(")");
        if (this.d != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.d));
        }
        sb.append('}');
        return sb.toString();
    }
}
