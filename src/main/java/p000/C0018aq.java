package p000;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: aq */
/* compiled from: PG */
public final class C0018aq {

    /* renamed from: a */
    public final Context f1757a;

    /* renamed from: b */
    public final ArrayList f1758b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f1759c = new ArrayList();

    /* renamed from: d */
    public CharSequence f1760d;

    /* renamed from: e */
    public CharSequence f1761e;

    /* renamed from: f */
    public PendingIntent f1762f;

    /* renamed from: g */
    public int f1763g;

    /* renamed from: h */
    public C0019ar f1764h;

    /* renamed from: i */
    public boolean f1765i = false;

    /* renamed from: j */
    public Bundle f1766j;

    /* renamed from: k */
    public String f1767k;

    /* renamed from: l */
    public final Notification f1768l;
    @Deprecated

    /* renamed from: m */
    public final ArrayList f1769m;

    @Deprecated
    public C0018aq(Context context) {
        Notification notification = new Notification();
        this.f1768l = notification;
        this.f1757a = context;
        this.f1767k = null;
        notification.when = System.currentTimeMillis();
        this.f1768l.audioStreamType = -1;
        this.f1763g = 0;
        this.f1769m = new ArrayList();
    }

    /* renamed from: a */
    public final Bundle mo1244a() {
        if (this.f1766j == null) {
            this.f1766j = new Bundle();
        }
        return this.f1766j;
    }

    /* renamed from: a */
    public static CharSequence m1780a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo1245a(int i) {
        this.f1768l.icon = i;
    }

    /* renamed from: a */
    public final void mo1246a(C0019ar arVar) {
        if (this.f1764h != arVar) {
            this.f1764h = arVar;
            if (arVar != null && arVar.f1942a != this) {
                arVar.f1942a = this;
                C0018aq aqVar = arVar.f1942a;
                if (aqVar != null) {
                    aqVar.mo1246a(arVar);
                }
            }
        }
    }
}
